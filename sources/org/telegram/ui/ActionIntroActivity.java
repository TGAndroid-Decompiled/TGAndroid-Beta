package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$TL_messageMediaVenue;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.CameraScanActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.ShareLocationDrawable;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.voip.CellFlickerDrawable;

public class ActionIntroActivity extends BaseFragment implements LocationController.LocationFetchCallback {
    private TextView buttonTextView;
    private int[] colors;
    private String currentGroupCreateAddress;
    private String currentGroupCreateDisplayAddress;
    private Location currentGroupCreateLocation;
    private int currentType;
    private LinearLayout descriptionLayout;
    private TextView[] descriptionLines = new TextView[6];
    private TextView descriptionText;
    private TextView descriptionText2;
    private Drawable drawable2;
    private boolean flickerButton;
    private RLottieImageView imageView;
    private ActionIntroQRLoginDelegate qrLoginDelegate;
    private boolean showingAsBottomSheet;
    private TextView subtitleTextView;
    private TextView titleTextView;

    public interface ActionIntroQRLoginDelegate {
        void didFindQRCode(String str);
    }

    public ActionIntroActivity(int i) {
        this.currentType = i;
    }

    public static boolean lambda$createView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$createView$1(DialogInterface dialogInterface, int i) {
        presentFragment(new LoginActivity().changePhoneNumber(), true);
    }

    public void lambda$createView$2(View view) {
        BaseFragment channelCreateActivity;
        int checkSelfPermission;
        if (getParentActivity() == null) {
            return;
        }
        switch (this.currentType) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putInt("step", 0);
                channelCreateActivity = new ChannelCreateActivity(bundle);
                break;
            case 1:
                getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                return;
            case 2:
                if (this.currentGroupCreateAddress != null && this.currentGroupCreateLocation != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLongArray("result", new long[]{getUserConfig().getClientUserId()});
                    bundle2.putInt("chatType", 4);
                    bundle2.putString("address", this.currentGroupCreateAddress);
                    bundle2.putParcelable("location", this.currentGroupCreateLocation);
                    channelCreateActivity = new GroupCreateFinalActivity(bundle2);
                    break;
                } else {
                    return;
                }
            case 3:
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setTitle(LocaleController.getString(R.string.PhoneNumberChangeTitle));
                builder.setMessage(LocaleController.getString(R.string.PhoneNumberAlert));
                builder.setPositiveButton(LocaleController.getString(R.string.Change), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ActionIntroActivity.this.lambda$createView$1(dialogInterface, i);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                showDialog(builder.create());
                return;
            case 4:
                try {
                    getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 5:
                if (getParentActivity() == null) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    checkSelfPermission = getParentActivity().checkSelfPermission("android.permission.CAMERA");
                    if (checkSelfPermission != 0) {
                        getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    }
                }
                processOpenQrReader();
                return;
            case 6:
                channelCreateActivity = new PasscodeActivity(1);
                break;
            default:
                return;
        }
        presentFragment(channelCreateActivity, true);
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
        getParentLayout().closeLastFragment(true);
    }

    public void lambda$onRequestPermissionsResultFragment$6() {
        presentFragment(new PeopleNearbyActivity(), true);
    }

    public void lambda$onRequestPermissionsResultFragment$7(DialogInterface dialogInterface, int i) {
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
            public void didFindMrzInfo(MrzRecognizer.Result result) {
                CameraScanActivity.CameraScanActivityDelegate.CC.$default$didFindMrzInfo(this, result);
            }

            @Override
            public void didFindQr(String str) {
                ActionIntroActivity.this.finishFragment(false);
                ActionIntroActivity.this.qrLoginDelegate.didFindQRCode(str);
            }

            @Override
            public String getSubtitleText() {
                return CameraScanActivity.CameraScanActivityDelegate.CC.$default$getSubtitleText(this);
            }

            @Override
            public void onDismiss() {
                CameraScanActivity.CameraScanActivityDelegate.CC.$default$onDismiss(this);
            }

            @Override
            public boolean processQr(String str, Runnable runnable) {
                return CameraScanActivity.CameraScanActivityDelegate.CC.$default$processQr(this, str, runnable);
            }
        });
    }

    public void updateColors() {
        int[] iArr = this.colors;
        if (iArr == null || this.imageView == null) {
            return;
        }
        iArr[0] = 3355443;
        iArr[1] = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText);
        int[] iArr2 = this.colors;
        iArr2[2] = 16777215;
        int i = Theme.key_windowBackgroundWhite;
        iArr2[3] = Theme.getColor(i);
        int[] iArr3 = this.colors;
        iArr3[4] = 5285866;
        iArr3[5] = Theme.getColor(Theme.key_featuredStickers_addButton);
        int[] iArr4 = this.colors;
        iArr4[6] = 2170912;
        iArr4[7] = Theme.getColor(i);
        this.imageView.replaceColors(this.colors);
    }

    @Override
    public View createView(Context context) {
        TextView textView;
        int dp;
        int dp2;
        TextView textView2;
        float f;
        TextView textView3;
        int i;
        TextView textView4;
        int i2;
        int i3;
        TextView textView5;
        String str;
        TextView textView6;
        TextView textView7;
        LinearLayout.LayoutParams createLinear;
        int i4 = 2;
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setItemsColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2), false);
            this.actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarWhiteSelector), false);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
                @Override
                public void onItemClick(int i5) {
                    if (i5 == -1) {
                        ActionIntroActivity.this.lambda$onBackPressed$308();
                    }
                }
            });
        }
        ViewGroup viewGroup = new ViewGroup(context) {
            @Override
            protected void onLayout(boolean z, int i5, int i6, int i7, int i8) {
                float f2;
                float f3;
                int measuredWidth;
                float f4;
                int i9;
                View view;
                int measuredWidth2;
                View view2;
                int measuredHeight;
                TextView textView8;
                int measuredWidth3;
                int measuredHeight2;
                int i10;
                TextView textView9;
                int measuredWidth4;
                TextView textView10;
                int i11;
                TextView textView11;
                int measuredWidth5;
                int i12;
                int i13;
                float f5;
                float f6;
                float measuredWidth6;
                int i14 = 0;
                if (((BaseFragment) ActionIntroActivity.this).actionBar != null) {
                    ((BaseFragment) ActionIntroActivity.this).actionBar.layout(0, 0, i7, ((BaseFragment) ActionIntroActivity.this).actionBar.getMeasuredHeight());
                }
                int i15 = i7 - i5;
                int i16 = i8 - i6;
                switch (ActionIntroActivity.this.currentType) {
                    case 0:
                        if (i7 <= i8) {
                            f2 = i16;
                            int i17 = (int) (0.188f * f2);
                            ActionIntroActivity.this.imageView.layout(0, i17, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + i17);
                            int i18 = (int) (0.651f * f2);
                            ActionIntroActivity.this.titleTextView.layout(0, i18, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i18);
                            f3 = 0.731f;
                            i9 = (int) (f3 * f2);
                            view = ActionIntroActivity.this.descriptionText;
                            measuredWidth2 = ActionIntroActivity.this.descriptionText.getMeasuredWidth();
                            view2 = ActionIntroActivity.this.descriptionText;
                            view.layout(i14, i9, measuredWidth2, view2.getMeasuredHeight() + i9);
                            i12 = (i15 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                            i13 = (int) (f2 * 0.853f);
                            TextView textView12 = ActionIntroActivity.this.buttonTextView;
                            measuredWidth4 = i12 + ActionIntroActivity.this.buttonTextView.getMeasuredWidth();
                            i11 = i12;
                            textView11 = textView12;
                            measuredHeight = i13;
                            textView10 = ActionIntroActivity.this.buttonTextView;
                            measuredWidth5 = i11;
                            measuredHeight2 = textView10.getMeasuredHeight() + measuredHeight;
                            int i19 = measuredWidth4;
                            i14 = measuredWidth5;
                            textView8 = textView11;
                            measuredWidth3 = i19;
                            textView8.layout(i14, measuredHeight, measuredWidth3, measuredHeight2);
                            return;
                        }
                        int measuredHeight3 = (i16 - ActionIntroActivity.this.imageView.getMeasuredHeight()) / 2;
                        ActionIntroActivity.this.imageView.layout(0, measuredHeight3, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + measuredHeight3);
                        float f7 = i15;
                        float f8 = 0.4f * f7;
                        int i20 = (int) f8;
                        float f9 = i16;
                        int i21 = (int) (0.22f * f9);
                        ActionIntroActivity.this.titleTextView.layout(i20, i21, ActionIntroActivity.this.titleTextView.getMeasuredWidth() + i20, ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i21);
                        int i22 = (int) (0.39f * f9);
                        ActionIntroActivity.this.descriptionText.layout(i20, i22, ActionIntroActivity.this.descriptionText.getMeasuredWidth() + i20, ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i22);
                        measuredWidth = (int) (f8 + (((f7 * 0.6f) - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2.0f));
                        f4 = f9 * 0.69f;
                        i13 = (int) f4;
                        i12 = measuredWidth;
                        TextView textView122 = ActionIntroActivity.this.buttonTextView;
                        measuredWidth4 = i12 + ActionIntroActivity.this.buttonTextView.getMeasuredWidth();
                        i11 = i12;
                        textView11 = textView122;
                        measuredHeight = i13;
                        textView10 = ActionIntroActivity.this.buttonTextView;
                        measuredWidth5 = i11;
                        measuredHeight2 = textView10.getMeasuredHeight() + measuredHeight;
                        int i192 = measuredWidth4;
                        i14 = measuredWidth5;
                        textView8 = textView11;
                        measuredWidth3 = i192;
                        textView8.layout(i14, measuredHeight, measuredWidth3, measuredHeight2);
                        return;
                    case 1:
                    case 4:
                        if (i7 <= i8) {
                            f2 = i16;
                            int i23 = (int) (0.214f * f2);
                            int measuredWidth7 = (i15 - ActionIntroActivity.this.imageView.getMeasuredWidth()) / 2;
                            ActionIntroActivity.this.imageView.layout(measuredWidth7, i23, ActionIntroActivity.this.imageView.getMeasuredWidth() + measuredWidth7, ActionIntroActivity.this.imageView.getMeasuredHeight() + i23);
                            int i24 = (int) (0.414f * f2);
                            ActionIntroActivity.this.titleTextView.layout(0, i24, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i24);
                            f3 = 0.493f;
                            i9 = (int) (f3 * f2);
                            view = ActionIntroActivity.this.descriptionText;
                            measuredWidth2 = ActionIntroActivity.this.descriptionText.getMeasuredWidth();
                            view2 = ActionIntroActivity.this.descriptionText;
                            view.layout(i14, i9, measuredWidth2, view2.getMeasuredHeight() + i9);
                            i12 = (i15 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                            i13 = (int) (f2 * 0.853f);
                            TextView textView1222 = ActionIntroActivity.this.buttonTextView;
                            measuredWidth4 = i12 + ActionIntroActivity.this.buttonTextView.getMeasuredWidth();
                            i11 = i12;
                            textView11 = textView1222;
                            measuredHeight = i13;
                            textView10 = ActionIntroActivity.this.buttonTextView;
                            measuredWidth5 = i11;
                            measuredHeight2 = textView10.getMeasuredHeight() + measuredHeight;
                            int i1922 = measuredWidth4;
                            i14 = measuredWidth5;
                            textView8 = textView11;
                            measuredWidth3 = i1922;
                            textView8.layout(i14, measuredHeight, measuredWidth3, measuredHeight2);
                            return;
                        }
                        int measuredHeight4 = (i16 - ActionIntroActivity.this.imageView.getMeasuredHeight()) / 2;
                        float f10 = i15;
                        int measuredWidth8 = ((int) ((0.5f * f10) - ActionIntroActivity.this.imageView.getMeasuredWidth())) / 2;
                        ActionIntroActivity.this.imageView.layout(measuredWidth8, measuredHeight4, ActionIntroActivity.this.imageView.getMeasuredWidth() + measuredWidth8, ActionIntroActivity.this.imageView.getMeasuredHeight() + measuredHeight4);
                        float f11 = 0.4f * f10;
                        int i25 = (int) f11;
                        f6 = i16;
                        int i26 = (int) (0.14f * f6);
                        ActionIntroActivity.this.titleTextView.layout(i25, i26, ActionIntroActivity.this.titleTextView.getMeasuredWidth() + i25, ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i26);
                        int i27 = (int) (0.31f * f6);
                        ActionIntroActivity.this.descriptionText.layout(i25, i27, ActionIntroActivity.this.descriptionText.getMeasuredWidth() + i25, ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i27);
                        measuredWidth6 = f11 + (((f10 * 0.6f) - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2.0f);
                        measuredWidth = (int) measuredWidth6;
                        f4 = f6 * 0.78f;
                        i13 = (int) f4;
                        i12 = measuredWidth;
                        TextView textView12222 = ActionIntroActivity.this.buttonTextView;
                        measuredWidth4 = i12 + ActionIntroActivity.this.buttonTextView.getMeasuredWidth();
                        i11 = i12;
                        textView11 = textView12222;
                        measuredHeight = i13;
                        textView10 = ActionIntroActivity.this.buttonTextView;
                        measuredWidth5 = i11;
                        measuredHeight2 = textView10.getMeasuredHeight() + measuredHeight;
                        int i19222 = measuredWidth4;
                        i14 = measuredWidth5;
                        textView8 = textView11;
                        measuredWidth3 = i19222;
                        textView8.layout(i14, measuredHeight, measuredWidth3, measuredHeight2);
                        return;
                    case 2:
                        if (i7 <= i8) {
                            float f12 = i16;
                            int i28 = (int) (0.197f * f12);
                            ActionIntroActivity.this.imageView.layout(0, i28, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + i28);
                            int i29 = (int) (0.421f * f12);
                            ActionIntroActivity.this.titleTextView.layout(0, i29, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i29);
                            int i30 = (int) (0.477f * f12);
                            ActionIntroActivity.this.subtitleTextView.layout(0, i30, ActionIntroActivity.this.subtitleTextView.getMeasuredWidth(), ActionIntroActivity.this.subtitleTextView.getMeasuredHeight() + i30);
                            int i31 = (int) (0.537f * f12);
                            ActionIntroActivity.this.descriptionText.layout(0, i31, ActionIntroActivity.this.descriptionText.getMeasuredWidth(), ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i31);
                            int measuredWidth9 = (i15 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                            int i32 = (int) (f12 * 0.71f);
                            ActionIntroActivity.this.buttonTextView.layout(measuredWidth9, i32, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth9, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i32);
                            measuredHeight = (getMeasuredHeight() - ActionIntroActivity.this.descriptionText2.getMeasuredHeight()) - AndroidUtilities.dp(20.0f);
                            textView8 = ActionIntroActivity.this.descriptionText2;
                            measuredWidth3 = ActionIntroActivity.this.descriptionText2.getMeasuredWidth();
                            measuredHeight2 = ActionIntroActivity.this.descriptionText2.getMeasuredHeight() + measuredHeight;
                            textView8.layout(i14, measuredHeight, measuredWidth3, measuredHeight2);
                            return;
                        }
                        float f13 = i16;
                        int measuredHeight5 = ((int) ((0.9f * f13) - ActionIntroActivity.this.imageView.getMeasuredHeight())) / 2;
                        ActionIntroActivity.this.imageView.layout(0, measuredHeight5, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + measuredHeight5);
                        int measuredHeight6 = measuredHeight5 + ActionIntroActivity.this.imageView.getMeasuredHeight() + AndroidUtilities.dp(10.0f);
                        ActionIntroActivity.this.subtitleTextView.layout(0, measuredHeight6, ActionIntroActivity.this.subtitleTextView.getMeasuredWidth(), ActionIntroActivity.this.subtitleTextView.getMeasuredHeight() + measuredHeight6);
                        float f14 = i15;
                        float f15 = 0.4f * f14;
                        i10 = (int) f15;
                        int i33 = (int) (0.12f * f13);
                        ActionIntroActivity.this.titleTextView.layout(i10, i33, ActionIntroActivity.this.titleTextView.getMeasuredWidth() + i10, ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i33);
                        int i34 = (int) (0.26f * f13);
                        ActionIntroActivity.this.descriptionText.layout(i10, i34, ActionIntroActivity.this.descriptionText.getMeasuredWidth() + i10, ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i34);
                        int measuredWidth10 = (int) (f15 + (((f14 * 0.6f) - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2.0f));
                        int i35 = (int) (f13 * 0.6f);
                        ActionIntroActivity.this.buttonTextView.layout(measuredWidth10, i35, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth10, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i35);
                        measuredHeight = (getMeasuredHeight() - ActionIntroActivity.this.descriptionText2.getMeasuredHeight()) - AndroidUtilities.dp(20.0f);
                        textView9 = ActionIntroActivity.this.descriptionText2;
                        measuredWidth4 = ActionIntroActivity.this.descriptionText2.getMeasuredWidth() + i10;
                        textView10 = ActionIntroActivity.this.descriptionText2;
                        i11 = i10;
                        textView11 = textView9;
                        measuredWidth5 = i11;
                        measuredHeight2 = textView10.getMeasuredHeight() + measuredHeight;
                        int i192222 = measuredWidth4;
                        i14 = measuredWidth5;
                        textView8 = textView11;
                        measuredWidth3 = i192222;
                        textView8.layout(i14, measuredHeight, measuredWidth3, measuredHeight2);
                        return;
                    case 3:
                        if (i7 <= i8) {
                            int i36 = (int) (i16 * 0.3f);
                            int measuredWidth11 = (i15 - ActionIntroActivity.this.imageView.getMeasuredWidth()) / 2;
                            ActionIntroActivity.this.imageView.layout(measuredWidth11, i36, ActionIntroActivity.this.imageView.getMeasuredWidth() + measuredWidth11, ActionIntroActivity.this.imageView.getMeasuredHeight() + i36);
                            int measuredHeight7 = i36 + ActionIntroActivity.this.imageView.getMeasuredHeight() + AndroidUtilities.dp(24.0f);
                            ActionIntroActivity.this.titleTextView.layout(0, measuredHeight7, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + measuredHeight7);
                            int textSize = (int) (measuredHeight7 + ActionIntroActivity.this.titleTextView.getTextSize() + AndroidUtilities.dp(16.0f));
                            ActionIntroActivity.this.descriptionText.layout(0, textSize, ActionIntroActivity.this.descriptionText.getMeasuredWidth(), ActionIntroActivity.this.descriptionText.getMeasuredHeight() + textSize);
                            int measuredWidth12 = (i15 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                            int measuredHeight8 = (i16 - ActionIntroActivity.this.buttonTextView.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                            ActionIntroActivity.this.buttonTextView.layout(measuredWidth12, measuredHeight8, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth12, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + measuredHeight8);
                            i10 = (i15 - ActionIntroActivity.this.subtitleTextView.getMeasuredWidth()) / 2;
                            measuredHeight = measuredHeight8 - (ActionIntroActivity.this.subtitleTextView.getMeasuredHeight() + AndroidUtilities.dp(32.0f));
                            textView9 = ActionIntroActivity.this.subtitleTextView;
                            measuredWidth4 = ActionIntroActivity.this.subtitleTextView.getMeasuredWidth() + i10;
                            textView10 = ActionIntroActivity.this.subtitleTextView;
                            i11 = i10;
                            textView11 = textView9;
                            measuredWidth5 = i11;
                            measuredHeight2 = textView10.getMeasuredHeight() + measuredHeight;
                            int i1922222 = measuredWidth4;
                            i14 = measuredWidth5;
                            textView8 = textView11;
                            measuredWidth3 = i1922222;
                            textView8.layout(i14, measuredHeight, measuredWidth3, measuredHeight2);
                            return;
                        }
                        float f16 = i16;
                        int measuredHeight9 = ((int) ((0.95f * f16) - ActionIntroActivity.this.imageView.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - ActionIntroActivity.this.imageView.getMeasuredWidth());
                        ActionIntroActivity.this.imageView.layout(width, measuredHeight9, ActionIntroActivity.this.imageView.getMeasuredWidth() + width, ActionIntroActivity.this.imageView.getMeasuredHeight() + measuredHeight9);
                        float f17 = i15;
                        float f18 = 0.4f * f17;
                        int i37 = (int) f18;
                        int i38 = (int) (0.12f * f16);
                        ActionIntroActivity.this.titleTextView.layout(i37, i38, ActionIntroActivity.this.titleTextView.getMeasuredWidth() + i37, ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i38);
                        int i39 = (int) (0.24f * f16);
                        ActionIntroActivity.this.descriptionText.layout(i37, i39, ActionIntroActivity.this.descriptionText.getMeasuredWidth() + i37, ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i39);
                        float f19 = f17 * 0.6f;
                        int measuredWidth13 = (int) (((f19 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2.0f) + f18);
                        int i40 = (int) (f16 * 0.8f);
                        ActionIntroActivity.this.buttonTextView.layout(measuredWidth13, i40, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth13, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i40);
                        measuredWidth5 = (int) (f18 + ((f19 - ActionIntroActivity.this.subtitleTextView.getMeasuredWidth()) / 2.0f));
                        measuredHeight = i40 - (ActionIntroActivity.this.subtitleTextView.getMeasuredHeight() + AndroidUtilities.dp(16.0f));
                        textView11 = ActionIntroActivity.this.subtitleTextView;
                        measuredWidth4 = ActionIntroActivity.this.subtitleTextView.getMeasuredWidth() + measuredWidth5;
                        textView10 = ActionIntroActivity.this.subtitleTextView;
                        measuredHeight2 = textView10.getMeasuredHeight() + measuredHeight;
                        int i19222222 = measuredWidth4;
                        i14 = measuredWidth5;
                        textView8 = textView11;
                        measuredWidth3 = i19222222;
                        textView8.layout(i14, measuredHeight, measuredWidth3, measuredHeight2);
                        return;
                    case 5:
                        if (ActionIntroActivity.this.showingAsBottomSheet) {
                            ActionIntroActivity.this.imageView.layout(0, 0, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight());
                            f2 = i16;
                            int i41 = (int) (0.403f * f2);
                            ActionIntroActivity.this.titleTextView.layout(0, i41, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i41);
                            i9 = (int) (0.631f * f2);
                            i14 = (getMeasuredWidth() - ActionIntroActivity.this.descriptionLayout.getMeasuredWidth()) / 2;
                            view = ActionIntroActivity.this.descriptionLayout;
                            measuredWidth2 = ActionIntroActivity.this.descriptionLayout.getMeasuredWidth() + i14;
                            view2 = ActionIntroActivity.this.descriptionLayout;
                            view.layout(i14, i9, measuredWidth2, view2.getMeasuredHeight() + i9);
                            i12 = (i15 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                            i13 = (int) (f2 * 0.853f);
                            TextView textView122222 = ActionIntroActivity.this.buttonTextView;
                            measuredWidth4 = i12 + ActionIntroActivity.this.buttonTextView.getMeasuredWidth();
                            i11 = i12;
                            textView11 = textView122222;
                            measuredHeight = i13;
                            textView10 = ActionIntroActivity.this.buttonTextView;
                            measuredWidth5 = i11;
                            measuredHeight2 = textView10.getMeasuredHeight() + measuredHeight;
                            int i192222222 = measuredWidth4;
                            i14 = measuredWidth5;
                            textView8 = textView11;
                            measuredWidth3 = i192222222;
                            textView8.layout(i14, measuredHeight, measuredWidth3, measuredHeight2);
                            return;
                        }
                        if (i7 > i8) {
                            int measuredHeight10 = (i16 - ActionIntroActivity.this.imageView.getMeasuredHeight()) / 2;
                            ActionIntroActivity.this.imageView.layout(0, measuredHeight10, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + measuredHeight10);
                            float f20 = i15;
                            float f21 = 0.4f * f20;
                            int i42 = (int) f21;
                            f6 = i16;
                            int i43 = (int) (0.08f * f6);
                            ActionIntroActivity.this.titleTextView.layout(i42, i43, ActionIntroActivity.this.titleTextView.getMeasuredWidth() + i42, ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i43);
                            float f22 = f20 * 0.6f;
                            int measuredWidth14 = (int) (((f22 - ActionIntroActivity.this.descriptionLayout.getMeasuredWidth()) / 2.0f) + f21);
                            int i44 = (int) (0.25f * f6);
                            ActionIntroActivity.this.descriptionLayout.layout(measuredWidth14, i44, ActionIntroActivity.this.descriptionLayout.getMeasuredWidth() + measuredWidth14, ActionIntroActivity.this.descriptionLayout.getMeasuredHeight() + i44);
                            measuredWidth6 = f21 + ((f22 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2.0f);
                            measuredWidth = (int) measuredWidth6;
                            f4 = f6 * 0.78f;
                            i13 = (int) f4;
                            i12 = measuredWidth;
                            TextView textView1222222 = ActionIntroActivity.this.buttonTextView;
                            measuredWidth4 = i12 + ActionIntroActivity.this.buttonTextView.getMeasuredWidth();
                            i11 = i12;
                            textView11 = textView1222222;
                            measuredHeight = i13;
                            textView10 = ActionIntroActivity.this.buttonTextView;
                            measuredWidth5 = i11;
                            measuredHeight2 = textView10.getMeasuredHeight() + measuredHeight;
                            int i1922222222 = measuredWidth4;
                            i14 = measuredWidth5;
                            textView8 = textView11;
                            measuredWidth3 = i1922222222;
                            textView8.layout(i14, measuredHeight, measuredWidth3, measuredHeight2);
                            return;
                        }
                        if (AndroidUtilities.displaySize.y < 1800) {
                            float f23 = i16;
                            int i45 = (int) (0.06f * f23);
                            ActionIntroActivity.this.imageView.layout(0, i45, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + i45);
                            int i46 = (int) (0.463f * f23);
                            ActionIntroActivity.this.titleTextView.layout(0, i46, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i46);
                            f5 = f23 * 0.543f;
                        } else {
                            float f24 = i16;
                            int i47 = (int) (0.148f * f24);
                            ActionIntroActivity.this.imageView.layout(0, i47, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + i47);
                            int i48 = (int) (0.551f * f24);
                            ActionIntroActivity.this.titleTextView.layout(0, i48, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i48);
                            f5 = f24 * 0.631f;
                        }
                        int i49 = (int) f5;
                        int measuredWidth15 = (getMeasuredWidth() - ActionIntroActivity.this.descriptionLayout.getMeasuredWidth()) / 2;
                        ActionIntroActivity.this.descriptionLayout.layout(measuredWidth15, i49, ActionIntroActivity.this.descriptionLayout.getMeasuredWidth() + measuredWidth15, ActionIntroActivity.this.descriptionLayout.getMeasuredHeight() + i49);
                        i12 = (i15 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                        f2 = i16;
                        i13 = (int) (f2 * 0.853f);
                        TextView textView12222222 = ActionIntroActivity.this.buttonTextView;
                        measuredWidth4 = i12 + ActionIntroActivity.this.buttonTextView.getMeasuredWidth();
                        i11 = i12;
                        textView11 = textView12222222;
                        measuredHeight = i13;
                        textView10 = ActionIntroActivity.this.buttonTextView;
                        measuredWidth5 = i11;
                        measuredHeight2 = textView10.getMeasuredHeight() + measuredHeight;
                        int i19222222222 = measuredWidth4;
                        i14 = measuredWidth5;
                        textView8 = textView11;
                        measuredWidth3 = i19222222222;
                        textView8.layout(i14, measuredHeight, measuredWidth3, measuredHeight2);
                        return;
                    case 6:
                        if (i7 <= i8) {
                            int i50 = (int) (i16 * 0.3f);
                            int measuredWidth16 = (i15 - ActionIntroActivity.this.imageView.getMeasuredWidth()) / 2;
                            ActionIntroActivity.this.imageView.layout(measuredWidth16, i50, ActionIntroActivity.this.imageView.getMeasuredWidth() + measuredWidth16, ActionIntroActivity.this.imageView.getMeasuredHeight() + i50);
                            int measuredHeight11 = i50 + ActionIntroActivity.this.imageView.getMeasuredHeight() + AndroidUtilities.dp(24.0f);
                            ActionIntroActivity.this.titleTextView.layout(0, measuredHeight11, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + measuredHeight11);
                            int textSize2 = (int) (measuredHeight11 + ActionIntroActivity.this.titleTextView.getTextSize() + AndroidUtilities.dp(16.0f));
                            ActionIntroActivity.this.descriptionText.layout(0, textSize2, ActionIntroActivity.this.descriptionText.getMeasuredWidth(), ActionIntroActivity.this.descriptionText.getMeasuredHeight() + textSize2);
                            i12 = (i15 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                            i13 = (i16 - ActionIntroActivity.this.buttonTextView.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                            TextView textView122222222 = ActionIntroActivity.this.buttonTextView;
                            measuredWidth4 = i12 + ActionIntroActivity.this.buttonTextView.getMeasuredWidth();
                            i11 = i12;
                            textView11 = textView122222222;
                            measuredHeight = i13;
                            textView10 = ActionIntroActivity.this.buttonTextView;
                            measuredWidth5 = i11;
                            measuredHeight2 = textView10.getMeasuredHeight() + measuredHeight;
                            int i192222222222 = measuredWidth4;
                            i14 = measuredWidth5;
                            textView8 = textView11;
                            measuredWidth3 = i192222222222;
                            textView8.layout(i14, measuredHeight, measuredWidth3, measuredHeight2);
                            return;
                        }
                        int measuredHeight42 = (i16 - ActionIntroActivity.this.imageView.getMeasuredHeight()) / 2;
                        float f102 = i15;
                        int measuredWidth82 = ((int) ((0.5f * f102) - ActionIntroActivity.this.imageView.getMeasuredWidth())) / 2;
                        ActionIntroActivity.this.imageView.layout(measuredWidth82, measuredHeight42, ActionIntroActivity.this.imageView.getMeasuredWidth() + measuredWidth82, ActionIntroActivity.this.imageView.getMeasuredHeight() + measuredHeight42);
                        float f112 = 0.4f * f102;
                        int i252 = (int) f112;
                        f6 = i16;
                        int i262 = (int) (0.14f * f6);
                        ActionIntroActivity.this.titleTextView.layout(i252, i262, ActionIntroActivity.this.titleTextView.getMeasuredWidth() + i252, ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i262);
                        int i272 = (int) (0.31f * f6);
                        ActionIntroActivity.this.descriptionText.layout(i252, i272, ActionIntroActivity.this.descriptionText.getMeasuredWidth() + i252, ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i272);
                        measuredWidth6 = f112 + (((f102 * 0.6f) - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2.0f);
                        measuredWidth = (int) measuredWidth6;
                        f4 = f6 * 0.78f;
                        i13 = (int) f4;
                        i12 = measuredWidth;
                        TextView textView1222222222 = ActionIntroActivity.this.buttonTextView;
                        measuredWidth4 = i12 + ActionIntroActivity.this.buttonTextView.getMeasuredWidth();
                        i11 = i12;
                        textView11 = textView1222222222;
                        measuredHeight = i13;
                        textView10 = ActionIntroActivity.this.buttonTextView;
                        measuredWidth5 = i11;
                        measuredHeight2 = textView10.getMeasuredHeight() + measuredHeight;
                        int i1922222222222 = measuredWidth4;
                        i14 = measuredWidth5;
                        textView8 = textView11;
                        measuredWidth3 = i1922222222222;
                        textView8.layout(i14, measuredHeight, measuredWidth3, measuredHeight2);
                        return;
                    default:
                        return;
                }
            }

            @Override
            protected void onMeasure(int r13, int r14) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionIntroActivity.AnonymousClass2.onMeasure(int, int):void");
            }
        };
        this.fragmentView = viewGroup;
        viewGroup.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        ViewGroup viewGroup2 = (ViewGroup) this.fragmentView;
        viewGroup2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$createView$0;
                lambda$createView$0 = ActionIntroActivity.lambda$createView$0(view, motionEvent);
                return lambda$createView$0;
            }
        });
        ActionBar actionBar2 = this.actionBar;
        if (actionBar2 != null) {
            viewGroup2.addView(actionBar2);
        }
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        viewGroup2.addView(rLottieImageView);
        TextView textView8 = new TextView(context);
        this.titleTextView = textView8;
        int i5 = Theme.key_windowBackgroundWhiteBlackText;
        textView8.setTextColor(Theme.getColor(i5));
        this.titleTextView.setGravity(1);
        this.titleTextView.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.titleTextView.setTextSize(1, 24.0f);
        viewGroup2.addView(this.titleTextView);
        TextView textView9 = new TextView(context);
        this.subtitleTextView = textView9;
        if (this.currentType == 3) {
            i5 = Theme.key_featuredStickers_addButton;
        }
        textView9.setTextColor(Theme.getColor(i5));
        this.subtitleTextView.setGravity(1);
        float f2 = 15.0f;
        this.subtitleTextView.setTextSize(1, 15.0f);
        this.subtitleTextView.setSingleLine(true);
        this.subtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
        if (this.currentType == 2) {
            textView = this.subtitleTextView;
            dp = AndroidUtilities.dp(24.0f);
            dp2 = AndroidUtilities.dp(24.0f);
        } else {
            textView = this.subtitleTextView;
            dp = AndroidUtilities.dp(32.0f);
            dp2 = AndroidUtilities.dp(32.0f);
        }
        textView.setPadding(dp, 0, dp2, 0);
        this.subtitleTextView.setVisibility(8);
        viewGroup2.addView(this.subtitleTextView);
        TextView textView10 = new TextView(context);
        this.descriptionText = textView10;
        textView10.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText6));
        this.descriptionText.setGravity(1);
        this.descriptionText.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.descriptionText.setTextSize(1, 15.0f);
        int i6 = this.currentType;
        if (i6 == 6 || i6 == 3) {
            this.descriptionText.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        } else if (i6 == 2) {
            this.descriptionText.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        } else {
            this.descriptionText.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        }
        viewGroup2.addView(this.descriptionText);
        if (this.currentType == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.descriptionLayout = linearLayout;
            linearLayout.setOrientation(1);
            this.descriptionLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
            this.descriptionLayout.setGravity(LocaleController.isRTL ? 5 : 3);
            viewGroup2.addView(this.descriptionLayout);
            int i7 = 0;
            for (int i8 = 3; i7 < i8; i8 = 3) {
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                this.descriptionLayout.addView(linearLayout2, LayoutHelper.createLinear(-2, -2, 0.0f, 0.0f, 0.0f, i7 != i4 ? 7.0f : 0.0f));
                int i9 = i7 * 2;
                this.descriptionLines[i9] = new TextView(context);
                TextView textView11 = this.descriptionLines[i9];
                int i10 = Theme.key_windowBackgroundWhiteBlackText;
                textView11.setTextColor(Theme.getColor(i10));
                this.descriptionLines[i9].setGravity(LocaleController.isRTL ? 5 : 3);
                this.descriptionLines[i9].setTextSize(1, f2);
                int i11 = i7 + 1;
                this.descriptionLines[i9].setText(String.format(LocaleController.isRTL ? ".%d" : "%d.", Integer.valueOf(i11)));
                this.descriptionLines[i9].setTypeface(AndroidUtilities.bold());
                int i12 = i9 + 1;
                this.descriptionLines[i12] = new TextView(context);
                this.descriptionLines[i12].setTextColor(Theme.getColor(i10));
                this.descriptionLines[i12].setGravity(LocaleController.isRTL ? 5 : 3);
                this.descriptionLines[i12].setTextSize(1, f2);
                if (i7 == 0) {
                    this.descriptionLines[i12].setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText));
                    this.descriptionLines[i12].setHighlightColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkSelection));
                    String string = LocaleController.getString(R.string.AuthAnotherClientInfo1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int indexOf = string.indexOf(42);
                    int lastIndexOf = string.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        this.descriptionLines[i12].setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new URLSpanNoUnderline(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl)), indexOf, lastIndexOf - 1, 33);
                    }
                    textView6 = this.descriptionLines[i12];
                    str = spannableStringBuilder;
                } else {
                    if (i7 == 1) {
                        TextView textView12 = this.descriptionLines[i12];
                        i3 = R.string.AuthAnotherClientInfo2;
                        textView5 = textView12;
                    } else {
                        TextView textView13 = this.descriptionLines[i12];
                        i3 = R.string.AuthAnotherClientInfo3;
                        textView5 = textView13;
                    }
                    textView6 = textView5;
                    str = LocaleController.getString(i3);
                }
                textView6.setText(str);
                if (LocaleController.isRTL) {
                    linearLayout2.setGravity(5);
                    linearLayout2.addView(this.descriptionLines[i12], LayoutHelper.createLinear(0, -2, 1.0f));
                    textView7 = this.descriptionLines[i9];
                    createLinear = LayoutHelper.createLinear(-2, -2, 4.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    linearLayout2.addView(this.descriptionLines[i9], LayoutHelper.createLinear(-2, -2, 0.0f, 0.0f, 4.0f, 0.0f));
                    textView7 = this.descriptionLines[i12];
                    createLinear = LayoutHelper.createLinear(-2, -2);
                }
                linearLayout2.addView(textView7, createLinear);
                i7 = i11;
                i4 = 2;
                f2 = 15.0f;
            }
            this.descriptionText.setVisibility(8);
        }
        TextView textView14 = new TextView(context);
        this.descriptionText2 = textView14;
        textView14.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText6));
        this.descriptionText2.setGravity(1);
        this.descriptionText2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.descriptionText2.setTextSize(1, 13.0f);
        this.descriptionText2.setVisibility(8);
        if (this.currentType == 2) {
            textView2 = this.descriptionText2;
            f = 18.0f;
        } else {
            textView2 = this.descriptionText2;
            f = 32.0f;
        }
        textView2.setPadding(AndroidUtilities.dp(f), 0, AndroidUtilities.dp(f), 0);
        viewGroup2.addView(this.descriptionText2);
        TextView textView15 = new TextView(context) {
            CellFlickerDrawable cellFlickerDrawable;

            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                if (ActionIntroActivity.this.flickerButton) {
                    if (this.cellFlickerDrawable == null) {
                        CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable();
                        this.cellFlickerDrawable = cellFlickerDrawable;
                        cellFlickerDrawable.drawFrame = false;
                        cellFlickerDrawable.repeatProgress = 2.0f;
                    }
                    this.cellFlickerDrawable.setParentWidth(getMeasuredWidth());
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    this.cellFlickerDrawable.draw(canvas, rectF, AndroidUtilities.dp(4.0f), null);
                    invalidate();
                }
            }
        };
        this.buttonTextView = textView15;
        textView15.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.buttonTextView.setGravity(17);
        this.buttonTextView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText));
        this.buttonTextView.setTextSize(1, 14.0f);
        this.buttonTextView.setTypeface(AndroidUtilities.bold());
        int i13 = this.currentType;
        this.buttonTextView.setBackground(Theme.AdaptiveRipple.filledRectByKey(Theme.key_featuredStickers_addButton, (i13 == 6 || i13 == 3 || i13 == 0) ? 6 : 4));
        viewGroup2.addView(this.buttonTextView);
        this.buttonTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ActionIntroActivity.this.lambda$createView$2(view);
            }
        });
        switch (this.currentType) {
            case 0:
                this.imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.imageView.setAnimation(R.raw.channel_create, 200, 200);
                this.titleTextView.setText(LocaleController.getString(R.string.ChannelAlertTitle));
                this.descriptionText.setText(LocaleController.getString(R.string.ChannelAlertText));
                textView3 = this.buttonTextView;
                i = R.string.ChannelAlertCreate2;
                textView3.setText(LocaleController.getString(i));
                this.imageView.playAnimation();
                this.flickerButton = true;
                break;
            case 1:
                this.imageView.setBackgroundDrawable(Theme.createCircleDrawable(AndroidUtilities.dp(100.0f), Theme.getColor(Theme.key_chats_archiveBackground)));
                this.imageView.setImageDrawable(new ShareLocationDrawable(context, 3));
                this.imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.titleTextView.setText(LocaleController.getString(R.string.PeopleNearby));
                this.descriptionText.setText(LocaleController.getString(R.string.PeopleNearbyAccessInfo));
                this.buttonTextView.setText(LocaleController.getString(R.string.PeopleNearbyAllowAccess));
                this.flickerButton = true;
                break;
            case 2:
                this.subtitleTextView.setVisibility(0);
                this.descriptionText2.setVisibility(0);
                this.imageView.setImageResource(Theme.getCurrentTheme().isDark() ? R.drawable.groupsintro2 : R.drawable.groupsintro);
                this.imageView.setScaleType(ImageView.ScaleType.CENTER);
                TextView textView16 = this.subtitleTextView;
                String str2 = this.currentGroupCreateDisplayAddress;
                textView16.setText(str2 != null ? str2 : "");
                this.titleTextView.setText(LocaleController.getString(R.string.NearbyCreateGroup));
                this.descriptionText.setText(LocaleController.getString(R.string.NearbyCreateGroupInfo));
                this.descriptionText2.setText(LocaleController.getString(R.string.NearbyCreateGroupInfo2));
                textView4 = this.buttonTextView;
                i2 = R.string.NearbyStartGroup;
                textView4.setText(LocaleController.getString(i2));
                break;
            case 3:
                this.subtitleTextView.setVisibility(0);
                this.imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.imageView.setAnimation(R.raw.utyan_change_number, 200, 200);
                this.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ActionIntroActivity.this.lambda$createView$4(view);
                    }
                });
                UserConfig userConfig = getUserConfig();
                TLRPC$User user = getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                if (user == null) {
                    user = userConfig.getCurrentUser();
                }
                if (user != null) {
                    this.subtitleTextView.setText(LocaleController.formatString("PhoneNumberKeepButton", R.string.PhoneNumberKeepButton, PhoneFormat.getInstance().format("+" + user.phone)));
                }
                this.subtitleTextView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ActionIntroActivity.this.lambda$createView$5(view);
                    }
                });
                TextView textView17 = this.titleTextView;
                i = R.string.PhoneNumberChange2;
                textView17.setText(LocaleController.getString(i));
                this.descriptionText.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PhoneNumberHelp)));
                textView3 = this.buttonTextView;
                textView3.setText(LocaleController.getString(i));
                this.imageView.playAnimation();
                this.flickerButton = true;
                break;
            case 4:
                this.imageView.setBackgroundDrawable(Theme.createCircleDrawable(AndroidUtilities.dp(100.0f), Theme.getColor(Theme.key_chats_archiveBackground)));
                this.imageView.setImageDrawable(new ShareLocationDrawable(context, 3));
                this.imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.titleTextView.setText(LocaleController.getString(R.string.PeopleNearby));
                this.descriptionText.setText(LocaleController.getString(R.string.PeopleNearbyGpsInfo));
                textView4 = this.buttonTextView;
                i2 = R.string.PeopleNearbyGps;
                textView4.setText(LocaleController.getString(i2));
                break;
            case 5:
                this.colors = new int[8];
                updateColors();
                this.imageView.setAnimation(R.raw.qr_login, 334, 334, this.colors);
                this.imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.titleTextView.setText(LocaleController.getString(R.string.AuthAnotherClient));
                this.buttonTextView.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
                this.imageView.playAnimation();
                break;
            case 6:
                this.imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.imageView.setAnimation(R.raw.utyan_passcode, 200, 200);
                this.imageView.setFocusable(false);
                this.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ActionIntroActivity.this.lambda$createView$3(view);
                    }
                });
                this.titleTextView.setText(LocaleController.getString(R.string.Passcode));
                this.descriptionText.setText(LocaleController.getString(R.string.ChangePasscodeInfoShort));
                textView3 = this.buttonTextView;
                i = R.string.EnablePasscode;
                textView3.setText(LocaleController.getString(i));
                this.imageView.playAnimation();
                this.flickerButton = true;
                break;
        }
        if (this.flickerButton) {
            this.buttonTextView.setPadding(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f));
            this.buttonTextView.setTextSize(1, 15.0f);
        }
        return this.fragmentView;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ActionIntroActivity.this.updateColors();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        View view = this.fragmentView;
        int i = ThemeDescription.FLAG_BACKGROUND;
        int i2 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(view, i, null, null, null, themeDescriptionDelegate, i2));
        if (this.actionBar != null) {
            arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i2));
            arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText2));
            arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarWhiteSelector));
        }
        TextView textView = this.titleTextView;
        int i3 = ThemeDescription.FLAG_TEXTCOLOR;
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(textView, i3, null, null, null, themeDescriptionDelegate, i4));
        arrayList.add(new ThemeDescription(this.subtitleTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.descriptionText, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText6));
        arrayList.add(new ThemeDescription(this.buttonTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_featuredStickers_buttonText));
        arrayList.add(new ThemeDescription(this.buttonTextView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE, null, null, null, themeDescriptionDelegate, Theme.key_featuredStickers_addButton));
        arrayList.add(new ThemeDescription(this.buttonTextView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, Theme.key_featuredStickers_addButtonPressed));
        arrayList.add(new ThemeDescription(this.descriptionLines[0], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.descriptionLines[1], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.descriptionLines[1], ThemeDescription.FLAG_LINKCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteLinkText));
        arrayList.add(new ThemeDescription(this.descriptionLines[2], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.descriptionLines[3], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.descriptionLines[4], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.descriptionLines[5], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_TEXTCOLOR, null, null, new Drawable[]{this.drawable2}, null, Theme.key_changephoneinfo_image2));
        return arrayList;
    }

    @Override
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(Theme.key_windowBackgroundWhite, null, true)) > 0.699999988079071d;
    }

    @Override
    public void onLocationAddressAvailable(String str, String str2, TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue, TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue2, Location location) {
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
        if (getParentActivity() == null) {
            return;
        }
        if (i == 2) {
            if (iArr == null || iArr.length == 0) {
                return;
            }
            if (iArr[0] != 0) {
                showDialog(AlertsCreator.createLocationRequiredDialog(getParentActivity(), false));
                return;
            } else {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ActionIntroActivity.this.lambda$onRequestPermissionsResultFragment$6();
                    }
                });
                return;
            }
        }
        if (i == 34) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                new AlertDialog.Builder(getParentActivity()).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint))).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        ActionIntroActivity.this.lambda$onRequestPermissionsResultFragment$7(dialogInterface, i2);
                    }
                }).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).setTopAnimation(R.raw.permission_request_camera, 72, false, Theme.getColor(Theme.key_dialogTopBackground)).show();
            } else {
                processOpenQrReader();
            }
        }
    }

    @Override
    public void onResume() {
        boolean z;
        super.onResume();
        if (this.currentType == 4) {
            if (Build.VERSION.SDK_INT >= 28) {
                z = ((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isLocationEnabled();
            } else {
                try {
                    if (Settings.Secure.getInt(ApplicationLoader.applicationContext.getContentResolver(), "location_mode", 0) == 0) {
                        z = false;
                    }
                } catch (Throwable th) {
                    FileLog.e(th);
                }
                z = true;
            }
            if (z) {
                presentFragment(new PeopleNearbyActivity(), true);
            }
        }
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

    public void setQrLoginDelegate(ActionIntroQRLoginDelegate actionIntroQRLoginDelegate) {
        this.qrLoginDelegate = actionIntroQRLoginDelegate;
    }
}
