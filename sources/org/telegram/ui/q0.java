package org.telegram.ui;
public final class q0 extends org.telegram.ui.Components.q6 {
    public final int f51016b;

    public q0(String str, int i7) {
        super(str, 0);
        this.f51016b = i7;
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f51016b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f10);
                return;
            case 1:
                bn.f45936md = (int) f10;
                return;
            case 2:
                ((org.telegram.ui.Cells.r1) obj).setTimeAlpha(f10);
                return;
            case 3:
                ((org.telegram.messenger.bj) obj).d = f10;
                return;
            case 4:
                ((wv0) obj).setCrossfadeProgress(f10);
                return;
            case 5:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f10);
                return;
            case 6:
                ((SecretMediaViewer) obj).setAnimationValue(f10);
                return;
            default:
                oz0 oz0Var = (oz0) obj;
                if (oz0Var.f50683a != f10) {
                    oz0Var.f50683a = f10;
                    SecretMediaViewer secretMediaViewer = oz0Var.f50689r;
                    secretMediaViewer.R.setAlpha(f10);
                    if (oz0Var.f50684b) {
                        org.telegram.ui.ActionBar.m5 m5Var = secretMediaViewer.R;
                        m5Var.setPivotX(m5Var.getWidth());
                        org.telegram.ui.ActionBar.m5 m5Var2 = secretMediaViewer.R;
                        m5Var2.setPivotY(m5Var2.getHeight());
                        float f11 = 1.0f - f10;
                        float f12 = 1.0f - (0.1f * f11);
                        secretMediaViewer.R.setScaleX(f12);
                        secretMediaViewer.R.setScaleY(f12);
                        org.telegram.ui.Components.k61 k61Var = secretMediaViewer.P;
                        if (k61Var.f36838y != f11) {
                            k61Var.f36838y = f11;
                            k61Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (oz0Var.f50685c) {
                        oz0Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
                    }
                    secretMediaViewer.Q.setAlpha(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f51016b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(bn.f45936md);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.r1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((org.telegram.messenger.bj) obj).d);
            case 4:
                return Float.valueOf(((wv0) obj).T);
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 6:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((oz0) obj).f50683a);
        }
    }
}
