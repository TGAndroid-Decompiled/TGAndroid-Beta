package org.telegram.ui;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzkb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.Switch;

public class SessionBottomSheet extends BottomSheet {
    RLottieImageView imageView;
    BaseFragment parentFragment;
    TLRPC.TL_authorization session;

    public class AnonymousClass8 implements View.OnClickListener {
        final Callback val$callback;
        final BaseFragment val$fragment;
        final TLRPC.TL_authorization val$session;

        public AnonymousClass8(Callback callback, TLRPC.TL_authorization tL_authorization, BaseFragment baseFragment) {
            this.val$callback = callback;
            this.val$session = tL_authorization;
            this.val$fragment = baseFragment;
        }

        public void lambda$onClick$0(Callback callback, TLRPC.TL_authorization tL_authorization, AlertDialog alertDialog, int i) {
            callback.onSessionTerminated(tL_authorization);
            SessionBottomSheet.this.lambda$showGiftOfferSheet$15();
        }

        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(SessionBottomSheet.this.parentFragment.getParentActivity(), 0, null);
            builder.setMessage(LocaleController.getString(R.string.TerminateSessionText));
            builder.setTitle(LocaleController.getString(R.string.AreYouSureSessionTitle));
            builder.setPositiveButton(LocaleController.getString(R.string.Terminate), new WearAuthSheet$$ExternalSyntheticLambda5(this, this.val$callback, this.val$session, 11));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate = builder.create();
            this.val$fragment.showDialog(alertDialogCreate);
            TextView textView = (TextView) alertDialogCreate.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        }
    }

    public interface Callback {
        void onSessionTerminated(TLRPC.TL_authorization tL_authorization);
    }

    public static class ItemView extends FrameLayout {
        TextView descriptionText;
        ImageView iconView;
        boolean needDivider;
        Switch switchView;
        TextView valueText;

        public ItemView(Context context, boolean z) {
            super(context);
            this.needDivider = false;
            ImageView imageView = new ImageView(context);
            this.iconView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.iconView, LayoutHelper.createFrame(32, 32.0f, 0, 12.0f, 4.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 0, 64.0f, 4.0f, 0.0f, 4.0f));
            TextView textView = new TextView(context);
            this.valueText = textView;
            textView.setTextSize(2, 16.0f);
            this.valueText.setGravity(3);
            this.valueText.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            TextView textViewM = Theme.ResourcesProvider.CC.m(linearLayout, this.valueText, LayoutHelper.createLinear(-1, -2, 0, 0, 0, z ? 64 : 0, 0), context);
            this.descriptionText = textViewM;
            textViewM.setTextSize(2, 13.0f);
            this.descriptionText.setGravity(3);
            this.descriptionText.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false));
            linearLayout.addView(this.descriptionText, LayoutHelper.createLinear(-1, -2, 0, 0, 4, z ? 64 : 0, 0));
            setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
            if (z) {
                Switch r2 = new Switch(context);
                this.switchView = r2;
                r2.setDrawIconType(1);
                addView(this.switchView, LayoutHelper.createFrame(37, 40.0f, 21, 21.0f, 0.0f, 21.0f, 0.0f));
            }
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (this.needDivider) {
                canvas.drawRect(AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (this.switchView != null) {
                accessibilityNodeInfo.setClassName("android.widget.Switch");
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(this.switchView.isChecked());
                StringBuilder sb = new StringBuilder();
                sb.append((Object) this.valueText.getText());
                sb.append("\n");
                sb.append((Object) this.descriptionText.getText());
                sb.append("\n");
                sb.append(LocaleController.getString(this.switchView.isChecked() ? R.string.NotificationsOn : R.string.NotificationsOff));
                accessibilityNodeInfo.setText(sb.toString());
            }
        }
    }

    public SessionBottomSheet(BaseFragment baseFragment, final TLRPC.TL_authorization tL_authorization, boolean z, Callback callback) {
        boolean z2;
        boolean z3;
        super(baseFragment.getParentActivity(), false, false, null);
        setOpenNoDelay(true);
        Activity parentActivity = baseFragment.getParentActivity();
        this.session = tL_authorization;
        this.parentFragment = baseFragment;
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        RLottieImageView rLottieImageView = new RLottieImageView(parentActivity);
        this.imageView = rLottieImageView;
        rLottieImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (SessionBottomSheet.this.imageView.isPlaying() || SessionBottomSheet.this.imageView.getAnimatedDrawable() == null) {
                    return;
                }
                SessionBottomSheet.this.imageView.getAnimatedDrawable().setCurrentFrame(40);
                SessionBottomSheet.this.imageView.playAnimation();
            }
        });
        this.imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(this.imageView, LayoutHelper.createLinear(70, 70, 1, 0, 16, 0, 0));
        TextView textView = new TextView(parentActivity);
        zzkb.m(20.0f, 2, textView);
        textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        textView.setGravity(17);
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 1, 21, 12, 21, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false));
        textView2.setTextSize(2, 13.0f);
        textView2.setGravity(17);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 21, 4, 21, 21));
        textView2.setText((tL_authorization.flags & 1) != 0 ? LocaleController.getString(R.string.Online) : LocaleController.formatDateTime(tL_authorization.date_active, true));
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
        textView.setText(sb);
        setAnimation(tL_authorization, this.imageView);
        ItemView itemView = new ItemView(parentActivity, false);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_authorization.app_name);
        sb2.append(" ");
        sb2.append(tL_authorization.app_version);
        itemView.valueText.setText(sb2);
        Drawable drawableMutate = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
        int i = Theme.key_windowBackgroundWhiteGrayIcon;
        int color = Theme.getColor(null, i, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(color, mode));
        itemView.iconView.setImageDrawable(drawableMutate);
        itemView.descriptionText.setText(LocaleController.getString(R.string.Application));
        linearLayout.addView(itemView);
        if (tL_authorization.country.length() != 0) {
            ItemView itemView2 = new ItemView(parentActivity, false);
            itemView2.valueText.setText(tL_authorization.country);
            Drawable drawableMutate2 = parentActivity.getDrawable(R.drawable.msg_location).mutate();
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), mode));
            itemView2.iconView.setImageDrawable(drawableMutate2);
            itemView2.descriptionText.setText(LocaleController.getString(R.string.Location));
            itemView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SessionBottomSheet.this.copyText(tL_authorization.country);
                }
            });
            itemView2.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    SessionBottomSheet.this.copyText(tL_authorization.country);
                    return true;
                }
            });
            itemView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 2, -1));
            linearLayout.addView(itemView2);
            itemView.needDivider = true;
            itemView = itemView2;
        }
        if (tL_authorization.ip.length() != 0) {
            ItemView itemView3 = new ItemView(parentActivity, false);
            itemView3.valueText.setText(tL_authorization.ip);
            Drawable drawableMutate3 = parentActivity.getDrawable(R.drawable.msg_language).mutate();
            drawableMutate3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), mode));
            itemView3.iconView.setImageDrawable(drawableMutate3);
            itemView3.descriptionText.setText(LocaleController.getString(R.string.IpAddress));
            itemView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SessionBottomSheet.this.copyText(tL_authorization.ip);
                }
            });
            itemView3.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    SessionBottomSheet.this.copyText(tL_authorization.country);
                    return true;
                }
            });
            itemView3.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 2, -1));
            linearLayout.addView(itemView3);
            z2 = true;
            itemView.needDivider = true;
            itemView = itemView3;
        } else {
            z2 = true;
        }
        if (secretChatsEnabled(tL_authorization)) {
            final ItemView itemView4 = new ItemView(parentActivity, z2);
            itemView4.valueText.setText(LocaleController.getString(R.string.AcceptSecretChats));
            Drawable drawableMutate4 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
            drawableMutate4.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), mode));
            itemView4.iconView.setImageDrawable(drawableMutate4);
            z3 = true;
            itemView4.switchView.setChecked(!tL_authorization.encrypted_requests_disabled, false);
            itemView4.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 7, -1));
            itemView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Switch r3 = itemView4.switchView;
                    r3.setChecked(!r3.isChecked(), true);
                    tL_authorization.encrypted_requests_disabled = !itemView4.switchView.isChecked();
                    SessionBottomSheet.this.uploadSessionSettings();
                }
            });
            itemView.needDivider = true;
            itemView4.descriptionText.setText(LocaleController.getString(R.string.AcceptSecretChatsDescription));
            linearLayout.addView(itemView4);
            itemView = itemView4;
        } else {
            z3 = true;
        }
        if (acceptCallsEnabled(tL_authorization)) {
            final ItemView itemView5 = new ItemView(parentActivity, z3);
            itemView5.valueText.setText(LocaleController.getString(R.string.AcceptCalls));
            Drawable drawableMutate5 = parentActivity.getDrawable(R.drawable.msg_calls).mutate();
            drawableMutate5.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), mode));
            itemView5.iconView.setImageDrawable(drawableMutate5);
            itemView5.switchView.setChecked(!tL_authorization.call_requests_disabled, false);
            itemView5.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 7, -1));
            itemView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Switch r3 = itemView5.switchView;
                    r3.setChecked(!r3.isChecked(), true);
                    tL_authorization.call_requests_disabled = !itemView5.switchView.isChecked();
                    SessionBottomSheet.this.uploadSessionSettings();
                }
            });
            itemView.needDivider = true;
            itemView5.descriptionText.setText(LocaleController.getString(R.string.AcceptCallsChatsDescription));
            linearLayout.addView(itemView5);
        }
        if (!z) {
            TextView textView3 = new TextView(parentActivity);
            textView3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.TerminateSession));
            textView3.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
            int iDp = AndroidUtilities.dp(24.0f);
            int color2 = Theme.getColor(null, Theme.key_chat_attachAudioBackground, false);
            int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_windowBackgroundWhite, false), 120);
            textView3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color2, alphaComponent, alphaComponent));
            linearLayout.addView(textView3, LayoutHelper.createFrame(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView3.setOnClickListener(new AnonymousClass8(callback, tL_authorization, baseFragment));
        }
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
    }

    private boolean acceptCallsEnabled(TLRPC.TL_authorization tL_authorization) {
        return tL_authorization.api_id != 22;
    }

    public void copyText(String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, null);
        builder.setItems(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new ArticleViewer$$ExternalSyntheticLambda1(8, this, str));
        builder.show();
    }

    public void lambda$copyText$1(String str, DialogInterface dialogInterface, int i) {
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
        ArticleViewer$21$$ExternalSyntheticOutline0.m(BulletinFactory.of(getContainer(), null), R.string.TextCopied);
    }

    public static void lambda$uploadSessionSettings$0(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    private boolean secretChatsEnabled(TLRPC.TL_authorization tL_authorization) {
        int i = tL_authorization.api_id;
        return (i == 2040 || i == 2496) ? false : true;
    }

    private void setAnimation(TLRPC.TL_authorization tL_authorization, RLottieImageView rLottieImageView) {
        int i;
        int i2;
        String lowerCase = tL_authorization.platform.toLowerCase();
        if (lowerCase.isEmpty()) {
            lowerCase = tL_authorization.system_version.toLowerCase();
        }
        String lowerCase2 = tL_authorization.device_model.toLowerCase();
        boolean z = true;
        if (lowerCase2.contains("safari")) {
            i = R.raw.safari_30;
            i2 = Theme.key_avatar_backgroundPink;
        } else if (lowerCase2.contains("edge")) {
            i = R.raw.edge_30;
            i2 = Theme.key_avatar_backgroundPink;
        } else if (lowerCase2.contains("chrome")) {
            i = R.raw.chrome_30;
            i2 = Theme.key_avatar_backgroundPink;
        } else if (lowerCase2.contains("firefox")) {
            i = R.raw.firefox_30;
            i2 = Theme.key_avatar_backgroundRed;
        } else if (lowerCase2.contains("opera") || lowerCase2.contains("firefox") || lowerCase2.contains("vivaldi")) {
            if (lowerCase2.contains("opera")) {
                i = R.drawable.device_web_opera;
            } else {
                i = lowerCase2.contains("firefox") ? R.drawable.device_web_firefox : R.drawable.device_web_other;
            }
            i2 = Theme.key_avatar_backgroundPink;
            z = false;
        } else if (lowerCase.contains("ubuntu")) {
            i = R.raw.ubuntu_30;
            i2 = Theme.key_avatar_backgroundBlue;
        } else if (lowerCase.contains("linux")) {
            i = R.raw.linux_30;
            i2 = Theme.key_avatar_backgroundBlue;
        } else if (lowerCase.contains("ios")) {
            i = lowerCase2.contains("ipad") ? R.raw.ipad_30 : R.raw.iphone_30;
            i2 = Theme.key_avatar_backgroundBlue;
        } else if (lowerCase.contains("windows")) {
            i = R.raw.windows_30;
            i2 = Theme.key_avatar_backgroundCyan;
        } else if (lowerCase.contains("macos")) {
            i = R.raw.mac_30;
            i2 = Theme.key_avatar_backgroundCyan;
        } else if (lowerCase.contains("android")) {
            i = R.raw.android_30;
            i2 = Theme.key_avatar_backgroundGreen;
        } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
            i = R.raw.windows_30;
            i2 = Theme.key_avatar_backgroundCyan;
        } else {
            i = R.raw.chrome_30;
            i2 = Theme.key_avatar_backgroundPink;
        }
        rLottieImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(42.0f), Theme.getColor(null, i2, false)));
        if (z) {
            rLottieImageView.setAnimation(i, 50, 50, new int[]{0, Theme.getColor(null, i2, false)});
        } else {
            rLottieImageView.setImageDrawable(getContext().getDrawable(i));
        }
    }

    public void uploadSessionSettings() {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = this.session;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(changeauthorizationsettings, new PassportActivity$$ExternalSyntheticLambda3(24));
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    @Override
    public void show() {
        super.show();
        this.imageView.playAnimation();
    }
}
