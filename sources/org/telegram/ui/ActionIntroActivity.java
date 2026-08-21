package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.voip.CellFlickerDrawable;

public class ActionIntroActivity extends BaseFragment implements LocationController.LocationFetchCallback {
    private TextView buttonTextView;
    private int[] colors;
    private String currentGroupCreateAddress;
    private String currentGroupCreateDisplayAddress;
    private Location currentGroupCreateLocation;
    private final int currentType;
    private LinearLayout descriptionLayout;
    private final TextView[] descriptionLines = new TextView[6];
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

    public static boolean $r8$lambda$SamJWdYl9lPGaCorXTiRCQP35lI(View view, MotionEvent motionEvent) {
        return true;
    }

    public void setOnOpenedSettings(Runnable runnable) {
        this.openedSettings = runnable;
    }

    public ActionIntroActivity(int i) {
        this.currentType = i;
    }

    @Override
    public View createView(Context context) {
        float f;
        float f2;
        float f3;
        int i = 2;
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setItemsColor(Theme.getColor(Theme.key_actionBarDefaultIcon), false);
            this.actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSelector), false);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
                @Override
                public void onItemClick(int i2) {
                    if (i2 == -1) {
                        ActionIntroActivity.this.finishFragment();
                    }
                }
            });
        }
        ViewGroup viewGroup = new ViewGroup(context) {
            @Override
            protected void onMeasure(int i2, int i3) {
                int size = View.MeasureSpec.getSize(i2);
                int size2 = View.MeasureSpec.getSize(i3);
                if (((BaseFragment) ActionIntroActivity.this).actionBar != null) {
                    ((BaseFragment) ActionIntroActivity.this).actionBar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i3);
                }
                int i4 = ActionIntroActivity.this.currentType;
                if (i4 != 0) {
                    if (i4 == 3) {
                        ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), 1073741824));
                        if (size > size2) {
                            float f4 = size;
                            ActionIntroActivity.this.subtitleTextView.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f4), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            int i5 = (int) (f4 * 0.6f);
                            ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        } else {
                            ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.subtitleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        }
                    } else if (i4 != 5) {
                        if (i4 == 6) {
                            if (ActionIntroActivity.this.currentType == 6) {
                                ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824));
                            } else {
                                ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                            }
                            if (size > size2) {
                                int i6 = (int) (size * 0.6f);
                                ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                ActionIntroActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                            } else {
                                ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                ActionIntroActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                if (ActionIntroActivity.this.currentType == 6) {
                                    ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                } else {
                                    ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(72.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                }
                            }
                        }
                    } else if (ActionIntroActivity.this.showingAsBottomSheet) {
                        ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.32f), 1073741824));
                        ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        ActionIntroActivity.this.descriptionLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        size2 = ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + ActionIntroActivity.this.imageView.getMeasuredHeight() + ActionIntroActivity.this.titleTextView.getMeasuredHeight() + AndroidUtilities.dp(20.0f) + ActionIntroActivity.this.titleTextView.getMeasuredHeight() + ActionIntroActivity.this.descriptionLayout.getMeasuredHeight();
                    } else if (size > size2) {
                        float f5 = size;
                        ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f5), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                        int i7 = (int) (f5 * 0.6f);
                        ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        ActionIntroActivity.this.descriptionLayout.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    } else {
                        ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                        ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        ActionIntroActivity.this.descriptionLayout.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    }
                } else if (size > size2) {
                    float f6 = size;
                    ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f6), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                    int i8 = (int) (f6 * 0.6f);
                    ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    ActionIntroActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else {
                    ActionIntroActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.399f), 1073741824));
                    ActionIntroActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    ActionIntroActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    ActionIntroActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(72.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                }
                setMeasuredDimension(size, size2);
            }

            @Override
            protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                float f4;
                if (((BaseFragment) ActionIntroActivity.this).actionBar != null) {
                    ((BaseFragment) ActionIntroActivity.this).actionBar.layout(0, 0, i4, ((BaseFragment) ActionIntroActivity.this).actionBar.getMeasuredHeight());
                }
                int i6 = i4 - i2;
                int i7 = i5 - i3;
                int i8 = ActionIntroActivity.this.currentType;
                if (i8 == 0) {
                    if (i4 > i5) {
                        int measuredHeight = (i7 - ActionIntroActivity.this.imageView.getMeasuredHeight()) / 2;
                        ActionIntroActivity.this.imageView.layout(0, measuredHeight, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + measuredHeight);
                        float f5 = i6;
                        float f6 = 0.4f * f5;
                        int i9 = (int) f6;
                        float f7 = i7;
                        int i10 = (int) (0.22f * f7);
                        ActionIntroActivity.this.titleTextView.layout(i9, i10, ActionIntroActivity.this.titleTextView.getMeasuredWidth() + i9, ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i10);
                        int i11 = (int) (0.39f * f7);
                        ActionIntroActivity.this.descriptionText.layout(i9, i11, ActionIntroActivity.this.descriptionText.getMeasuredWidth() + i9, ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i11);
                        int measuredWidth = (int) (f6 + (((f5 * 0.6f) - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2.0f));
                        int i12 = (int) (f7 * 0.69f);
                        ActionIntroActivity.this.buttonTextView.layout(measuredWidth, i12, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i12);
                        return;
                    }
                    float f8 = i7;
                    int i13 = (int) (0.188f * f8);
                    ActionIntroActivity.this.imageView.layout(0, i13, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + i13);
                    int i14 = (int) (0.651f * f8);
                    ActionIntroActivity.this.titleTextView.layout(0, i14, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i14);
                    int i15 = (int) (0.731f * f8);
                    ActionIntroActivity.this.descriptionText.layout(0, i15, ActionIntroActivity.this.descriptionText.getMeasuredWidth(), ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i15);
                    int measuredWidth2 = (i6 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                    int i16 = (int) (f8 * 0.853f);
                    ActionIntroActivity.this.buttonTextView.layout(measuredWidth2, i16, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth2, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i16);
                    return;
                }
                if (i8 == 3) {
                    if (i4 > i5) {
                        float f9 = i7;
                        int measuredHeight2 = ((int) ((0.95f * f9) - ActionIntroActivity.this.imageView.getMeasuredHeight())) / 2;
                        int width = (int) ((getWidth() * 0.35f) - ActionIntroActivity.this.imageView.getMeasuredWidth());
                        ActionIntroActivity.this.imageView.layout(width, measuredHeight2, ActionIntroActivity.this.imageView.getMeasuredWidth() + width, ActionIntroActivity.this.imageView.getMeasuredHeight() + measuredHeight2);
                        float f10 = i6;
                        float f11 = 0.4f * f10;
                        int i17 = (int) f11;
                        int i18 = (int) (0.12f * f9);
                        ActionIntroActivity.this.titleTextView.layout(i17, i18, ActionIntroActivity.this.titleTextView.getMeasuredWidth() + i17, ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i18);
                        int i19 = (int) (0.24f * f9);
                        ActionIntroActivity.this.descriptionText.layout(i17, i19, ActionIntroActivity.this.descriptionText.getMeasuredWidth() + i17, ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i19);
                        float f12 = f10 * 0.6f;
                        int measuredWidth3 = (int) (((f12 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2.0f) + f11);
                        int i20 = (int) (f9 * 0.8f);
                        ActionIntroActivity.this.buttonTextView.layout(measuredWidth3, i20, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth3, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i20);
                        int measuredWidth4 = (int) (f11 + ((f12 - ActionIntroActivity.this.subtitleTextView.getMeasuredWidth()) / 2.0f));
                        int measuredHeight3 = i20 - (ActionIntroActivity.this.subtitleTextView.getMeasuredHeight() + AndroidUtilities.dp(16.0f));
                        ActionIntroActivity.this.subtitleTextView.layout(measuredWidth4, measuredHeight3, ActionIntroActivity.this.subtitleTextView.getMeasuredWidth() + measuredWidth4, ActionIntroActivity.this.subtitleTextView.getMeasuredHeight() + measuredHeight3);
                        return;
                    }
                    int i21 = (int) (i7 * 0.3f);
                    int measuredWidth5 = (i6 - ActionIntroActivity.this.imageView.getMeasuredWidth()) / 2;
                    ActionIntroActivity.this.imageView.layout(measuredWidth5, i21, ActionIntroActivity.this.imageView.getMeasuredWidth() + measuredWidth5, ActionIntroActivity.this.imageView.getMeasuredHeight() + i21);
                    int measuredHeight4 = i21 + ActionIntroActivity.this.imageView.getMeasuredHeight() + AndroidUtilities.dp(24.0f);
                    ActionIntroActivity.this.titleTextView.layout(0, measuredHeight4, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + measuredHeight4);
                    int textSize = (int) (measuredHeight4 + ActionIntroActivity.this.titleTextView.getTextSize() + AndroidUtilities.dp(16.0f));
                    ActionIntroActivity.this.descriptionText.layout(0, textSize, ActionIntroActivity.this.descriptionText.getMeasuredWidth(), ActionIntroActivity.this.descriptionText.getMeasuredHeight() + textSize);
                    int measuredWidth6 = (i6 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                    int measuredHeight5 = (i7 - ActionIntroActivity.this.buttonTextView.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                    ActionIntroActivity.this.buttonTextView.layout(measuredWidth6, measuredHeight5, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth6, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + measuredHeight5);
                    int measuredWidth7 = (i6 - ActionIntroActivity.this.subtitleTextView.getMeasuredWidth()) / 2;
                    int measuredHeight6 = measuredHeight5 - (ActionIntroActivity.this.subtitleTextView.getMeasuredHeight() + AndroidUtilities.dp(32.0f));
                    ActionIntroActivity.this.subtitleTextView.layout(measuredWidth7, measuredHeight6, ActionIntroActivity.this.subtitleTextView.getMeasuredWidth() + measuredWidth7, ActionIntroActivity.this.subtitleTextView.getMeasuredHeight() + measuredHeight6);
                    return;
                }
                if (i8 != 5) {
                    if (i8 != 6) {
                        return;
                    }
                    if (i4 > i5) {
                        int measuredHeight7 = (i7 - ActionIntroActivity.this.imageView.getMeasuredHeight()) / 2;
                        float f13 = i6;
                        int measuredWidth8 = ((int) ((0.5f * f13) - ActionIntroActivity.this.imageView.getMeasuredWidth())) / 2;
                        ActionIntroActivity.this.imageView.layout(measuredWidth8, measuredHeight7, ActionIntroActivity.this.imageView.getMeasuredWidth() + measuredWidth8, ActionIntroActivity.this.imageView.getMeasuredHeight() + measuredHeight7);
                        float f14 = 0.4f * f13;
                        int i22 = (int) f14;
                        float f15 = i7;
                        int i23 = (int) (0.14f * f15);
                        ActionIntroActivity.this.titleTextView.layout(i22, i23, ActionIntroActivity.this.titleTextView.getMeasuredWidth() + i22, ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i23);
                        int i24 = (int) (0.31f * f15);
                        ActionIntroActivity.this.descriptionText.layout(i22, i24, ActionIntroActivity.this.descriptionText.getMeasuredWidth() + i22, ActionIntroActivity.this.descriptionText.getMeasuredHeight() + i24);
                        int measuredWidth9 = (int) (f14 + (((f13 * 0.6f) - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2.0f));
                        int i25 = (int) (f15 * 0.78f);
                        ActionIntroActivity.this.buttonTextView.layout(measuredWidth9, i25, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth9, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i25);
                        return;
                    }
                    int i26 = (int) (i7 * 0.3f);
                    int measuredWidth10 = (i6 - ActionIntroActivity.this.imageView.getMeasuredWidth()) / 2;
                    ActionIntroActivity.this.imageView.layout(measuredWidth10, i26, ActionIntroActivity.this.imageView.getMeasuredWidth() + measuredWidth10, ActionIntroActivity.this.imageView.getMeasuredHeight() + i26);
                    int measuredHeight8 = i26 + ActionIntroActivity.this.imageView.getMeasuredHeight() + AndroidUtilities.dp(24.0f);
                    ActionIntroActivity.this.titleTextView.layout(0, measuredHeight8, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + measuredHeight8);
                    int textSize2 = (int) (measuredHeight8 + ActionIntroActivity.this.titleTextView.getTextSize() + AndroidUtilities.dp(16.0f));
                    ActionIntroActivity.this.descriptionText.layout(0, textSize2, ActionIntroActivity.this.descriptionText.getMeasuredWidth(), ActionIntroActivity.this.descriptionText.getMeasuredHeight() + textSize2);
                    int measuredWidth11 = (i6 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                    int measuredHeight9 = (i7 - ActionIntroActivity.this.buttonTextView.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                    ActionIntroActivity.this.buttonTextView.layout(measuredWidth11, measuredHeight9, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth11, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + measuredHeight9);
                    return;
                }
                if (ActionIntroActivity.this.showingAsBottomSheet) {
                    ActionIntroActivity.this.imageView.layout(0, 0, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight());
                    float f16 = i7;
                    int i27 = (int) (0.403f * f16);
                    ActionIntroActivity.this.titleTextView.layout(0, i27, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i27);
                    int i28 = (int) (0.631f * f16);
                    int measuredWidth12 = (getMeasuredWidth() - ActionIntroActivity.this.descriptionLayout.getMeasuredWidth()) / 2;
                    ActionIntroActivity.this.descriptionLayout.layout(measuredWidth12, i28, ActionIntroActivity.this.descriptionLayout.getMeasuredWidth() + measuredWidth12, ActionIntroActivity.this.descriptionLayout.getMeasuredHeight() + i28);
                    int measuredWidth13 = (i6 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                    int i29 = (int) (f16 * 0.853f);
                    ActionIntroActivity.this.buttonTextView.layout(measuredWidth13, i29, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth13, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i29);
                    return;
                }
                if (i4 > i5) {
                    int measuredHeight10 = (i7 - ActionIntroActivity.this.imageView.getMeasuredHeight()) / 2;
                    ActionIntroActivity.this.imageView.layout(0, measuredHeight10, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + measuredHeight10);
                    float f17 = i6;
                    float f18 = 0.4f * f17;
                    int i30 = (int) f18;
                    float f19 = i7;
                    int i31 = (int) (0.08f * f19);
                    ActionIntroActivity.this.titleTextView.layout(i30, i31, ActionIntroActivity.this.titleTextView.getMeasuredWidth() + i30, ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i31);
                    float f20 = f17 * 0.6f;
                    int measuredWidth14 = (int) (((f20 - ActionIntroActivity.this.descriptionLayout.getMeasuredWidth()) / 2.0f) + f18);
                    int i32 = (int) (0.25f * f19);
                    ActionIntroActivity.this.descriptionLayout.layout(measuredWidth14, i32, ActionIntroActivity.this.descriptionLayout.getMeasuredWidth() + measuredWidth14, ActionIntroActivity.this.descriptionLayout.getMeasuredHeight() + i32);
                    int measuredWidth15 = (int) (f18 + ((f20 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2.0f));
                    int i33 = (int) (f19 * 0.78f);
                    ActionIntroActivity.this.buttonTextView.layout(measuredWidth15, i33, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth15, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i33);
                    return;
                }
                if (AndroidUtilities.displaySize.y < 1800) {
                    float f21 = i7;
                    int i34 = (int) (0.06f * f21);
                    ActionIntroActivity.this.imageView.layout(0, i34, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + i34);
                    int i35 = (int) (0.463f * f21);
                    ActionIntroActivity.this.titleTextView.layout(0, i35, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i35);
                    f4 = f21 * 0.543f;
                } else {
                    float f22 = i7;
                    int i36 = (int) (0.148f * f22);
                    ActionIntroActivity.this.imageView.layout(0, i36, ActionIntroActivity.this.imageView.getMeasuredWidth(), ActionIntroActivity.this.imageView.getMeasuredHeight() + i36);
                    int i37 = (int) (0.551f * f22);
                    ActionIntroActivity.this.titleTextView.layout(0, i37, ActionIntroActivity.this.titleTextView.getMeasuredWidth(), ActionIntroActivity.this.titleTextView.getMeasuredHeight() + i37);
                    f4 = f22 * 0.631f;
                }
                int i38 = (int) f4;
                int measuredWidth16 = (getMeasuredWidth() - ActionIntroActivity.this.descriptionLayout.getMeasuredWidth()) / 2;
                ActionIntroActivity.this.descriptionLayout.layout(measuredWidth16, i38, ActionIntroActivity.this.descriptionLayout.getMeasuredWidth() + measuredWidth16, ActionIntroActivity.this.descriptionLayout.getMeasuredHeight() + i38);
                int measuredWidth17 = (i6 - ActionIntroActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                int i39 = (int) (i7 * 0.853f);
                ActionIntroActivity.this.buttonTextView.layout(measuredWidth17, i39, ActionIntroActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth17, ActionIntroActivity.this.buttonTextView.getMeasuredHeight() + i39);
            }
        };
        this.fragmentView = viewGroup;
        viewGroup.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        ViewGroup viewGroup2 = (ViewGroup) this.fragmentView;
        viewGroup2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ActionIntroActivity.$r8$lambda$SamJWdYl9lPGaCorXTiRCQP35lI(view, motionEvent);
            }
        });
        ActionBar actionBar2 = this.actionBar;
        if (actionBar2 != null) {
            viewGroup2.addView(actionBar2);
        }
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        viewGroup2.addView(rLottieImageView);
        TextView textView = new TextView(context);
        this.titleTextView = textView;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i2));
        this.titleTextView.setGravity(1);
        this.titleTextView.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.titleTextView.setTextSize(1, 24.0f);
        viewGroup2.addView(this.titleTextView);
        TextView textView2 = new TextView(context);
        this.subtitleTextView = textView2;
        if (this.currentType == 3) {
            i2 = Theme.key_featuredStickers_addButton;
        }
        textView2.setTextColor(Theme.getColor(i2));
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
        textView3.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText6));
        this.descriptionText.setGravity(1);
        this.descriptionText.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.descriptionText.setTextSize(1, 15.0f);
        int i3 = this.currentType;
        if (i3 == 6 || i3 == 3) {
            f = 32.0f;
            this.descriptionText.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        } else {
            f = 32.0f;
            this.descriptionText.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        }
        viewGroup2.addView(this.descriptionText);
        if (this.currentType == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.descriptionLayout = linearLayout;
            linearLayout.setOrientation(1);
            f2 = 24.0f;
            this.descriptionLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
            this.descriptionLayout.setGravity(LocaleController.isRTL ? 5 : 3);
            viewGroup2.addView(this.descriptionLayout);
            int i4 = 0;
            for (int i5 = 3; i4 < i5; i5 = 3) {
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                this.descriptionLayout.addView(linearLayout2, LayoutHelper.createLinear(-2, -2, 0.0f, 0.0f, 0.0f, i4 != i ? 7.0f : 0.0f));
                int i6 = i4 * 2;
                this.descriptionLines[i6] = new TextView(context);
                TextView textView4 = this.descriptionLines[i6];
                int i7 = Theme.key_windowBackgroundWhiteBlackText;
                textView4.setTextColor(Theme.getColor(i7));
                this.descriptionLines[i6].setGravity(LocaleController.isRTL ? 5 : 3);
                this.descriptionLines[i6].setTextSize(1, f4);
                int i8 = i4 + 1;
                this.descriptionLines[i6].setText(String.format(LocaleController.isRTL ? ".%d" : "%d.", Integer.valueOf(i8)));
                this.descriptionLines[i6].setTypeface(AndroidUtilities.bold());
                int i9 = i6 + 1;
                this.descriptionLines[i9] = new TextView(context);
                this.descriptionLines[i9].setTextColor(Theme.getColor(i7));
                this.descriptionLines[i9].setGravity(LocaleController.isRTL ? 5 : 3);
                this.descriptionLines[i9].setTextSize(1, f4);
                if (i4 == 0) {
                    this.descriptionLines[i9].setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText));
                    this.descriptionLines[i9].setHighlightColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkSelection));
                    String string = LocaleController.getString(R.string.AuthAnotherClientInfo1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int iIndexOf = string.indexOf(42);
                    int iLastIndexOf = string.lastIndexOf(42);
                    if (iIndexOf != -1 && iLastIndexOf != -1 && iIndexOf != iLastIndexOf) {
                        this.descriptionLines[i9].setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(iIndexOf, iIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new URLSpanNoUnderline(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl)), iIndexOf, iLastIndexOf - 1, 33);
                    }
                    this.descriptionLines[i9].setText(spannableStringBuilder);
                } else if (i4 == 1) {
                    this.descriptionLines[i9].setText(LocaleController.getString(R.string.AuthAnotherClientInfo2));
                } else {
                    this.descriptionLines[i9].setText(LocaleController.getString(R.string.AuthAnotherClientInfo3));
                }
                if (LocaleController.isRTL) {
                    linearLayout2.setGravity(5);
                    linearLayout2.addView(this.descriptionLines[i9], LayoutHelper.createLinear(0, -2, 1.0f));
                    linearLayout2.addView(this.descriptionLines[i6], LayoutHelper.createLinear(-2, -2, 4.0f, 0.0f, 0.0f, 0.0f));
                } else {
                    linearLayout2.addView(this.descriptionLines[i6], LayoutHelper.createLinear(-2, -2, 0.0f, 0.0f, 4.0f, 0.0f));
                    linearLayout2.addView(this.descriptionLines[i9], LayoutHelper.createLinear(-2, -2));
                }
                i4 = i8;
                i = 2;
                f4 = 15.0f;
            }
            f3 = 2.0f;
            this.descriptionText.setVisibility(8);
        } else {
            f2 = 24.0f;
            f3 = 2.0f;
        }
        TextView textView5 = new TextView(context);
        this.descriptionText2 = textView5;
        textView5.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText6));
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
                CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable();
                this.cellFlickerDrawable = cellFlickerDrawable;
                cellFlickerDrawable.drawFrame = false;
                cellFlickerDrawable.repeatProgress = 2.0f;
            }

            @Override
            protected void onSizeChanged(int i10, int i11, int i12, int i13) {
                super.onSizeChanged(i10, i11, i12, i13);
                ActionIntroActivity.this.startMessagingButtonBackground.setBounds(0, 0, i10, i11);
                ActionIntroActivity.this.startMessagingButtonBackground.setCornerRadius(Math.min(i10, i11) / 2.0f);
                this.cellFlickerDrawable.setParentWidth(i10);
            }

            @Override
            public void draw(Canvas canvas) {
                ActionIntroActivity.this.startMessagingButtonBackground.draw(canvas);
                super.draw(canvas);
            }

            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                if (ActionIntroActivity.this.flickerButton) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    this.cellFlickerDrawable.draw(canvas, rectF, getMeasuredHeight() / 2.0f, null);
                    invalidate();
                }
            }
        };
        this.buttonTextView = textView6;
        ScaleStateListAnimator.apply(textView6, 0.02f, 1.2f);
        this.buttonTextView.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.buttonTextView.setGravity(17);
        this.buttonTextView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText));
        this.buttonTextView.setTextSize(1, 14.0f);
        this.buttonTextView.setTypeface(AndroidUtilities.bold());
        this.buttonTextView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(f2), 0, Theme.getColor(Theme.key_featuredStickers_addButtonPressed)));
        viewGroup2.addView(this.buttonTextView);
        this.buttonTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ActionIntroActivity.m1282$r8$lambda$YoXUHFDOYw97s_yFcToiLUcjTk(this.f$0, view);
            }
        });
        int i10 = this.currentType;
        if (i10 == 0) {
            this.imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.imageView.setAnimation(R.raw.channel_create, 200, 200);
            this.titleTextView.setText(LocaleController.getString(R.string.ChannelAlertTitle));
            this.descriptionText.setText(LocaleController.getString(R.string.ChannelAlertText));
            this.buttonTextView.setText(LocaleController.getString(R.string.ChannelAlertCreate2));
            this.imageView.playAnimation();
            this.flickerButton = true;
        } else if (i10 == 3) {
            this.subtitleTextView.setVisibility(0);
            this.imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.imageView.setAnimation(R.raw.utyan_change_number, 200, 200);
            this.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ActionIntroActivity.$r8$lambda$_LiT6nF0pCqmw78TLVTONKDlvhU(this.f$0, view);
                }
            });
            UserConfig userConfig = getUserConfig();
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
            if (user == null) {
                user = userConfig.getCurrentUser();
            }
            if (user != null) {
                this.subtitleTextView.setText(LocaleController.formatString("PhoneNumberKeepButton", R.string.PhoneNumberKeepButton, PhoneFormat.getInstance().format("+" + user.phone)));
            }
            this.subtitleTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.getParentLayout().closeLastFragment(true);
                }
            });
            TextView textView7 = this.titleTextView;
            int i11 = R.string.PhoneNumberChange2;
            textView7.setText(LocaleController.getString(i11));
            this.descriptionText.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PhoneNumberHelp)));
            this.buttonTextView.setText(LocaleController.getString(i11));
            this.imageView.playAnimation();
            this.flickerButton = true;
        } else if (i10 == 5) {
            int[] iArr = new int[8];
            this.colors = iArr;
            this.imageView.setAnimation(R.raw.qr_login, 334, 334, iArr);
            this.imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.titleTextView.setText(LocaleController.getString(R.string.AuthAnotherClient));
            this.buttonTextView.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
            this.imageView.playAnimation();
        } else if (i10 == 6) {
            this.imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.imageView.setAnimation(R.raw.utyan_passcode, 200, 200);
            this.imageView.setFocusable(false);
            this.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ActionIntroActivity.$r8$lambda$qm9iyqvBYfiazsNVyHICd2LoBaI(this.f$0, view);
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

    public static void m1282$r8$lambda$YoXUHFDOYw97s_yFcToiLUcjTk(final ActionIntroActivity actionIntroActivity, View view) {
        if (actionIntroActivity.getParentActivity() == null) {
            return;
        }
        int i = actionIntroActivity.currentType;
        if (i == 0) {
            Bundle bundle = new Bundle();
            bundle.putInt("step", 0);
            actionIntroActivity.presentFragment(new ChannelCreateActivity(bundle), true);
            return;
        }
        if (i == 3) {
            AlertDialog.Builder builder = new AlertDialog.Builder(actionIntroActivity.getParentActivity());
            builder.setTitle(LocaleController.getString(R.string.PhoneNumberChangeTitle));
            builder.setMessage(LocaleController.getString(R.string.PhoneNumberAlert));
            builder.setPositiveButton(LocaleController.getString(R.string.Change), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    ActionIntroActivity.$r8$lambda$seBBMPEx7Svusq_lfZ_nm0ZpCqc(this.f$0, alertDialog, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            actionIntroActivity.showDialog(builder.create());
            return;
        }
        if (i == 5) {
            if (actionIntroActivity.getParentActivity() == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && actionIntroActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                actionIntroActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                return;
            } else {
                actionIntroActivity.processOpenQrReader();
                return;
            }
        }
        if (i != 6) {
            return;
        }
        actionIntroActivity.presentFragment(new PasscodeActivity(1), true);
        Runnable runnable = actionIntroActivity.openedSettings;
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
            actionIntroActivity.openedSettings = null;
        }
    }

    public static void $r8$lambda$seBBMPEx7Svusq_lfZ_nm0ZpCqc(ActionIntroActivity actionIntroActivity, AlertDialog alertDialog, int i) {
        actionIntroActivity.getClass();
        actionIntroActivity.presentFragment(new LoginActivity().changePhoneNumber(), true);
    }

    public static void $r8$lambda$qm9iyqvBYfiazsNVyHICd2LoBaI(ActionIntroActivity actionIntroActivity, View view) {
        if (actionIntroActivity.imageView.getAnimatedDrawable().isRunning()) {
            return;
        }
        actionIntroActivity.imageView.getAnimatedDrawable().setCurrentFrame(0, false);
        actionIntroActivity.imageView.playAnimation();
    }

    public static void $r8$lambda$_LiT6nF0pCqmw78TLVTONKDlvhU(ActionIntroActivity actionIntroActivity, View view) {
        if (actionIntroActivity.imageView.getAnimatedDrawable().isRunning()) {
            return;
        }
        actionIntroActivity.imageView.getAnimatedDrawable().setCurrentFrame(0, false);
        actionIntroActivity.imageView.playAnimation();
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
    public void onResume() {
        super.onResume();
    }

    public void updateColors() {
        GradientDrawable gradientDrawable = this.startMessagingButtonBackground;
        int i = Theme.key_featuredStickers_addButton;
        gradientDrawable.setColors(new int[]{getThemedColor(i), getThemedColor(Theme.key_featuredStickers_addButton2)});
        this.buttonTextView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText));
        this.buttonTextView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(24.0f), 0, Theme.getColor(Theme.key_featuredStickers_addButtonPressed)));
        int[] iArr = this.colors;
        if (iArr == null || this.imageView == null) {
            return;
        }
        iArr[0] = 3355443;
        iArr[1] = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText);
        int[] iArr2 = this.colors;
        iArr2[2] = 16777215;
        int i2 = Theme.key_windowBackgroundWhite;
        iArr2[3] = Theme.getColor(i2);
        int[] iArr3 = this.colors;
        iArr3[4] = 5285866;
        iArr3[5] = Theme.getColor(i);
        int[] iArr4 = this.colors;
        iArr4[6] = 2170912;
        iArr4[7] = Theme.getColor(i2);
        this.imageView.replaceColors(this.colors);
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                processOpenQrReader();
            } else {
                new AlertDialog.Builder(getParentActivity()).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint))).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        ActionIntroActivity.$r8$lambda$p_44rheyAljTbztyGMJmJ1ZLASg(this.f$0, alertDialog, i2);
                    }
                }).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).setTopAnimation(R.raw.permission_request_camera, 72, false, Theme.getColor(Theme.key_dialogTopBackground)).show();
            }
        }
    }

    public static void $r8$lambda$p_44rheyAljTbztyGMJmJ1ZLASg(ActionIntroActivity actionIntroActivity, AlertDialog alertDialog, int i) {
        actionIntroActivity.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            actionIntroActivity.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setQrLoginDelegate(ActionIntroQRLoginDelegate actionIntroQRLoginDelegate) {
        this.qrLoginDelegate = actionIntroQRLoginDelegate;
    }

    private void processOpenQrReader() {
        CameraScanActivity.showAsSheet((BaseFragment) this, false, 1, new CameraScanActivity.CameraScanActivityDelegate() {
            @Override
            public void didFindMrzInfo(MrzRecognizer.Result result) {
                CameraScanActivity.CameraScanActivityDelegate.CC.$default$didFindMrzInfo(this, result);
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

            @Override
            public void didFindQr(String str) {
                ActionIntroActivity.this.finishFragment(false);
                ActionIntroActivity.this.qrLoginDelegate.didFindQRCode(str);
            }
        });
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                this.f$0.updateColors();
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
            arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
            arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        }
        TextView textView = this.titleTextView;
        int i3 = ThemeDescription.FLAG_TEXTCOLOR;
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(textView, i3, null, null, null, themeDescriptionDelegate, i4));
        arrayList.add(new ThemeDescription(this.subtitleTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.descriptionText, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText6));
        arrayList.add(new ThemeDescription(this.descriptionLines[0], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.descriptionLines[1], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.descriptionLines[1], ThemeDescription.FLAG_LINKCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteLinkText));
        arrayList.add(new ThemeDescription(this.descriptionLines[2], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.descriptionLines[3], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.descriptionLines[4], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.descriptionLines[5], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i4));
        return arrayList;
    }

    @Override
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(Theme.key_windowBackgroundWhite, null, true)) > 0.699999988079071d;
    }
}
