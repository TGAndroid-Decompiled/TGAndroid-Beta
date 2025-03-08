package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AvatarsDrawable;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.Text;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

public class UserInfoCell extends View implements NotificationCenter.NotificationCenterDelegate {
    private boolean animating;
    private int backgroundHeight;
    private MessagesController.CommonChatsList commonChats;
    private final int currentAccount;
    private long dialogId;
    private Text footer;
    private final ButtonBounce fullBounce;
    private final RectF fullBounds;
    private final Drawable groupsArrow;
    private final AvatarsDrawable groupsAvatars;
    private final ButtonBounce groupsBounce;
    private final RectF groupsBounds;
    private final Drawable groupsRipple;
    private Row groupsRow;
    private float height;
    private final Theme.ResourcesProvider resourcesProvider;
    private final ArrayList rows;
    private float rowsKeysWidth;
    private float rowsValuesWidth;
    private float rowsWidth;
    private Text subtitle;
    private Text title;
    private float viewTop;
    private float width;

    public class Row {
        public boolean avatars;
        public final RectF bounds = new RectF();
        public Text key;
        public Text value;

        public Row(CharSequence charSequence, CharSequence charSequence2, boolean z) {
            this.key = new Text(charSequence, 12.0f);
            this.value = new Text(charSequence2, 12.0f, AndroidUtilities.bold());
            this.avatars = z;
        }
    }

    public UserInfoCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.rows = new ArrayList();
        this.fullBounds = new RectF();
        this.fullBounce = new ButtonBounce(this);
        this.groupsBounds = new RectF();
        this.groupsBounce = new ButtonBounce(this);
        AvatarsDrawable avatarsDrawable = new AvatarsDrawable(this, false);
        this.groupsAvatars = avatarsDrawable;
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        Drawable createRadSelectorDrawable = Theme.createRadSelectorDrawable(822083583, 8, 8);
        this.groupsRipple = createRadSelectorDrawable;
        createRadSelectorDrawable.setCallback(this);
        avatarsDrawable.width = AndroidUtilities.dp(50.0f);
        avatarsDrawable.height = AndroidUtilities.dp(13.0f);
        avatarsDrawable.drawStoriesCircle = false;
        avatarsDrawable.setSize(AndroidUtilities.dp(13.0f));
        avatarsDrawable.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_mini_forumarrow).mutate();
        this.groupsArrow = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    private Row addRow(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (!this.rows.isEmpty()) {
            this.height += AndroidUtilities.dp(7.0f);
        }
        Row row = new Row(charSequence, charSequence2, z);
        this.rows.add(row);
        this.height += AndroidUtilities.dp(14.0f);
        this.rowsKeysWidth = Math.max(this.rowsKeysWidth, row.key.getCurrentWidth());
        this.rowsValuesWidth = Math.max(this.rowsValuesWidth, row.value.getCurrentWidth() + (z ? AndroidUtilities.dp(38.0f) : 0));
        return row;
    }

    private CharSequence countryText(String str) {
        String str2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(str);
        if (!TextUtils.isEmpty(languageFlag)) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
        }
        try {
            str2 = new Locale("", str).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
        } catch (Exception e) {
            FileLog.e(e);
            str2 = null;
        }
        if (str != null && str.equalsIgnoreCase("ft")) {
            str2 = LocaleController.getString(R.string.ContactInfoPhoneFragment);
        }
        if (TextUtils.isEmpty(str2)) {
            spannableStringBuilder.append((CharSequence) str);
        } else {
            spannableStringBuilder.append((CharSequence) str2);
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        return Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), true);
    }

    public static String displayDate(String str) {
        String[] split = str.split("\\.");
        if (split.length != 2) {
            return str;
        }
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split[1]);
        Calendar calendar = Calendar.getInstance();
        calendar.set(parseInt2, parseInt - 1, 1, 0, 0, 0);
        calendar.set(14, 0);
        return LocaleController.formatYearMont(calendar.getTimeInMillis() / 1000, true);
    }

    public static boolean isEmpty(TLRPC.PeerSettings peerSettings) {
        return peerSettings == null || (peerSettings.phone_country == null && peerSettings.registration_month == null);
    }

    public boolean animating() {
        return this.animating;
    }

    public void applyServiceShaderMatrix() {
        applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, getX(), this.viewTop);
    }

    public void applyServiceShaderMatrix(int i, int i2, float f, float f2) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(i, i2, f, f2);
        } else {
            Theme.applyServiceShaderMatrix(i, i2, f, f2);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.userInfoDidLoad) {
            long longValue = ((Long) objArr[0]).longValue();
            long j = this.dialogId;
            if (longValue == j) {
                set(j, MessagesController.getInstance(this.currentAccount).getPeerSettings(this.dialogId));
                return;
            }
            return;
        }
        if (i == NotificationCenter.commonChatsLoaded && ((Long) objArr[0]).longValue() == this.dialogId) {
            MessagesController.CommonChatsList commonChats = MessagesController.getInstance(this.currentAccount).getCommonChats(this.dialogId);
            this.commonChats = commonChats;
            int count = commonChats.getCount();
            Row row = this.groupsRow;
            if (row == null || count <= 0) {
                set(this.dialogId, MessagesController.getInstance(this.currentAccount).getPeerSettings(this.dialogId));
                requestLayout();
            } else {
                row.value = new Text(LocaleController.formatPluralString("Groups", count, new Object[0]), 12.0f, AndroidUtilities.bold());
                this.groupsAvatars.setCount(Math.min(3, this.commonChats.chats.size()));
                for (int i3 = 0; i3 < Math.min(3, this.commonChats.chats.size()); i3++) {
                    this.groupsAvatars.setObject(i3, this.currentAccount, this.commonChats.chats.get(i3));
                }
                this.groupsAvatars.commitTransition(true);
            }
            invalidate();
        }
    }

    public boolean hasGradientService() {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider != null ? resourcesProvider.hasGradientService() : Theme.hasGradientService();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.commonChatsLoaded);
        this.groupsAvatars.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.commonChatsLoaded);
        this.groupsAvatars.onDetachedFromWindow();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Text ellipsize;
        float width;
        float height;
        int i;
        float f;
        super.onDraw(canvas);
        canvas.save();
        float width2 = getWidth() / 2.0f;
        this.fullBounds.set((getWidth() - this.width) / 2.0f, (getHeight() - this.height) / 2.0f, (getWidth() + this.width) / 2.0f, (getHeight() + this.height) / 2.0f);
        float scale = this.fullBounce.getScale(0.025f);
        canvas.scale(scale, scale, this.fullBounds.centerX(), this.fullBounds.centerY());
        applyServiceShaderMatrix();
        canvas.drawRoundRect(this.fullBounds, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Theme.getThemePaint("paintChatActionBackground", this.resourcesProvider));
        if (hasGradientService()) {
            canvas.drawRoundRect(this.fullBounds, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Theme.getThemePaint("paintChatActionBackgroundDarken", this.resourcesProvider));
        }
        float f2 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.height) / 2.0f);
        float height2 = ((getHeight() - this.height) / 2.0f) + 0.0f;
        canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
        this.title.ellipsize(this.width - AndroidUtilities.dp(32.0f)).draw(canvas, width2 - (this.title.getWidth() / 2.0f), this.title.getHeight() / 2.0f, -1, 1.0f);
        canvas.translate(0.0f, this.title.getHeight() + AndroidUtilities.dp(3.0f));
        float dp = height2 + AndroidUtilities.dp(14.0f) + this.title.getHeight() + AndroidUtilities.dp(3.0f);
        this.subtitle.ellipsize(this.width - AndroidUtilities.dp(32.0f)).draw(canvas, width2 - (this.subtitle.getWidth() / 2.0f), this.subtitle.getHeight() / 2.0f, -1, 0.7f);
        canvas.translate(0.0f, this.subtitle.getHeight() + AndroidUtilities.dp(11.0f));
        float height3 = dp + this.subtitle.getHeight() + AndroidUtilities.dp(11.0f);
        int i2 = 0;
        while (i2 < this.rows.size()) {
            if (i2 > 0) {
                canvas.translate(f2, AndroidUtilities.dp(7.0f));
                height3 += AndroidUtilities.dp(7.0f);
            }
            canvas.save();
            Row row = (Row) this.rows.get(i2);
            int i3 = i2;
            row.key.draw(canvas, (((width2 - (this.width / 2.0f)) + AndroidUtilities.dp(16.0f)) + this.rowsKeysWidth) - row.key.getCurrentWidth(), row.key.getHeight() / 2.0f, -1, 0.7f);
            row.bounds.set((width2 - (this.width / 2.0f)) + AndroidUtilities.dp(16.0f) + this.rowsKeysWidth + AndroidUtilities.dp(7.66f), height3, (width2 - (this.width / 2.0f)) + AndroidUtilities.dp(16.0f) + this.rowsKeysWidth + AndroidUtilities.dp(7.66f) + row.value.getCurrentWidth() + (row.avatars ? AndroidUtilities.dp(5.0f) + (this.groupsArrow.getIntrinsicWidth() * 0.8f) + this.groupsAvatars.getMaxX() : 0.0f), row.value.getHeight() + height3);
            if (this.groupsRow == row) {
                this.groupsBounds.set(row.bounds);
                this.groupsBounds.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(2.0f));
                float scale2 = this.groupsBounce.getScale(0.025f);
                canvas.scale(scale2, scale2, this.groupsBounds.centerX(), row.value.getHeight() / 2.0f);
                Drawable drawable = this.groupsRipple;
                if (drawable != null) {
                    RectF rectF = this.groupsBounds;
                    drawable.setBounds((int) rectF.left, (int) (rectF.top - height3), (int) rectF.right, (int) (rectF.bottom - height3));
                    this.groupsRipple.draw(canvas);
                }
            }
            row.value.draw(canvas, AndroidUtilities.dp(7.66f) + (width2 - (this.width / 2.0f)) + AndroidUtilities.dp(16.0f) + this.rowsKeysWidth, row.value.getHeight() / 2.0f, -1, 1.0f);
            if (row.avatars) {
                canvas.save();
                canvas.translate((width2 - (this.width / 2.0f)) + AndroidUtilities.dp(16.0f) + this.rowsKeysWidth + AndroidUtilities.dp(7.66f) + row.value.getCurrentWidth() + AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                this.groupsAvatars.onDraw(canvas);
                canvas.translate(this.groupsAvatars.getMaxX() + AndroidUtilities.dp(1.0f), AndroidUtilities.dp(13.0f) / 2.0f);
                this.groupsArrow.setBounds(0, (int) (((-r1.getIntrinsicHeight()) * 0.8f) / 2.0f), (int) (this.groupsArrow.getIntrinsicWidth() * 0.8f), (int) ((this.groupsArrow.getIntrinsicHeight() * 0.8f) / 2.0f));
                this.groupsArrow.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
            height3 += AndroidUtilities.dp(14.0f);
            i2 = i3 + 1;
            f2 = 0.0f;
        }
        if (this.footer != null) {
            canvas.translate(0.0f, AndroidUtilities.dp(12.0f));
            if (this.footer.isMultiline()) {
                ellipsize = this.footer;
                width = width2 - (ellipsize.getWidth() / 2.0f);
                i = -1;
                f = 0.7f;
                height = 0.0f;
            } else {
                ellipsize = this.footer.ellipsize(this.width - AndroidUtilities.dp(32.0f));
                width = width2 - (this.footer.getWidth() / 2.0f);
                height = this.footer.getHeight() / 2.0f;
                i = -1;
                f = 0.7f;
            }
            ellipsize.draw(canvas, width, height, i, f);
        }
        canvas.restore();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), Math.max(0, ((int) this.height) + AndroidUtilities.dp(16.0f)));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        boolean z = this.groupsRow != null && this.groupsBounds.contains(motionEvent.getX(), motionEvent.getY());
        boolean z2 = !z && this.fullBounds.contains(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            this.fullBounce.setPressed(z2);
            this.groupsBounce.setPressed(z);
            this.groupsRipple.setState(z ? new int[]{16842919, 16842910} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (this.fullBounce.isPressed()) {
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment instanceof ChatActivity) {
                    ((ChatActivity) safeLastFragment).openThisProfile();
                }
            } else if (this.groupsBounce.isPressed()) {
                BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment2 != null) {
                    Bundle bundle = new Bundle();
                    long j = this.dialogId;
                    if (j >= 0) {
                        str = "user_id";
                    } else {
                        j = -j;
                        str = "chat_id";
                    }
                    bundle.putLong(str, j);
                    bundle.putBoolean("open_common", true);
                    safeLastFragment2.presentFragment(new ProfileActivity(bundle));
                }
                invalidate();
            }
            this.groupsBounce.setPressed(false);
            this.fullBounce.setPressed(false);
            this.groupsRipple.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            this.groupsBounce.setPressed(false);
            this.fullBounce.setPressed(false);
            this.groupsRipple.setState(new int[0]);
        }
        return this.groupsBounce.isPressed() || this.fullBounce.isPressed();
    }

    public void set(long r13, org.telegram.tgnet.TLRPC.PeerSettings r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.UserInfoCell.set(long, org.telegram.tgnet.TLRPC$PeerSettings):void");
    }

    public void setAnimating(boolean z) {
        this.animating = z;
    }

    public void setVisiblePart(float f, int i) {
        if (Math.abs(this.viewTop - f) > 0.01f || i != this.backgroundHeight) {
            invalidate();
        }
        this.backgroundHeight = i;
        this.viewTop = f;
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.groupsRipple || super.verifyDrawable(drawable);
    }
}
