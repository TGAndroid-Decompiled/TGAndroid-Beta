package org.telegram.ui;
public final class q0 extends org.telegram.ui.Components.l6 {
    public final int f48997b;

    public q0(String str, int i7) {
        super(str, 0);
        this.f48997b = i7;
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f48997b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f10);
                return;
            case 1:
                an.f43712id = (int) f10;
                return;
            case 2:
                ((org.telegram.ui.Cells.q1) obj).setTimeAlpha(f10);
                return;
            case 3:
                ((org.telegram.messenger.ej) obj).d = f10;
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
                lz0 lz0Var = (lz0) obj;
                if (lz0Var.f47600a != f10) {
                    lz0Var.f47600a = f10;
                    SecretMediaViewer secretMediaViewer = lz0Var.f47606r;
                    secretMediaViewer.Q.setAlpha(f10);
                    if (lz0Var.f47601b) {
                        org.telegram.ui.ActionBar.k5 k5Var = secretMediaViewer.Q;
                        k5Var.setPivotX(k5Var.getWidth());
                        org.telegram.ui.ActionBar.k5 k5Var2 = secretMediaViewer.Q;
                        k5Var2.setPivotY(k5Var2.getHeight());
                        float f11 = 1.0f - f10;
                        float f12 = 1.0f - (0.1f * f11);
                        secretMediaViewer.Q.setScaleX(f12);
                        secretMediaViewer.Q.setScaleY(f12);
                        org.telegram.ui.Components.v51 v51Var = secretMediaViewer.O;
                        if (v51Var.f38917y != f11) {
                            v51Var.f38917y = f11;
                            v51Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (lz0Var.f47602c) {
                        lz0Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
                    }
                    secretMediaViewer.P.setAlpha(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f48997b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(an.f43712id);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.q1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((org.telegram.messenger.ej) obj).d);
            case 4:
                return Float.valueOf(((wv0) obj).S);
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 6:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((lz0) obj).f47600a);
        }
    }
}
