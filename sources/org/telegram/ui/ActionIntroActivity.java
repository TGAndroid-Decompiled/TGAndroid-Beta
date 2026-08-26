package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.voip.CellFlickerDrawable;

public class ActionIntroActivity extends BaseFragment implements LocationController.LocationFetchCallback {
    public static final int ACTION_TYPE_CHANGE_PHONE_NUMBER = 3;
    public static final int ACTION_TYPE_CHANNEL_CREATE = 0;
    public static final int ACTION_TYPE_QR_LOGIN = 5;
    public static final int ACTION_TYPE_SET_PASSCODE = 6;
    public static final int CAMERA_PERMISSION_REQUEST_CODE = 34;
    private TextView buttonTextView;
    private int[] colors;
    private String currentGroupCreateAddress;
    private String currentGroupCreateDisplayAddress;
    private Location currentGroupCreateLocation;
    private final int currentType;
    private LinearLayout descriptionLayout;
    private final TextView[] descriptionLines;
    private TextView descriptionText;
    private TextView descriptionText2;
    private boolean flickerButton;
    private RLottieImageView imageView;
    private Runnable openedSettings;
    private ActionIntroQRLoginDelegate qrLoginDelegate;
    private boolean showingAsBottomSheet;
    private GradientDrawable startMessagingButtonBackground;
    private TextView subtitleTextView;
    private TextView titleTextView;

    public interface ActionIntroQRLoginDelegate {
        void didFindQRCode(String str);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ActionType {
    }

    public ActionIntroActivity(int i) {
        super(null);
        this.descriptionLines = new TextView[6];
        this.currentType = i;
    }

    public static boolean lambda$createView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$createView$1(AlertDialog alertDialog, int i) {
        presentFragment(new LoginActivity().changePhoneNumber(), true);
    }

    public void lambda$createView$2(View view) {
        if (getParentActivity() == null) {
            return;
        }
        int i = this.currentType;
        if (i == 0) {
            presentFragment(new ChannelCreateActivity(NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(0, "step")), true);
            return;
        }
        if (i == 3) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setTitle(LocaleController.getString(R.string.PhoneNumberChangeTitle));
            builder.setMessage(LocaleController.getString(R.string.PhoneNumberAlert));
            builder.setPositiveButton(LocaleController.getString(R.string.Change), new ActionIntroActivity$$ExternalSyntheticLambda2(this, 1));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            showDialog(builder.create());
            return;
        }
        if (i == 5) {
            if (getParentActivity() == null) {
                return;
            }
            if (Build.VERSION.SDK_INT < 23 || getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                processOpenQrReader();
                return;
            } else {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                return;
            }
        }
        if (i != 6) {
            return;
        }
        presentFragment(new PasscodeActivity(1), true);
        Runnable runnable = this.openedSettings;
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
            this.openedSettings = null;
        }
    }

    public void lambda$createView$3(View view) {
        if (this.imageView.getAnimatedDrawable().isRunning()) {
            return;
        }
        this.imageView.getAnimatedDrawable().setCurrentFrame(0, false);
        this.imageView.playAnimation();
    }

    public void lambda$createView$4(View view) {
        if (this.imageView.getAnimatedDrawable().isRunning()) {
            return;
        }
        this.imageView.getAnimatedDrawable().setCurrentFrame(0, false);
        this.imageView.playAnimation();
    }

    public void lambda$createView$5(View view) {
        ((ActionBarLayout) getParentLayout()).closeLastFragment(true, false);
    }

    public void lambda$onRequestPermissionsResultFragment$6(AlertDialog alertDialog, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void processOpenQrReader() {
        CameraScanActivity.showAsSheet((BaseFragment) this, false, 1, new CameraScanActivity.CameraScanActivityDelegate() {
            @Override
            public final void didFindMrzInfo(MrzRecognizer.Result result) {
                CameraScanActivity.CameraScanActivityDelegate.CC.$default$didFindMrzInfo(this, result);
            }

            @Override
            public void didFindQr(String str) {
                ActionIntroActivity.this.finishFragment(false);
                ActionIntroActivity.this.qrLoginDelegate.didFindQRCode(str);
            }

            @Override
            public final String getSubtitleText() {
                return CameraScanActivity.CameraScanActivityDelegate.CC.$default$getSubtitleText(this);
            }

            @Override
            public final void onDismiss() {
                CameraScanActivity.CameraScanActivityDelegate.CC.$default$onDismiss(this);
            }

            @Override
            public final boolean processQr(String str, Runnable runnable) {
                return CameraScanActivity.CameraScanActivityDelegate.CC.$default$processQr(this, str, runnable);
            }
        });
    }

    public void updateColors() {
        GradientDrawable gradientDrawable = this.startMessagingButtonBackground;
        int i = Theme.key_featuredStickers_addButton;
        gradientDrawable.setColors(new int[]{getThemedColor(i), getThemedColor(Theme.key_featuredStickers_addButton2)});
        this.buttonTextView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        TextView textView = this.buttonTextView;
        int iDp = AndroidUtilities.dp(24.0f);
        int color = Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
        textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, color, color));
        int[] iArr = this.colors;
        if (iArr == null || this.imageView == null) {
            return;
        }
        iArr[0] = 3355443;
        iArr[1] = Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false);
        int[] iArr2 = this.colors;
        iArr2[2] = 16777215;
        int i2 = Theme.key_windowBackgroundWhite;
        iArr2[3] = Theme.getColor(null, i2, false);
        int[] iArr3 = this.colors;
        iArr3[4] = 5285866;
        iArr3[5] = Theme.getColor(null, i, false);
        int[] iArr4 = this.colors;
        iArr4[6] = 2170912;
        iArr4[7] = Theme.getColor(null, i2, false);
        this.imageView.replaceColors(this.colors);
    }

    @Override
    public View createView(Context context) {
        float f;
        float f2;
        float f3;
        int i = 3;
        int i2 = 2;
        final int i3 = 1;
        ActionBar actionBar = this.actionBar;
        final int i4 = 0;
        if (actionBar != null) {
            actionBar.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setItemsColor(Theme.getColor(null, Theme.key_actionBarDefaultIcon, false), false);
            this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_actionBarDefaultSelector, false), false);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
                @Override
                public void onItemClick(int i5) {
                    if (i5 == -1) {
                        ActionIntroActivity.this.finishFragment();
                    }
                }
            });
        }
        ViewGroup viewGroup = new ViewGroup(context) {
            @Override
            public void onLayout(boolean z, int i5, int i6, int i7, int i8) {
                float f4;
                if (((BaseFragment) ActionIntroActivity.this).actionBar != null) {
                    ((BaseFragment) ActionIntroActivity.this).actionBar.layout(0, 0, i7, ((BaseFragment) ActionIntroActivity.this).actionBar.getMeasuredHeight());
                }
                int i9 = i7 - i5;
                int i10 = i8 - i6;
                int i11 = ActionIntroActivity.this.currentType;
                if (i11 == 0) {
                    if (i7 <= i8) {
                        float f5 = i10;
                        int i12 = (int) (0.188f * f5);
                        ActionIntroActivity.this.imageView.layout(0, i12, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + i12);
                        int i13 = (int) (0.651f * f5);
                        ActionIntroActivity.this.titleTextView.layout(0, i13, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i13);
                        int i14 = (int) (0.731f * f5);
                        ActionIntroActivity.this.descriptionText.layout(0, i14, ActionIntroActivity.this.descriptionText.getMeasuredWidth(), ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i14);
                        int measuredWidth = (i9 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                        int i15 = (int) (f5 * 0.853f);
                        ActionIntroActivity.this.buttonTextView.layout(measuredWidth, i15, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i15);
                        return;
                    }
                    int measuredHeight = (i10 - ActionIntroActivity.this.imageView.getMeasuredHeight()) / 2;
                    ActionIntroActivity.this.imageView.layout(0, measuredHeight, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + measuredHeight);
                    float f6 = i9;
                    float f7 = 0.4f * f6;
                    int i16 = (int) f7;
                    float f8 = i10;
                    int i17 = (int) (0.22f * f8);
                    ActionIntroActivity.this.titleTextView.layout(i16, i17, ActionIntroActivity.this.titleTextView.getMeasuredWidth() + i16, ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i17);
                    int i18 = (int) (0.39f * f8);
                    ActionIntroActivity.this.descriptionText.layout(i16, i18, ActionIntroActivity.this.descriptionText.getMeasuredWidth() + i16, ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i18);
                    int iM = (int) ImageReceiver$$ExternalSyntheticOutline0.m(f6 * 0.6f, ActionIntroActivity.this.buttonTextView.getMeasuredWidth(), 2.0f, f7);
                    int i19 = (int) (f8 * 0.69f);
                    ActionIntroActivity.this.buttonTextView.layout(iM, i19, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + iM, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i19);
                    return;
                }
                if (i11 == 3) {
                    if (i7 <= i8) {
                        int i20 = (int) (i10 * 0.3f);
                        int measuredWidth2 = (i9 - ActionIntroActivity.this.imageView.getMeasuredWidth()) / 2;
                        ActionIntroActivity.this.imageView.layout(measuredWidth2, i20, ActionIntroActivity.this.imageView.getMeasuredWidth() + measuredWidth2, ActionIntroActivity.this.imageView.getMeasuredHeight() + i20);
                        int iM2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(24.0f, ActionIntroActivity.this.imageView.getMeasuredHeight(), i20);
                        ActionIntroActivity.this.titleTextView.layout(0, iM2, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + iM2);
                        int textSize = (int) (ActionIntroActivity.this.titleTextView.getTextSize() + AndroidUtilities.dp(16.0f) + iM2);
                        ActionIntroActivity.this.descriptionText.layout(0, textSize, ActionIntroActivity.this.descriptionText.getMeasuredWidth(), ActionIntroActivity.this.descriptionText.getMeasuredHeight() + textSize);
                        int measuredWidth3 = (i9 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                        int measuredHeight2 = (i10 - ActionIntroActivity.this.buttonTextView.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        ActionIntroActivity.this.buttonTextView.layout(measuredWidth3, measuredHeight2, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth3, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + measuredHeight2);
                        int measuredWidth4 = (i9 - ActionIntroActivity.this.subtitleTextView.getMeasuredWidth()) / 2;
                        int iM$1 = OKLCH.m$1(32.0f, ActionIntroActivity.this.subtitleTextView.getMeasuredHeight(), measuredHeight2);
                        ActionIntroActivity.this.subtitleTextView.layout(measuredWidth4, iM$1, ActionIntroActivity.this.subtitleTextView.getMeasuredWidth() + measuredWidth4, ActionIntroActivity.this.subtitleTextView.getMeasuredHeight() + iM$1);
                        return;
                    }
                    float f9 = i10;
                    int measuredHeight3 = ((int) ((0.95f * f9) - ActionIntroActivity.this.imageView.getMeasuredHeight())) / 2;
                    int width = (int) ((getWidth() * 0.35f) - ActionIntroActivity.this.imageView.getMeasuredWidth());
                    ActionIntroActivity.this.imageView.layout(width, measuredHeight3, ActionIntroActivity.this.imageView.getMeasuredWidth() + width, ActionIntroActivity.this.imageView.getMeasuredHeight() + measuredHeight3);
                    float f10 = i9;
                    float f11 = 0.4f * f10;
                    int i21 = (int) f11;
                    int i22 = (int) (0.12f * f9);
                    ActionIntroActivity.this.titleTextView.layout(i21, i22, ActionIntroActivity.this.titleTextView.getMeasuredWidth() + i21, ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i22);
                    int i23 = (int) (0.24f * f9);
                    ActionIntroActivity.this.descriptionText.layout(i21, i23, ActionIntroActivity.this.descriptionText.getMeasuredWidth() + i21, ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i23);
                    float f12 = f10 * 0.6f;
                    int iM3 = (int) ImageReceiver$$ExternalSyntheticOutline0.m(f12, ActionIntroActivity.this.buttonTextView.getMeasuredWidth(), 2.0f, f11);
                    int i24 = (int) (f9 * 0.8f);
                    ActionIntroActivity.this.buttonTextView.layout(iM3, i24, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + iM3, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i24);
                    int iM4 = (int) ImageReceiver$$ExternalSyntheticOutline0.m(f12, ActionIntroActivity.this.subtitleTextView.getMeasuredWidth(), 2.0f, f11);
                    int iM$2 = OKLCH.m$1(16.0f, ActionIntroActivity.this.subtitleTextView.getMeasuredHeight(), i24);
                    ActionIntroActivity.this.subtitleTextView.layout(iM4, iM$2, ActionIntroActivity.this.subtitleTextView.getMeasuredWidth() + iM4, ActionIntroActivity.this.subtitleTextView.getMeasuredHeight() + iM$2);
                    return;
                }
                if (i11 != 5) {
                    if (i11 != 6) {
                        return;
                    }
                    if (i7 <= i8) {
                        int i25 = (int) (i10 * 0.3f);
                        int measuredWidth5 = (i9 - ActionIntroActivity.this.imageView.getMeasuredWidth()) / 2;
                        ActionIntroActivity.this.imageView.layout(measuredWidth5, i25, ActionIntroActivity.this.imageView.getMeasuredWidth() + measuredWidth5, ActionIntroActivity.this.imageView.getMeasuredHeight() + i25);
                        int iM5 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(24.0f, ActionIntroActivity.this.imageView.getMeasuredHeight(), i25);
                        ActionIntroActivity.this.titleTextView.layout(0, iM5, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + iM5);
                        int textSize2 = (int) (ActionIntroActivity.this.titleTextView.getTextSize() + AndroidUtilities.dp(16.0f) + iM5);
                        ActionIntroActivity.this.descriptionText.layout(0, textSize2, ActionIntroActivity.this.descriptionText.getMeasuredWidth(), ActionIntroActivity.this.descriptionText.getMeasuredHeight() + textSize2);
                        int measuredWidth6 = (i9 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                        int measuredHeight4 = (i10 - ActionIntroActivity.this.buttonTextView.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        ActionIntroActivity.this.buttonTextView.layout(measuredWidth6, measuredHeight4, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth6, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + measuredHeight4);
                        return;
                    }
                    int measuredHeight5 = (i10 - ActionIntroActivity.this.imageView.getMeasuredHeight()) / 2;
                    float f13 = i9;
                    int measuredWidth7 = ((int) ((0.5f * f13) - ActionIntroActivity.this.imageView.getMeasuredWidth())) / 2;
                    ActionIntroActivity.this.imageView.layout(measuredWidth7, measuredHeight5, ActionIntroActivity.this.imageView.getMeasuredWidth() + measuredWidth7, ActionIntroActivity.this.imageView.getMeasuredHeight() + measuredHeight5);
                    float f14 = 0.4f * f13;
                    int i26 = (int) f14;
                    float f15 = i10;
                    int i27 = (int) (0.14f * f15);
                    ActionIntroActivity.this.titleTextView.layout(i26, i27, ActionIntroActivity.this.titleTextView.getMeasuredWidth() + i26, ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i27);
                    int i28 = (int) (0.31f * f15);
                    ActionIntroActivity.this.descriptionText.layout(i26, i28, ActionIntroActivity.this.descriptionText.getMeasuredWidth() + i26, ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i28);
                    int iM6 = (int) ImageReceiver$$ExternalSyntheticOutline0.m(f13 * 0.6f, ActionIntroActivity.this.buttonTextView.getMeasuredWidth(), 2.0f, f14);
                    int i29 = (int) (f15 * 0.78f);
                    ActionIntroActivity.this.buttonTextView.layout(iM6, i29, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + iM6, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i29);
                    return;
                }
                if (ActionIntroActivity.this.showingAsBottomSheet) {
                    ActionIntroActivity.this.imageView.layout(0, 0, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight());
                    float f16 = i10;
                    int i30 = (int) (0.403f * f16);
                    ActionIntroActivity.this.titleTextView.layout(0, i30, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i30);
                    int i31 = (int) (0.631f * f16);
                    int measuredWidth8 = (getMeasuredWidth() - ActionIntroActivity.this.descriptionLayout.getMeasuredWidth()) / 2;
                    ActionIntroActivity.this.descriptionLayout.layout(measuredWidth8, i31, ActionIntroActivity.this.descriptionLayout.getMeasuredWidth() + measuredWidth8, ActionIntroActivity.this.descriptionLayout.getMeasuredHeight() + i31);
                    int measuredWidth9 = (i9 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                    int i32 = (int) (f16 * 0.853f);
                    ActionIntroActivity.this.buttonTextView.layout(measuredWidth9, i32, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth9, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i32);
                    return;
                }
                if (i7 > i8) {
                    int measuredHeight6 = (i10 - ActionIntroActivity.this.imageView.getMeasuredHeight()) / 2;
                    ActionIntroActivity.this.imageView.layout(0, measuredHeight6, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + measuredHeight6);
                    float f17 = i9;
                    float f18 = 0.4f * f17;
                    int i33 = (int) f18;
                    float f19 = i10;
                    int i34 = (int) (0.08f * f19);
                    ActionIntroActivity.this.titleTextView.layout(i33, i34, ActionIntroActivity.this.titleTextView.getMeasuredWidth() + i33, ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i34);
                    float f20 = f17 * 0.6f;
                    int iM7 = (int) ImageReceiver$$ExternalSyntheticOutline0.m(f20, ActionIntroActivity.this.descriptionLayout.getMeasuredWidth(), 2.0f, f18);
                    int i35 = (int) (0.25f * f19);
                    ActionIntroActivity.this.descriptionLayout.layout(iM7, i35, ActionIntroActivity.this.descriptionLayout.getMeasuredWidth() + iM7, ActionIntroActivity.this.descriptionLayout.getMeasuredHeight() + i35);
                    int iM8 = (int) ImageReceiver$$ExternalSyntheticOutline0.m(f20, ActionIntroActivity.this.buttonTextView.getMeasuredWidth(), 2.0f, f18);
                    int i36 = (int) (f19 * 0.78f);
                    ActionIntroActivity.this.buttonTextView.layout(iM8, i36, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + iM8, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i36);
                    return;
                }
                if (AndroidUtilities.displaySize.y < 1800) {
                    float f21 = i10;
                    int i37 = (int) (0.06f * f21);
                    ActionIntroActivity.this.imageView.layout(0, i37, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + i37);
                    int i38 = (int) (0.463f * f21);
                    ActionIntroActivity.this.titleTextView.layout(0, i38, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i38);
                    f4 = f21 * 0.543f;
                } else {
                    float f22 = i10;
                    int i39 = (int) (0.148f * f22);
                    ActionIntroActivity.this.imageView.layout(0, i39, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + i39);
                    int i40 = (int) (0.551f * f22);
                    ActionIntroActivity.this.titleTextView.layout(0, i40, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i40);
                    f4 = f22 * 0.631f;
                }
                int i41 = (int) f4;
                int measuredWidth10 = (getMeasuredWidth() - ActionIntroActivity.this.descriptionLayout.getMeasuredWidth()) / 2;
                ActionIntroActivity.this.descriptionLayout.layout(measuredWidth10, i41, ActionIntroActivity.this.descriptionLayout.getMeasuredWidth() + measuredWidth10, ActionIntroActivity.this.descriptionLayout.getMeasuredHeight() + i41);
                int measuredWidth11 = (i9 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                int i42 = (int) (i10 * 0.853f);
                ActionIntroActivity.this.buttonTextView.layout(measuredWidth11, i42, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth11, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i42);
            }

            @Override
            public void onMeasure(int i5, int i6) {
                int size = View.MeasureSpec.getSize(i5);
                int size2 = View.MeasureSpec.getSize(i6);
                if (((BaseFragment) ActionIntroActivity.this).actionBar != null) {
                    ((BaseFragment) ActionIntroActivity.this).actionBar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i6);
                }
                int i7 = ActionIntroActivity.this.currentType;
                if (i7 != 0) {
                    if (i7 == 3) {
                        ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), 1073741824));
                        if (size > size2) {
                            float f4 = size;
                            ActionIntroActivity.this.subtitleTextView.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f4), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i8 = (int) (f4 * 0.6f);
                            ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        } else {
                            ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.subtitleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.buttonTextView.measure(OKLCH.m(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        }
                    } else if (i7 != 5) {
                        if (i7 == 6) {
                            if (ActionIntroActivity.this.currentType == 6) {
                                ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824));
                            } else {
                                ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                            }
                            if (size > size2) {
                                int i9 = (int) (size * 0.6f);
                                ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                ActionIntroActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                            } else {
                                ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                ActionIntroActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                if (ActionIntroActivity.this.currentType == 6) {
                                    ActionIntroActivity.this.buttonTextView.measure(OKLCH.m(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                } else {
                                    ActionIntroActivity.this.buttonTextView.measure(OKLCH.m(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                }
                            }
                        }
                    } else if (ActionIntroActivity.this.showingAsBottomSheet) {
                        ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.32f), 1073741824));
                        ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        ActionIntroActivity.this.descriptionLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        size2 = ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + ActionIntroActivity.this.descriptionLayout.getMeasuredHeight() + ActionIntroActivity.this.titleTextView.getMeasuredHeight() + AndroidUtilities.dp(20.0f) + ActionIntroActivity.this.titleTextView.getMeasuredHeight() + ActionIntroActivity.this.imageView.getMeasuredHeight();
                    } else if (size > size2) {
                        float f5 = size;
                        ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f5), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                        int i10 = (int) (f5 * 0.6f);
                        ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        ActionIntroActivity.this.descriptionLayout.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    } else {
                        ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                        ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        ActionIntroActivity.this.descriptionLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    }
                } else if (size > size2) {
                    float f6 = size;
                    ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f6), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                    int i11 = (int) (f6 * 0.6f);
                    ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    ActionIntroActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else {
                    ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                    ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    ActionIntroActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    ActionIntroActivity.this.buttonTextView.measure(OKLCH.m(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                }
                setMeasuredDimension(size, size2);
            }
        };
        this.fragmentView = viewGroup;
        viewGroup.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        ViewGroup viewGroup2 = (ViewGroup) this.fragmentView;
        viewGroup2.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda59(i2));
        ActionBar actionBar2 = this.actionBar;
        if (actionBar2 != null) {
            viewGroup2.addView(actionBar2);
        }
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        viewGroup2.addView(rLottieImageView);
        TextView textView = new TextView(context);
        this.titleTextView = textView;
        int i5 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(null, i5, false));
        this.titleTextView.setGravity(1);
        this.titleTextView.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.titleTextView.setTextSize(1, 24.0f);
        viewGroup2.addView(this.titleTextView);
        TextView textView2 = new TextView(context);
        this.subtitleTextView = textView2;
        if (this.currentType == 3) {
            i5 = Theme.key_featuredStickers_addButton;
        }
        textView2.setTextColor(Theme.getColor(null, i5, false));
        this.subtitleTextView.setGravity(1);
        float f4 = 15.0f;
        this.subtitleTextView.setTextSize(1, 15.0f);
        this.subtitleTextView.setSingleLine(true);
        this.subtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.subtitleTextView.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.subtitleTextView.setVisibility(8);
        viewGroup2.addView(this.subtitleTextView);
        TextView textView3 = new TextView(context);
        this.descriptionText = textView3;
        textView3.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText6, false));
        this.descriptionText.setGravity(1);
        this.descriptionText.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.descriptionText.setTextSize(1, 15.0f);
        int i6 = this.currentType;
        if (i6 == 6 || i6 == 3) {
            f = 32.0f;
            f2 = 24.0f;
            this.descriptionText.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        } else {
            f = 32.0f;
            f2 = 24.0f;
            this.descriptionText.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        }
        viewGroup2.addView(this.descriptionText);
        if (this.currentType == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.descriptionLayout = linearLayout;
            linearLayout.setOrientation(1);
            f3 = 2.0f;
            this.descriptionLayout.setPadding(AndroidUtilities.dp(f2), 0, AndroidUtilities.dp(f2), 0);
            this.descriptionLayout.setGravity(LocaleController.isRTL ? 5 : 3);
            viewGroup2.addView(this.descriptionLayout);
            int i7 = 0;
            while (i7 < i) {
                LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(0, context);
                this.descriptionLayout.addView(linearLayoutM, LayoutHelper.createLinear(-2, -2, 0.0f, 0.0f, 0.0f, i7 != i2 ? 7.0f : 0.0f));
                int i8 = i7 * 2;
                this.descriptionLines[i8] = new TextView(context);
                TextView textView4 = this.descriptionLines[i8];
                int i9 = Theme.key_windowBackgroundWhiteBlackText;
                textView4.setTextColor(Theme.getColor(null, i9, false));
                this.descriptionLines[i8].setGravity(LocaleController.isRTL ? 5 : 3);
                this.descriptionLines[i8].setTextSize(1, f4);
                int i10 = i7 + 1;
                this.descriptionLines[i8].setText(String.format(LocaleController.isRTL ? ".%d" : "%d.", Integer.valueOf(i10)));
                this.descriptionLines[i8].setTypeface(AndroidUtilities.bold());
                int i11 = i8 + 1;
                this.descriptionLines[i11] = new TextView(context);
                this.descriptionLines[i11].setTextColor(Theme.getColor(null, i9, false));
                this.descriptionLines[i11].setGravity(LocaleController.isRTL ? 5 : 3);
                this.descriptionLines[i11].setTextSize(1, f4);
                if (i7 == 0) {
                    this.descriptionLines[i11].setLinkTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkText, false));
                    this.descriptionLines[i11].setHighlightColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkSelection, false));
                    String string = LocaleController.getString(R.string.AuthAnotherClientInfo1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int iIndexOf = string.indexOf(42);
                    int iLastIndexOf = string.lastIndexOf(42);
                    if (iIndexOf != -1 && iLastIndexOf != -1 && iIndexOf != iLastIndexOf) {
                        this.descriptionLines[i11].setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(iIndexOf, iIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new URLSpanNoUnderline(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl)), iIndexOf, iLastIndexOf - 1, 33);
                    }
                    this.descriptionLines[i11].setText(spannableStringBuilder);
                } else if (i7 == 1) {
                    this.descriptionLines[i11].setText(LocaleController.getString(R.string.AuthAnotherClientInfo2));
                } else {
                    this.descriptionLines[i11].setText(LocaleController.getString(R.string.AuthAnotherClientInfo3));
                }
                if (LocaleController.isRTL) {
                    linearLayoutM.setGravity(5);
                    linearLayoutM.addView(this.descriptionLines[i11], LayoutHelper.createLinear(0, -2, 1.0f));
                    linearLayoutM.addView(this.descriptionLines[i8], LayoutHelper.createLinear(-2, -2, 4.0f, 0.0f, 0.0f, 0.0f));
                } else {
                    linearLayoutM.addView(this.descriptionLines[i8], LayoutHelper.createLinear(-2, -2, 0.0f, 0.0f, 4.0f, 0.0f));
                    linearLayoutM.addView(this.descriptionLines[i11], LayoutHelper.createLinear(-2, -2));
                }
                i7 = i10;
                i = 3;
                i2 = 2;
                f4 = 15.0f;
            }
            this.descriptionText.setVisibility(8);
        } else {
            f3 = 2.0f;
        }
        TextView textView5 = new TextView(context);
        this.descriptionText2 = textView5;
        textView5.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText6, false));
        this.descriptionText2.setGravity(1);
        this.descriptionText2.setLineSpacing(AndroidUtilities.dp(f3), 1.0f);
        this.descriptionText2.setTextSize(1, 13.0f);
        this.descriptionText2.setVisibility(8);
        this.descriptionText2.setPadding(AndroidUtilities.dp(f), 0, AndroidUtilities.dp(f), 0);
        viewGroup2.addView(this.descriptionText2);
        this.startMessagingButtonBackground = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        TextView textView6 = new TextView(context) {
            private final CellFlickerDrawable cellFlickerDrawable;

            {
                CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable(64, 204, 160);
                this.cellFlickerDrawable = cellFlickerDrawable;
                cellFlickerDrawable.drawFrame = false;
                cellFlickerDrawable.repeatProgress = 2.0f;
            }

            @Override
            public void draw(Canvas canvas) {
                ActionIntroActivity.this.startMessagingButtonBackground.draw(canvas);
                super.draw(canvas);
            }

            @Override
            public void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                if (ActionIntroActivity.this.flickerButton) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    this.cellFlickerDrawable.draw(null, canvas, rectF, getMeasuredHeight() / 2.0f);
                    invalidate();
                }
            }

            @Override
            public void onSizeChanged(int i12, int i13, int i14, int i15) {
                super.onSizeChanged(i12, i13, i14, i15);
                ActionIntroActivity.this.startMessagingButtonBackground.setBounds(0, 0, i12, i13);
                ActionIntroActivity.this.startMessagingButtonBackground.setCornerRadius(Math.min(i12, i13) / 2.0f);
                this.cellFlickerDrawable.parentWidth = i12;
            }
        };
        this.buttonTextView = textView6;
        ScaleStateListAnimator.apply(textView6, 0.02f, 1.2f);
        this.buttonTextView.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.buttonTextView.setGravity(17);
        this.buttonTextView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        this.buttonTextView.setTextSize(1, 14.0f);
        this.buttonTextView.setTypeface(AndroidUtilities.bold());
        TextView textView7 = this.buttonTextView;
        int iDp = AndroidUtilities.dp(f2);
        int color = Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
        textView7.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, color, color));
        viewGroup2.addView(this.buttonTextView);
        this.buttonTextView.setOnClickListener(new View.OnClickListener(this) {
            public final ActionIntroActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$createView$2(view);
                        break;
                    case 1:
                        this.f$0.lambda$createView$3(view);
                        break;
                    case 2:
                        this.f$0.lambda$createView$4(view);
                        break;
                    default:
                        this.f$0.lambda$createView$5(view);
                        break;
                }
            }
        });
        int i12 = this.currentType;
        if (i12 == 0) {
            this.imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.imageView.setAnimation(R.raw.channel_create, 200, 200);
            this.titleTextView.setText(LocaleController.getString(R.string.ChannelAlertTitle));
            this.descriptionText.setText(LocaleController.getString(R.string.ChannelAlertText));
            this.buttonTextView.setText(LocaleController.getString(R.string.ChannelAlertCreate2));
            this.imageView.playAnimation();
            this.flickerButton = true;
        } else if (i12 == 3) {
            this.subtitleTextView.setVisibility(0);
            this.imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.imageView.setAnimation(R.raw.utyan_change_number, 200, 200);
            final int i13 = 2;
            this.imageView.setOnClickListener(new View.OnClickListener(this) {
                public final ActionIntroActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            this.f$0.lambda$createView$2(view);
                            break;
                        case 1:
                            this.f$0.lambda$createView$3(view);
                            break;
                        case 2:
                            this.f$0.lambda$createView$4(view);
                            break;
                        default:
                            this.f$0.lambda$createView$5(view);
                            break;
                    }
                }
            });
            UserConfig userConfig = getUserConfig();
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
            if (user == null) {
                user = userConfig.getCurrentUser();
            }
            if (user != null) {
                this.subtitleTextView.setText(LocaleController.formatString("PhoneNumberKeepButton", R.string.PhoneNumberKeepButton, UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), user.phone, PhoneFormat.getInstance())));
            }
            final int i14 = 3;
            this.subtitleTextView.setOnClickListener(new View.OnClickListener(this) {
                public final ActionIntroActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            this.f$0.lambda$createView$2(view);
                            break;
                        case 1:
                            this.f$0.lambda$createView$3(view);
                            break;
                        case 2:
                            this.f$0.lambda$createView$4(view);
                            break;
                        default:
                            this.f$0.lambda$createView$5(view);
                            break;
                    }
                }
            });
            TextView textView8 = this.titleTextView;
            int i15 = R.string.PhoneNumberChange2;
            textView8.setText(LocaleController.getString(i15));
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(R.string.PhoneNumberHelp, this.descriptionText);
            this.buttonTextView.setText(LocaleController.getString(i15));
            this.imageView.playAnimation();
            this.flickerButton = true;
        } else if (i12 == 5) {
            int[] iArr = new int[8];
            this.colors = iArr;
            this.imageView.setAnimation(R.raw.qr_login, 334, 334, iArr);
            this.imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.titleTextView.setText(LocaleController.getString(R.string.AuthAnotherClient));
            this.buttonTextView.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
            this.imageView.playAnimation();
        } else if (i12 == 6) {
            this.imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.imageView.setAnimation(R.raw.utyan_passcode, 200, 200);
            this.imageView.setFocusable(false);
            this.imageView.setOnClickListener(new View.OnClickListener(this) {
                public final ActionIntroActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$createView$2(view);
                            break;
                        case 1:
                            this.f$0.lambda$createView$3(view);
                            break;
                        case 2:
                            this.f$0.lambda$createView$4(view);
                            break;
                        default:
                            this.f$0.lambda$createView$5(view);
                            break;
                    }
                }
            });
            this.titleTextView.setText(LocaleController.getString(R.string.Passcode));
            this.descriptionText.setText(LocaleController.getString(R.string.ChangePasscodeInfoShort));
            this.buttonTextView.setText(LocaleController.getString(R.string.EnablePasscode));
            this.imageView.playAnimation();
            this.flickerButton = true;
        }
        if (this.flickerButton) {
            this.buttonTextView.setPadding(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f));
            this.buttonTextView.setTextSize(1, 15.0f);
        }
        updateColors();
        return this.fragmentView;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        IntroActivity$$ExternalSyntheticLambda0 introActivity$$ExternalSyntheticLambda0 = new IntroActivity$$ExternalSyntheticLambda0(this, 1);
        View view = this.fragmentView;
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(view, 1, null, null, null, introActivity$$ExternalSyntheticLambda0, i));
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            arrayList.add(new ThemeDescription(actionBar, 1, null, null, null, null, i));
            arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
            arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        }
        TextView textView = this.titleTextView;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(textView, 4, null, null, null, introActivity$$ExternalSyntheticLambda0, i2));
        arrayList.add(new ThemeDescription(this.subtitleTextView, 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.descriptionText, 4, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText6));
        arrayList.add(new ThemeDescription(this.descriptionLines[0], 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.descriptionLines[1], 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.descriptionLines[1], 2, null, null, null, null, Theme.key_windowBackgroundWhiteLinkText));
        arrayList.add(new ThemeDescription(this.descriptionLines[2], 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.descriptionLines[3], 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.descriptionLines[4], 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.descriptionLines[5], 4, null, null, null, null, i2));
        return arrayList;
    }

    public int getType() {
        return this.currentType;
    }

    @Override
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(null, Theme.key_windowBackgroundWhite, true)) > 0.699999988079071d;
    }

    @Override
    public void onLocationAddressAvailable(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        TextView textView = this.subtitleTextView;
        if (textView == null) {
            return;
        }
        textView.setText(str);
        this.currentGroupCreateAddress = str;
        this.currentGroupCreateDisplayAddress = str2;
        this.currentGroupCreateLocation = location;
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i == 34) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                new AlertDialog.Builder(getParentActivity(), 0, null).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint))).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new ActionIntroActivity$$ExternalSyntheticLambda2(this, 0)).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).setTopAnimation(R.raw.permission_request_camera, 72, false, Theme.getColor(null, Theme.key_dialogTopBackground, false)).show();
            } else {
                processOpenQrReader();
            }
        }
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    public void setGroupCreateAddress(String str, String str2, Location location) {
        this.currentGroupCreateAddress = str;
        this.currentGroupCreateDisplayAddress = str2;
        this.currentGroupCreateLocation = location;
        if (location == null || str != null) {
            return;
        }
        LocationController.fetchLocationAddress(location, this);
    }

    public void setOnOpenedSettings(Runnable runnable) {
        this.openedSettings = runnable;
    }

    public void setQrLoginDelegate(ActionIntroQRLoginDelegate actionIntroQRLoginDelegate) {
        this.qrLoginDelegate = actionIntroQRLoginDelegate;
    }

    public void setShowingAsBottomSheet(boolean z) {
        this.showingAsBottomSheet = z;
    }
}
