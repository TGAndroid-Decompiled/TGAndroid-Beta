package org.telegram.ui;
public final class q0 extends org.telegram.ui.Components.p6 {
    public final int f51201b;

    public q0(String str, int i7) {
        super(str, 0);
        this.f51201b = i7;
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f51201b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f10);
                return;
            case 1:
                bn.f46108md = (int) f10;
                return;
            case 2:
                ((org.telegram.ui.Cells.r1) obj).setTimeAlpha(f10);
                return;
            case 3:
                ((org.telegram.messenger.bj) obj).d = f10;
                return;
            case 4:
                ((vv0) obj).setCrossfadeProgress(f10);
                return;
            case 5:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f10);
                return;
            case 6:
                ((SecretMediaViewer) obj).setAnimationValue(f10);
                return;
            default:
                mz0 mz0Var = (mz0) obj;
                if (mz0Var.f50156a != f10) {
                    mz0Var.f50156a = f10;
                    SecretMediaViewer secretMediaViewer = mz0Var.f50162r;
                    secretMediaViewer.R.setAlpha(f10);
                    if (mz0Var.f50157b) {
                        org.telegram.ui.ActionBar.n5 n5Var = secretMediaViewer.R;
                        n5Var.setPivotX(n5Var.getWidth());
                        org.telegram.ui.ActionBar.n5 n5Var2 = secretMediaViewer.R;
                        n5Var2.setPivotY(n5Var2.getHeight());
                        float f11 = 1.0f - f10;
                        float f12 = 1.0f - (0.1f * f11);
                        secretMediaViewer.R.setScaleX(f12);
                        secretMediaViewer.R.setScaleY(f12);
                        org.telegram.ui.Components.l61 l61Var = secretMediaViewer.P;
                        if (l61Var.f37070y != f11) {
                            l61Var.f37070y = f11;
                            l61Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (mz0Var.f50158c) {
                        mz0Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
                    }
                    secretMediaViewer.Q.setAlpha(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f51201b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(bn.f46108md);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.r1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((org.telegram.messenger.bj) obj).d);
            case 4:
                return Float.valueOf(((vv0) obj).T);
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 6:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((mz0) obj).f50156a);
        }
    }
}
