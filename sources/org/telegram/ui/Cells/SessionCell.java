package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.DotDividerSpan;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;

public final class SessionCell extends FrameLayout {
    public static final int $r8$clinit = 0;
    public final AvatarDrawable avatarDrawable;
    public final int currentAccount;
    public final int currentType;
    public final TextView detailExTextView;
    public final TextView detailTextView;
    public FlickerLoadingView globalGradient;
    public final BackupImageView imageView;
    public final LinearLayout linearLayout;
    public final TextView nameTextView;
    public boolean needDivider;
    public final TextView onlineTextView;
    public final BackupImageView placeholderImageView;
    public boolean showStub;
    public final AnimatedFloat showStubValue;

    public SessionCell(Context context, int i) {
        float f;
        int i2;
        int i3;
        float f2;
        int i4;
        float f3;
        super(context);
        this.showStubValue = new AnimatedFloat(this);
        this.currentAccount = UserConfig.selectedAccount;
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        this.currentType = i;
        int i5 = 21;
        if (i == 1) {
            boolean z = LocaleController.isRTL;
            addView(linearLayout, LayoutHelper.createFrame(-1, 30.0f, (z ? 5 : 3) | 48, z ? 15 : 49, 11.0f, z ? 49 : 15, 0.0f));
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            this.avatarDrawable = avatarDrawable;
            avatarDrawable.setTextSize(AndroidUtilities.dp(10.0f));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(10.0f));
            boolean z2 = LocaleController.isRTL;
            addView(backupImageView, LayoutHelper.createFrame(20, 20.0f, (z2 ? 5 : 3) | 48, z2 ? 0 : 21, 13.0f, z2 ? 21 : 0, 0.0f));
        } else {
            BackupImageView backupImageView2 = new BackupImageView(context);
            this.placeholderImageView = backupImageView2;
            backupImageView2.setRoundRadius(AndroidUtilities.dp(10.0f));
            boolean z3 = LocaleController.isRTL;
            addView(backupImageView2, LayoutHelper.createFrame(42, 42.0f, (z3 ? 5 : 3) | 48, z3 ? 0 : 16, 9.0f, z3 ? 16 : 0, 0.0f));
            this.avatarDrawable = new AvatarDrawable();
            BackupImageView backupImageView3 = new BackupImageView(context);
            this.imageView = backupImageView3;
            backupImageView3.setRoundRadius(AndroidUtilities.dp(10.0f));
            boolean z4 = LocaleController.isRTL;
            addView(backupImageView3, LayoutHelper.createFrame(42, 42.0f, (z4 ? 5 : 3) | 48, z4 ? 0 : 16, 9.0f, z4 ? 16 : 0, 0.0f));
            boolean z5 = LocaleController.isRTL;
            addView(linearLayout, LayoutHelper.createFrame(-1, 30.0f, (z5 ? 5 : 3) | 48, z5 ? 15 : 72, 6.333f, z5 ? 72 : 15, 0.0f));
        }
        TextView textView = new TextView(context);
        this.nameTextView = textView;
        int i6 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(null, i6, false));
        textView.setTextSize(1, i == 0 ? 15.0f : 16.0f);
        textView.setLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        TextView textView2 = new TextView(context);
        this.onlineTextView = textView2;
        textView2.setTextSize(1, i == 0 ? 12.0f : 13.0f);
        textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        if (LocaleController.isRTL) {
            linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -1, 51, 0, 2, 0, 0));
            linearLayout.addView(textView, LayoutHelper.createLinear(0, -1, 1.0f, 53, 10, 0, 0, 0));
        } else {
            linearLayout.addView(textView, LayoutHelper.createLinear(0, -1, 1.0f, 51, 0, 0, 10, 0));
            linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -1, 53, 0, 2, 0, 0));
        }
        if (LocaleController.isRTL) {
            int i7 = i == 0 ? 72 : 21;
            TextView textView3 = new TextView(context);
            this.detailTextView = textView3;
            textView3.setTextColor(Theme.getColor(null, i6, false));
            if (i == 0) {
                f = 13.0f;
            } else {
                f = 14.0f;
            }
            textView3.setTextSize(1, f);
            textView3.setLines(1);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            textView3.setEllipsize(truncateAt);
            if (LocaleController.isRTL) {
                i2 = 5;
            } else {
                i2 = 3;
            }
            textView3.setGravity(i2 | 48);
            if (LocaleController.isRTL) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            int i8 = i3 | 48;
            float f4 = i5;
            if (i == 0) {
                f2 = 28.0f;
            } else {
                f2 = 36.0f;
            }
            float f5 = i7;
            addView(textView3, LayoutHelper.createFrame(-1, -2.0f, i8, f4, f2, f5, 0.0f));
            TextView textView4 = new TextView(context);
            this.detailExTextView = textView4;
            textView4.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText3, false));
            textView4.setTextSize(1, i != 0 ? 14.0f : 13.0f);
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            if (LocaleController.isRTL) {
                i4 = 5;
            } else {
                i4 = 3;
            }
            textView4.setGravity(i4 | 48);
            int i9 = (LocaleController.isRTL ? 5 : 3) | 48;
            if (i == 0) {
                f3 = 46.0f;
            } else {
                f3 = 59.0f;
            }
            addView(textView4, LayoutHelper.createFrame(-1, -2.0f, i9, f4, f3, f5, 0.0f));
        }
        i5 = i == 0 ? 72 : 21;
        TextView textView5 = new TextView(context);
        this.detailTextView = textView5;
        textView5.setTextColor(Theme.getColor(null, i6, false));
        if (i == 0) {
            f = 13.0f;
        } else {
            f = 14.0f;
        }
        textView5.setTextSize(1, f);
        textView5.setLines(1);
        textView5.setMaxLines(1);
        textView5.setSingleLine(true);
        textView5.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        textView5.setGravity(i2 | 48);
        if (LocaleController.isRTL) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        int i10 = i3 | 48;
        float f6 = i5;
        if (i == 0) {
            f2 = 28.0f;
        } else {
            f2 = 36.0f;
        }
        float f7 = i7;
        addView(textView5, LayoutHelper.createFrame(-1, -2.0f, i10, f6, f2, f7, 0.0f));
        TextView textView6 = new TextView(context);
        this.detailExTextView = textView6;
        textView6.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText3, false));
        textView6.setTextSize(1, i != 0 ? 14.0f : 13.0f);
        textView6.setLines(1);
        textView6.setMaxLines(1);
        textView6.setSingleLine(true);
        textView6.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        textView6.setGravity(i4 | 48);
        int i11 = (LocaleController.isRTL ? 5 : 3) | 48;
        if (i == 0) {
            f3 = 46.0f;
        } else {
            f3 = 59.0f;
        }
        addView(textView6, LayoutHelper.createFrame(-1, -2.0f, i11, f6, f3, f7, 0.0f));
    }

    public static CombinedDrawable createDrawable(int i, TLRPC.TL_authorization tL_authorization) {
        int i2;
        int i3;
        int i4;
        String lowerCase = tL_authorization.platform.toLowerCase();
        if (lowerCase.isEmpty()) {
            lowerCase = tL_authorization.system_version.toLowerCase();
        }
        String lowerCase2 = tL_authorization.device_model.toLowerCase();
        if (lowerCase2.contains("safari")) {
            i2 = R.drawable.device_web_safari;
            i3 = Theme.key_avatar_backgroundPink;
            i4 = Theme.key_avatar_background2Pink;
        } else if (lowerCase2.contains("edge")) {
            i2 = R.drawable.device_web_edge;
            i3 = Theme.key_avatar_backgroundPink;
            i4 = Theme.key_avatar_background2Pink;
        } else if (lowerCase2.contains("chrome")) {
            i2 = R.drawable.device_web_chrome;
            i3 = Theme.key_avatar_backgroundPink;
            i4 = Theme.key_avatar_background2Pink;
        } else if (lowerCase2.contains("opera")) {
            i2 = R.drawable.device_web_opera;
            i3 = Theme.key_avatar_backgroundPink;
            i4 = Theme.key_avatar_background2Pink;
        } else if (lowerCase2.contains("firefox")) {
            i2 = R.drawable.device_web_firefox;
            i3 = Theme.key_avatar_backgroundPink;
            i4 = Theme.key_avatar_background2Pink;
        } else if (lowerCase2.contains("vivaldi")) {
            i2 = R.drawable.device_web_other;
            i3 = Theme.key_avatar_backgroundPink;
            i4 = Theme.key_avatar_background2Pink;
        } else if (lowerCase.contains("ios")) {
            i2 = lowerCase2.contains("ipad") ? R.drawable.device_tablet_ios : R.drawable.device_phone_ios;
            i3 = Theme.key_avatar_backgroundBlue;
            i4 = Theme.key_avatar_background2Blue;
        } else if (lowerCase.contains("windows")) {
            i2 = R.drawable.device_desktop_win;
            i3 = Theme.key_avatar_backgroundCyan;
            i4 = Theme.key_avatar_background2Cyan;
        } else if (lowerCase.contains("macos")) {
            i2 = R.drawable.device_desktop_osx;
            i3 = Theme.key_avatar_backgroundCyan;
            i4 = Theme.key_avatar_background2Cyan;
        } else if (lowerCase.contains("android")) {
            i2 = lowerCase2.contains("tab") ? R.drawable.device_tablet_android : R.drawable.device_phone_android;
            i3 = Theme.key_avatar_backgroundGreen;
            i4 = Theme.key_avatar_background2Green;
        } else {
            if (lowerCase.contains("fragment")) {
                i2 = R.drawable.fragment;
            } else if (lowerCase.equalsIgnoreCase("search")) {
                i2 = R.drawable.msg_search;
                i3 = Theme.key_avatar_backgroundBlue;
                i4 = Theme.key_avatar_background2Blue;
            } else if (lowerCase.contains("anonymous")) {
                i2 = R.drawable.large_hidden;
                i3 = Theme.key_avatar_backgroundBlue;
                i4 = Theme.key_avatar_background2Blue;
            } else if (lowerCase.contains("premiumbot")) {
                i2 = R.drawable.filled_star_plus;
                i3 = Theme.key_color_yellow;
                i4 = Theme.key_color_orange;
            } else if (lowerCase.contains("ads")) {
                i2 = R.drawable.msg_channel;
                i3 = Theme.key_avatar_backgroundPink;
                i4 = Theme.key_avatar_background2Pink;
            } else if (lowerCase.contains("api")) {
                i2 = R.drawable.filled_paid_broadcast;
                i3 = Theme.key_avatar_backgroundGreen;
                i4 = Theme.key_avatar_background2Green;
            } else if (lowerCase.equals("?")) {
                i2 = R.drawable.msg_emoji_question;
            } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                i2 = R.drawable.device_desktop_other;
                i3 = Theme.key_avatar_backgroundCyan;
                i4 = Theme.key_avatar_background2Cyan;
            } else {
                i2 = R.drawable.device_web_other;
                i3 = Theme.key_avatar_backgroundPink;
                i4 = Theme.key_avatar_background2Pink;
            }
            i3 = -1;
            i4 = -1;
        }
        Drawable drawableMutate = ApplicationLoader.applicationContext.getDrawable(i2).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_avatar_text, false), PorterDuff.Mode.SRC_IN));
        float f = i;
        CombinedDrawable combinedDrawable = new CombinedDrawable(new CircleGradientDrawable(AndroidUtilities.dp(f), i3 == -1 ? -16777216 : Theme.getColor(null, i3, false), i4 != -1 ? Theme.getColor(null, i4, false) : -16777216), drawableMutate);
        if (lowerCase != null && lowerCase.contains("fragment")) {
            combinedDrawable.setIconSize((int) ((drawableMutate.getIntrinsicWidth() / 44.0f) * f), (int) ((drawableMutate.getIntrinsicHeight() / 44.0f) * f));
        }
        return combinedDrawable;
    }

    private void setContentAlpha(float f) {
        TextView textView = this.detailExTextView;
        if (textView != null) {
            textView.setAlpha(f);
        }
        TextView textView2 = this.detailTextView;
        if (textView2 != null) {
            textView2.setAlpha(f);
        }
        TextView textView3 = this.nameTextView;
        if (textView3 != null) {
            textView3.setAlpha(f);
        }
        TextView textView4 = this.onlineTextView;
        if (textView4 != null) {
            textView4.setAlpha(f);
        }
        BackupImageView backupImageView = this.imageView;
        if (backupImageView != null) {
            backupImageView.setAlpha(f);
        }
        BackupImageView backupImageView2 = this.placeholderImageView;
        if (backupImageView2 != null) {
            backupImageView2.setAlpha(1.0f - f);
        }
        LinearLayout linearLayout = this.linearLayout;
        if (linearLayout != null) {
            linearLayout.setAlpha(f);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f = this.showStubValue.set(this.showStub ? 1.0f : 0.0f);
        setContentAlpha(1.0f - f);
        if (f > 0.0f && this.globalGradient != null) {
            if (f < 1.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, (int) (f * 255.0f), 31);
            }
            this.globalGradient.updateColors();
            this.globalGradient.updateGradient();
            if (getParent() != null) {
                View view = (View) getParent();
                this.globalGradient.setParentSize(view.getMeasuredWidth(), view.getMeasuredHeight(), -getX());
            }
            LinearLayout linearLayout = this.linearLayout;
            float fDp = AndroidUtilities.dp(12.0f) + this.nameTextView.getTop() + linearLayout.getTop();
            float x = linearLayout.getX();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(x, fDp - AndroidUtilities.dp(4.0f), (getMeasuredWidth() * 0.2f) + x, fDp + AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.globalGradient.getPaint());
            float top = (this.detailTextView.getTop() + linearLayout.getTop()) - AndroidUtilities.dp(1.0f);
            float x2 = linearLayout.getX();
            rectF2.set(x2, top - AndroidUtilities.dp(4.0f), (getMeasuredWidth() * 0.4f) + x2, top + AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.globalGradient.getPaint());
            float top2 = (this.detailExTextView.getTop() + linearLayout.getTop()) - AndroidUtilities.dp(1.0f);
            float x3 = linearLayout.getX();
            rectF2.set(x3, top2 - AndroidUtilities.dp(4.0f), (getMeasuredWidth() * 0.3f) + x3, top2 + AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.globalGradient.getPaint());
            invalidate();
            if (f < 1.0f) {
                canvas.restore();
            }
        }
        if (this.needDivider) {
            int i = this.currentType == 1 ? 49 : 72;
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(i), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(i) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.currentType == 0 ? 70.0f : 90.0f) + (this.needDivider ? 1 : 0), 1073741824));
    }

    public final void setSession(TLObject tLObject, boolean z) {
        String firstName;
        String strStringForMessageListDate;
        this.needDivider = z;
        BackupImageView backupImageView = this.imageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(10.0f));
        boolean z2 = tLObject instanceof TL_account.TL_connectedBot;
        TextView textView = this.detailExTextView;
        TextView textView2 = this.detailTextView;
        TextView textView3 = this.nameTextView;
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        int i = this.currentAccount;
        if (z2) {
            TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) tLObject;
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(tL_connectedBot.bot_id));
            avatarDrawable.setInfo(user);
            backupImageView.setRoundRadius(AndroidUtilities.dp(21.0f));
            backupImageView.setForUserOrChat(user, avatarDrawable);
            textView3.setText(UserObject.getUserName(user));
            textView2.setText(LocaleController.getString(R.string.SessionBot));
            if (TLObject.hasFlag(tL_connectedBot.flags, 2)) {
                textView.setText(LocaleController.formatString(R.string.SessionBotConnectedOn, LocaleController.formatDateTime(tL_connectedBot.date, false)));
            }
        } else if (tLObject instanceof TLRPC.TL_authorization) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            backupImageView.setImageDrawable(createDrawable(42, tL_authorization));
            StringBuilder sb = new StringBuilder();
            if (tL_authorization.device_model.length() != 0) {
                sb.append(tL_authorization.device_model);
            }
            if (sb.length() == 0) {
                if (tL_authorization.platform.length() != 0) {
                    sb.append(tL_authorization.platform);
                }
                if (tL_authorization.system_version.length() != 0) {
                    if (tL_authorization.platform.length() != 0) {
                        sb.append(" ");
                    }
                    sb.append(tL_authorization.system_version);
                }
            }
            textView3.setText(sb);
            if ((tL_authorization.flags & 1) != 0) {
                setTag(Integer.valueOf(Theme.key_windowBackgroundWhiteValueText));
                strStringForMessageListDate = LocaleController.getString(R.string.Online);
            } else {
                setTag(Integer.valueOf(Theme.key_windowBackgroundWhiteGrayText3));
                strStringForMessageListDate = LocaleController.stringForMessageListDate(tL_authorization.date_active);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (tL_authorization.country.length() != 0) {
                spannableStringBuilder.append((CharSequence) tL_authorization.country);
            }
            if (spannableStringBuilder.length() != 0) {
                DotDividerSpan dotDividerSpan = new DotDividerSpan();
                dotDividerSpan.setTopPadding(AndroidUtilities.dp(1.5f));
                spannableStringBuilder.append((CharSequence) " . ").setSpan(dotDividerSpan, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
            }
            spannableStringBuilder.append((CharSequence) strStringForMessageListDate);
            textView.setText(spannableStringBuilder);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_authorization.app_name);
            sb2.append(" ");
            sb2.append(tL_authorization.app_version);
            textView2.setText(sb2);
        } else if (tLObject instanceof TLRPC.TL_webAuthorization) {
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) tLObject;
            TLRPC.User user2 = MessagesController.getInstance(i).getUser(Long.valueOf(tL_webAuthorization.bot_id));
            textView3.setText(tL_webAuthorization.domain);
            if (user2 != null) {
                avatarDrawable.setInfo(i, user2);
                firstName = UserObject.getFirstName(user2);
                backupImageView.setForUserOrChat(user2, avatarDrawable);
            } else {
                firstName = "";
            }
            int i2 = Theme.key_windowBackgroundWhiteGrayText3;
            setTag(Integer.valueOf(i2));
            TextView textView4 = this.onlineTextView;
            textView4.setText(LocaleController.stringForMessageListDate(tL_webAuthorization.date_active));
            textView4.setTextColor(Theme.getColor(null, i2, false));
            StringBuilder sb3 = new StringBuilder();
            if (tL_webAuthorization.ip.length() != 0) {
                sb3.append(tL_webAuthorization.ip);
            }
            if (tL_webAuthorization.region.length() != 0) {
                if (sb3.length() != 0) {
                    sb3.append(" ");
                }
                sb3.append("— ");
                sb3.append(tL_webAuthorization.region);
            }
            textView.setText(sb3);
            StringBuilder sb4 = new StringBuilder();
            if (!TextUtils.isEmpty(firstName)) {
                sb4.append(firstName);
            }
            if (tL_webAuthorization.browser.length() != 0) {
                if (sb4.length() != 0) {
                    sb4.append(", ");
                }
                sb4.append(tL_webAuthorization.browser);
            }
            if (tL_webAuthorization.platform.length() != 0) {
                if (sb4.length() != 0) {
                    sb4.append(", ");
                }
                sb4.append(tL_webAuthorization.platform);
            }
            textView2.setText(sb4);
        }
        if (this.showStub) {
            this.showStub = false;
            invalidate();
        }
    }

    public final class CircleGradientDrawable extends Drawable {
        public final int $r8$classId = 0;
        public final Paint paint;
        public final int size;

        public CircleGradientDrawable(int i, int i2, int i3) {
            this.size = i;
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i, new int[]{i2, i3}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }

        @Override
        public final void draw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, this.paint);
                    break;
                default:
                    canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, this.paint);
                    break;
            }
        }

        @Override
        public int getIntrinsicHeight() {
            switch (this.$r8$classId) {
                case 0:
                    return this.size;
                default:
                    return super.getIntrinsicHeight();
            }
        }

        @Override
        public int getIntrinsicWidth() {
            switch (this.$r8$classId) {
                case 0:
                    return this.size;
                default:
                    return super.getIntrinsicWidth();
            }
        }

        @Override
        public final int getOpacity() {
            switch (this.$r8$classId) {
            }
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
            switch (this.$r8$classId) {
                case 0:
                    this.paint.setAlpha(i);
                    break;
                default:
                    this.paint.setAlpha(Theme.multAlpha(i / 255.0f, this.size));
                    break;
            }
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                default:
                    this.paint.setColorFilter(colorFilter);
                    break;
            }
        }

        public CircleGradientDrawable(Paint paint, int i) {
            this.paint = paint;
            this.size = i;
        }

        private final void setColorFilter$org$telegram$ui$Cells$SessionCell$CircleGradientDrawable(ColorFilter colorFilter) {
        }
    }
}
