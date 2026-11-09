package org.telegram.ui;
public final class q0 extends org.telegram.ui.Components.l6 {
    public final int f48839b;

    public q0(String str, int i7) {
        super(str, 0);
        this.f48839b = i7;
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f48839b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f10);
                return;
            case 1:
                cn.f44367kd = (int) f10;
                return;
            case 2:
                ((org.telegram.ui.Cells.q1) obj).setTimeAlpha(f10);
                return;
            case 3:
                ((org.telegram.messenger.ej) obj).d = f10;
                return;
            case 4:
                ((yv0) obj).setCrossfadeProgress(f10);
                return;
            case 5:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f10);
                return;
            case 6:
                ((SecretMediaViewer) obj).setAnimationValue(f10);
                return;
            default:
                oz0 oz0Var = (oz0) obj;
                if (oz0Var.f48568a != f10) {
                    oz0Var.f48568a = f10;
                    SecretMediaViewer secretMediaViewer = oz0Var.f48574r;
                    secretMediaViewer.Q.setAlpha(f10);
                    if (oz0Var.f48569b) {
                        org.telegram.ui.ActionBar.l5 l5Var = secretMediaViewer.Q;
                        l5Var.setPivotX(l5Var.getWidth());
                        org.telegram.ui.ActionBar.l5 l5Var2 = secretMediaViewer.Q;
                        l5Var2.setPivotY(l5Var2.getHeight());
                        float f11 = 1.0f - f10;
                        float f12 = 1.0f - (0.1f * f11);
                        secretMediaViewer.Q.setScaleX(f12);
                        secretMediaViewer.Q.setScaleY(f12);
                        org.telegram.ui.Components.w51 w51Var = secretMediaViewer.O;
                        if (w51Var.f39941y != f11) {
                            w51Var.f39941y = f11;
                            w51Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (oz0Var.f48570c) {
                        oz0Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
                    }
                    secretMediaViewer.P.setAlpha(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f48839b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(cn.f44367kd);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.q1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((org.telegram.messenger.ej) obj).d);
            case 4:
                return Float.valueOf(((yv0) obj).S);
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 6:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((oz0) obj).f48568a);
        }
    }
}
