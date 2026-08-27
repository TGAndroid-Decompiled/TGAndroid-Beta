package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class g0 implements View.OnTouchListener {

    public final int f38249a;

    public final Object f38250b;

    public g0(Object obj, int i10) {
        this.f38249a = i10;
        this.f38250b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        int i10;
        float f10;
        Runnable runnable;
        switch (this.f38249a) {
            case 0:
                m4 m4Var = (m4) this.f38250b;
                m4Var.getClass();
                if (motionEvent.getActionMasked() != 0 || (n1Var = m4Var.D) == null || !n1Var.isShowing()) {
                    return false;
                }
                view.getHitRect(m4Var.f40355y0);
                if (m4Var.f40355y0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                m4Var.D.d(true);
                return false;
            case 1:
                kt ktVar = (kt) this.f38250b;
                ktVar.getClass();
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 3) {
                    if (ktVar.f39870n) {
                        ktVar.o();
                    } else {
                        ktVar.n();
                    }
                }
                return true;
            case 2:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f38250b;
                if (externalActionActivity.f35472c.getFragmentStack().isEmpty() || motionEvent.getAction() != 1) {
                    return false;
                }
                float x8 = motionEvent.getX();
                float y10 = motionEvent.getY();
                int[] iArr = new int[2];
                externalActionActivity.d.getView().getLocationOnScreen(iArr);
                int i11 = iArr[0];
                int i12 = iArr[1];
                if (externalActionActivity.d.j()) {
                    return false;
                }
                if (x8 > i11 && x8 < externalActionActivity.d.getView().getWidth() + i11 && y10 > i12 && y10 < externalActionActivity.d.getView().getHeight() + i12) {
                    return false;
                }
                if (!externalActionActivity.d.getFragmentStack().isEmpty()) {
                    while (externalActionActivity.d.getFragmentStack().size() - 1 > 0) {
                        ActionBarLayout actionBarLayout = externalActionActivity.d;
                        actionBarLayout.a0((org.telegram.ui.ActionBar.n2) actionBarLayout.getFragmentStack().get(0), false);
                    }
                    externalActionActivity.d.l(true, false);
                }
                return true;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) this.f38250b;
                if (launchActivity.m0.getFragmentStack().isEmpty() || motionEvent.getAction() != 1) {
                    return false;
                }
                float x10 = motionEvent.getX();
                float y11 = motionEvent.getY();
                int[] iArr2 = new int[2];
                launchActivity.f35523n0.getView().getLocationOnScreen(iArr2);
                int i13 = iArr2[0];
                int i14 = iArr2[1];
                if (launchActivity.f35523n0.j()) {
                    return false;
                }
                if (x10 > i13 && x10 < launchActivity.f35523n0.getView().getWidth() + i13 && y11 > i14 && y11 < launchActivity.f35523n0.getView().getHeight() + i14) {
                    return false;
                }
                if (!launchActivity.f35523n0.getFragmentStack().isEmpty()) {
                    while (launchActivity.f35523n0.getFragmentStack().size() - 1 > 0) {
                        ActionBarLayout actionBarLayout2 = launchActivity.f35523n0;
                        actionBarLayout2.a0(actionBarLayout2.getFragmentStack().get(0), false);
                    }
                    launchActivity.f35523n0.l(true, false);
                }
                return true;
            case 4:
                kp0 kp0Var = (kp0) this.f38250b;
                float x11 = motionEvent.getX();
                float y12 = motionEvent.getY();
                int iDp = AndroidUtilities.dp(14.0f);
                if (motionEvent.getAction() == 0) {
                    float f11 = kp0Var.f39824f;
                    float f12 = iDp;
                    float f13 = f11 - f12;
                    if (f13 >= x11 || f11 + f12 <= x11) {
                        float f14 = kp0Var.d;
                        f10 = f13 + f14;
                        if (f10 >= x11 && f11 + f12 + f14 > x11) {
                            float f15 = kp0Var.h;
                            if (f15 - f12 < y12 && f15 + f12 > y12) {
                                kp0Var.f39825n = 2;
                            } else if (f13 >= x11) {
                                if (f10 >= x11) {
                                    if (f11 < x11) {
                                        kp0Var.f39825n = 0;
                                    } else {
                                        kp0Var.f39825n = 0;
                                    }
                                } else if (f11 < x11) {
                                    kp0Var.f39825n = 0;
                                } else {
                                    kp0Var.f39825n = 0;
                                }
                            } else if (f10 >= x11) {
                                if (f11 < x11) {
                                    kp0Var.f39825n = 0;
                                } else {
                                    kp0Var.f39825n = 0;
                                }
                            } else if (f11 < x11) {
                                kp0Var.f39825n = 0;
                            } else {
                                kp0Var.f39825n = 0;
                            }
                        } else if (f13 >= x11 && f11 + f12 > x11) {
                            float f16 = kp0Var.h;
                            float f17 = kp0Var.f39823e;
                            if ((f16 - f12) + f17 < y12 && f16 + f12 + f17 > y12) {
                                kp0Var.f39825n = 3;
                            } else if (f10 >= x11) {
                                if (f11 < x11) {
                                    kp0Var.f39825n = 0;
                                } else {
                                    kp0Var.f39825n = 0;
                                }
                            } else if (f11 < x11) {
                                kp0Var.f39825n = 0;
                            } else {
                                kp0Var.f39825n = 0;
                            }
                        } else if (f10 >= x11 && f11 + f12 + f14 > x11) {
                            float f18 = kp0Var.h;
                            float f19 = kp0Var.f39823e;
                            if ((f18 - f12) + f19 < y12 && f18 + f12 + f19 > y12) {
                                kp0Var.f39825n = 4;
                            } else if (f11 < x11) {
                                kp0Var.f39825n = 0;
                            } else {
                                kp0Var.f39825n = 0;
                            }
                        } else if (f11 < x11 || f11 + f14 <= x11) {
                            kp0Var.f39825n = 0;
                        } else {
                            float f20 = kp0Var.h;
                            if (f20 >= y12 || f20 + kp0Var.f39823e <= y12) {
                                kp0Var.f39825n = 0;
                            } else {
                                kp0Var.f39825n = 5;
                            }
                        }
                    } else {
                        float f21 = kp0Var.h;
                        if (f21 - f12 >= y12 || f21 + f12 <= y12) {
                            float f110 = kp0Var.d;
                            f10 = f13 + f110;
                            if (f10 >= x11) {
                                if (f13 >= x11) {
                                    if (f10 >= x11) {
                                        if (f11 < x11) {
                                            kp0Var.f39825n = 0;
                                        } else {
                                            kp0Var.f39825n = 0;
                                        }
                                    } else if (f11 < x11) {
                                        kp0Var.f39825n = 0;
                                    } else {
                                        kp0Var.f39825n = 0;
                                    }
                                } else if (f10 >= x11) {
                                    if (f11 < x11) {
                                        kp0Var.f39825n = 0;
                                    } else {
                                        kp0Var.f39825n = 0;
                                    }
                                } else if (f11 < x11) {
                                    kp0Var.f39825n = 0;
                                } else {
                                    kp0Var.f39825n = 0;
                                }
                            } else if (f13 >= x11) {
                                if (f10 >= x11) {
                                    if (f11 < x11) {
                                        kp0Var.f39825n = 0;
                                    } else {
                                        kp0Var.f39825n = 0;
                                    }
                                } else if (f11 < x11) {
                                    kp0Var.f39825n = 0;
                                } else {
                                    kp0Var.f39825n = 0;
                                }
                            } else if (f10 >= x11) {
                                if (f11 < x11) {
                                    kp0Var.f39825n = 0;
                                } else {
                                    kp0Var.f39825n = 0;
                                }
                            } else if (f11 < x11) {
                                kp0Var.f39825n = 0;
                            } else {
                                kp0Var.f39825n = 0;
                            }
                        } else {
                            kp0Var.f39825n = 1;
                        }
                    }
                    if (kp0Var.f39825n != 0) {
                        kp0Var.requestDisallowInterceptTouchEvent(true);
                    }
                    kp0Var.f39826r = x11;
                    kp0Var.f39827s = y12;
                } else if (motionEvent.getAction() == 1) {
                    kp0Var.f39825n = 0;
                } else if (motionEvent.getAction() == 2 && (i10 = kp0Var.f39825n) != 0) {
                    float f22 = x11 - kp0Var.f39826r;
                    float f23 = y12 - kp0Var.f39827s;
                    if (i10 == 5) {
                        float f24 = kp0Var.f39824f + f22;
                        kp0Var.f39824f = f24;
                        float f25 = kp0Var.h + f23;
                        kp0Var.h = f25;
                        int i15 = kp0Var.f39829x;
                        float f26 = i15;
                        if (f24 < f26) {
                            kp0Var.f39824f = f26;
                        } else {
                            float f27 = kp0Var.d;
                            float f28 = f24 + f27;
                            float f29 = i15 + kp0Var.v;
                            if (f28 > f29) {
                                kp0Var.f39824f = f29 - f27;
                            }
                        }
                        int i16 = kp0Var.f39830y;
                        float f30 = i16;
                        if (f25 < f30) {
                            kp0Var.h = f30;
                        } else {
                            float f31 = kp0Var.f39823e;
                            float f32 = f25 + f31;
                            float f33 = i16 + kp0Var.f39828w;
                            if (f32 > f33) {
                                kp0Var.h = f33 - f31;
                            }
                        }
                    } else if (i10 == 1) {
                        float f34 = kp0Var.d;
                        if (f34 - f22 < 160.0f) {
                            f22 = f34 - 160.0f;
                        }
                        float f35 = kp0Var.f39824f;
                        float f36 = f35 + f22;
                        float f37 = kp0Var.f39829x;
                        if (f36 < f37) {
                            f22 = f37 - f35;
                        }
                        if (kp0Var.C) {
                            float f38 = kp0Var.f39823e;
                            if (f38 - f23 < 160.0f) {
                                f23 = f38 - 160.0f;
                            }
                            float f39 = kp0Var.h;
                            float f40 = f39 + f23;
                            float f41 = kp0Var.f39830y;
                            if (f40 < f41) {
                                f23 = f41 - f39;
                            }
                            kp0Var.f39824f = f35 + f22;
                            kp0Var.h = f39 + f23;
                            kp0Var.d = f34 - f22;
                            kp0Var.f39823e = f38 - f23;
                        } else {
                            float f42 = kp0Var.h;
                            float f43 = f42 + f22;
                            float f44 = kp0Var.f39830y;
                            if (f43 < f44) {
                                f22 = f44 - f42;
                            }
                            kp0Var.f39824f = f35 + f22;
                            kp0Var.h = f42 + f22;
                            kp0Var.d = f34 - f22;
                            kp0Var.f39823e -= f22;
                        }
                    } else if (i10 == 2) {
                        float f45 = kp0Var.d;
                        if (f45 + f22 < 160.0f) {
                            f22 = -(f45 - 160.0f);
                        }
                        float f46 = kp0Var.f39824f;
                        float f47 = f46 + f45 + f22;
                        float f48 = kp0Var.f39829x + kp0Var.v;
                        if (f47 > f48) {
                            f22 = (f48 - f46) - f45;
                        }
                        if (kp0Var.C) {
                            float f49 = kp0Var.f39823e;
                            if (f49 - f23 < 160.0f) {
                                f23 = f49 - 160.0f;
                            }
                            float f50 = kp0Var.h;
                            float f51 = f50 + f23;
                            float f52 = kp0Var.f39830y;
                            if (f51 < f52) {
                                f23 = f52 - f50;
                            }
                            kp0Var.h = f50 + f23;
                            kp0Var.d = f45 + f22;
                            kp0Var.f39823e = f49 - f23;
                        } else {
                            float f53 = kp0Var.h;
                            float f54 = f53 - f22;
                            float f55 = kp0Var.f39830y;
                            if (f54 < f55) {
                                f22 = f53 - f55;
                            }
                            kp0Var.h = f53 - f22;
                            kp0Var.d = f45 + f22;
                            kp0Var.f39823e += f22;
                        }
                    } else if (i10 == 3) {
                        float f56 = kp0Var.d;
                        if (f56 - f22 < 160.0f) {
                            f22 = f56 - 160.0f;
                        }
                        float f57 = kp0Var.f39824f;
                        float f58 = f57 + f22;
                        float f59 = kp0Var.f39829x;
                        if (f58 < f59) {
                            f22 = f59 - f57;
                        }
                        if (kp0Var.C) {
                            float f60 = kp0Var.h;
                            float f61 = kp0Var.f39823e;
                            float f62 = f60 + f61 + f23;
                            float f63 = kp0Var.f39830y + kp0Var.f39828w;
                            if (f62 > f63) {
                                f23 = (f63 - f60) - f61;
                            }
                            kp0Var.f39824f = f57 + f22;
                            kp0Var.d = f56 - f22;
                            float f64 = f61 + f23;
                            kp0Var.f39823e = f64;
                            if (f64 < 160.0f) {
                                kp0Var.f39823e = 160.0f;
                            }
                        } else {
                            float f65 = kp0Var.h + f56;
                            float f66 = f65 - f22;
                            int i17 = kp0Var.f39830y;
                            int i18 = kp0Var.f39828w;
                            if (f66 > i17 + i18) {
                                f22 = (f65 - i17) - i18;
                            }
                            kp0Var.f39824f = f57 + f22;
                            kp0Var.d = f56 - f22;
                            kp0Var.f39823e -= f22;
                        }
                    } else if (i10 == 4) {
                        float f67 = kp0Var.f39824f;
                        float f68 = kp0Var.d;
                        float f69 = f67 + f68 + f22;
                        float f70 = kp0Var.f39829x + kp0Var.v;
                        if (f69 > f70) {
                            f22 = (f70 - f67) - f68;
                        }
                        if (kp0Var.C) {
                            float f71 = kp0Var.h;
                            float f72 = kp0Var.f39823e;
                            float f73 = f71 + f72 + f23;
                            float f74 = kp0Var.f39830y + kp0Var.f39828w;
                            if (f73 > f74) {
                                f23 = (f74 - f71) - f72;
                            }
                            kp0Var.d = f68 + f22;
                            kp0Var.f39823e = f72 + f23;
                        } else {
                            float f75 = kp0Var.h;
                            float f76 = f75 + f68 + f22;
                            float f77 = kp0Var.f39830y + kp0Var.f39828w;
                            if (f76 > f77) {
                                f22 = (f77 - f75) - f68;
                            }
                            kp0Var.d = f68 + f22;
                            kp0Var.f39823e += f22;
                        }
                        if (kp0Var.d < 160.0f) {
                            kp0Var.d = 160.0f;
                        }
                        if (kp0Var.f39823e < 160.0f) {
                            kp0Var.f39823e = 160.0f;
                        }
                    }
                    kp0Var.f39826r = x11;
                    kp0Var.f39827s = y12;
                    kp0Var.invalidate();
                }
                return true;
            case 5:
                jv0 jv0Var = (jv0) this.f38250b;
                if (jv0Var.P != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) jv0Var.P).getBackgroundDrawable();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(jv0Var.P.getX(), jv0Var.P.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        jv0Var.c(true);
                        return true;
                    }
                }
                return false;
            case 6:
                a61 a61Var = (a61) this.f38250b;
                a61Var.getClass();
                if (motionEvent.getAction() != 0 || (runnable = a61Var.P1) == null) {
                    return false;
                }
                runnable.run();
                return true;
            default:
                dd1 dd1Var = (dd1) this.f38250b;
                if (dd1Var.O != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable2 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) dd1Var.O).getBackgroundDrawable();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(backgroundDrawable2.getBounds());
                    rectF2.offset(dd1Var.O.getX(), dd1Var.O.getY());
                    if (!rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        dd1Var.c(true);
                        return true;
                    }
                }
                return false;
        }
    }
}
