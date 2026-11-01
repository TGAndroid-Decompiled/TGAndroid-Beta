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
public final class e00 extends hg.c {
    public final Context d;
    public final h00 e;

    public e00(h00 h00Var, Context context) {
        this.e = h00Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
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
        zz zzVar = (zz) this.e.P.get(i10);
        if (zzVar == null) {
            return 3;
        }
        return zzVar.f7681a;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        String L0;
        String L02;
        int i11;
        int i12;
        int i13;
        h00 h00Var = this.e;
        ArrayList arrayList = h00Var.P;
        zz zzVar = (zz) arrayList.get(i10);
        if (zzVar != null) {
            int i14 = i10 + 1;
            boolean z11 = false;
            if (i14 < arrayList.size() && (i13 = ((zz) arrayList.get(i14)).f7681a) != 3 && i13 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i15 = c1Var.f47912f;
            View view = c1Var.f47909a;
            if (i15 != 0) {
                if (i15 != 1) {
                    int i16 = -1;
                    if (i15 != 4) {
                        switch (i15) {
                            case 6:
                                ((org.telegram.ui.Cells.b9) view).setText(zzVar.d);
                                return;
                            case 7:
                                ((b00) view).e(zzVar.f44263m, z10);
                                return;
                            case 8:
                                rz rzVar = (rz) view;
                                if (rzVar.f41176c != z10) {
                                    rzVar.f41176c = z10;
                                    rzVar.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                xz xzVar = (xz) view;
                                h00Var.I = xzVar;
                                xzVar.e(org.telegram.ui.Components.o5.cloneSpans(h00Var.f37609x, -1, xzVar.f43485s.getPaint().getFontMetricsInt(), 0.5f), false);
                                xz xzVar2 = h00Var.I;
                                if (h00Var.getUserConfig().q()) {
                                    i16 = h00Var.E;
                                }
                                xzVar2.d(i16, false);
                                h00Var.I.setText(org.telegram.messenger.dd.L0(2131750623, null));
                                return;
                            case 10:
                                on0 on0Var = (on0) view;
                                on0Var.setCloseAsLock(!h00Var.getUserConfig().q());
                                if (h00Var.getUserConfig().q()) {
                                    i16 = h00Var.E;
                                }
                                on0Var.a(i16, false);
                                on0Var.setOnColorClick(new org.telegram.ui.Components.vg(18, this, on0Var));
                                return;
                            case 11:
                                yz yzVar = (yz) view;
                                h00Var.J = yzVar;
                                yzVar.setText(zzVar.d);
                                org.telegram.ui.Cells.y3 y3Var = yzVar.f43755r;
                                y3Var.setText(zzVar.e);
                                y3Var.setOnClickListener(zzVar.f44256c);
                                return;
                            default:
                                return;
                        }
                    }
                    pz pzVar = (pz) view;
                    boolean z12 = zzVar.f44262l;
                    ImageView imageView = pzVar.f40639a;
                    TextView textView = pzVar.f40640b;
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.t6.f21171q7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.t6.f21135o6;
                    }
                    org.telegram.ui.ActionBar.a7.t(imageView, i11, null, PorterDuff.Mode.MULTIPLY);
                    if (z12) {
                        i12 = org.telegram.ui.ActionBar.t6.f21154p7;
                    } else {
                        i12 = org.telegram.ui.ActionBar.t6.q6;
                    }
                    org.telegram.ui.ActionBar.a7.V(textView, i12, null);
                    int i17 = zzVar.f44261k;
                    CharSequence charSequence = zzVar.d;
                    ImageView imageView2 = pzVar.f40639a;
                    if (!org.telegram.messenger.dd.X) {
                        i16 = 1;
                    }
                    if (i17 == 0) {
                        imageView2.setVisibility(8);
                    } else {
                        imageView2.setVisibility(0);
                        imageView2.setImageResource(i17);
                    }
                    float f7 = 72.0f;
                    if (org.telegram.messenger.dd.X) {
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
                    Boolean bool = pzVar.e;
                    if (bool == null || bool.booleanValue() != z11) {
                        pzVar.e = Boolean.valueOf(z11);
                        float f10 = 0.0f;
                        if (pzVar.f40641c == i17) {
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
                    pzVar.d = z10;
                    pzVar.setWillNotDraw(!z10);
                    pzVar.f40641c = i17;
                    return;
                }
                org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                String str = zzVar.f44259i;
                if (str != null) {
                    paVar.d(str, zzVar.d, null, z10);
                    return;
                }
                long j10 = zzVar.h;
                if (j10 > 0) {
                    TLRPC.User Z1 = h00Var.getMessagesController().Z1(Long.valueOf(j10));
                    if (Z1 != null) {
                        if (Z1.bot) {
                            L02 = org.telegram.messenger.dd.L0(2131753156, null);
                        } else if (Z1.contact) {
                            L02 = org.telegram.messenger.dd.L0(2131750793, null);
                        } else {
                            L02 = org.telegram.messenger.dd.L0(2131750722, null);
                        }
                        paVar.d(Z1, null, L02, z10);
                        return;
                    }
                    return;
                }
                TLRPC.Chat L03 = h00Var.getMessagesController().L0(Long.valueOf(-j10));
                if (L03 != null) {
                    if (org.telegram.messenger.w3.Y(L03)) {
                        L0 = org.telegram.messenger.dd.L0(2131751990, null);
                    } else if (L03.participants_count != 0) {
                        if (org.telegram.messenger.w3.V(L03)) {
                            L0 = org.telegram.messenger.dd.H(',', "Subscribers", L03.participants_count);
                        } else {
                            L0 = org.telegram.messenger.dd.H(',', "Members", L03.participants_count);
                        }
                    } else if (!org.telegram.messenger.w3.t0(L03)) {
                        if (org.telegram.messenger.w3.T(L03) && !L03.megagroup) {
                            L0 = org.telegram.messenger.dd.L0(2131752329, null);
                        } else {
                            L0 = org.telegram.messenger.dd.L0(2131748656, null);
                        }
                    } else if (org.telegram.messenger.w3.T(L03) && !L03.megagroup) {
                        L0 = org.telegram.messenger.dd.L0(2131752318, null);
                    } else {
                        L0 = org.telegram.messenger.dd.L0(2131748653, null);
                    }
                    paVar.d(L03, null, L0, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
            if (zzVar.f44257f) {
                p4Var.setText(h00.E0(0, zzVar.d, false));
            } else {
                p4Var.setText(zzVar.d);
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
        h00 h00Var = this.e;
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
                String L0 = org.telegram.messenger.dd.L0(2131750733, null);
                p6Var = ((org.telegram.ui.ActionBar.k2) h00Var).resourceProvider;
                ?? j3Var = new org.telegram.ui.Cells.j3(this.d, (org.telegram.ui.Components.vu0) h00Var.fragmentView, L0, false, 12, p6Var);
                h00Var.K = j3Var;
                j3Var.f22070r = false;
                j3Var.f22071s = true;
                org.telegram.ui.Cells.h3 h3Var = j3Var.f22066b;
                h3Var.getEditText().setEmojiColor(Integer.valueOf(h00Var.getThemedColor(org.telegram.ui.ActionBar.t6.Ci)));
                h3Var.setEmojiViewCacheType(25);
                h3Var.setText(h00Var.f37609x);
                i11 = ((org.telegram.ui.ActionBar.k2) h00Var).currentAccount;
                org.telegram.ui.Components.f5.r(i11, h00Var.f37610y);
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
                frameLayout.f40639a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i16 = 3;
                if (org.telegram.messenger.dd.X) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout.addView(imageView, w7.b6.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f40640b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = org.telegram.messenger.dd.X;
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
                if (org.telegram.messenger.dd.X) {
                    i16 = 5;
                }
                textView.setGravity(i16);
                boolean z11 = org.telegram.messenger.dd.X;
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
                l0Var.f39040b = imageView2;
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
                i14 = ((org.telegram.ui.ActionBar.k2) h00Var).currentAccount;
                paVar = new d00(this, this.d, h00Var, i14, h00Var.f37606r.f15000a);
                break;
            case 8:
                paVar = new rz(context);
                break;
            case 9:
                paVar = new xz(h00Var, context);
                break;
            case 10:
                Activity parentActivity = h00Var.getParentActivity();
                i15 = ((org.telegram.ui.ActionBar.k2) h00Var).currentAccount;
                p6Var2 = ((org.telegram.ui.ActionBar.k2) h00Var).resourceProvider;
                paVar = new on0(2, i15, parentActivity, p6Var2);
                break;
            case 11:
                p6Var3 = ((org.telegram.ui.ActionBar.k2) h00Var).resourceProvider;
                paVar = new yz(context, p6Var3);
                break;
        }
        return new s4.c1(paVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
        if (i10 != 2 && i10 == 9) {
            h00 h00Var = this.e;
            ((xz) c1Var.f47909a).e(org.telegram.ui.Components.o5.cloneSpans(h00Var.f37609x, -1, h00Var.I.f43485s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        if (c1Var.f47912f == 2) {
            org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) c1Var.f47909a;
            j3Var.f22066b.k(true);
            j3Var.f22066b.d();
        }
    }
}
