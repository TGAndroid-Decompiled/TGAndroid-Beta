package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AvatarsDrawable;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.Text;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

public final class UserInfoCell extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int $r8$clinit = 0;
    public boolean animating;
    public int backgroundHeight;
    public MessagesController.CommonChatsList commonChats;
    public final int currentAccount;
    public long dialogId;
    public Text footer;
    public final ButtonBounce fullBounce;
    public final RectF fullBounds;
    public final Drawable groupsArrow;
    public final AvatarsDrawable groupsAvatars;
    public final ButtonBounce groupsBounce;
    public final RectF groupsBounds;
    public final BaseCell.RippleDrawableSafe groupsRipple;
    public Row groupsRow;
    public float height;
    public final Theme.ResourcesProvider resourcesProvider;
    public final ArrayList rows;
    public float rowsKeysWidth;
    public float rowsValuesWidth;
    public float rowsWidth;
    public Text subtitle;
    public Text title;
    public float viewTop;
    public float width;

    public final class Row {
        public final boolean avatars;
        public final RectF bounds = new RectF();
        public final Text key;
        public Text value;

        public Row(String str, CharSequence charSequence, boolean z) {
            this.key = new Text(str, 12.0f);
            this.value = new Text(charSequence, 12.0f, AndroidUtilities.bold());
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
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateRadSelectorDrawable = Theme.createRadSelectorDrawable(822083583, 8, 8);
        this.groupsRipple = rippleDrawableSafeCreateRadSelectorDrawable;
        rippleDrawableSafeCreateRadSelectorDrawable.setCallback(this);
        avatarsDrawable.width = AndroidUtilities.dp(50.0f);
        avatarsDrawable.height = AndroidUtilities.dp(13.0f);
        avatarsDrawable.drawStoriesCircle = false;
        avatarsDrawable.setSize(AndroidUtilities.dp(13.0f));
        avatarsDrawable.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.msg_mini_forumarrow).mutate();
        this.groupsArrow = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final Row addRow(String str, CharSequence charSequence, boolean z) {
        ArrayList arrayList = this.rows;
        if (!arrayList.isEmpty()) {
            this.height += AndroidUtilities.dp(7.0f);
        }
        Row row = new Row(str, charSequence, z);
        arrayList.add(row);
        this.height += AndroidUtilities.dp(14.0f);
        this.rowsKeysWidth = Math.max(this.rowsKeysWidth, row.key.getCurrentWidth());
        this.rowsValuesWidth = Math.max(this.rowsValuesWidth, row.value.getCurrentWidth() + (z ? AndroidUtilities.dp(38.0f) : 0));
        return row;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.userInfoDidLoad;
        int i4 = this.currentAccount;
        if (i == i3) {
            long jLongValue = ((Long) objArr[0]).longValue();
            long j = this.dialogId;
            if (jLongValue == j) {
                set(j, MessagesController.getInstance(i4).getPeerSettings(this.dialogId));
                return;
            }
            return;
        }
        if (i == NotificationCenter.commonChatsLoaded && ((Long) objArr[0]).longValue() == this.dialogId) {
            MessagesController.CommonChatsList commonChats = MessagesController.getInstance(i4).getCommonChats(this.dialogId);
            this.commonChats = commonChats;
            int count = commonChats.getCount();
            Row row = this.groupsRow;
            if (row == null || count <= 0) {
                set(this.dialogId, MessagesController.getInstance(i4).getPeerSettings(this.dialogId));
                requestLayout();
            } else {
                row.value = new Text(LocaleController.formatPluralString("Groups", count, new Object[0]), 12.0f, AndroidUtilities.bold());
                int iMin = Math.min(3, this.commonChats.chats.size());
                AvatarsDrawable avatarsDrawable = this.groupsAvatars;
                avatarsDrawable.setCount(iMin);
                for (int i5 = 0; i5 < Math.min(3, this.commonChats.chats.size()); i5++) {
                    avatarsDrawable.setObject(i5, i4, this.commonChats.chats.get(i5));
                }
                avatarsDrawable.commitTransition(true);
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.commonChatsLoaded);
        this.groupsAvatars.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.commonChatsLoaded);
        this.groupsAvatars.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float intrinsicWidth;
        super.onDraw(canvas);
        canvas.save();
        float f = 2.0f;
        float width = getWidth() / 2.0f;
        RectF rectF = this.fullBounds;
        rectF.set((getWidth() - this.width) / 2.0f, (getHeight() - this.height) / 2.0f, (getWidth() + this.width) / 2.0f, (getHeight() + this.height) / 2.0f);
        float f2 = 0.025f;
        float scale = this.fullBounce.getScale(0.025f);
        canvas.scale(scale, scale, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i = this.backgroundHeight;
        float x = getX();
        float f3 = this.viewTop;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(measuredWidth, i, x, f3);
        } else {
            Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, measuredWidth, i, x, f3);
        }
        float f4 = 16.0f;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Theme.getThemePaint("paintChatActionBackground", resourcesProvider));
        if (resourcesProvider != null ? resourcesProvider.hasGradientService() : Theme.hasGradientService()) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Theme.getThemePaint("paintChatActionBackgroundDarken", resourcesProvider));
        }
        float f5 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.height) / 2.0f);
        float fM = ImageReceiver$$ExternalSyntheticOutline0.m(getHeight(), this.height, 2.0f, 0.0f);
        canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
        float fDp = fM + AndroidUtilities.dp(14.0f);
        this.title.ellipsize(this.width - AndroidUtilities.dp(32.0f)).draw(canvas, width - (this.title.getWidth() / 2.0f), this.title.getHeight() / 2.0f, -1, 1.0f);
        canvas.translate(0.0f, this.title.getHeight() + AndroidUtilities.dp(3.0f));
        float height = fDp + this.title.getHeight() + AndroidUtilities.dp(3.0f);
        this.subtitle.ellipsize(this.width - AndroidUtilities.dp(32.0f)).draw(canvas, width - (this.subtitle.getWidth() / 2.0f), this.subtitle.getHeight() / 2.0f, -1, 0.7f);
        canvas.translate(0.0f, this.subtitle.getHeight() + AndroidUtilities.dp(11.0f));
        float height2 = this.subtitle.getHeight() + AndroidUtilities.dp(11.0f) + height;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.rows;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (i2 > 0) {
                canvas.translate(f5, AndroidUtilities.dp(7.0f));
                height2 += AndroidUtilities.dp(7.0f);
            }
            canvas.save();
            Row row = (Row) arrayList.get(i2);
            float fDp2 = (((width - (this.width / f)) + AndroidUtilities.dp(f4)) + this.rowsKeysWidth) - row.key.getCurrentWidth();
            float fDp3 = (width - (this.width / f)) + AndroidUtilities.dp(f4) + this.rowsKeysWidth + AndroidUtilities.dp(7.66f);
            float fDp4 = (fDp3 - fDp2) - AndroidUtilities.dp(7.66f);
            Text text = row.key;
            float f6 = height2;
            text.ellipsize(fDp4).draw(canvas, fDp2, text.getHeight() / f, -1, 0.7f);
            RectF rectF2 = row.bounds;
            float fDp5 = (width - (this.width / 2.0f)) + AndroidUtilities.dp(16.0f) + this.rowsKeysWidth + AndroidUtilities.dp(7.66f);
            float currentWidth = row.value.getCurrentWidth() + (width - (this.width / 2.0f)) + AndroidUtilities.dp(16.0f) + this.rowsKeysWidth + AndroidUtilities.dp(7.66f);
            AvatarsDrawable avatarsDrawable = this.groupsAvatars;
            Drawable drawable = this.groupsArrow;
            boolean z = row.avatars;
            if (z) {
                intrinsicWidth = (drawable.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f) + avatarsDrawable.getMaxX();
            } else {
                intrinsicWidth = 0.0f;
            }
            rectF2.set(fDp5, f6, currentWidth + intrinsicWidth, row.value.getHeight() + f6);
            if (this.groupsRow == row) {
                RectF rectF3 = this.groupsBounds;
                rectF3.set(rectF2);
                rectF3.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(2.0f));
                float scale2 = this.groupsBounce.getScale(f2);
                canvas.scale(scale2, scale2, rectF3.centerX(), row.value.getHeight() / 2.0f);
                BaseCell.RippleDrawableSafe rippleDrawableSafe = this.groupsRipple;
                if (rippleDrawableSafe != null) {
                    rippleDrawableSafe.setBounds((int) rectF3.left, (int) (rectF3.top - f6), (int) rectF3.right, (int) (rectF3.bottom - f6));
                    rippleDrawableSafe.draw(canvas);
                }
            }
            row.value.ellipsize((((this.width / 2.0f) + width) - AndroidUtilities.dp(8.0f)) - fDp3).draw(canvas, fDp3, row.value.getHeight() / 2.0f, -1, 1.0f);
            if (z) {
                canvas.save();
                canvas.translate(row.value.getCurrentWidth() + (width - (this.width / 2.0f)) + AndroidUtilities.dp(16.0f) + this.rowsKeysWidth + AndroidUtilities.dp(7.66f) + AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                avatarsDrawable.onDraw(canvas);
                canvas.translate(avatarsDrawable.getMaxX() + AndroidUtilities.dp(1.0f), AndroidUtilities.dp(13.0f) / 2.0f);
                drawable.setBounds(0, (int) (((-drawable.getIntrinsicHeight()) * 0.8f) / 2.0f), (int) (drawable.getIntrinsicWidth() * 0.8f), (int) ((drawable.getIntrinsicHeight() * 0.8f) / 2.0f));
                drawable.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
            height2 = AndroidUtilities.dp(14.0f) + f6;
            i2++;
            f = 2.0f;
            f2 = 0.025f;
            f4 = 16.0f;
            f5 = 0.0f;
        }
        if (this.footer != null) {
            canvas.translate(0.0f, AndroidUtilities.dp(12.0f));
            if (this.footer.isMultiline()) {
                Text text2 = this.footer;
                text2.draw(canvas, width - (text2.getWidth() / 2.0f), 0.0f, -1, 0.7f);
            } else {
                this.footer.ellipsize(this.width - AndroidUtilities.dp(32.0f)).draw(canvas, width - (this.footer.getWidth() / 2.0f), this.footer.getHeight() / 2.0f, -1, 0.7f);
            }
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), MessageObject$$ExternalSyntheticOutline0.m(16.0f, (int) this.height, 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = this.groupsRow != null && this.groupsBounds.contains(motionEvent.getX(), motionEvent.getY());
        boolean z2 = !z && this.fullBounds.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.groupsRipple;
        ButtonBounce buttonBounce = this.groupsBounce;
        ButtonBounce buttonBounce2 = this.fullBounce;
        if (action == 0) {
            buttonBounce2.setPressed(z2);
            buttonBounce.setPressed(z);
            rippleDrawableSafe.setState(z ? new int[]{16842919, 16842910} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (buttonBounce2.isPressed()) {
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment instanceof ChatActivity) {
                    ((ChatActivity) safeLastFragment).openThisProfile();
                }
            } else if (buttonBounce.isPressed()) {
                BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment2 != null) {
                    Bundle bundle = new Bundle();
                    long j = this.dialogId;
                    if (j >= 0) {
                        bundle.putLong("user_id", j);
                    } else {
                        bundle.putLong("chat_id", -j);
                    }
                    bundle.putBoolean("open_common", true);
                    safeLastFragment2.presentFragment(new ProfileActivity(bundle));
                }
                invalidate();
            }
            buttonBounce.setPressed(false);
            buttonBounce2.setPressed(false);
            rippleDrawableSafe.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            buttonBounce.setPressed(false);
            buttonBounce2.setPressed(false);
            rippleDrawableSafe.setState(new int[0]);
        }
        return buttonBounce.isPressed() || buttonBounce2.isPressed();
    }

    public final void set(long j, TLRPC.PeerSettings peerSettings) {
        TL_bots.botVerification botverification;
        this.dialogId = j;
        this.width = 0.0f;
        this.height = 0.0f;
        this.rowsKeysWidth = 0.0f;
        this.rowsValuesWidth = 0.0f;
        this.rows.clear();
        int i = (int) (AndroidUtilities.displaySize.x * 0.95f);
        this.height += AndroidUtilities.dp(14.0f);
        Text text = new Text(DialogObject.getName(j), 14.0f, AndroidUtilities.bold());
        this.title = text;
        this.height = text.getHeight() + AndroidUtilities.dp(3.0f) + this.height;
        int i2 = this.currentAccount;
        Text text2 = new Text(LocaleController.getString(ContactsController.getInstance(i2).isContact(j) ? R.string.ContactInfoIsContact : R.string.ContactInfoIsNotContact), 14.0f);
        this.subtitle = text2;
        this.height = text2.getHeight() + AndroidUtilities.dp(11.0f) + this.height;
        if (peerSettings != null && peerSettings.phone_country != null) {
            addRow(LocaleController.getString(R.string.ContactInfoPhone), LocaleController.getCountryWithFlag(peerSettings.phone_country, 12, R.string.ContactInfoPhoneFragment), false);
        }
        if (peerSettings != null && peerSettings.registration_month != null) {
            String string = LocaleController.getString(R.string.ContactInfoRegistration);
            String yearMont = peerSettings.registration_month;
            String[] strArrSplit = yearMont.split("\\.");
            if (strArrSplit.length == 2) {
                int i3 = Integer.parseInt(strArrSplit[0]);
                int i4 = Integer.parseInt(strArrSplit[1]);
                Calendar calendar = Calendar.getInstance();
                calendar.set(i4, i3 - 1, 1, 0, 0, 0);
                calendar.set(14, 0);
                yearMont = LocaleController.formatYearMont(calendar.getTimeInMillis() / 1000, true);
            }
            addRow(string, yearMont, false);
        }
        TLRPC.User user = j < 0 ? null : MessagesController.getInstance(i2).getUser(Long.valueOf(j));
        TLRPC.UserFull userFull = j < 0 ? null : MessagesController.getInstance(i2).getUserFull(j);
        if (userFull == null && j > 0) {
            MessagesController.getInstance(i2).loadUserInfo(MessagesController.getInstance(i2).getUser(Long.valueOf(j)), true, 0);
        }
        if (userFull != null) {
            MessagesController.CommonChatsList commonChats = MessagesController.getInstance(i2).getCommonChats(j);
            this.commonChats = commonChats;
            int iMax = Math.max(userFull.common_chats_count, commonChats.getCount());
            if (iMax > 0) {
                this.groupsRow = addRow(LocaleController.getString(R.string.ContactInfoCommonGroups), LocaleController.formatPluralString("Groups", iMax, new Object[0]), true);
                int iMin = Math.min(3, this.commonChats.chats.size());
                AvatarsDrawable avatarsDrawable = this.groupsAvatars;
                avatarsDrawable.setCount(iMin);
                for (int i5 = 0; i5 < Math.min(3, this.commonChats.chats.size()); i5++) {
                    avatarsDrawable.setObject(i5, i2, this.commonChats.chats.get(i5));
                }
                avatarsDrawable.commitTransition(true);
            } else {
                this.commonChats = null;
                this.groupsRow = null;
            }
        } else {
            this.commonChats = null;
            this.groupsRow = null;
        }
        this.rowsWidth = this.rowsKeysWidth + AndroidUtilities.dp(7.66f) + this.rowsValuesWidth;
        if (user == null || user.verified || UserObject.isService(user.id)) {
            this.footer = null;
            this.height += AndroidUtilities.dp(14.0f);
        } else if (user.bot_verification_icon == 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("i  ");
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.filled_info);
            coloredImageSpan.setScale(0.55f, -0.55f);
            coloredImageSpan.translate(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(-1.0f));
            spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ContactInfoNotVerified));
            this.footer = new Text(spannableStringBuilder, 12.0f);
            this.height = this.footer.getHeight() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.height;
        } else if (userFull == null || (botverification = userFull.bot_verification) == null) {
            this.footer = null;
            this.height += AndroidUtilities.dp(14.0f);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
            this.footer = new Text(spannableStringBuilder2, 12.0f);
            spannableStringBuilder2.setSpan(new AnimatedEmojiSpan(botverification.icon, this.footer.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) botverification.description);
            Text textMultiline = new Text(spannableStringBuilder2, 12.0f).align(Layout.Alignment.ALIGN_CENTER).multiline(5);
            Point point = AndroidUtilities.displaySize;
            this.footer = textMultiline.setMaxWidth(Math.min(point.x, point.y) * 0.5f).supportAnimatedEmojis(this);
            this.height = this.footer.getHeight() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.height;
        }
        float fMax = Math.max(this.width, this.title.getWidth());
        this.width = fMax;
        float fMax2 = Math.max(fMax, this.subtitle.getWidth());
        this.width = fMax2;
        float fMax3 = Math.max(fMax2, this.rowsWidth);
        this.width = fMax3;
        this.width = Math.min(fMax3 + AndroidUtilities.dp(32.0f), i);
    }

    public void setAnimating(boolean z) {
        this.animating = z;
    }

    public final void setVisiblePart(float f, int i) {
        if (Math.abs(this.viewTop - f) > 0.01f || i != this.backgroundHeight) {
            invalidate();
        }
        this.backgroundHeight = i;
        this.viewTop = f;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.groupsRipple || super.verifyDrawable(drawable);
    }
}
