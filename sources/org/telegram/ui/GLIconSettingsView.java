package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ColorPicker;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.SeekBarView;
public class GLIconSettingsView extends LinearLayout {
    public static float smallStarsSize = 1.0f;

    public GLIconSettingsView(final Context context, final GLIconRenderer gLIconRenderer) {
        super(context);
        setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText("Spectral top ");
        textView.setTextColor(Theme.getColor("dialogTextBlue2"));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        addView(textView, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        SeekBarView seekBarView = new SeekBarView(context);
        seekBarView.setDelegate(new SeekBarView.SeekBarViewDelegate(this) {
            @Override
            public CharSequence getContentDescription() {
                return SeekBarView.SeekBarViewDelegate.CC.$default$getContentDescription(this);
            }

            @Override
            public int getStepsCount() {
                return SeekBarView.SeekBarViewDelegate.CC.$default$getStepsCount(this);
            }

            @Override
            public void onSeekBarPressed(boolean z) {
            }

            @Override
            public void onSeekBarDrag(boolean z, float f) {
                gLIconRenderer.star.spec1 = f * 2.0f;
            }
        });
        seekBarView.setProgress(gLIconRenderer.star.spec1 / 2.0f);
        seekBarView.setReportChanges(true);
        addView(seekBarView, LayoutHelper.createFrame(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
        TextView textView2 = new TextView(context);
        textView2.setText("Spectral bottom ");
        textView2.setTextColor(Theme.getColor("dialogTextBlue2"));
        textView2.setTextSize(1, 16.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        addView(textView2, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        SeekBarView seekBarView2 = new SeekBarView(context);
        seekBarView2.setDelegate(new SeekBarView.SeekBarViewDelegate(this) {
            @Override
            public CharSequence getContentDescription() {
                return SeekBarView.SeekBarViewDelegate.CC.$default$getContentDescription(this);
            }

            @Override
            public int getStepsCount() {
                return SeekBarView.SeekBarViewDelegate.CC.$default$getStepsCount(this);
            }

            @Override
            public void onSeekBarPressed(boolean z) {
            }

            @Override
            public void onSeekBarDrag(boolean z, float f) {
                gLIconRenderer.star.spec2 = f * 2.0f;
            }
        });
        seekBarView2.setProgress(gLIconRenderer.star.spec2 / 2.0f);
        seekBarView2.setReportChanges(true);
        addView(seekBarView2, LayoutHelper.createFrame(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setText("Setup spec color");
        textView3.setTextSize(1, 16.0f);
        textView3.setLines(1);
        textView3.setGravity(17);
        textView3.setMaxLines(1);
        textView3.setSingleLine(true);
        textView3.setTextColor(Theme.getColor("featuredStickers_buttonText"));
        textView3.setBackground(Theme.AdaptiveRipple.filledRect(Theme.getColor("featuredStickers_addButton"), 4.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            @Override
            public void onClick(View view) {
                ColorPicker colorPicker = new ColorPicker(this, context, false, new ColorPicker.ColorPickerDelegate() {
                    @Override
                    public void deleteTheme() {
                        ColorPicker.ColorPickerDelegate.CC.$default$deleteTheme(this);
                    }

                    @Override
                    public int getDefaultColor(int i) {
                        return ColorPicker.ColorPickerDelegate.CC.$default$getDefaultColor(this, i);
                    }

                    @Override
                    public void openThemeCreate(boolean z) {
                        ColorPicker.ColorPickerDelegate.CC.$default$openThemeCreate(this, z);
                    }

                    @Override
                    public void setColor(int i, int i2, boolean z) {
                        gLIconRenderer.star.specColor = i;
                    }
                }) {
                    @Override
                    protected void onMeasure(int i, int i2) {
                        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(300.0f), 1073741824));
                    }
                };
                colorPicker.setColor(gLIconRenderer.star.specColor, 0);
                colorPicker.setType(-1, true, 1, 1, false, 0, false);
                BottomSheet bottomSheet = new BottomSheet(context, false);
                bottomSheet.setCustomView(colorPicker);
                bottomSheet.setDimBehind(false);
                bottomSheet.show();
            }
        });
        addView(textView3, LayoutHelper.createFrame(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        TextView textView4 = new TextView(context);
        textView4.setText("Diffuse ");
        textView4.setTextColor(Theme.getColor("dialogTextBlue2"));
        textView4.setTextSize(1, 16.0f);
        textView4.setLines(1);
        textView4.setMaxLines(1);
        textView4.setSingleLine(true);
        textView4.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        addView(textView4, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        SeekBarView seekBarView3 = new SeekBarView(context);
        seekBarView3.setDelegate(new SeekBarView.SeekBarViewDelegate(this) {
            @Override
            public CharSequence getContentDescription() {
                return SeekBarView.SeekBarViewDelegate.CC.$default$getContentDescription(this);
            }

            @Override
            public int getStepsCount() {
                return SeekBarView.SeekBarViewDelegate.CC.$default$getStepsCount(this);
            }

            @Override
            public void onSeekBarPressed(boolean z) {
            }

            @Override
            public void onSeekBarDrag(boolean z, float f) {
                gLIconRenderer.star.diffuse = f;
            }
        });
        seekBarView3.setProgress(gLIconRenderer.star.diffuse);
        seekBarView3.setReportChanges(true);
        addView(seekBarView3, LayoutHelper.createFrame(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
        TextView textView5 = new TextView(context);
        textView5.setText("Normal map spectral");
        textView5.setTextColor(Theme.getColor("dialogTextBlue2"));
        textView5.setTextSize(1, 16.0f);
        textView5.setLines(1);
        textView5.setMaxLines(1);
        textView5.setSingleLine(true);
        textView5.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        addView(textView5, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        SeekBarView seekBarView4 = new SeekBarView(context);
        seekBarView4.setDelegate(new SeekBarView.SeekBarViewDelegate(this) {
            @Override
            public CharSequence getContentDescription() {
                return SeekBarView.SeekBarViewDelegate.CC.$default$getContentDescription(this);
            }

            @Override
            public int getStepsCount() {
                return SeekBarView.SeekBarViewDelegate.CC.$default$getStepsCount(this);
            }

            @Override
            public void onSeekBarPressed(boolean z) {
            }

            @Override
            public void onSeekBarDrag(boolean z, float f) {
                gLIconRenderer.star.normalSpec = f * 2.0f;
            }
        });
        seekBarView4.setProgress(gLIconRenderer.star.normalSpec / 2.0f);
        seekBarView4.setReportChanges(true);
        addView(seekBarView4, LayoutHelper.createFrame(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
        TextView textView6 = new TextView(context);
        textView6.setText("Setup normal spec color");
        textView6.setTextSize(1, 16.0f);
        textView6.setLines(1);
        textView6.setGravity(17);
        textView6.setMaxLines(1);
        textView6.setSingleLine(true);
        textView6.setTextColor(Theme.getColor("featuredStickers_buttonText"));
        textView6.setBackground(Theme.AdaptiveRipple.filledRect(Theme.getColor("featuredStickers_addButton"), 4.0f));
        textView6.setOnClickListener(new View.OnClickListener(this) {
            @Override
            public void onClick(View view) {
                ColorPicker colorPicker = new ColorPicker(this, context, false, new ColorPicker.ColorPickerDelegate() {
                    @Override
                    public void deleteTheme() {
                        ColorPicker.ColorPickerDelegate.CC.$default$deleteTheme(this);
                    }

                    @Override
                    public int getDefaultColor(int i) {
                        return ColorPicker.ColorPickerDelegate.CC.$default$getDefaultColor(this, i);
                    }

                    @Override
                    public void openThemeCreate(boolean z) {
                        ColorPicker.ColorPickerDelegate.CC.$default$openThemeCreate(this, z);
                    }

                    @Override
                    public void setColor(int i, int i2, boolean z) {
                        if (i2 == 0) {
                            gLIconRenderer.star.normalSpecColor = i;
                        }
                    }
                }) {
                    @Override
                    protected void onMeasure(int i, int i2) {
                        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(300.0f), 1073741824));
                    }
                };
                colorPicker.setColor(gLIconRenderer.star.normalSpecColor, 0);
                colorPicker.setType(-1, true, 1, 1, false, 0, false);
                BottomSheet bottomSheet = new BottomSheet(context, false);
                bottomSheet.setCustomView(colorPicker);
                bottomSheet.setDimBehind(false);
                bottomSheet.show();
            }
        });
        addView(textView6, LayoutHelper.createFrame(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        TextView textView7 = new TextView(context);
        textView7.setText("Small starts size");
        textView7.setTextColor(Theme.getColor("dialogTextBlue2"));
        textView7.setTextSize(1, 16.0f);
        textView7.setLines(1);
        textView7.setMaxLines(1);
        textView7.setSingleLine(true);
        textView7.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        addView(textView7, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        SeekBarView seekBarView5 = new SeekBarView(context);
        seekBarView5.setDelegate(new SeekBarView.SeekBarViewDelegate(this) {
            @Override
            public CharSequence getContentDescription() {
                return SeekBarView.SeekBarViewDelegate.CC.$default$getContentDescription(this);
            }

            @Override
            public int getStepsCount() {
                return SeekBarView.SeekBarViewDelegate.CC.$default$getStepsCount(this);
            }

            @Override
            public void onSeekBarPressed(boolean z) {
            }

            @Override
            public void onSeekBarDrag(boolean z, float f) {
                GLIconSettingsView.smallStarsSize = f * 2.0f;
            }
        });
        seekBarView5.setProgress(smallStarsSize / 2.0f);
        seekBarView5.setReportChanges(true);
        addView(seekBarView5, LayoutHelper.createFrame(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
    }
}
