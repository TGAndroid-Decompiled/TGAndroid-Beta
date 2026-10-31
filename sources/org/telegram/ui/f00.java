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
public final class f00 extends hg.c {
    public final Context d;
    public final i00 e;

    public f00(i00 i00Var, Context context) {
        this.e = i00Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 != 3 && i10 != 0 && i10 != 2 && i10 != 5 && i10 != 9 && i10 != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.e.P.size();
    }

    @Override
    public final int d(int i10) {
        a00 a00Var = (a00) this.e.P.get(i10);
        if (a00Var == null) {
            return 3;
        }
        return a00Var.f7680a;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        String L0;
        String L02;
        int i11;
        int i12;
        int i13;
        i00 i00Var = this.e;
        ArrayList arrayList = i00Var.P;
        a00 a00Var = (a00) arrayList.get(i10);
        if (a00Var != null) {
            int i14 = i10 + 1;
            boolean z11 = false;
            if (i14 < arrayList.size() && (i13 = ((a00) arrayList.get(i14)).f7680a) != 3 && i13 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = c1Var.f47901f;
            View view = c1Var.f47898a;
            if (i15 != 0) {
                if (i15 != 1) {
                    int i16 = -1;
                    if (i15 != 4) {
                        switch (i15) {
                            case 6:
                                ((org.telegram.ui.Cells.b9) view).setText(a00Var.d);
                                return;
                            case 7:
                                ((c00) view).e(a00Var.f35502m, z10);
                                return;
                            case 8:
                                sz szVar = (sz) view;
                                if (szVar.f41671c != z10) {
                                    szVar.f41671c = z10;
                                    szVar.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                yz yzVar = (yz) view;
                                i00Var.I = yzVar;
                                yzVar.e(org.telegram.ui.Components.o5.cloneSpans(i00Var.f38074x, -1, yzVar.f43919s.getPaint().getFontMetricsInt(), 0.5f), false);
                                yz yzVar2 = i00Var.I;
                                if (i00Var.getUserConfig().q()) {
                                    i16 = i00Var.E;
                                }
                                yzVar2.d(i16, false);
                                i00Var.I.setText(org.telegram.messenger.cd.L0(2131750623, null));
                                return;
                            case 10:
                                qn0 qn0Var = (qn0) view;
                                qn0Var.setCloseAsLock(!i00Var.getUserConfig().q());
                                if (i00Var.getUserConfig().q()) {
                                    i16 = i00Var.E;
                                }
                                qn0Var.a(i16, false);
                                qn0Var.setOnColorClick(new org.telegram.ui.Components.vg(17, this, qn0Var));
                                return;
                            case 11:
                                zz zzVar = (zz) view;
                                i00Var.J = zzVar;
                                zzVar.setText(a00Var.d);
                                org.telegram.ui.Cells.y3 y3Var = zzVar.f44261r;
                                y3Var.setText(a00Var.e);
                                y3Var.setOnClickListener(a00Var.f35495c);
                                return;
                            default:
                                return;
                        }
                    }
                    qz qzVar = (qz) view;
                    boolean z12 = a00Var.f35501l;
                    ImageView imageView = qzVar.f41092a;
                    TextView textView = qzVar.f41093b;
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.t6.f21170q7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.t6.f21134o6;
                    }
                    org.telegram.ui.ActionBar.a7.t(imageView, i11, null, PorterDuff.Mode.MULTIPLY);
                    if (z12) {
                        i12 = org.telegram.ui.ActionBar.t6.f21153p7;
                    } else {
                        i12 = org.telegram.ui.ActionBar.t6.q6;
                    }
                    org.telegram.ui.ActionBar.a7.V(textView, i12, null);
                    int i17 = a00Var.f35500k;
                    CharSequence charSequence = a00Var.d;
                    ImageView imageView2 = qzVar.f41092a;
                    if (!org.telegram.messenger.cd.X) {
                        i16 = 1;
                    }
                    if (i17 == 0) {
                        imageView2.setVisibility(8);
                    } else {
                        imageView2.setVisibility(0);
                        imageView2.setImageResource(i17);
                    }
                    float f7 = 72.0f;
                    if (org.telegram.messenger.cd.X) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i17 == 0) {
                            f7 = 24.0f;
                        }
                        marginLayoutParams.rightMargin = org.telegram.messenger.i0.L(f7);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                        if (i17 == 0) {
                            f7 = 24.0f;
                        }
                        marginLayoutParams2.leftMargin = org.telegram.messenger.i0.L(f7);
                    }
                    textView.setText(charSequence);
                    if (!z10 && i17 != 0) {
                        z11 = true;
                    }
                    Boolean bool = qzVar.e;
                    if (bool == null || bool.booleanValue() != z11) {
                        qzVar.e = Boolean.valueOf(z11);
                        float f10 = 0.0f;
                        if (qzVar.f41094c == i17) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z11) {
                                f10 = org.telegram.messenger.i0.L(i16 * (-7));
                            }
                            animate.translationX(f10).setDuration(180L).setInterpolator(org.telegram.ui.Components.gr.h).start();
                        } else {
                            if (z11) {
                                f10 = org.telegram.messenger.i0.L(i16 * (-7));
                            }
                            textView.setTranslationX(f10);
                        }
                    }
                    qzVar.d = z10;
                    qzVar.setWillNotDraw(!z10);
                    qzVar.f41094c = i17;
                    return;
                }
                org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                String str = a00Var.f35498i;
                if (str != null) {
                    paVar.d(str, a00Var.d, null, z10);
                    return;
                }
                long j10 = a00Var.h;
                if (j10 > 0) {
                    TLRPC.User Z1 = i00Var.getMessagesController().Z1(Long.valueOf(j10));
                    if (Z1 != null) {
                        if (Z1.bot) {
                            L02 = org.telegram.messenger.cd.L0(2131753156, null);
                        } else if (Z1.contact) {
                            L02 = org.telegram.messenger.cd.L0(2131750793, null);
                        } else {
                            L02 = org.telegram.messenger.cd.L0(2131750722, null);
                        }
                        paVar.d(Z1, null, L02, z10);
                        return;
                    }
                    return;
                }
                TLRPC.Chat L03 = i00Var.getMessagesController().L0(Long.valueOf(-j10));
                if (L03 != null) {
                    if (org.telegram.messenger.w3.Y(L03)) {
                        L0 = org.telegram.messenger.cd.L0(2131751990, null);
                    } else if (L03.participants_count != 0) {
                        if (org.telegram.messenger.w3.V(L03)) {
                            L0 = org.telegram.messenger.cd.H(',', "Subscribers", L03.participants_count);
                        } else {
                            L0 = org.telegram.messenger.cd.H(',', "Members", L03.participants_count);
                        }
                    } else if (!org.telegram.messenger.w3.t0(L03)) {
                        if (org.telegram.messenger.w3.T(L03) && !L03.megagroup) {
                            L0 = org.telegram.messenger.cd.L0(2131752329, null);
                        } else {
                            L0 = org.telegram.messenger.cd.L0(2131748656, null);
                        }
                    } else if (org.telegram.messenger.w3.T(L03) && !L03.megagroup) {
                        L0 = org.telegram.messenger.cd.L0(2131752318, null);
                    } else {
                        L0 = org.telegram.messenger.cd.L0(2131748653, null);
                    }
                    paVar.d(L03, null, L0, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
            if (a00Var.f35496f) {
                p4Var.setText(i00.D0(0, a00Var.d, false));
            } else {
                p4Var.setText(a00Var.d);
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.pa paVar;
        org.telegram.ui.ActionBar.p6 p6Var;
        int i11;
        int i12;
        int i13;
        float f7;
        float f10;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.p6 p6Var2;
        org.telegram.ui.ActionBar.p6 p6Var3;
        Context context = this.d;
        i00 i00Var = this.e;
        switch (i10) {
            case 0:
                paVar = new org.telegram.ui.Cells.p4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.pa paVar2 = new org.telegram.ui.Cells.pa(context, 6, 0, false);
                paVar2.setSelfAsSavedMessages(true);
                paVar = paVar2;
                break;
            case 2:
                String L0 = org.telegram.messenger.cd.L0(2131750733, null);
                p6Var = ((org.telegram.ui.ActionBar.k2) i00Var).resourceProvider;
                ?? j3Var = new org.telegram.ui.Cells.j3(this.d, (org.telegram.ui.Components.uu0) i00Var.fragmentView, L0, false, 12, p6Var);
                i00Var.K = j3Var;
                j3Var.f22069r = false;
                j3Var.f22070s = true;
                org.telegram.ui.Cells.h3 h3Var = j3Var.f22065b;
                h3Var.getEditText().setEmojiColor(Integer.valueOf(i00Var.getThemedColor(org.telegram.ui.ActionBar.t6.Ci)));
                h3Var.setEmojiViewCacheType(25);
                h3Var.setText(i00Var.f38074x);
                i11 = ((org.telegram.ui.ActionBar.k2) i00Var).currentAccount;
                org.telegram.ui.Components.f5.r(i11, i00Var.f38075y);
                org.telegram.ui.Components.mt editText = h3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.l3());
                editText.addTextChangedListener(new n0(this, 7));
                editText.setPadding(org.telegram.messenger.i0.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                h3Var.getEditText().setImeOptions(268435462);
                paVar = j3Var;
                break;
            case 3:
                paVar = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f41092a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i16 = 3;
                if (org.telegram.messenger.cd.X) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout.addView(imageView, w7.b6.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f41093b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = org.telegram.messenger.cd.X;
                int i17 = 24;
                if (z10) {
                    i13 = 24;
                } else {
                    i13 = 0;
                }
                if (z10) {
                    i17 = 0;
                }
                textView.setPadding(i13, 0, i17, 0);
                if (org.telegram.messenger.cd.X) {
                    i16 = 5;
                }
                textView.setGravity(i16);
                boolean z11 = org.telegram.messenger.cd.X;
                if (z11) {
                    f7 = 0.0f;
                } else {
                    f7 = 72.0f;
                }
                if (z11) {
                    f10 = 72.0f;
                } else {
                    f10 = 0.0f;
                }
                frameLayout.addView(textView, w7.b6.d(-1, -2.0f, 23, f7, 0.0f, f10, 0.0f));
                paVar = frameLayout;
                break;
            case 5:
                l0 l0Var = new l0(context, 8);
                ?? imageView2 = new ImageView(context);
                l0Var.f39006b = imageView2;
                imageView2.f(2131624015, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                l0Var.addView((View) imageView2, w7.b6.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(l0Var, 23));
                paVar = l0Var;
                break;
            case 6:
            default:
                paVar = new org.telegram.ui.Cells.b9(context);
                break;
            case 7:
                i14 = ((org.telegram.ui.ActionBar.k2) i00Var).currentAccount;
                paVar = new e00(this, this.d, i00Var, i14, i00Var.f38071r.f14645a);
                break;
            case 8:
                paVar = new sz(context);
                break;
            case 9:
                paVar = new yz(i00Var, context);
                break;
            case 10:
                Activity parentActivity = i00Var.getParentActivity();
                i15 = ((org.telegram.ui.ActionBar.k2) i00Var).currentAccount;
                p6Var2 = ((org.telegram.ui.ActionBar.k2) i00Var).resourceProvider;
                paVar = new qn0(2, i15, parentActivity, p6Var2);
                break;
            case 11:
                p6Var3 = ((org.telegram.ui.ActionBar.k2) i00Var).resourceProvider;
                paVar = new zz(context, p6Var3);
                break;
        }
        return new s4.c1(paVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 != 2 && i10 == 9) {
            i00 i00Var = this.e;
            ((yz) c1Var.f47898a).e(org.telegram.ui.Components.o5.cloneSpans(i00Var.f38074x, -1, i00Var.I.f43919s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        if (c1Var.f47901f == 2) {
            org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) c1Var.f47898a;
            j3Var.f22065b.k(true);
            j3Var.f22065b.d();
        }
    }
}
