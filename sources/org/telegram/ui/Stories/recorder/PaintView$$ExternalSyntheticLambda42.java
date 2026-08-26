package org.telegram.ui.Stories.recorder;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.PersistColorPalette;

public final class PaintView$$ExternalSyntheticLambda42 implements View.OnLongClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public PaintView$$ExternalSyntheticLambda42(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                PaintView paintView = (PaintView) this.f$0;
                if (paintView.popupLayout != null) {
                    int i = paintView.currentAccount;
                    PersistColorPalette persistColorPalette = PersistColorPalette.getInstance(i);
                    persistColorPalette.fillShapes = !persistColorPalette.fillShapes;
                    persistColorPalette.mConfig.edit().putBoolean("fill_shapes", persistColorPalette.fillShapes).apply();
                    boolean z = PersistColorPalette.getInstance(i).fillShapes;
                    for (int i2 = 0; i2 < paintView.popupLayout.getItemsCount(); i2++) {
                        View itemAt = paintView.popupLayout.getItemAt(i2);
                        if (itemAt instanceof PaintView.PopupButton) {
                            Brush.Shape shape = (Brush.Shape) Brush.Shape.SHAPES_LIST.get(i2);
                            ((PaintView.PopupButton) itemAt).setIcon(z ? shape.getFilledIconRes() : shape.getIconRes(), z, true);
                        }
                    }
                }
                return true;
            default:
                StoryRecorder storyRecorder = (StoryRecorder) this.f$0;
                StoryRecorder.AnonymousClass25 anonymousClass25 = storyRecorder.cameraView;
                if (anonymousClass25 == null || !anonymousClass25.isFrontface()) {
                    return false;
                }
                storyRecorder.checkFrontfaceFlashModes();
                storyRecorder.flashButton.setSelected(true);
                storyRecorder.flashViews.flashTo(0.85f, 240L, null);
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(storyRecorder.containerView, storyRecorder.resourcesProvider, storyRecorder.flashButton);
                Activity activity = storyRecorder.activity;
                itemOptionsMakeOptions.addView(new SliderView(activity, 1).setValue(storyRecorder.flashViews.warmth).setOnValueChange(new StoryRecorder$$ExternalSyntheticLambda14(storyRecorder, 21))).addSpaceGap().addView(new SliderView(activity, 2).setMinMax(0.65f, 1.0f).setValue(storyRecorder.flashViews.intensity).setOnValueChange(new StoryRecorder$$ExternalSyntheticLambda14(storyRecorder, 1))).setOnDismiss(new StoryRecorder$$ExternalSyntheticLambda5(storyRecorder, 1)).setDimAlpha(0).setGravity(5).translate(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f)).setBackgroundColor(-1155851493).show();
                return true;
        }
    }
}
