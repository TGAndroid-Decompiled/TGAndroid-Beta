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
public final class bz extends sg.b {
    public final Context d;
    public final ez f44167e;

    public bz(ez ezVar, Context context) {
        this.f44167e = ezVar;
        this.d = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 3 && i3 != 0 && i3 != 2 && i3 != 5 && i3 != 9 && i3 != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f44167e.Q.size();
    }

    @Override
    public final int d(int i3) {
        vy vyVar = (vy) this.f44167e.Q.get(i3);
        if (vyVar == null) {
            return 3;
        }
        return vyVar.f54715a;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        String M0;
        String M02;
        int i10;
        int i11;
        int i12;
        ez ezVar = this.f44167e;
        ArrayList arrayList = ezVar.Q;
        vy vyVar = (vy) arrayList.get(i3);
        if (vyVar != null) {
            int i13 = i3 + 1;
            boolean z11 = false;
            if (i13 < arrayList.size() && (i12 = ((vy) arrayList.get(i13)).f54715a) != 3 && i12 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i14 = d1Var.f55544f;
            View view = d1Var.f55540a;
            if (i14 != 0) {
                if (i14 != 1) {
                    int i15 = -1;
                    if (i14 != 4) {
                        switch (i14) {
                            case 6:
                                ((org.telegram.ui.Cells.y8) view).setText(vyVar.d);
                                return;
                            case 7:
                                ((yy) view).e(vyVar.f50640m, z10);
                                return;
                            case 8:
                                oy oyVar = (oy) view;
                                if (oyVar.f48381c != z10) {
                                    oyVar.f48381c = z10;
                                    oyVar.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                ty tyVar = (ty) view;
                                ezVar.J = tyVar;
                                tyVar.e(org.telegram.ui.Components.p5.cloneSpans(ezVar.f45110x, -1, tyVar.f49918s.getPaint().getFontMetricsInt(), 0.5f), false);
                                ty tyVar2 = ezVar.J;
                                if (ezVar.getUserConfig().q()) {
                                    i15 = ezVar.F;
                                }
                                tyVar2.d(i15, false);
                                ezVar.J.setText(org.telegram.messenger.bd.M0(2131750623, null));
                                return;
                            case 10:
                                zl0 zl0Var = (zl0) view;
                                zl0Var.setCloseAsLock(!ezVar.getUserConfig().q());
                                if (ezVar.getUserConfig().q()) {
                                    i15 = ezVar.F;
                                }
                                zl0Var.a(i15, false);
                                zl0Var.setOnColorClick(new org.telegram.ui.Components.ei(14, this, zl0Var));
                                return;
                            case 11:
                                uy uyVar = (uy) view;
                                ezVar.K = uyVar;
                                uyVar.setText(vyVar.d);
                                org.telegram.ui.Cells.w3 w3Var = uyVar.f50349r;
                                w3Var.setText(vyVar.f50633e);
                                w3Var.setOnClickListener(vyVar.f50632c);
                                return;
                            default:
                                return;
                        }
                    }
                    my myVar = (my) view;
                    boolean z12 = vyVar.f50639l;
                    ImageView imageView = myVar.f47821a;
                    TextView textView = myVar.f47822b;
                    if (z12) {
                        i10 = org.telegram.ui.ActionBar.k6.f28122q7;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f28081o6;
                    }
                    org.telegram.ui.ActionBar.r6.t(imageView, i10, null, PorterDuff.Mode.MULTIPLY);
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.k6.f28102p7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.k6.f28121q6;
                    }
                    org.telegram.ui.ActionBar.r6.V(textView, i11, null);
                    int i16 = vyVar.f50638k;
                    CharSequence charSequence = vyVar.d;
                    ImageView imageView2 = myVar.f47821a;
                    if (!org.telegram.messenger.bd.f21784a0) {
                        i15 = 1;
                    }
                    if (i16 == 0) {
                        imageView2.setVisibility(8);
                    } else {
                        imageView2.setVisibility(0);
                        imageView2.setImageResource(i16);
                    }
                    float f10 = 72.0f;
                    if (org.telegram.messenger.bd.f21784a0) {
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
                    Boolean bool = myVar.f47824e;
                    if (bool == null || bool.booleanValue() != z11) {
                        myVar.f47824e = Boolean.valueOf(z11);
                        float f11 = 0.0f;
                        if (myVar.f47823c == i16) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z11) {
                                f11 = org.telegram.messenger.g0.L(i15 * (-7));
                            }
                            animate.translationX(f11).setDuration(180L).setInterpolator(org.telegram.ui.Components.xq.h).start();
                        } else {
                            if (z11) {
                                f11 = org.telegram.messenger.g0.L(i15 * (-7));
                            }
                            textView.setTranslationX(f11);
                        }
                    }
                    myVar.d = z10;
                    myVar.setWillNotDraw(!z10);
                    myVar.f47823c = i16;
                    return;
                }
                org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                String str = vyVar.f50636i;
                if (str != null) {
                    paVar.d(str, vyVar.d, null, z10);
                    return;
                }
                long j10 = vyVar.h;
                if (j10 > 0) {
                    TLRPC.User a22 = ezVar.getMessagesController().a2(Long.valueOf(j10));
                    if (a22 != null) {
                        if (a22.bot) {
                            M02 = org.telegram.messenger.bd.M0(2131753156, null);
                        } else if (a22.contact) {
                            M02 = org.telegram.messenger.bd.M0(2131750793, null);
                        } else {
                            M02 = org.telegram.messenger.bd.M0(2131750722, null);
                        }
                        paVar.d(a22, null, M02, z10);
                        return;
                    }
                    return;
                }
                TLRPC.Chat M03 = ezVar.getMessagesController().M0(Long.valueOf(-j10));
                if (M03 != null) {
                    if (org.telegram.messenger.t3.Y(M03)) {
                        M0 = org.telegram.messenger.bd.M0(2131751990, null);
                    } else if (M03.participants_count != 0) {
                        if (org.telegram.messenger.t3.V(M03)) {
                            M0 = org.telegram.messenger.bd.H(',', "Subscribers", M03.participants_count);
                        } else {
                            M0 = org.telegram.messenger.bd.H(',', "Members", M03.participants_count);
                        }
                    } else if (!org.telegram.messenger.t3.t0(M03)) {
                        if (org.telegram.messenger.t3.T(M03) && !M03.megagroup) {
                            M0 = org.telegram.messenger.bd.M0(2131752329, null);
                        } else {
                            M0 = org.telegram.messenger.bd.M0(2131748649, null);
                        }
                    } else if (org.telegram.messenger.t3.T(M03) && !M03.megagroup) {
                        M0 = org.telegram.messenger.bd.M0(2131752318, null);
                    } else {
                        M0 = org.telegram.messenger.bd.M0(2131748646, null);
                    }
                    paVar.d(M03, null, M0, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (vyVar.f50634f) {
                n4Var.setText(ez.E0(0, vyVar.d, false));
            } else {
                n4Var.setText(vyVar.d);
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
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
        ez ezVar = this.f44167e;
        switch (i3) {
            case 0:
                paVar = new org.telegram.ui.Cells.n4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.pa paVar2 = new org.telegram.ui.Cells.pa(context, 6, 0, false);
                paVar2.setSelfAsSavedMessages(true);
                paVar = paVar2;
                break;
            case 2:
                String M0 = org.telegram.messenger.bd.M0(2131750733, null);
                e6Var = ((org.telegram.ui.ActionBar.d2) ezVar).resourceProvider;
                ?? h3Var = new org.telegram.ui.Cells.h3(this.d, (org.telegram.ui.Components.qt0) ezVar.fragmentView, M0, false, 12, e6Var);
                ezVar.L = h3Var;
                h3Var.f29321r = false;
                h3Var.f29322s = true;
                org.telegram.ui.Cells.f3 f3Var = h3Var.f29316b;
                f3Var.getEditText().setEmojiColor(Integer.valueOf(ezVar.getThemedColor(org.telegram.ui.ActionBar.k6.Ci)));
                f3Var.setEmojiViewCacheType(25);
                f3Var.setText(ezVar.f45110x);
                i10 = ((org.telegram.ui.ActionBar.d2) ezVar).currentAccount;
                org.telegram.ui.Components.g5.r(i10, ezVar.f45111y);
                org.telegram.ui.Components.xs editText = f3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.j3());
                editText.addTextChangedListener(new n0(this, 7));
                editText.setPadding(org.telegram.messenger.g0.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                f3Var.getEditText().setImeOptions(268435462);
                paVar = h3Var;
                break;
            case 3:
                paVar = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.f47824e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f47821a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i15 = 3;
                if (org.telegram.messenger.bd.f21784a0) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                frameLayout.addView(imageView, b8.mf.d(24, 24.0f, i11 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f47822b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = org.telegram.messenger.bd.f21784a0;
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
                if (org.telegram.messenger.bd.f21784a0) {
                    i15 = 5;
                }
                textView.setGravity(i15);
                boolean z11 = org.telegram.messenger.bd.f21784a0;
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
                frameLayout.addView(textView, b8.mf.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
                paVar = frameLayout;
                break;
            case 5:
                l0 l0Var = new l0(context, 8);
                ?? imageView2 = new ImageView(context);
                l0Var.f47060b = imageView2;
                imageView2.f(2131624015, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                l0Var.addView((View) imageView2, b8.mf.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(l0Var, 23));
                paVar = l0Var;
                break;
            case 6:
            default:
                paVar = new org.telegram.ui.Cells.y8(context);
                break;
            case 7:
                i13 = ((org.telegram.ui.ActionBar.d2) ezVar).currentAccount;
                paVar = new az(this, this.d, ezVar, i13, ezVar.f45107r.f24237a);
                break;
            case 8:
                paVar = new oy(context);
                break;
            case 9:
                paVar = new ty(ezVar, context);
                break;
            case 10:
                Activity parentActivity = ezVar.getParentActivity();
                i14 = ((org.telegram.ui.ActionBar.d2) ezVar).currentAccount;
                e6Var2 = ((org.telegram.ui.ActionBar.d2) ezVar).resourceProvider;
                paVar = new zl0(2, i14, parentActivity, e6Var2);
                break;
            case 11:
                e6Var3 = ((org.telegram.ui.ActionBar.d2) ezVar).resourceProvider;
                paVar = new uy(context, e6Var3);
                break;
        }
        return new u4.d1(paVar);
    }

    @Override
    public final void y(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 2 && i3 == 9) {
            ez ezVar = this.f44167e;
            ((ty) d1Var.f55540a).e(org.telegram.ui.Components.p5.cloneSpans(ezVar.f45110x, -1, ezVar.J.f49918s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(u4.d1 d1Var) {
        if (d1Var.f55544f == 2) {
            org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) d1Var.f55540a;
            h3Var.f29316b.k(true);
            h3Var.f29316b.d();
        }
    }
}
