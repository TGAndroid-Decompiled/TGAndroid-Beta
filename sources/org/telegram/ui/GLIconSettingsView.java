package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Components.ColorPicker;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.Icon3D;
import org.telegram.ui.Components.SectionsScrollView;

public class GLIconSettingsView extends LinearLayout {
    public static float smallStarsSize = 1.0f;
    public final int $r8$classId;

    public final class AnonymousClass3 implements View.OnClickListener {
        public final int $r8$classId;
        public final Context val$context;
        public final GLIconRenderer val$mRenderer;

        public final class AnonymousClass2 extends ColorPicker {
            public final int $r8$classId;

            public AnonymousClass2(Context context, boolean z, ColorPicker.ColorPickerDelegate colorPickerDelegate, int i) {
                super(context, z, colorPickerDelegate);
                this.$r8$classId = i;
            }

            @Override
            public final void onMeasure(int i, int i2) {
                switch (this.$r8$classId) {
                    case 0:
                        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(300.0f), 1073741824));
                        break;
                    case 1:
                        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(300.0f), 1073741824));
                        break;
                    default:
                        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(300.0f), 1073741824));
                        break;
                }
            }
        }

        public AnonymousClass3(Context context, GLIconRenderer gLIconRenderer, int i) {
            this.$r8$classId = i;
            this.val$context = context;
            this.val$mRenderer = gLIconRenderer;
        }

        @Override
        public final void onClick(View view) {
            switch (this.$r8$classId) {
                case 0:
                    PhotoViewer.AnonymousClass49 anonymousClass49 = new PhotoViewer.AnonymousClass49(this, 5);
                    Context context = this.val$context;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(context, false, anonymousClass49, 0);
                    Icon3D icon3D = this.val$mRenderer.model;
                    anonymousClass2.setColor(icon3D != null ? icon3D.specColor : 0, 0);
                    anonymousClass2.setType(-1, 1, 1, false);
                    BottomSheet bottomSheet = new BottomSheet(context, null, false, false);
                    bottomSheet.setCustomView(anonymousClass2);
                    bottomSheet.setDimBehind(false);
                    bottomSheet.show();
                    break;
                default:
                    ChatActivity.AnonymousClass1 anonymousClass1 = new ChatActivity.AnonymousClass1(this, 28);
                    Context context2 = this.val$context;
                    AnonymousClass2 anonymousClass3 = new AnonymousClass2(context2, false, anonymousClass1, 2);
                    Icon3D icon3D2 = this.val$mRenderer.model;
                    anonymousClass3.setColor(icon3D2 == null ? 0 : icon3D2.normalSpecColor, 0);
                    anonymousClass3.setType(-1, 1, 1, false);
                    BottomSheet bottomSheet2 = new BottomSheet(context2, null, false, false);
                    bottomSheet2.setCustomView(anonymousClass3);
                    bottomSheet2.setDimBehind(false);
                    bottomSheet2.show();
                    break;
            }
        }
    }

    public GLIconSettingsView(Context context, int i) {
        super(context);
        this.$r8$classId = i;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        Path path;
        switch (this.$r8$classId) {
            case 6:
                if (!(getParent() instanceof SectionsScrollView)) {
                    return super.drawChild(canvas, view, j);
                }
                SectionsScrollView sectionsScrollView = (SectionsScrollView) getParent();
                canvas.save();
                int i = SectionsScrollView.$r8$clinit;
                sectionsScrollView.getClass();
                if (view != null && SectionsScrollView.isSectionView(view)) {
                    GLIconSettingsView gLIconSettingsView = sectionsScrollView.contentView;
                    int iIndexOfChild = gLIconSettingsView.indexOfChild(view);
                    int i2 = iIndexOfChild - 1;
                    View childAt = i2 < 0 ? null : gLIconSettingsView.getChildAt(i2);
                    int i3 = iIndexOfChild + 1;
                    View childAt2 = i3 < gLIconSettingsView.getChildCount() ? gLIconSettingsView.getChildAt(i3) : null;
                    boolean z = childAt != null && SectionsScrollView.isSectionView(childAt);
                    boolean z2 = childAt2 != null && SectionsScrollView.isSectionView(childAt2);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), Math.max(sectionsScrollView.getScrollY() - AndroidUtilities.dp(16.0f), view.getY() + gLIconSettingsView.getY()), view.getX() + view.getWidth(), Math.min(AndroidUtilities.dp(16.0f) + sectionsScrollView.getScrollY() + sectionsScrollView.getHeight(), view.getY() + gLIconSettingsView.getY() + view.getHeight()));
                    if (z && z2) {
                        z = view.getY() >= rectF.top;
                        boolean z3 = view.getY() + ((float) view.getHeight()) <= rectF.bottom;
                        if (!z || !z3) {
                            z2 = z3;
                            path = sectionsScrollView.clipPath;
                            if (!z) {
                                if (!z) {
                                    path.rewind();
                                    path.addRoundRect(rectF, sectionsScrollView.sectionRadiusTop, Path.Direction.CW);
                                    canvas.clipPath(path);
                                } else if (!z2) {
                                    path.rewind();
                                    path.addRoundRect(rectF, sectionsScrollView.sectionRadiusBottom, Path.Direction.CW);
                                    canvas.clipPath(path);
                                }
                            } else if (!z) {
                                path.rewind();
                                path.addRoundRect(rectF, sectionsScrollView.sectionRadiusTop, Path.Direction.CW);
                                canvas.clipPath(path);
                            } else if (!z2) {
                                path.rewind();
                                path.addRoundRect(rectF, sectionsScrollView.sectionRadiusBottom, Path.Direction.CW);
                                canvas.clipPath(path);
                            }
                        }
                    } else {
                        path = sectionsScrollView.clipPath;
                        if (!z && !z2) {
                            path.rewind();
                            float f = sectionsScrollView.sectionRadius;
                            path.addRoundRect(rectF, f, f, Path.Direction.CW);
                            canvas.clipPath(path);
                        } else if (!z) {
                            path.rewind();
                            path.addRoundRect(rectF, sectionsScrollView.sectionRadiusTop, Path.Direction.CW);
                            canvas.clipPath(path);
                        } else if (!z2) {
                            path.rewind();
                            path.addRoundRect(rectF, sectionsScrollView.sectionRadiusBottom, Path.Direction.CW);
                            canvas.clipPath(path);
                        }
                    }
                }
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.$r8$classId) {
            case 3:
                super.onLayout(z, i, i2, i3, i4);
                setPivotX(getWidth());
                break;
            case 6:
                super.onLayout(z, i, i2, i3, i4);
                if (getParent() instanceof SectionsScrollView) {
                    ((SectionsScrollView) getParent()).invalidate();
                }
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        switch (this.$r8$classId) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
                break;
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
                break;
            case 3:
            case 6:
            default:
                super.onMeasure(i, i2);
                break;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), AndroidUtilities.dp(600.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), AndroidUtilities.dp(800.0f)), 1073741824));
                break;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i)), View.MeasureSpec.getMode(i)), i2);
                break;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
                break;
            case 8:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
                break;
            case 9:
                super.onMeasure(i, i2);
                setPivotY(0.0f);
                setPivotX(0.0f);
                break;
            case 10:
                super.onMeasure(i, i2);
                setPivotY(0.0f);
                setPivotX(getMeasuredWidth());
                break;
        }
    }

    public GLIconSettingsView(Context context) {
        super(context);
        this.$r8$classId = 6;
        setWillNotDraw(false);
    }
}
