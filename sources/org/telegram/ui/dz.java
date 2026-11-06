package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dz extends rg.b {
    public final Context d;
    public final gz f45163e;

    public dz(gz gzVar, Context context) {
        this.f45163e = gzVar;
        this.d = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f56955f;
        if (i7 != 3 && i7 != 0 && i7 != 2 && i7 != 5 && i7 != 9 && i7 != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f45163e.P.size();
    }

    @Override
    public final int d(int i7) {
        yy yyVar = (yy) this.f45163e.P.get(i7);
        if (yyVar == null) {
            return 3;
        }
        return yyVar.f54439a;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        String M0;
        String M02;
        int i10;
        int i11;
        int i12;
        gz gzVar = this.f45163e;
        ArrayList arrayList = gzVar.P;
        yy yyVar = (yy) arrayList.get(i7);
        if (yyVar != null) {
            int i13 = i7 + 1;
            boolean z10 = false;
            if (i13 < arrayList.size() && (i12 = ((yy) arrayList.get(i13)).f54439a) != 3 && i12 != 6) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i14 = d1Var.f56955f;
            View view = d1Var.f56951a;
            if (i14 != 0) {
                if (i14 != 1) {
                    int i15 = -1;
                    if (i14 != 4) {
                        switch (i14) {
                            case 6:
                                ((org.telegram.ui.Cells.z8) view).setText(yyVar.d);
                                return;
                            case 7:
                                ((az) view).e(yyVar.f52375m, z9);
                                return;
                            case 8:
                                ry ryVar = (ry) view;
                                if (ryVar.f49586c != z9) {
                                    ryVar.f49586c = z9;
                                    ryVar.setWillNotDraw(!z9);
                                    return;
                                }
                                return;
                            case 9:
                                wy wyVar = (wy) view;
                                gzVar.I = wyVar;
                                wyVar.e(org.telegram.ui.Components.r5.cloneSpans(gzVar.f46168x, -1, wyVar.f51673s.getPaint().getFontMetricsInt(), 0.5f), false);
                                wy wyVar2 = gzVar.I;
                                if (gzVar.getUserConfig().q()) {
                                    i15 = gzVar.E;
                                }
                                wyVar2.d(i15, false);
                                gzVar.I.setText(org.telegram.messenger.hd.M0(2131750623, null));
                                return;
                            case 10:
                                em0 em0Var = (em0) view;
                                em0Var.setCloseAsLock(!gzVar.getUserConfig().q());
                                if (gzVar.getUserConfig().q()) {
                                    i15 = gzVar.E;
                                }
                                em0Var.a(i15, false);
                                em0Var.setOnColorClick(new org.telegram.ui.Components.ex(11, this, em0Var));
                                return;
                            case 11:
                                xy xyVar = (xy) view;
                                gzVar.J = xyVar;
                                xyVar.setText(yyVar.d);
                                org.telegram.ui.Cells.w3 w3Var = xyVar.f52014r;
                                w3Var.setText(yyVar.f52368e);
                                w3Var.setOnClickListener(yyVar.f52367c);
                                return;
                            default:
                                return;
                        }
                    }
                    py pyVar = (py) view;
                    boolean z11 = yyVar.f52374l;
                    ImageView imageView = pyVar.f48972a;
                    TextView textView = pyVar.f48973b;
                    if (z11) {
                        i10 = org.telegram.ui.ActionBar.k6.f28090q7;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f28049o6;
                    }
                    org.telegram.ui.ActionBar.r6.t(imageView, i10, null, PorterDuff.Mode.MULTIPLY);
                    if (z11) {
                        i11 = org.telegram.ui.ActionBar.k6.f28070p7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.k6.f28089q6;
                    }
                    org.telegram.ui.ActionBar.r6.V(textView, i11, null);
                    int i16 = yyVar.f52373k;
                    CharSequence charSequence = yyVar.d;
                    ImageView imageView2 = pyVar.f48972a;
                    if (!org.telegram.messenger.hd.f22878a0) {
                        i15 = 1;
                    }
                    if (i16 == 0) {
                        imageView2.setVisibility(8);
                    } else {
                        imageView2.setVisibility(0);
                        imageView2.setImageResource(i16);
                    }
                    float f10 = 72.0f;
                    if (org.telegram.messenger.hd.f22878a0) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i16 == 0) {
                            f10 = 24.0f;
                        }
                        marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i16 == 0) {
                            f10 = 24.0f;
                        }
                        marginLayoutParams2.leftMargin = org.telegram.messenger.g0.L(f10);
                    }
                    textView.setText(charSequence);
                    if (!z9 && i16 != 0) {
                        z10 = true;
                    }
                    Boolean bool = pyVar.f48975e;
                    if (bool == null || bool.booleanValue() != z10) {
                        pyVar.f48975e = Boolean.valueOf(z10);
                        float f11 = 0.0f;
                        if (pyVar.f48974c == i16) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z10) {
                                f11 = org.telegram.messenger.g0.L(i15 * (-7));
                            }
                            animate.translationX(f11).setDuration(180L).setInterpolator(org.telegram.ui.Components.xq.h).start();
                        } else {
                            if (z10) {
                                f11 = org.telegram.messenger.g0.L(i15 * (-7));
                            }
                            textView.setTranslationX(f11);
                        }
                    }
                    pyVar.d = z9;
                    pyVar.setWillNotDraw(!z9);
                    pyVar.f48974c = i16;
                    return;
                }
                org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                String str = yyVar.f52371i;
                if (str != null) {
                    paVar.d(str, yyVar.d, null, z9);
                    return;
                }
                long j3 = yyVar.h;
                if (j3 > 0) {
                    TLRPC.User a22 = gzVar.getMessagesController().a2(Long.valueOf(j3));
                    if (a22 != null) {
                        if (a22.bot) {
                            M02 = org.telegram.messenger.hd.M0(2131753156, null);
                        } else if (a22.contact) {
                            M02 = org.telegram.messenger.hd.M0(2131750793, null);
                        } else {
                            M02 = org.telegram.messenger.hd.M0(2131750722, null);
                        }
                        paVar.d(a22, null, M02, z9);
                        return;
                    }
                    return;
                }
                TLRPC.Chat M03 = gzVar.getMessagesController().M0(Long.valueOf(-j3));
                if (M03 != null) {
                    if (org.telegram.messenger.t3.Y(M03)) {
                        M0 = org.telegram.messenger.hd.M0(2131751990, null);
                    } else if (M03.participants_count != 0) {
                        if (org.telegram.messenger.t3.V(M03)) {
                            M0 = org.telegram.messenger.hd.H(',', "Subscribers", M03.participants_count);
                        } else {
                            M0 = org.telegram.messenger.hd.H(',', "Members", M03.participants_count);
                        }
                    } else if (!org.telegram.messenger.t3.t0(M03)) {
                        if (org.telegram.messenger.t3.T(M03) && !M03.megagroup) {
                            M0 = org.telegram.messenger.hd.M0(2131752329, null);
                        } else {
                            M0 = org.telegram.messenger.hd.M0(2131748640, null);
                        }
                    } else if (org.telegram.messenger.t3.T(M03) && !M03.megagroup) {
                        M0 = org.telegram.messenger.hd.M0(2131752318, null);
                    } else {
                        M0 = org.telegram.messenger.hd.M0(2131748637, null);
                    }
                    paVar.d(M03, null, M0, z9);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (yyVar.f52369f) {
                n4Var.setText(gz.E0(0, yyVar.d, false));
            } else {
                n4Var.setText(yyVar.d);
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.pa paVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        Context context = this.d;
        gz gzVar = this.f45163e;
        switch (i7) {
            case 0:
                paVar = new org.telegram.ui.Cells.n4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.pa paVar2 = new org.telegram.ui.Cells.pa(context, 6, 0, false);
                paVar2.setSelfAsSavedMessages(true);
                paVar = paVar2;
                break;
            case 2:
                String M0 = org.telegram.messenger.hd.M0(2131750733, null);
                f6Var = ((org.telegram.ui.ActionBar.f2) gzVar).resourceProvider;
                ?? h3Var = new org.telegram.ui.Cells.h3(this.d, (org.telegram.ui.Components.rt0) gzVar.fragmentView, M0, false, 12, f6Var);
                gzVar.K = h3Var;
                h3Var.f29254r = false;
                h3Var.f29255s = true;
                org.telegram.ui.Cells.f3 f3Var = h3Var.f29249b;
                f3Var.getEditText().setEmojiColor(Integer.valueOf(gzVar.getThemedColor(org.telegram.ui.ActionBar.k6.Ci)));
                f3Var.setEmojiViewCacheType(25);
                f3Var.setText(gzVar.f46168x);
                i10 = ((org.telegram.ui.ActionBar.f2) gzVar).currentAccount;
                org.telegram.ui.Components.i5.r(i10, gzVar.f46169y);
                org.telegram.ui.Components.ys editText = f3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.j3());
                editText.addTextChangedListener(new m0(this, 7));
                editText.setPadding(org.telegram.messenger.g0.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                f3Var.getEditText().setImeOptions(268435462);
                paVar = h3Var;
                break;
            case 3:
                paVar = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.f48975e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f48972a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i15 = 3;
                if (org.telegram.messenger.hd.f22878a0) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                frameLayout.addView(imageView, c8.ha.d(24, 24.0f, i11 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f48973b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z9 = org.telegram.messenger.hd.f22878a0;
                int i16 = 24;
                if (z9) {
                    i12 = 24;
                } else {
                    i12 = 0;
                }
                if (z9) {
                    i16 = 0;
                }
                textView.setPadding(i12, 0, i16, 0);
                if (org.telegram.messenger.hd.f22878a0) {
                    i15 = 5;
                }
                textView.setGravity(i15);
                boolean z10 = org.telegram.messenger.hd.f22878a0;
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 72.0f;
                }
                if (z10) {
                    f11 = 72.0f;
                } else {
                    f11 = 0.0f;
                }
                frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
                paVar = frameLayout;
                break;
            case 5:
                k0 k0Var = new k0(context, 8);
                ?? imageView2 = new ImageView(context);
                k0Var.f47070b = imageView2;
                imageView2.f(2131624015, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                k0Var.addView((View) imageView2, c8.ha.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(k0Var, 23));
                paVar = k0Var;
                break;
            case 6:
            default:
                paVar = new org.telegram.ui.Cells.z8(context);
                break;
            case 7:
                i13 = ((org.telegram.ui.ActionBar.f2) gzVar).currentAccount;
                paVar = new cz(this, this.d, gzVar, i13, gzVar.f46165r.f26064a);
                break;
            case 8:
                paVar = new ry(context);
                break;
            case 9:
                paVar = new wy(gzVar, context);
                break;
            case 10:
                Activity parentActivity = gzVar.getParentActivity();
                i14 = ((org.telegram.ui.ActionBar.f2) gzVar).currentAccount;
                f6Var2 = ((org.telegram.ui.ActionBar.f2) gzVar).resourceProvider;
                paVar = new em0(2, i14, parentActivity, f6Var2);
                break;
            case 11:
                f6Var3 = ((org.telegram.ui.ActionBar.f2) gzVar).resourceProvider;
                paVar = new xy(context, f6Var3);
                break;
        }
        return new v4.d1(paVar);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        int i7 = d1Var.f56955f;
        if (i7 != 2 && i7 == 9) {
            gz gzVar = this.f45163e;
            ((wy) d1Var.f56951a).e(org.telegram.ui.Components.r5.cloneSpans(gzVar.f46168x, -1, gzVar.I.f51673s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(v4.d1 d1Var) {
        if (d1Var.f56955f == 2) {
            org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) d1Var.f56951a;
            h3Var.f29249b.k(true);
            h3Var.f29249b.d();
        }
    }
}
