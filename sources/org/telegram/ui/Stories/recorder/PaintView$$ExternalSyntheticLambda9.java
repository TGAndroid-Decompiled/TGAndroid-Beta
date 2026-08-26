package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda19;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda140;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

public final class PaintView$$ExternalSyntheticLambda9 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$3;

    public PaintView$$ExternalSyntheticLambda9(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                final StoryRecorder.AnonymousClass24 anonymousClass24 = (StoryRecorder.AnonymousClass24) this.f$0;
                if (!anonymousClass24.isColorListShown) {
                    Runnable runnable = anonymousClass24.onDoneButtonClickedListener;
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    ColorPickerBottomSheet colorPickerBottomSheet = new ColorPickerBottomSheet((Context) this.f$1, anonymousClass24.resourcesProvider);
                    anonymousClass24.colorPickerBottomSheet = colorPickerBottomSheet;
                    colorPickerBottomSheet.onSetColor(anonymousClass24.colorSwatch.color, 2);
                    final PersistColorPalette persistColorPalette = (PersistColorPalette) this.f$3;
                    colorPickerBottomSheet.pipetteDelegate = new ColorPickerBottomSheet.PipetteDelegate() {
                        public boolean hasPipette;

                        @Override
                        public final FrameLayout getContainerView() {
                            return anonymousClass24.pipetteContainerLayout;
                        }

                        @Override
                        public final View getSnapshotDrawingView() {
                            return anonymousClass24;
                        }

                        @Override
                        public final boolean isPipetteAvailable() {
                            return false;
                        }

                        @Override
                        public final boolean isPipetteVisible() {
                            return this.hasPipette;
                        }

                        @Override
                        public final void onColorSelected(int i) {
                            StoryRecorder.AnonymousClass24 anonymousClass25 = anonymousClass24;
                            anonymousClass25.showColorList$1(false);
                            PersistColorPalette persistColorPalette2 = persistColorPalette;
                            persistColorPalette2.selectColor(i, true);
                            persistColorPalette2.saveColors();
                            anonymousClass25.setNewColor(i);
                            int currentColorPosition = persistColorPalette2.getCurrentColorPosition();
                            AnonymousClass11 anonymousClass11 = anonymousClass25.colorsListView;
                            anonymousClass11.setSelectedColorIndex(currentColorPosition);
                            anonymousClass11.getAdapter().notifyDataSetChanged();
                        }

                        @Override
                        public final void onDrawImageOverCanvas(Canvas canvas) {
                            AnonymousClass3 anonymousClass3 = anonymousClass24.renderView;
                            Matrix matrix = anonymousClass3.getMatrix();
                            canvas.save();
                            canvas.translate(anonymousClass3.getX(), anonymousClass3.getY());
                            canvas.concat(matrix);
                            anonymousClass3.getWidth();
                            throw null;
                        }

                        @Override
                        public final void onStartColorPipette() {
                            this.hasPipette = true;
                        }

                        @Override
                        public final void onStopColorPipette() {
                            this.hasPipette = false;
                        }
                    };
                    colorPickerBottomSheet.colorListener = new StarsController$$ExternalSyntheticLambda140(4, anonymousClass24, persistColorPalette);
                    colorPickerBottomSheet.show();
                }
                break;
            case 1:
                StoryRecorder.AnonymousClass8 anonymousClass8 = (StoryRecorder.AnonymousClass8) this.f$0;
                ItemOptions itemOptions = anonymousClass8.periodPopup;
                if (itemOptions == null || !itemOptions.isShown()) {
                    CaptionStory$$ExternalSyntheticLambda4 captionStory$$ExternalSyntheticLambda4 = new CaptionStory$$ExternalSyntheticLambda4(anonymousClass8, 0);
                    boolean zIsPremium = UserConfig.getInstance(anonymousClass8.currentAccount).isPremium();
                    CaptionStory$$ExternalSyntheticLambda4 captionStory$$ExternalSyntheticLambda5 = zIsPremium ? null : new CaptionStory$$ExternalSyntheticLambda4(anonymousClass8, 1);
                    ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions((FrameLayout) this.f$1, (DarkThemeResourceProvider) this.f$3, anonymousClass8.periodButton);
                    anonymousClass8.periodPopup = itemOptionsMakeOptions;
                    itemOptionsMakeOptions.addText(LocaleController.getString("StoryPeriodHint"), 13, AndroidUtilities.dp(200.0f));
                    anonymousClass8.periodPopup.addGap();
                    int i = 0;
                    while (true) {
                        int[] iArr = CaptionStory.periods;
                        if (i >= 4) {
                            anonymousClass8.periodPopup.setDimAlpha(0).show();
                        } else {
                            int i2 = iArr[i];
                            anonymousClass8.periodPopup.add(0, i2 == Integer.MAX_VALUE ? LocaleController.getString("StoryPeriodKeep") : LocaleController.formatPluralString("Hours", i2 / 3600, new Object[0]), Theme.key_actionBarDefaultSubmenuItem, new Theme$$ExternalSyntheticLambda19(captionStory$$ExternalSyntheticLambda4, i2, 19)).putPremiumLock((zIsPremium || i2 == 86400 || i2 == Integer.MAX_VALUE) ? null : new Theme$$ExternalSyntheticLambda19(captionStory$$ExternalSyntheticLambda5, i2, 20));
                            if (anonymousClass8.periodIndex == i) {
                                anonymousClass8.periodPopup.putCheck();
                            }
                            i++;
                        }
                    }
                }
                break;
            default:
                GalleryListView galleryListView = GalleryListView.this;
                ArrayList arrayList = galleryListView.selectedPhotos;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f$1;
                boolean zContains = arrayList.contains(photoEntry);
                ArrayList arrayList2 = galleryListView.selectedPhotos;
                if (zContains) {
                    arrayList2.remove(photoEntry);
                } else if (arrayList2.size() + 1 > galleryListView.maxCount) {
                    int i3 = -galleryListView.shiftDp;
                    galleryListView.shiftDp = i3;
                    AndroidUtilities.shakeViewSpring((GalleryListView.Cell) this.f$3, i3);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                } else {
                    arrayList2.add(photoEntry);
                }
                AndroidUtilities.updateVisibleRows(galleryListView.listView);
                galleryListView.updateSelectButtonVisible();
                break;
        }
    }
}
