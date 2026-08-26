package org.telegram.ui;

import android.app.Activity;
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
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.android.gms.internal.mlkit_vision_common.zzkr;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.Switch;

public final class SessionBottomSheet extends BottomSheet {
    public static final int $r8$clinit = 0;
    public final RLottieImageView imageView;
    public final SessionsActivity parentFragment;
    public final TLRPC.TL_authorization session;

    public final class AnonymousClass8 implements View.OnClickListener {
        public final SessionsActivity.AnonymousClass5 val$callback;
        public final SessionsActivity val$fragment;
        public final TLRPC.TL_authorization val$session;

        public AnonymousClass8(SessionsActivity.AnonymousClass5 anonymousClass5, TLRPC.TL_authorization tL_authorization, SessionsActivity sessionsActivity) {
            this.val$callback = anonymousClass5;
            this.val$session = tL_authorization;
            this.val$fragment = sessionsActivity;
        }

        @Override
        public final void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(SessionBottomSheet.this.parentFragment.getParentActivity(), 0, null);
            String string = LocaleController.getString(R.string.TerminateSessionText);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.message = string;
            alertDialog.title = LocaleController.getString(R.string.AreYouSureSessionTitle);
            builder.setPositiveButton(LocaleController.getString(R.string.Terminate), new VoIPFragment$$ExternalSyntheticLambda42(this, this.val$callback, this.val$session, 18));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            this.val$fragment.showDialog(alertDialog);
            TextView textView = (TextView) alertDialog.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        }
    }

    public interface Callback {
    }

    public final class ItemView extends FrameLayout {
        public final TextView descriptionText;
        public final ImageView iconView;
        public boolean needDivider;
        public final Switch switchView;
        public final TextView valueText;

        public ItemView(Activity activity, boolean z) {
            super(activity);
            this.needDivider = false;
            ImageView imageView = new ImageView(activity);
            this.iconView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, LayoutHelper.createFrame(32, 32.0f, 0, 12.0f, 4.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 0, 64.0f, 4.0f, 0.0f, 4.0f));
            TextView textView = new TextView(activity);
            this.valueText = textView;
            textView.setTextSize(2, 16.0f);
            textView.setGravity(3);
            textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 0, 0, 0, z ? 64 : 0, 0));
            TextView textView2 = new TextView(activity);
            this.descriptionText = textView2;
            textView2.setTextSize(2, 13.0f);
            textView2.setGravity(3);
            textView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false));
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 0, 0, 4, z ? 64 : 0, 0));
            setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
            if (z) {
                Switch r2 = new Switch(activity, null);
                this.switchView = r2;
                r2.setDrawIconType(1);
                addView(r2, LayoutHelper.createFrame(37, 40.0f, 21, 21.0f, 0.0f, 21.0f, 0.0f));
            }
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (this.needDivider) {
                canvas.drawRect(AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            Switch r0 = this.switchView;
            if (r0 != null) {
                accessibilityNodeInfo.setClassName("android.widget.Switch");
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(r0.isChecked);
                StringBuilder sb = new StringBuilder();
                sb.append((Object) this.valueText.getText());
                sb.append("\n");
                sb.append((Object) this.descriptionText.getText());
                sb.append("\n");
                sb.append(LocaleController.getString(r0.isChecked ? R.string.NotificationsOn : R.string.NotificationsOff));
                accessibilityNodeInfo.setText(sb.toString());
            }
        }
    }

    public SessionBottomSheet(SessionsActivity sessionsActivity, final TLRPC.TL_authorization tL_authorization, boolean z, SessionsActivity.AnonymousClass5 anonymousClass5) {
        int i;
        int i2;
        boolean z2;
        ItemView itemView;
        int i3;
        PorterDuff.Mode mode;
        boolean z3;
        int i4;
        super(sessionsActivity.getParentActivity(), null, false, false);
        setOpenNoDelay(true);
        Activity parentActivity = sessionsActivity.getParentActivity();
        this.session = tL_authorization;
        this.parentFragment = sessionsActivity;
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        RLottieImageView rLottieImageView = new RLottieImageView(parentActivity);
        this.imageView = rLottieImageView;
        rLottieImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                SessionBottomSheet sessionBottomSheet = SessionBottomSheet.this;
                if (sessionBottomSheet.imageView.isPlaying() || sessionBottomSheet.imageView.getAnimatedDrawable() == null) {
                    return;
                }
                sessionBottomSheet.imageView.getAnimatedDrawable().setCurrentFrame(40, true, false);
                sessionBottomSheet.imageView.playAnimation();
            }
        });
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(rLottieImageView, LayoutHelper.createLinear(70, 70, 1, 0, 16, 0, 0));
        TextView textView = new TextView(parentActivity);
        zzkk.m(20.0f, 2, textView);
        zzkr.m(Theme.key_windowBackgroundWhiteBlackText, textView, 17);
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
        String lowerCase = tL_authorization.platform.toLowerCase();
        lowerCase = lowerCase.isEmpty() ? tL_authorization.system_version.toLowerCase() : lowerCase;
        String lowerCase2 = tL_authorization.device_model.toLowerCase();
        if (lowerCase2.contains("safari")) {
            i = R.raw.safari_30;
            i2 = Theme.key_avatar_backgroundPink;
        } else if (lowerCase2.contains("edge")) {
            i = R.raw.edge_30;
            i2 = Theme.key_avatar_backgroundPink;
        } else if (lowerCase2.contains("chrome")) {
            i = R.raw.chrome_30;
            i2 = Theme.key_avatar_backgroundPink;
        } else {
            if (!lowerCase2.contains("firefox")) {
                if (lowerCase2.contains("opera") || lowerCase2.contains("firefox") || lowerCase2.contains("vivaldi")) {
                    i = lowerCase2.contains("opera") ? R.drawable.device_web_opera : lowerCase2.contains("firefox") ? R.drawable.device_web_firefox : R.drawable.device_web_other;
                    i2 = Theme.key_avatar_backgroundPink;
                    z2 = false;
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
                if (z2) {
                    rLottieImageView.setAnimation(i, 50, 50, new int[]{0, Theme.getColor(null, i2, false)});
                } else {
                    rLottieImageView.setImageDrawable(getContext().getDrawable(i));
                }
                itemView = new ItemView(parentActivity, false);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_authorization.app_name);
                sb2.append(" ");
                sb2.append(tL_authorization.app_version);
                itemView.valueText.setText(sb2);
                Drawable drawableMutate = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
                i3 = Theme.key_windowBackgroundWhiteGrayIcon;
                int color = Theme.getColor(null, i3, false);
                mode = PorterDuff.Mode.SRC_IN;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(color, mode));
                itemView.iconView.setImageDrawable(drawableMutate);
                itemView.descriptionText.setText(LocaleController.getString(R.string.Application));
                linearLayout.addView(itemView);
                if (tL_authorization.country.length() != 0) {
                    ItemView itemView2 = new ItemView(parentActivity, false);
                    itemView2.valueText.setText(tL_authorization.country);
                    Drawable drawableMutate2 = parentActivity.getDrawable(R.drawable.msg_location).mutate();
                    drawableMutate2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i3, false), mode));
                    itemView2.iconView.setImageDrawable(drawableMutate2);
                    itemView2.descriptionText.setText(LocaleController.getString(R.string.Location));
                    itemView2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            SessionBottomSheet.this.copyText(tL_authorization.country);
                        }
                    });
                    itemView2.setOnLongClickListener(new View.OnLongClickListener() {
                        @Override
                        public final boolean onLongClick(View view) {
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
                    drawableMutate3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i3, false), mode));
                    itemView3.iconView.setImageDrawable(drawableMutate3);
                    itemView3.descriptionText.setText(LocaleController.getString(R.string.IpAddress));
                    itemView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            SessionBottomSheet.this.copyText(tL_authorization.ip);
                        }
                    });
                    itemView3.setOnLongClickListener(new View.OnLongClickListener() {
                        @Override
                        public final boolean onLongClick(View view) {
                            SessionBottomSheet.this.copyText(tL_authorization.country);
                            return true;
                        }
                    });
                    itemView3.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 2, -1));
                    linearLayout.addView(itemView3);
                    z3 = true;
                    itemView.needDivider = true;
                    itemView = itemView3;
                } else {
                    z3 = true;
                }
                i4 = tL_authorization.api_id;
                if (i4 != 2040 && i4 != 2496) {
                    final ItemView itemView4 = new ItemView(parentActivity, z3);
                    itemView4.valueText.setText(LocaleController.getString(R.string.AcceptSecretChats));
                    Drawable drawableMutate4 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
                    drawableMutate4.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i3, false), mode));
                    itemView4.iconView.setImageDrawable(drawableMutate4);
                    Switch r9 = itemView4.switchView;
                    r9.setChecked(r9.drawIconType, !tL_authorization.encrypted_requests_disabled, false);
                    itemView4.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 7, -1));
                    itemView4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            ItemView itemView5 = itemView4;
                            Switch r0 = itemView5.switchView;
                            r0.setChecked(r0.drawIconType, !r0.isChecked, true);
                            tL_authorization.encrypted_requests_disabled = !itemView5.switchView.isChecked;
                            SessionBottomSheet.this.uploadSessionSettings();
                        }
                    });
                    itemView.needDivider = true;
                    itemView4.descriptionText.setText(LocaleController.getString(R.string.AcceptSecretChatsDescription));
                    linearLayout.addView(itemView4);
                    itemView = itemView4;
                }
                if (tL_authorization.api_id != 22) {
                    final ItemView itemView5 = new ItemView(parentActivity, true);
                    itemView5.valueText.setText(LocaleController.getString(R.string.AcceptCalls));
                    Drawable drawableMutate5 = parentActivity.getDrawable(R.drawable.msg_calls).mutate();
                    drawableMutate5.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i3, false), mode));
                    itemView5.iconView.setImageDrawable(drawableMutate5);
                    Switch r10 = itemView5.switchView;
                    r10.setChecked(r10.drawIconType, !tL_authorization.call_requests_disabled, false);
                    itemView5.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 7, -1));
                    itemView5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            ItemView itemView6 = itemView5;
                            Switch r0 = itemView6.switchView;
                            r0.setChecked(r0.drawIconType, !r0.isChecked, true);
                            tL_authorization.call_requests_disabled = !itemView6.switchView.isChecked;
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
                    textView3.setOnClickListener(new AnonymousClass8(anonymousClass5, tL_authorization, sessionsActivity));
                }
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(linearLayout);
                setCustomView(scrollView);
            }
            i = R.raw.firefox_30;
            i2 = Theme.key_avatar_backgroundRed;
        }
        z2 = true;
        rLottieImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(42.0f), Theme.getColor(null, i2, false)));
        if (z2) {
            rLottieImageView.setAnimation(i, 50, 50, new int[]{0, Theme.getColor(null, i2, false)});
        } else {
            rLottieImageView.setImageDrawable(getContext().getDrawable(i));
        }
        itemView = new ItemView(parentActivity, false);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(tL_authorization.app_name);
        sb3.append(" ");
        sb3.append(tL_authorization.app_version);
        itemView.valueText.setText(sb3);
        Drawable drawableMutate6 = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
        i3 = Theme.key_windowBackgroundWhiteGrayIcon;
        int color3 = Theme.getColor(null, i3, false);
        mode = PorterDuff.Mode.SRC_IN;
        drawableMutate6.setColorFilter(new PorterDuffColorFilter(color3, mode));
        itemView.iconView.setImageDrawable(drawableMutate6);
        itemView.descriptionText.setText(LocaleController.getString(R.string.Application));
        linearLayout.addView(itemView);
        if (tL_authorization.country.length() != 0) {
            ItemView itemView6 = new ItemView(parentActivity, false);
            itemView6.valueText.setText(tL_authorization.country);
            Drawable drawableMutate7 = parentActivity.getDrawable(R.drawable.msg_location).mutate();
            drawableMutate7.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i3, false), mode));
            itemView6.iconView.setImageDrawable(drawableMutate7);
            itemView6.descriptionText.setText(LocaleController.getString(R.string.Location));
            itemView6.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    SessionBottomSheet.this.copyText(tL_authorization.country);
                }
            });
            itemView6.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public final boolean onLongClick(View view) {
                    SessionBottomSheet.this.copyText(tL_authorization.country);
                    return true;
                }
            });
            itemView6.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 2, -1));
            linearLayout.addView(itemView6);
            itemView.needDivider = true;
            itemView = itemView6;
        }
        if (tL_authorization.ip.length() != 0) {
            ItemView itemView7 = new ItemView(parentActivity, false);
            itemView7.valueText.setText(tL_authorization.ip);
            Drawable drawableMutate8 = parentActivity.getDrawable(R.drawable.msg_language).mutate();
            drawableMutate8.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i3, false), mode));
            itemView7.iconView.setImageDrawable(drawableMutate8);
            itemView7.descriptionText.setText(LocaleController.getString(R.string.IpAddress));
            itemView7.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    SessionBottomSheet.this.copyText(tL_authorization.ip);
                }
            });
            itemView7.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public final boolean onLongClick(View view) {
                    SessionBottomSheet.this.copyText(tL_authorization.country);
                    return true;
                }
            });
            itemView7.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 2, -1));
            linearLayout.addView(itemView7);
            z3 = true;
            itemView.needDivider = true;
            itemView = itemView7;
        } else {
            z3 = true;
        }
        i4 = tL_authorization.api_id;
        if (i4 != 2040) {
            final ItemView itemView8 = new ItemView(parentActivity, z3);
            itemView8.valueText.setText(LocaleController.getString(R.string.AcceptSecretChats));
            Drawable drawableMutate9 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
            drawableMutate9.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i3, false), mode));
            itemView8.iconView.setImageDrawable(drawableMutate9);
            Switch r11 = itemView8.switchView;
            r11.setChecked(r11.drawIconType, !tL_authorization.encrypted_requests_disabled, false);
            itemView8.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 7, -1));
            itemView8.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ItemView itemView9 = itemView8;
                    Switch r0 = itemView9.switchView;
                    r0.setChecked(r0.drawIconType, !r0.isChecked, true);
                    tL_authorization.encrypted_requests_disabled = !itemView9.switchView.isChecked;
                    SessionBottomSheet.this.uploadSessionSettings();
                }
            });
            itemView.needDivider = true;
            itemView8.descriptionText.setText(LocaleController.getString(R.string.AcceptSecretChatsDescription));
            linearLayout.addView(itemView8);
            itemView = itemView8;
        }
        if (tL_authorization.api_id != 22) {
            final ItemView itemView9 = new ItemView(parentActivity, true);
            itemView9.valueText.setText(LocaleController.getString(R.string.AcceptCalls));
            Drawable drawableMutate10 = parentActivity.getDrawable(R.drawable.msg_calls).mutate();
            drawableMutate10.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i3, false), mode));
            itemView9.iconView.setImageDrawable(drawableMutate10);
            Switch r12 = itemView9.switchView;
            r12.setChecked(r12.drawIconType, !tL_authorization.call_requests_disabled, false);
            itemView9.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 7, -1));
            itemView9.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ItemView itemView10 = itemView9;
                    Switch r0 = itemView10.switchView;
                    r0.setChecked(r0.drawIconType, !r0.isChecked, true);
                    tL_authorization.call_requests_disabled = !itemView10.switchView.isChecked;
                    SessionBottomSheet.this.uploadSessionSettings();
                }
            });
            itemView.needDivider = true;
            itemView9.descriptionText.setText(LocaleController.getString(R.string.AcceptCallsChatsDescription));
            linearLayout.addView(itemView9);
        }
        if (!z) {
            TextView textView4 = new TextView(parentActivity);
            textView4.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView4.setGravity(17);
            textView4.setTextSize(1, 14.0f);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setText(LocaleController.getString(R.string.TerminateSession));
            textView4.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
            int iDp2 = AndroidUtilities.dp(24.0f);
            int color4 = Theme.getColor(null, Theme.key_chat_attachAudioBackground, false);
            int alphaComponent2 = ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_windowBackgroundWhite, false), 120);
            textView4.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, color4, alphaComponent2, alphaComponent2));
            linearLayout.addView(textView4, LayoutHelper.createFrame(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView4.setOnClickListener(new AnonymousClass8(anonymousClass5, tL_authorization, sessionsActivity));
        }
        ScrollView scrollView2 = new ScrollView(parentActivity);
        scrollView2.addView(linearLayout);
        setCustomView(scrollView2);
    }

    public final void copyText(String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, null);
        builder.setItems(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new ArticleViewer$$ExternalSyntheticLambda24(12, this, str));
        builder.show();
    }

    @Override
    public final void show() {
        super.show();
        this.imageView.playAnimation();
    }

    public final void uploadSessionSettings() {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = this.session;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(changeauthorizationsettings, new PassportActivity$$ExternalSyntheticLambda1(16));
    }
}
