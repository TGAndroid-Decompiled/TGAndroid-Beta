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
public final class ez extends rg.b {
    public final Context d;
    public final hz f46926e;

    public ez(hz hzVar, Context context) {
        this.f46926e = hzVar;
        this.d = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 3 && i7 != 0 && i7 != 2 && i7 != 5 && i7 != 9 && i7 != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f46926e.Q.size();
    }

    @Override
    public final int d(int i7) {
        zy zyVar = (zy) this.f46926e.Q.get(i7);
        if (zyVar == null) {
            return 3;
        }
        return zyVar.f56015a;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        String M0;
        String M02;
        int i10;
        int i11;
        int i12;
        hz hzVar = this.f46926e;
        ArrayList arrayList = hzVar.Q;
        zy zyVar = (zy) arrayList.get(i7);
        if (zyVar != null) {
            int i13 = i7 + 1;
            boolean z11 = false;
            if (i13 < arrayList.size() && (i12 = ((zy) arrayList.get(i13)).f56015a) != 3 && i12 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i14 = e1Var.f58539f;
            View view = e1Var.f58535a;
            if (i14 != 0) {
                if (i14 != 1) {
                    int i15 = -1;
                    if (i14 != 4) {
                        switch (i14) {
                            case 6:
                                ((org.telegram.ui.Cells.y8) view).setText(zyVar.d);
                                return;
                            case 7:
                                ((bz) view).e(zyVar.f54068m, z10);
                                return;
                            case 8:
                                sy syVar = (sy) view;
                                if (syVar.f51302c != z10) {
                                    syVar.f51302c = z10;
                                    syVar.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                xy xyVar = (xy) view;
                                hzVar.J = xyVar;
                                xyVar.e(org.telegram.ui.Components.p5.cloneSpans(hzVar.f47852x, -1, xyVar.f53351s.getPaint().getFontMetricsInt(), 0.5f), false);
                                xy xyVar2 = hzVar.J;
                                if (hzVar.getUserConfig().q()) {
                                    i15 = hzVar.F;
                                }
                                xyVar2.d(i15, false);
                                hzVar.J.setText(org.telegram.messenger.hd.M0(2131750622, null));
                                return;
                            case 10:
                                gm0 gm0Var = (gm0) view;
                                gm0Var.setCloseAsLock(!hzVar.getUserConfig().q());
                                if (hzVar.getUserConfig().q()) {
                                    i15 = hzVar.F;
                                }
                                gm0Var.a(i15, false);
                                gm0Var.setOnColorClick(new org.telegram.ui.Components.gh(16, this, gm0Var));
                                return;
                            case 11:
                                yy yyVar = (yy) view;
                                hzVar.K = yyVar;
                                yyVar.setText(zyVar.d);
                                org.telegram.ui.Cells.w3 w3Var = yyVar.f53748r;
                                w3Var.setText(zyVar.f54061e);
                                w3Var.setOnClickListener(zyVar.f54060c);
                                return;
                            default:
                                return;
                        }
                    }
                    qy qyVar = (qy) view;
                    boolean z12 = zyVar.f54067l;
                    ImageView imageView = qyVar.f50803a;
                    TextView textView = qyVar.f50804b;
                    if (z12) {
                        i10 = org.telegram.ui.ActionBar.j6.f29090q7;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f29049o6;
                    }
                    org.telegram.ui.ActionBar.q6.s(imageView, i10, null, PorterDuff.Mode.MULTIPLY);
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.j6.f29070p7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.j6.f29089q6;
                    }
                    org.telegram.ui.ActionBar.q6.U(textView, i11, null);
                    int i16 = zyVar.f54066k;
                    CharSequence charSequence = zyVar.d;
                    ImageView imageView2 = qyVar.f50803a;
                    if (!org.telegram.messenger.hd.f24104a0) {
                        i15 = 1;
                    }
                    if (i16 == 0) {
                        imageView2.setVisibility(8);
                    } else {
                        imageView2.setVisibility(0);
                        imageView2.setImageResource(i16);
                    }
                    float f10 = 72.0f;
                    if (org.telegram.messenger.hd.f24104a0) {
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
                    if (!z10 && i16 != 0) {
                        z11 = true;
                    }
                    Boolean bool = qyVar.f50806e;
                    if (bool == null || bool.booleanValue() != z11) {
                        qyVar.f50806e = Boolean.valueOf(z11);
                        float f11 = 0.0f;
                        if (qyVar.f50805c == i16) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z11) {
                                f11 = org.telegram.messenger.g0.L(i15 * (-7));
                            }
                            animate.translationX(f11).setDuration(180L).setInterpolator(org.telegram.ui.Components.er.h).start();
                        } else {
                            if (z11) {
                                f11 = org.telegram.messenger.g0.L(i15 * (-7));
                            }
                            textView.setTranslationX(f11);
                        }
                    }
                    qyVar.d = z10;
                    qyVar.setWillNotDraw(!z10);
                    qyVar.f50805c = i16;
                    return;
                }
                org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                String str = zyVar.f54064i;
                if (str != null) {
                    paVar.d(str, zyVar.d, null, z10);
                    return;
                }
                long j3 = zyVar.h;
                if (j3 > 0) {
                    TLRPC.User a22 = hzVar.getMessagesController().a2(Long.valueOf(j3));
                    if (a22 != null) {
                        if (a22.bot) {
                            M02 = org.telegram.messenger.hd.M0(2131753156, null);
                        } else if (a22.contact) {
                            M02 = org.telegram.messenger.hd.M0(2131750792, null);
                        } else {
                            M02 = org.telegram.messenger.hd.M0(2131750721, null);
                        }
                        paVar.d(a22, null, M02, z10);
                        return;
                    }
                    return;
                }
                TLRPC.Chat M03 = hzVar.getMessagesController().M0(Long.valueOf(-j3));
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
                            M0 = org.telegram.messenger.hd.M0(2131748641, null);
                        }
                    } else if (org.telegram.messenger.t3.T(M03) && !M03.megagroup) {
                        M0 = org.telegram.messenger.hd.M0(2131752318, null);
                    } else {
                        M0 = org.telegram.messenger.hd.M0(2131748638, null);
                    }
                    paVar.d(M03, null, M0, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (zyVar.f54062f) {
                n4Var.setText(hz.E0(0, zyVar.d, false));
            } else {
                n4Var.setText(zyVar.d);
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.pa paVar;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        Context context = this.d;
        hz hzVar = this.f46926e;
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
                String M0 = org.telegram.messenger.hd.M0(2131750732, null);
                e6Var = ((org.telegram.ui.ActionBar.e2) hzVar).resourceProvider;
                ?? h3Var = new org.telegram.ui.Cells.h3(this.d, (org.telegram.ui.Components.st0) hzVar.fragmentView, M0, false, 12, e6Var);
                hzVar.L = h3Var;
                h3Var.f30380r = false;
                h3Var.f30381s = true;
                org.telegram.ui.Cells.f3 f3Var = h3Var.f30375b;
                f3Var.getEditText().setEmojiColor(Integer.valueOf(hzVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi)));
                f3Var.setEmojiViewCacheType(25);
                f3Var.setText(hzVar.f47852x);
                i10 = ((org.telegram.ui.ActionBar.e2) hzVar).currentAccount;
                org.telegram.ui.Components.g5.r(i10, hzVar.f47853y);
                org.telegram.ui.Components.ft editText = f3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.j3());
                editText.addTextChangedListener(new m0(this, 7));
                editText.setPadding(org.telegram.messenger.g0.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                f3Var.getEditText().setImeOptions(268435462);
                paVar = h3Var;
                break;
            case 3:
                paVar = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.f50806e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f50803a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i15 = 3;
                if (org.telegram.messenger.hd.f24104a0) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                frameLayout.addView(imageView, c8.ja.d(24, 24.0f, i11 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f50804b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = org.telegram.messenger.hd.f24104a0;
                int i16 = 24;
                if (z10) {
                    i12 = 24;
                } else {
                    i12 = 0;
                }
                if (z10) {
                    i16 = 0;
                }
                textView.setPadding(i12, 0, i16, 0);
                if (org.telegram.messenger.hd.f24104a0) {
                    i15 = 5;
                }
                textView.setGravity(i15);
                boolean z11 = org.telegram.messenger.hd.f24104a0;
                if (z11) {
                    f10 = 0.0f;
                } else {
                    f10 = 72.0f;
                }
                if (z11) {
                    f11 = 72.0f;
                } else {
                    f11 = 0.0f;
                }
                frameLayout.addView(textView, c8.ja.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
                paVar = frameLayout;
                break;
            case 5:
                k0 k0Var = new k0(context, 8);
                ?? imageView2 = new ImageView(context);
                k0Var.f48488b = imageView2;
                imageView2.f(2131624016, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                k0Var.addView((View) imageView2, c8.ja.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(k0Var, 23));
                paVar = k0Var;
                break;
            case 6:
            default:
                paVar = new org.telegram.ui.Cells.y8(context);
                break;
            case 7:
                i13 = ((org.telegram.ui.ActionBar.e2) hzVar).currentAccount;
                paVar = new dz(this, this.d, hzVar, i13, hzVar.f47849r.f26552a);
                break;
            case 8:
                paVar = new sy(context);
                break;
            case 9:
                paVar = new xy(hzVar, context);
                break;
            case 10:
                Activity parentActivity = hzVar.getParentActivity();
                i14 = ((org.telegram.ui.ActionBar.e2) hzVar).currentAccount;
                e6Var2 = ((org.telegram.ui.ActionBar.e2) hzVar).resourceProvider;
                paVar = new gm0(2, i14, parentActivity, e6Var2);
                break;
            case 11:
                e6Var3 = ((org.telegram.ui.ActionBar.e2) hzVar).resourceProvider;
                paVar = new yy(context, e6Var3);
                break;
        }
        return new v4.e1(paVar);
    }

    @Override
    public final void y(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 2 && i7 == 9) {
            hz hzVar = this.f46926e;
            ((xy) e1Var.f58535a).e(org.telegram.ui.Components.p5.cloneSpans(hzVar.f47852x, -1, hzVar.J.f53351s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(v4.e1 e1Var) {
        if (e1Var.f58539f == 2) {
            org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) e1Var.f58535a;
            h3Var.f30375b.k(true);
            h3Var.f30375b.d();
        }
    }
}
