package org.telegram.p009ui;

import android.annotation.TargetApi;
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
import org.telegram.PhoneFormat.C0894PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.UserConfig;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1006ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.CameraScanActivity;
import org.telegram.p009ui.Components.AlertsCreator;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RLottieImageView;
import org.telegram.p009ui.Components.ShareLocationDrawable;
import org.telegram.p009ui.Components.URLSpanNoUnderline;
import org.telegram.p009ui.Components.voip.CellFlickerDrawable;
import org.telegram.tgnet.TLRPC$User;

@TargetApi(C0952R.styleable.MapAttrs_zOrderOnTop)
public class ActionIntroActivity extends BaseFragment implements LocationController.LocationFetchCallback {
    private TextView buttonTextView;
    private int[] colors;
    private String currentGroupCreateAddress;
    private String currentGroupCreateDisplayAddress;
    private Location currentGroupCreateLocation;
    private int currentType;
    private LinearLayout descriptionLayout;
    private TextView descriptionText;
    private TextView descriptionText2;
    private TextView[] desctiptionLines = new TextView[6];
    private Drawable drawable1;
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

    public static boolean lambda$createView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    public ActionIntroActivity(int i) {
        this.currentType = i;
    }

    @Override
    public View createView(Context context) {
        int i;
        C1006ActionBar actionBar = this.actionBar;
        int i2 = 0;
        if (actionBar != null) {
            actionBar.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            this.actionBar.setBackButtonImage(C0952R.C0953drawable.ic_ab_back);
            this.actionBar.setItemsColor(Theme.getColor("windowBackgroundWhiteGrayText2"), false);
            this.actionBar.setItemsBackgroundColor(Theme.getColor("actionBarWhiteSelector"), false);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new C1006ActionBar.ActionBarMenuOnItemClick() {
                @Override
                public void onItemClick(int i3) {
                    if (i3 == -1) {
                        ActionIntroActivity.this.finishFragment();
                    }
                }
            });
        }
        ViewGroup viewGroup = new ViewGroup(context) {
            @Override
            protected void onMeasure(int i3, int i4) {
                int size = View.MeasureSpec.getSize(i3);
                int size2 = View.MeasureSpec.getSize(i4);
                if (((BaseFragment) ActionIntroActivity.this).actionBar != null) {
                    ((BaseFragment) ActionIntroActivity.this).actionBar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i4);
                }
                switch (ActionIntroActivity.this.currentType) {
                    case 0:
                        if (size <= size2) {
                            ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                            ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.m34dp(86.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(42.0f), 1073741824));
                            break;
                        } else {
                            float f = size;
                            ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                            int i5 = (int) (f * 0.6f);
                            ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(42.0f), 1073741824));
                            break;
                        }
                    case 1:
                    case 4:
                    case 6:
                        if (ActionIntroActivity.this.currentType == 6) {
                            ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(140.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(140.0f), 1073741824));
                        } else {
                            ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(100.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(100.0f), 1073741824));
                        }
                        if (size <= size2) {
                            ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            if (ActionIntroActivity.this.currentType != 6) {
                                ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec((int) (size * 0.6f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(42.0f), 1073741824));
                                break;
                            } else {
                                ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.m34dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(50.0f), 1073741824));
                                break;
                            }
                        } else {
                            int i6 = (int) (size * 0.6f);
                            ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(42.0f), 1073741824));
                            break;
                        }
                    case 2:
                        if (size <= size2) {
                            ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.44f), Integer.MIN_VALUE));
                            ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.subtitleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.descriptionText2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(42.0f), 1073741824));
                            break;
                        } else {
                            float f2 = size;
                            int i7 = (int) (0.45f * f2);
                            ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.78f), Integer.MIN_VALUE));
                            ActionIntroActivity.this.subtitleTextView.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i8 = (int) (f2 * 0.6f);
                            ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.descriptionText2.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(42.0f), 1073741824));
                            break;
                        }
                    case 3:
                        ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(150.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(150.0f), 1073741824));
                        if (size <= size2) {
                            ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.subtitleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.m34dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(50.0f), 1073741824));
                            break;
                        } else {
                            float f3 = size;
                            ActionIntroActivity.this.subtitleTextView.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f3), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i9 = (int) (f3 * 0.6f);
                            ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(42.0f), 1073741824));
                            break;
                        }
                    case 5:
                        if (!ActionIntroActivity.this.showingAsBottomSheet) {
                            if (size <= size2) {
                                ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                                ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                ActionIntroActivity.this.descriptionLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(42.0f), 1073741824));
                                break;
                            } else {
                                float f4 = size;
                                ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f4), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                                int i10 = (int) (f4 * 0.6f);
                                ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                ActionIntroActivity.this.descriptionLayout.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(42.0f), 1073741824));
                                break;
                            }
                        } else {
                            ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.32f), 1073741824));
                            ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.descriptionLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(42.0f), 1073741824));
                            size2 = ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + ActionIntroActivity.this.imageView.getMeasuredHeight() + ActionIntroActivity.this.titleTextView.getMeasuredHeight() + AndroidUtilities.m34dp(20.0f) + ActionIntroActivity.this.titleTextView.getMeasuredHeight() + ActionIntroActivity.this.descriptionLayout.getMeasuredHeight();
                            break;
                        }
                }
                setMeasuredDimension(size, size2);
            }

            @Override
            protected void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                float f;
                if (((BaseFragment) ActionIntroActivity.this).actionBar != null) {
                    ((BaseFragment) ActionIntroActivity.this).actionBar.layout(0, 0, i5, ((BaseFragment) ActionIntroActivity.this).actionBar.getMeasuredHeight());
                }
                int i7 = i5 - i3;
                int i8 = i6 - i4;
                switch (ActionIntroActivity.this.currentType) {
                    case 0:
                        if (i5 > i6) {
                            int measuredHeight = (i8 - ActionIntroActivity.this.imageView.getMeasuredHeight()) / 2;
                            ActionIntroActivity.this.imageView.layout(0, measuredHeight, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + measuredHeight);
                            float f2 = i7;
                            float f3 = f2 * 0.4f;
                            int i9 = (int) f3;
                            float f4 = i8;
                            int i10 = (int) (0.22f * f4);
                            ActionIntroActivity.this.titleTextView.layout(i9, i10, ActionIntroActivity.this.titleTextView.getMeasuredWidth() + i9, ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i10);
                            int i11 = (int) (0.39f * f4);
                            ActionIntroActivity.this.descriptionText.layout(i9, i11, ActionIntroActivity.this.descriptionText.getMeasuredWidth() + i9, ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i11);
                            int measuredWidth = (int) (f3 + (((f2 * 0.6f) - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2.0f));
                            int i12 = (int) (f4 * 0.69f);
                            ActionIntroActivity.this.buttonTextView.layout(measuredWidth, i12, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i12);
                            return;
                        }
                        float f5 = i8;
                        int i13 = (int) (0.188f * f5);
                        ActionIntroActivity.this.imageView.layout(0, i13, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + i13);
                        int i14 = (int) (0.651f * f5);
                        ActionIntroActivity.this.titleTextView.layout(0, i14, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i14);
                        int i15 = (int) (0.731f * f5);
                        ActionIntroActivity.this.descriptionText.layout(0, i15, ActionIntroActivity.this.descriptionText.getMeasuredWidth(), ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i15);
                        int measuredWidth2 = (i7 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                        int i16 = (int) (f5 * 0.853f);
                        ActionIntroActivity.this.buttonTextView.layout(measuredWidth2, i16, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth2, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i16);
                        return;
                    case 1:
                    case 4:
                        if (i5 > i6) {
                            int measuredHeight2 = (i8 - ActionIntroActivity.this.imageView.getMeasuredHeight()) / 2;
                            float f6 = i7;
                            int measuredWidth3 = ((int) ((0.5f * f6) - ActionIntroActivity.this.imageView.getMeasuredWidth())) / 2;
                            ActionIntroActivity.this.imageView.layout(measuredWidth3, measuredHeight2, ActionIntroActivity.this.imageView.getMeasuredWidth() + measuredWidth3, ActionIntroActivity.this.imageView.getMeasuredHeight() + measuredHeight2);
                            float f7 = f6 * 0.4f;
                            int i17 = (int) f7;
                            float f8 = i8;
                            int i18 = (int) (0.14f * f8);
                            ActionIntroActivity.this.titleTextView.layout(i17, i18, ActionIntroActivity.this.titleTextView.getMeasuredWidth() + i17, ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i18);
                            int i19 = (int) (0.31f * f8);
                            ActionIntroActivity.this.descriptionText.layout(i17, i19, ActionIntroActivity.this.descriptionText.getMeasuredWidth() + i17, ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i19);
                            int measuredWidth4 = (int) (f7 + (((f6 * 0.6f) - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2.0f));
                            int i20 = (int) (f8 * 0.78f);
                            ActionIntroActivity.this.buttonTextView.layout(measuredWidth4, i20, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth4, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i20);
                            return;
                        }
                        float f9 = i8;
                        int i21 = (int) (0.214f * f9);
                        int measuredWidth5 = (i7 - ActionIntroActivity.this.imageView.getMeasuredWidth()) / 2;
                        ActionIntroActivity.this.imageView.layout(measuredWidth5, i21, ActionIntroActivity.this.imageView.getMeasuredWidth() + measuredWidth5, ActionIntroActivity.this.imageView.getMeasuredHeight() + i21);
                        int i22 = (int) (0.414f * f9);
                        ActionIntroActivity.this.titleTextView.layout(0, i22, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i22);
                        int i23 = (int) (0.493f * f9);
                        ActionIntroActivity.this.descriptionText.layout(0, i23, ActionIntroActivity.this.descriptionText.getMeasuredWidth(), ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i23);
                        int measuredWidth6 = (i7 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                        int i24 = (int) (f9 * 0.71f);
                        ActionIntroActivity.this.buttonTextView.layout(measuredWidth6, i24, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth6, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i24);
                        return;
                    case 2:
                        if (i5 > i6) {
                            float f10 = i8;
                            int measuredHeight3 = ((int) ((0.9f * f10) - ActionIntroActivity.this.imageView.getMeasuredHeight())) / 2;
                            ActionIntroActivity.this.imageView.layout(0, measuredHeight3, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + measuredHeight3);
                            int measuredHeight4 = measuredHeight3 + ActionIntroActivity.this.imageView.getMeasuredHeight() + AndroidUtilities.m34dp(10.0f);
                            ActionIntroActivity.this.subtitleTextView.layout(0, measuredHeight4, ActionIntroActivity.this.subtitleTextView.getMeasuredWidth(), ActionIntroActivity.this.subtitleTextView.getMeasuredHeight() + measuredHeight4);
                            float f11 = i7;
                            float f12 = f11 * 0.4f;
                            int i25 = (int) f12;
                            int i26 = (int) (0.12f * f10);
                            ActionIntroActivity.this.titleTextView.layout(i25, i26, ActionIntroActivity.this.titleTextView.getMeasuredWidth() + i25, ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i26);
                            int i27 = (int) (0.26f * f10);
                            ActionIntroActivity.this.descriptionText.layout(i25, i27, ActionIntroActivity.this.descriptionText.getMeasuredWidth() + i25, ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i27);
                            int measuredWidth7 = (int) (f12 + (((f11 * 0.6f) - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2.0f));
                            int i28 = (int) (f10 * 0.6f);
                            ActionIntroActivity.this.buttonTextView.layout(measuredWidth7, i28, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth7, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i28);
                            int measuredHeight5 = (getMeasuredHeight() - ActionIntroActivity.this.descriptionText2.getMeasuredHeight()) - AndroidUtilities.m34dp(20.0f);
                            ActionIntroActivity.this.descriptionText2.layout(i25, measuredHeight5, ActionIntroActivity.this.descriptionText2.getMeasuredWidth() + i25, ActionIntroActivity.this.descriptionText2.getMeasuredHeight() + measuredHeight5);
                            return;
                        }
                        float f13 = i8;
                        int i29 = (int) (0.197f * f13);
                        ActionIntroActivity.this.imageView.layout(0, i29, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + i29);
                        int i30 = (int) (0.421f * f13);
                        ActionIntroActivity.this.titleTextView.layout(0, i30, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i30);
                        int i31 = (int) (0.477f * f13);
                        ActionIntroActivity.this.subtitleTextView.layout(0, i31, ActionIntroActivity.this.subtitleTextView.getMeasuredWidth(), ActionIntroActivity.this.subtitleTextView.getMeasuredHeight() + i31);
                        int i32 = (int) (0.537f * f13);
                        ActionIntroActivity.this.descriptionText.layout(0, i32, ActionIntroActivity.this.descriptionText.getMeasuredWidth(), ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i32);
                        int measuredWidth8 = (i7 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                        int i33 = (int) (f13 * 0.71f);
                        ActionIntroActivity.this.buttonTextView.layout(measuredWidth8, i33, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth8, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i33);
                        int measuredHeight6 = (getMeasuredHeight() - ActionIntroActivity.this.descriptionText2.getMeasuredHeight()) - AndroidUtilities.m34dp(20.0f);
                        ActionIntroActivity.this.descriptionText2.layout(0, measuredHeight6, ActionIntroActivity.this.descriptionText2.getMeasuredWidth(), ActionIntroActivity.this.descriptionText2.getMeasuredHeight() + measuredHeight6);
                        return;
                    case 3:
                        if (i5 > i6) {
                            float f14 = i8;
                            int measuredHeight7 = ((int) ((0.95f * f14) - ActionIntroActivity.this.imageView.getMeasuredHeight())) / 2;
                            int width = (int) ((getWidth() * 0.35f) - ActionIntroActivity.this.imageView.getMeasuredWidth());
                            ActionIntroActivity.this.imageView.layout(width, measuredHeight7, ActionIntroActivity.this.imageView.getMeasuredWidth() + width, ActionIntroActivity.this.imageView.getMeasuredHeight() + measuredHeight7);
                            float f15 = i7;
                            float f16 = f15 * 0.4f;
                            int i34 = (int) f16;
                            int i35 = (int) (0.12f * f14);
                            ActionIntroActivity.this.titleTextView.layout(i34, i35, ActionIntroActivity.this.titleTextView.getMeasuredWidth() + i34, ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i35);
                            int i36 = (int) (0.24f * f14);
                            ActionIntroActivity.this.descriptionText.layout(i34, i36, ActionIntroActivity.this.descriptionText.getMeasuredWidth() + i34, ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i36);
                            float f17 = f15 * 0.6f;
                            int measuredWidth9 = (int) (((f17 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2.0f) + f16);
                            int i37 = (int) (f14 * 0.8f);
                            ActionIntroActivity.this.buttonTextView.layout(measuredWidth9, i37, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth9, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i37);
                            int measuredWidth10 = (int) (f16 + ((f17 - ActionIntroActivity.this.subtitleTextView.getMeasuredWidth()) / 2.0f));
                            int measuredHeight8 = i37 - (ActionIntroActivity.this.subtitleTextView.getMeasuredHeight() + AndroidUtilities.m34dp(16.0f));
                            ActionIntroActivity.this.subtitleTextView.layout(measuredWidth10, measuredHeight8, ActionIntroActivity.this.subtitleTextView.getMeasuredWidth() + measuredWidth10, ActionIntroActivity.this.subtitleTextView.getMeasuredHeight() + measuredHeight8);
                            return;
                        }
                        int i38 = (int) (i8 * 0.3f);
                        int measuredWidth11 = (i7 - ActionIntroActivity.this.imageView.getMeasuredWidth()) / 2;
                        ActionIntroActivity.this.imageView.layout(measuredWidth11, i38, ActionIntroActivity.this.imageView.getMeasuredWidth() + measuredWidth11, ActionIntroActivity.this.imageView.getMeasuredHeight() + i38);
                        int measuredHeight9 = i38 + ActionIntroActivity.this.imageView.getMeasuredHeight() + AndroidUtilities.m34dp(24.0f);
                        ActionIntroActivity.this.titleTextView.layout(0, measuredHeight9, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + measuredHeight9);
                        int textSize = (int) (measuredHeight9 + ActionIntroActivity.this.titleTextView.getTextSize() + AndroidUtilities.m34dp(16.0f));
                        ActionIntroActivity.this.descriptionText.layout(0, textSize, ActionIntroActivity.this.descriptionText.getMeasuredWidth(), ActionIntroActivity.this.descriptionText.getMeasuredHeight() + textSize);
                        int measuredWidth12 = (i7 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                        int measuredHeight10 = (i8 - ActionIntroActivity.this.buttonTextView.getMeasuredHeight()) - AndroidUtilities.m34dp(48.0f);
                        ActionIntroActivity.this.buttonTextView.layout(measuredWidth12, measuredHeight10, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth12, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + measuredHeight10);
                        int measuredWidth13 = (i7 - ActionIntroActivity.this.subtitleTextView.getMeasuredWidth()) / 2;
                        int measuredHeight11 = measuredHeight10 - (ActionIntroActivity.this.subtitleTextView.getMeasuredHeight() + AndroidUtilities.m34dp(32.0f));
                        ActionIntroActivity.this.subtitleTextView.layout(measuredWidth13, measuredHeight11, ActionIntroActivity.this.subtitleTextView.getMeasuredWidth() + measuredWidth13, ActionIntroActivity.this.subtitleTextView.getMeasuredHeight() + measuredHeight11);
                        return;
                    case 5:
                        if (ActionIntroActivity.this.showingAsBottomSheet) {
                            ActionIntroActivity.this.imageView.layout(0, 0, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + 0);
                            float f18 = i8;
                            int i39 = (int) (0.403f * f18);
                            ActionIntroActivity.this.titleTextView.layout(0, i39, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i39);
                            int i40 = (int) (0.631f * f18);
                            int measuredWidth14 = (getMeasuredWidth() - ActionIntroActivity.this.descriptionLayout.getMeasuredWidth()) / 2;
                            ActionIntroActivity.this.descriptionLayout.layout(measuredWidth14, i40, ActionIntroActivity.this.descriptionLayout.getMeasuredWidth() + measuredWidth14, ActionIntroActivity.this.descriptionLayout.getMeasuredHeight() + i40);
                            int measuredWidth15 = (i7 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                            int i41 = (int) (f18 * 0.853f);
                            ActionIntroActivity.this.buttonTextView.layout(measuredWidth15, i41, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth15, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i41);
                            return;
                        } else if (i5 > i6) {
                            int measuredHeight12 = (i8 - ActionIntroActivity.this.imageView.getMeasuredHeight()) / 2;
                            ActionIntroActivity.this.imageView.layout(0, measuredHeight12, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + measuredHeight12);
                            float f19 = i7;
                            float f20 = f19 * 0.4f;
                            int i42 = (int) f20;
                            float f21 = i8;
                            int i43 = (int) (0.08f * f21);
                            ActionIntroActivity.this.titleTextView.layout(i42, i43, ActionIntroActivity.this.titleTextView.getMeasuredWidth() + i42, ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i43);
                            float f22 = f19 * 0.6f;
                            int measuredWidth16 = (int) (((f22 - ActionIntroActivity.this.descriptionLayout.getMeasuredWidth()) / 2.0f) + f20);
                            int i44 = (int) (0.25f * f21);
                            ActionIntroActivity.this.descriptionLayout.layout(measuredWidth16, i44, ActionIntroActivity.this.descriptionLayout.getMeasuredWidth() + measuredWidth16, ActionIntroActivity.this.descriptionLayout.getMeasuredHeight() + i44);
                            int measuredWidth17 = (int) (f20 + ((f22 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2.0f));
                            int i45 = (int) (f21 * 0.78f);
                            ActionIntroActivity.this.buttonTextView.layout(measuredWidth17, i45, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth17, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i45);
                            return;
                        } else {
                            if (AndroidUtilities.displaySize.y < 1800) {
                                float f23 = i8;
                                int i46 = (int) (0.06f * f23);
                                ActionIntroActivity.this.imageView.layout(0, i46, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + i46);
                                int i47 = (int) (0.463f * f23);
                                ActionIntroActivity.this.titleTextView.layout(0, i47, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i47);
                                f = f23 * 0.543f;
                            } else {
                                float f24 = i8;
                                int i48 = (int) (0.148f * f24);
                                ActionIntroActivity.this.imageView.layout(0, i48, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + i48);
                                int i49 = (int) (0.551f * f24);
                                ActionIntroActivity.this.titleTextView.layout(0, i49, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i49);
                                f = f24 * 0.631f;
                            }
                            int i50 = (int) f;
                            int measuredWidth18 = (getMeasuredWidth() - ActionIntroActivity.this.descriptionLayout.getMeasuredWidth()) / 2;
                            ActionIntroActivity.this.descriptionLayout.layout(measuredWidth18, i50, ActionIntroActivity.this.descriptionLayout.getMeasuredWidth() + measuredWidth18, ActionIntroActivity.this.descriptionLayout.getMeasuredHeight() + i50);
                            int measuredWidth19 = (i7 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                            int i51 = (int) (i8 * 0.853f);
                            ActionIntroActivity.this.buttonTextView.layout(measuredWidth19, i51, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth19, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i51);
                            return;
                        }
                    case 6:
                        if (i5 > i6) {
                            int measuredHeight13 = (i8 - ActionIntroActivity.this.imageView.getMeasuredHeight()) / 2;
                            float f25 = i7;
                            int measuredWidth20 = ((int) ((0.5f * f25) - ActionIntroActivity.this.imageView.getMeasuredWidth())) / 2;
                            ActionIntroActivity.this.imageView.layout(measuredWidth20, measuredHeight13, ActionIntroActivity.this.imageView.getMeasuredWidth() + measuredWidth20, ActionIntroActivity.this.imageView.getMeasuredHeight() + measuredHeight13);
                            float f26 = f25 * 0.4f;
                            int i52 = (int) f26;
                            float f27 = i8;
                            int i53 = (int) (0.14f * f27);
                            ActionIntroActivity.this.titleTextView.layout(i52, i53, ActionIntroActivity.this.titleTextView.getMeasuredWidth() + i52, ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i53);
                            int i54 = (int) (0.31f * f27);
                            ActionIntroActivity.this.descriptionText.layout(i52, i54, ActionIntroActivity.this.descriptionText.getMeasuredWidth() + i52, ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i54);
                            int measuredWidth21 = (int) (f26 + (((f25 * 0.6f) - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2.0f));
                            int i55 = (int) (f27 * 0.78f);
                            ActionIntroActivity.this.buttonTextView.layout(measuredWidth21, i55, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth21, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i55);
                            return;
                        }
                        int i56 = (int) (i8 * 0.3f);
                        int measuredWidth22 = (i7 - ActionIntroActivity.this.imageView.getMeasuredWidth()) / 2;
                        ActionIntroActivity.this.imageView.layout(measuredWidth22, i56, ActionIntroActivity.this.imageView.getMeasuredWidth() + measuredWidth22, ActionIntroActivity.this.imageView.getMeasuredHeight() + i56);
                        int measuredHeight14 = i56 + ActionIntroActivity.this.imageView.getMeasuredHeight() + AndroidUtilities.m34dp(24.0f);
                        ActionIntroActivity.this.titleTextView.layout(0, measuredHeight14, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + measuredHeight14);
                        int textSize2 = (int) (measuredHeight14 + ActionIntroActivity.this.titleTextView.getTextSize() + AndroidUtilities.m34dp(16.0f));
                        ActionIntroActivity.this.descriptionText.layout(0, textSize2, ActionIntroActivity.this.descriptionText.getMeasuredWidth(), ActionIntroActivity.this.descriptionText.getMeasuredHeight() + textSize2);
                        int measuredWidth23 = (i7 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                        int measuredHeight15 = (i8 - ActionIntroActivity.this.buttonTextView.getMeasuredHeight()) - AndroidUtilities.m34dp(48.0f);
                        ActionIntroActivity.this.buttonTextView.layout(measuredWidth23, measuredHeight15, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth23, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + measuredHeight15);
                        return;
                    default:
                        return;
                }
            }
        };
        this.fragmentView = viewGroup;
        viewGroup.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        ViewGroup viewGroup2 = (ViewGroup) this.fragmentView;
        viewGroup2.setOnTouchListener(ActionIntroActivity$$ExternalSyntheticLambda6.INSTANCE);
        C1006ActionBar actionBar2 = this.actionBar;
        if (actionBar2 != null) {
            viewGroup2.addView(actionBar2);
        }
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        viewGroup2.addView(rLottieImageView);
        TextView textView = new TextView(context);
        this.titleTextView = textView;
        textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        int i3 = 1;
        this.titleTextView.setGravity(1);
        this.titleTextView.setPadding(AndroidUtilities.m34dp(32.0f), 0, AndroidUtilities.m34dp(32.0f), 0);
        this.titleTextView.setTextSize(1, 24.0f);
        viewGroup2.addView(this.titleTextView);
        TextView textView2 = new TextView(context);
        this.subtitleTextView = textView2;
        int i4 = 3;
        textView2.setTextColor(Theme.getColor(this.currentType == 3 ? "featuredStickers_addButton" : "windowBackgroundWhiteBlackText"));
        this.subtitleTextView.setGravity(1);
        float f = 15.0f;
        this.subtitleTextView.setTextSize(1, 15.0f);
        this.subtitleTextView.setSingleLine(true);
        this.subtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
        int i5 = 2;
        if (this.currentType == 2) {
            this.subtitleTextView.setPadding(AndroidUtilities.m34dp(24.0f), 0, AndroidUtilities.m34dp(24.0f), 0);
        } else {
            this.subtitleTextView.setPadding(AndroidUtilities.m34dp(32.0f), 0, AndroidUtilities.m34dp(32.0f), 0);
        }
        this.subtitleTextView.setVisibility(8);
        viewGroup2.addView(this.subtitleTextView);
        TextView textView3 = new TextView(context);
        this.descriptionText = textView3;
        textView3.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText6"));
        this.descriptionText.setGravity(1);
        this.descriptionText.setLineSpacing(AndroidUtilities.m34dp(2.0f), 1.0f);
        this.descriptionText.setTextSize(1, 15.0f);
        int i6 = this.currentType;
        if (i6 == 6 || i6 == 3) {
            this.descriptionText.setPadding(AndroidUtilities.m34dp(48.0f), 0, AndroidUtilities.m34dp(48.0f), 0);
        } else if (i6 == 2) {
            this.descriptionText.setPadding(AndroidUtilities.m34dp(24.0f), 0, AndroidUtilities.m34dp(24.0f), 0);
        } else {
            this.descriptionText.setPadding(AndroidUtilities.m34dp(32.0f), 0, AndroidUtilities.m34dp(32.0f), 0);
        }
        viewGroup2.addView(this.descriptionText);
        String str = "";
        if (this.currentType == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.descriptionLayout = linearLayout;
            linearLayout.setOrientation(1);
            this.descriptionLayout.setPadding(AndroidUtilities.m34dp(24.0f), 0, AndroidUtilities.m34dp(24.0f), 0);
            this.descriptionLayout.setGravity(LocaleController.isRTL ? 5 : 3);
            viewGroup2.addView(this.descriptionLayout);
            int i7 = 0;
            while (i7 < i4) {
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(i2);
                this.descriptionLayout.addView(linearLayout2, LayoutHelper.createLinear(-2, -2, 0.0f, 0.0f, 0.0f, i7 != i5 ? 7.0f : 0.0f));
                int i8 = i7 * 2;
                this.desctiptionLines[i8] = new TextView(context);
                this.desctiptionLines[i8].setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
                this.desctiptionLines[i8].setGravity(LocaleController.isRTL ? 5 : 3);
                this.desctiptionLines[i8].setTextSize(i3, f);
                TextView textView4 = this.desctiptionLines[i8];
                String str2 = LocaleController.isRTL ? ".%d" : "%d.";
                Object[] objArr = new Object[i3];
                int i9 = i7 + 1;
                objArr[i2] = Integer.valueOf(i9);
                textView4.setText(String.format(str2, objArr));
                this.desctiptionLines[i8].setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                int i10 = i8 + 1;
                this.desctiptionLines[i10] = new TextView(context);
                this.desctiptionLines[i10].setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
                this.desctiptionLines[i10].setGravity(LocaleController.isRTL ? 5 : 3);
                this.desctiptionLines[i10].setTextSize(i3, f);
                if (i7 == 0) {
                    this.desctiptionLines[i10].setLinkTextColor(Theme.getColor("windowBackgroundWhiteLinkText"));
                    this.desctiptionLines[i10].setHighlightColor(Theme.getColor("windowBackgroundWhiteLinkSelection"));
                    String string = LocaleController.getString("AuthAnotherClientInfo1", C0952R.string.AuthAnotherClientInfo1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int indexOf = string.indexOf(42);
                    int lastIndexOf = string.lastIndexOf(42);
                    if (!(indexOf == -1 || lastIndexOf == -1 || indexOf == lastIndexOf)) {
                        this.desctiptionLines[i10].setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) str);
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) str);
                        spannableStringBuilder.setSpan(new URLSpanNoUnderline(LocaleController.getString("AuthAnotherClientDownloadClientUrl", C0952R.string.AuthAnotherClientDownloadClientUrl)), indexOf, lastIndexOf - 1, 33);
                    }
                    this.desctiptionLines[i10].setText(spannableStringBuilder);
                } else if (i7 == 1) {
                    this.desctiptionLines[i10].setText(LocaleController.getString("AuthAnotherClientInfo2", C0952R.string.AuthAnotherClientInfo2));
                } else {
                    this.desctiptionLines[i10].setText(LocaleController.getString("AuthAnotherClientInfo3", C0952R.string.AuthAnotherClientInfo3));
                }
                if (LocaleController.isRTL) {
                    linearLayout2.setGravity(5);
                    linearLayout2.addView(this.desctiptionLines[i10], LayoutHelper.createLinear(0, -2, 1.0f));
                    linearLayout2.addView(this.desctiptionLines[i8], LayoutHelper.createLinear(-2, -2, 4.0f, 0.0f, 0.0f, 0.0f));
                } else {
                    linearLayout2.addView(this.desctiptionLines[i8], LayoutHelper.createLinear(-2, -2, 0.0f, 0.0f, 4.0f, 0.0f));
                    linearLayout2.addView(this.desctiptionLines[i10], LayoutHelper.createLinear(-2, -2));
                }
                i7 = i9;
                i2 = 0;
                i3 = 1;
                f = 15.0f;
                i4 = 3;
                i5 = 2;
            }
            this.descriptionText.setVisibility(8);
        }
        TextView textView5 = new TextView(context);
        this.descriptionText2 = textView5;
        textView5.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText6"));
        this.descriptionText2.setGravity(1);
        this.descriptionText2.setLineSpacing(AndroidUtilities.m34dp(2.0f), 1.0f);
        this.descriptionText2.setTextSize(1, 13.0f);
        this.descriptionText2.setVisibility(8);
        if (this.currentType == 2) {
            i = 0;
            this.descriptionText2.setPadding(AndroidUtilities.m34dp(18.0f), 0, AndroidUtilities.m34dp(18.0f), 0);
        } else {
            i = 0;
            this.descriptionText2.setPadding(AndroidUtilities.m34dp(32.0f), 0, AndroidUtilities.m34dp(32.0f), 0);
        }
        viewGroup2.addView(this.descriptionText2);
        TextView textView6 = new TextView(context) {
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
                    this.cellFlickerDrawable.draw(canvas, rectF, AndroidUtilities.m34dp(4.0f));
                    invalidate();
                }
            }
        };
        this.buttonTextView = textView6;
        textView6.setPadding(AndroidUtilities.m34dp(34.0f), i, AndroidUtilities.m34dp(34.0f), i);
        this.buttonTextView.setGravity(17);
        this.buttonTextView.setTextColor(Theme.getColor("featuredStickers_buttonText"));
        this.buttonTextView.setTextSize(1, 14.0f);
        this.buttonTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        int i11 = this.currentType;
        this.buttonTextView.setBackground(Theme.AdaptiveRipple.filledRect("featuredStickers_addButton", (i11 == 6 || i11 == 3) ? 6 : 4));
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
                this.imageView.setAnimation(C0952R.raw.channel_create, 200, 200);
                this.titleTextView.setText(LocaleController.getString("ChannelAlertTitle", C0952R.string.ChannelAlertTitle));
                this.descriptionText.setText(LocaleController.getString("ChannelAlertText", C0952R.string.ChannelAlertText));
                this.buttonTextView.setText(LocaleController.getString("ChannelAlertCreate2", C0952R.string.ChannelAlertCreate2));
                this.imageView.playAnimation();
                this.flickerButton = true;
                break;
            case 1:
                this.imageView.setBackgroundDrawable(Theme.createCircleDrawable(AndroidUtilities.m34dp(100.0f), Theme.getColor("chats_archiveBackground")));
                this.imageView.setImageDrawable(new ShareLocationDrawable(context, 3));
                this.imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.titleTextView.setText(LocaleController.getString("PeopleNearby", C0952R.string.PeopleNearby));
                this.descriptionText.setText(LocaleController.getString("PeopleNearbyAccessInfo", C0952R.string.PeopleNearbyAccessInfo));
                this.buttonTextView.setText(LocaleController.getString("PeopleNearbyAllowAccess", C0952R.string.PeopleNearbyAllowAccess));
                break;
            case 2:
                this.subtitleTextView.setVisibility(0);
                this.descriptionText2.setVisibility(0);
                this.imageView.setImageResource(Theme.getCurrentTheme().isDark() ? C0952R.C0953drawable.groupsintro2 : C0952R.C0953drawable.groupsintro);
                this.imageView.setScaleType(ImageView.ScaleType.CENTER);
                TextView textView7 = this.subtitleTextView;
                String str3 = this.currentGroupCreateDisplayAddress;
                if (str3 != null) {
                    str = str3;
                }
                textView7.setText(str);
                this.titleTextView.setText(LocaleController.getString("NearbyCreateGroup", C0952R.string.NearbyCreateGroup));
                this.descriptionText.setText(LocaleController.getString("NearbyCreateGroupInfo", C0952R.string.NearbyCreateGroupInfo));
                this.descriptionText2.setText(LocaleController.getString("NearbyCreateGroupInfo2", C0952R.string.NearbyCreateGroupInfo2));
                this.buttonTextView.setText(LocaleController.getString("NearbyStartGroup", C0952R.string.NearbyStartGroup));
                break;
            case 3:
                this.subtitleTextView.setVisibility(0);
                this.imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.imageView.setAnimation(C0952R.raw.utyan_change_number, 200, 200);
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
                    TextView textView8 = this.subtitleTextView;
                    C0894PhoneFormat phoneFormat = C0894PhoneFormat.getInstance();
                    textView8.setText(LocaleController.formatString("PhoneNumberKeepButton", C0952R.string.PhoneNumberKeepButton, phoneFormat.format("+" + user.phone)));
                }
                this.subtitleTextView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ActionIntroActivity.this.lambda$createView$5(view);
                    }
                });
                this.titleTextView.setText(LocaleController.getString("PhoneNumberChange2", C0952R.string.PhoneNumberChange2));
                this.descriptionText.setText(AndroidUtilities.replaceTags(LocaleController.getString("PhoneNumberHelp", C0952R.string.PhoneNumberHelp)));
                this.buttonTextView.setText(LocaleController.getString("PhoneNumberChange2", C0952R.string.PhoneNumberChange2));
                this.imageView.playAnimation();
                this.flickerButton = true;
                break;
            case 4:
                this.imageView.setBackgroundDrawable(Theme.createCircleDrawable(AndroidUtilities.m34dp(100.0f), Theme.getColor("chats_archiveBackground")));
                this.imageView.setImageDrawable(new ShareLocationDrawable(context, 3));
                this.imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.titleTextView.setText(LocaleController.getString("PeopleNearby", C0952R.string.PeopleNearby));
                this.descriptionText.setText(LocaleController.getString("PeopleNearbyGpsInfo", C0952R.string.PeopleNearbyGpsInfo));
                this.buttonTextView.setText(LocaleController.getString("PeopleNearbyGps", C0952R.string.PeopleNearbyGps));
                break;
            case 5:
                this.colors = new int[8];
                updateColors();
                this.imageView.setAnimation(C0952R.raw.qr_login, 334, 334, this.colors);
                this.imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.titleTextView.setText(LocaleController.getString("AuthAnotherClient", C0952R.string.AuthAnotherClient));
                this.buttonTextView.setText(LocaleController.getString("AuthAnotherClientScan", C0952R.string.AuthAnotherClientScan));
                this.imageView.playAnimation();
                break;
            case 6:
                this.imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.imageView.setAnimation(C0952R.raw.utyan_passcode, 200, 200);
                this.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ActionIntroActivity.this.lambda$createView$3(view);
                    }
                });
                this.titleTextView.setText(LocaleController.getString("Passcode", C0952R.string.Passcode));
                this.descriptionText.setText(LocaleController.getString("ChangePasscodeInfoShort", C0952R.string.ChangePasscodeInfoShort));
                this.buttonTextView.setText(LocaleController.getString("EnablePasscode", C0952R.string.EnablePasscode));
                this.imageView.playAnimation();
                this.flickerButton = true;
                break;
        }
        if (this.flickerButton) {
            this.buttonTextView.setPadding(AndroidUtilities.m34dp(34.0f), AndroidUtilities.m34dp(8.0f), AndroidUtilities.m34dp(34.0f), AndroidUtilities.m34dp(8.0f));
            this.buttonTextView.setTextSize(1, 15.0f);
        }
        return this.fragmentView;
    }

    public void lambda$createView$2(View view) {
        if (getParentActivity() != null) {
            switch (this.currentType) {
                case 0:
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 0);
                    presentFragment(new ChannelCreateActivity(bundle), true);
                    return;
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
                        presentFragment(new GroupCreateFinalActivity(bundle2), true);
                        return;
                    }
                    return;
                case 3:
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                    builder.setTitle(LocaleController.getString("PhoneNumberChangeTitle", C0952R.string.PhoneNumberChangeTitle));
                    builder.setMessage(LocaleController.getString("PhoneNumberAlert", C0952R.string.PhoneNumberAlert));
                    builder.setPositiveButton(LocaleController.getString("Change", C0952R.string.Change), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            ActionIntroActivity.this.lambda$createView$1(dialogInterface, i);
                        }
                    });
                    builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
                    showDialog(builder.create());
                    return;
                case 4:
                    try {
                        getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        return;
                    } catch (Exception e) {
                        FileLog.m30e(e);
                        return;
                    }
                case 5:
                    if (getParentActivity() != null) {
                        if (Build.VERSION.SDK_INT < 23 || getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                            processOpenQrReader();
                            return;
                        } else {
                            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                            return;
                        }
                    } else {
                        return;
                    }
                case 6:
                    presentFragment(new PasscodeActivity(1), true);
                    return;
                default:
                    return;
            }
        }
    }

    public void lambda$createView$1(DialogInterface dialogInterface, int i) {
        presentFragment(new ChangePhoneActivity(), true);
    }

    public void lambda$createView$3(View view) {
        if (!this.imageView.getAnimatedDrawable().isRunning()) {
            this.imageView.getAnimatedDrawable().setCurrentFrame(0, false);
            this.imageView.playAnimation();
        }
    }

    public void lambda$createView$4(View view) {
        if (!this.imageView.getAnimatedDrawable().isRunning()) {
            this.imageView.getAnimatedDrawable().setCurrentFrame(0, false);
            this.imageView.playAnimation();
        }
    }

    public void lambda$createView$5(View view) {
        getParentLayout().closeLastFragment(true);
    }

    @Override
    public void onLocationAddressAvailable(String str, String str2, Location location) {
        TextView textView = this.subtitleTextView;
        if (textView != null) {
            textView.setText(str);
            this.currentGroupCreateAddress = str;
            this.currentGroupCreateDisplayAddress = str2;
            this.currentGroupCreateLocation = location;
        }
    }

    @Override
    public void onResume() {
        boolean z;
        super.onResume();
        if (this.currentType == 4) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                z = ((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isLocationEnabled();
            } else {
                if (i >= 19) {
                    try {
                        if (Settings.Secure.getInt(ApplicationLoader.applicationContext.getContentResolver(), "location_mode", 0) == 0) {
                            z = false;
                        }
                    } catch (Throwable th) {
                        FileLog.m30e(th);
                    }
                }
                z = true;
            }
            if (z) {
                presentFragment(new PeopleNearbyActivity(), true);
            }
        }
    }

    public void updateColors() {
        int[] iArr = this.colors;
        if (iArr != null && this.imageView != null) {
            iArr[0] = 3355443;
            iArr[1] = Theme.getColor("windowBackgroundWhiteBlackText");
            int[] iArr2 = this.colors;
            iArr2[2] = 16777215;
            iArr2[3] = Theme.getColor("windowBackgroundWhite");
            int[] iArr3 = this.colors;
            iArr3[4] = 5285866;
            iArr3[5] = Theme.getColor("featuredStickers_addButton");
            int[] iArr4 = this.colors;
            iArr4[6] = 2170912;
            iArr4[7] = Theme.getColor("windowBackgroundWhite");
            this.imageView.replaceColors(this.colors);
        }
    }

    public void setGroupCreateAddress(String str, String str2, Location location) {
        this.currentGroupCreateAddress = str;
        this.currentGroupCreateDisplayAddress = str2;
        this.currentGroupCreateLocation = location;
        if (location != null && str == null) {
            LocationController.fetchLocationAddress(location, this);
        }
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (getParentActivity() != null) {
            if (i == 2) {
                if (iArr != null && iArr.length != 0) {
                    if (iArr[0] != 0) {
                        showDialog(AlertsCreator.createLocationRequiredDialog(getParentActivity(), false));
                    } else {
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                ActionIntroActivity.this.lambda$onRequestPermissionsResultFragment$6();
                            }
                        });
                    }
                }
            } else if (i != 34) {
            } else {
                if (iArr.length <= 0 || iArr[0] != 0) {
                    new AlertDialog.Builder(getParentActivity()).setMessage(AndroidUtilities.replaceTags(LocaleController.getString("QRCodePermissionNoCameraWithHint", C0952R.string.QRCodePermissionNoCameraWithHint))).setPositiveButton(LocaleController.getString("PermissionOpenSettings", C0952R.string.PermissionOpenSettings), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            ActionIntroActivity.this.lambda$onRequestPermissionsResultFragment$7(dialogInterface, i2);
                        }
                    }).setNegativeButton(LocaleController.getString("ContactsPermissionAlertNotNow", C0952R.string.ContactsPermissionAlertNotNow), null).setTopAnimation(C0952R.raw.permission_request_camera, 72, false, Theme.getColor("dialogTopBackground")).show();
                } else {
                    processOpenQrReader();
                }
            }
        }
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
            FileLog.m30e(e);
        }
    }

    public void setQrLoginDelegate(ActionIntroQRLoginDelegate actionIntroQRLoginDelegate) {
        this.qrLoginDelegate = actionIntroQRLoginDelegate;
    }

    private void processOpenQrReader() {
        CameraScanActivity.showAsSheet(this, false, 1, new CameraScanActivity.CameraScanActivityDelegate() {
            @Override
            public void didFindMrzInfo(MrzRecognizer.Result result) {
                CameraScanActivity.CameraScanActivityDelegate.CC.$default$didFindMrzInfo(this, result);
            }

            @Override
            public boolean processQr(String str, Runnable runnable) {
                return CameraScanActivity.CameraScanActivityDelegate.CC.$default$processQr(this, str, runnable);
            }

            @Override
            public void didFindQr(String str) {
                ActionIntroActivity.this.finishFragment(false);
                ActionIntroActivity.this.qrLoginDelegate.didFindQRCode(str);
            }
        });
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ThemeDescription.ThemeDescriptionDelegate actionIntroActivity$$ExternalSyntheticLambda8 = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ActionIntroActivity.this.updateColors();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, actionIntroActivity$$ExternalSyntheticLambda8, "windowBackgroundWhite"));
        if (this.actionBar != null) {
            arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
            arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "windowBackgroundWhiteGrayText2"));
            arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarWhiteSelector"));
        }
        arrayList.add(new ThemeDescription(this.titleTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, actionIntroActivity$$ExternalSyntheticLambda8, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.subtitleTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.descriptionText, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteGrayText6"));
        arrayList.add(new ThemeDescription(this.buttonTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "featuredStickers_buttonText"));
        arrayList.add(new ThemeDescription(this.buttonTextView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE, null, null, null, actionIntroActivity$$ExternalSyntheticLambda8, "featuredStickers_addButton"));
        arrayList.add(new ThemeDescription(this.buttonTextView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "featuredStickers_addButtonPressed"));
        arrayList.add(new ThemeDescription(this.desctiptionLines[0], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.desctiptionLines[1], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.desctiptionLines[1], ThemeDescription.FLAG_LINKCOLOR, null, null, null, null, "windowBackgroundWhiteLinkText"));
        arrayList.add(new ThemeDescription(this.desctiptionLines[2], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.desctiptionLines[3], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.desctiptionLines[4], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.desctiptionLines[5], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_TEXTCOLOR, null, null, new Drawable[]{this.drawable1}, null, "changephoneinfo_image"));
        arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_TEXTCOLOR, null, null, new Drawable[]{this.drawable2}, null, "changephoneinfo_image2"));
        return arrayList;
    }

    @Override
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor("windowBackgroundWhite", null, true)) > 0.699999988079071d;
    }
}
