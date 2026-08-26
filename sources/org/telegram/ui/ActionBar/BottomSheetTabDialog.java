package org.telegram.ui.ActionBar;

import android.app.Dialog;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda9;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.QrActivity;

public final class BottomSheetTabDialog extends Dialog {
    public boolean attached;
    public final QrActivity.AnonymousClass2 navigationBar;
    public final Paint navigationBarPaint;
    public final BottomSheetTabsOverlay.Sheet sheet;
    public final WindowView windowView;

    public final class WindowView extends FrameLayout implements BottomSheetTabsOverlay.SheetView {
        public final BottomSheetTabsOverlay.SheetView sheetView;

        public WindowView(BottomSheetTabsOverlay.SheetView sheetView) {
            super(sheetView.getContext());
            this.sheetView = sheetView;
        }

        @Override
        public final float drawInto(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2) {
            return this.sheetView.drawInto(canvas, rectF, f, rectF2, f2);
        }

        @Override
        public RectF getRect() {
            return this.sheetView.getRect();
        }

        @Override
        public void setDrawingFromOverlay(boolean z) {
            this.sheetView.setDrawingFromOverlay(z);
        }
    }

    public BottomSheetTabDialog(BottomSheetTabsOverlay.Sheet sheet) {
        super(sheet.mo1066getWindowView().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.navigationBarPaint = paint;
        this.sheet = sheet;
        BottomSheetTabsOverlay.SheetView sheetViewMo1066getWindowView = sheet.mo1066getWindowView();
        QrActivity.AnonymousClass2 anonymousClass2 = new QrActivity.AnonymousClass2(this, getContext(), 1);
        this.navigationBar = anonymousClass2;
        paint.setColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        WindowView windowView = new WindowView(sheetViewMo1066getWindowView);
        this.windowView = windowView;
        setContentView(windowView, new ViewGroup.LayoutParams(-1, -1));
        windowView.addView(anonymousClass2, LayoutHelper.createFrame(-1, -2, 80));
        windowView.setClipToPadding(false);
    }

    public static void checkSheet(BottomSheetTabsOverlay.Sheet sheet) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        if (AndroidUtilities.isTablet() || sheet.hadDialog() || AndroidUtilities.hasDialogOnTop(safeLastFragment)) {
            BottomSheetTabDialog bottomSheetTabDialog = new BottomSheetTabDialog(sheet);
            if (sheet.setDialog(bottomSheetTabDialog)) {
                WindowView windowView = bottomSheetTabDialog.windowView;
                View view = (View) windowView.sheetView;
                AndroidUtilities.removeFromParent(view);
                windowView.addView(view, LayoutHelper.createFrame(-1, -1, 119));
            }
        }
    }

    public final void detach() {
        this.sheet.setDialog(null);
        if (this.attached) {
            this.attached = false;
            try {
                super.dismiss();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void dismiss() {
        this.sheet.dismiss(false);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            window.addFlags(-2147483392);
        } else {
            window.addFlags(-2147417856);
        }
        window.setWindowAnimations(R.style.DialogNoAnimation);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        attributes.flags &= -3;
        attributes.softInputMode = 16;
        attributes.height = -1;
        if (i >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        if (i >= 23) {
            window.setStatusBarColor(0);
        }
        WindowView windowView = this.windowView;
        windowView.setFitsSystemWindows(true);
        windowView.setSystemUiVisibility(1792);
        windowView.setPadding(0, 0, 0, 0);
        windowView.setOnApplyWindowInsetsListener(new ArticleViewer$$ExternalSyntheticLambda9(1));
    }
}
