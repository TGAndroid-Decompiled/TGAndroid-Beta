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
public final class hz extends rg.b {
    public final Context d;
    public final kz f48548e;

    public hz(kz kzVar, Context context) {
        this.f48548e = kzVar;
        this.d = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59126f;
        if (i7 != 3 && i7 != 0 && i7 != 2 && i7 != 5 && i7 != 9 && i7 != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f48548e.Q.size();
    }

    @Override
    public final int d(int i7) {
        cz czVar = (cz) this.f48548e.Q.get(i7);
        if (czVar == null) {
            return 3;
        }
        return czVar.f56589a;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        String M0;
        String M02;
        int i10;
        int i11;
        int i12;
        kz kzVar = this.f48548e;
        ArrayList arrayList = kzVar.Q;
        cz czVar = (cz) arrayList.get(i7);
        if (czVar != null) {
            int i13 = i7 + 1;
            boolean z11 = false;
            if (i13 < arrayList.size() && (i12 = ((cz) arrayList.get(i13)).f56589a) != 3 && i12 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i14 = f1Var.f59126f;
            View view = f1Var.f59122a;
            if (i14 != 0) {
                if (i14 != 1) {
                    int i15 = -1;
                    if (i14 != 4) {
                        switch (i14) {
                            case 6:
                                ((org.telegram.ui.Cells.z8) view).setText(czVar.d);
                                return;
                            case 7:
                                ((ez) view).e(czVar.f46801m, z10);
                                return;
                            case 8:
                                vy vyVar = (vy) view;
                                if (vyVar.f52883c != z10) {
                                    vyVar.f52883c = z10;
                                    vyVar.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                az azVar = (az) view;
                                kzVar.J = azVar;
                                azVar.e(org.telegram.ui.Components.x5.cloneSpans(kzVar.f49384x, -1, azVar.f45705s.getPaint().getFontMetricsInt(), 0.5f), false);
                                az azVar2 = kzVar.J;
                                if (kzVar.getUserConfig().q()) {
                                    i15 = kzVar.F;
                                }
                                azVar2.d(i15, false);
                                kzVar.J.setText(org.telegram.messenger.gd.M0(2131750606, null));
                                return;
                            case 10:
                                im0 im0Var = (im0) view;
                                im0Var.setCloseAsLock(!kzVar.getUserConfig().q());
                                if (kzVar.getUserConfig().q()) {
                                    i15 = kzVar.F;
                                }
                                im0Var.a(i15, false);
                                im0Var.setOnColorClick(new org.telegram.ui.Components.ph(15, this, im0Var));
                                return;
                            case 11:
                                bz bzVar = (bz) view;
                                kzVar.K = bzVar;
                                bzVar.setText(czVar.d);
                                org.telegram.ui.Cells.w3 w3Var = bzVar.f46322r;
                                w3Var.setText(czVar.f46794e);
                                w3Var.setOnClickListener(czVar.f46793c);
                                return;
                            default:
                                return;
                        }
                    }
                    ty tyVar = (ty) view;
                    boolean z12 = czVar.f46800l;
                    ImageView imageView = tyVar.f52376a;
                    TextView textView = tyVar.f52377b;
                    if (z12) {
                        i10 = org.telegram.ui.ActionBar.n6.f29637q7;
                    } else {
                        i10 = org.telegram.ui.ActionBar.n6.f29596o6;
                    }
                    org.telegram.ui.ActionBar.u6.s(imageView, i10, null, PorterDuff.Mode.MULTIPLY);
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.n6.f29617p7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.n6.f29636q6;
                    }
                    org.telegram.ui.ActionBar.u6.U(textView, i11, null);
                    int i16 = czVar.f46799k;
                    CharSequence charSequence = czVar.d;
                    ImageView imageView2 = tyVar.f52376a;
                    if (!org.telegram.messenger.gd.f24216a0) {
                        i15 = 1;
                    }
                    if (i16 == 0) {
                        imageView2.setVisibility(8);
                    } else {
                        imageView2.setVisibility(0);
                        imageView2.setImageResource(i16);
                    }
                    float f10 = 72.0f;
                    if (org.telegram.messenger.gd.f24216a0) {
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
                    Boolean bool = tyVar.f52379e;
                    if (bool == null || bool.booleanValue() != z11) {
                        tyVar.f52379e = Boolean.valueOf(z11);
                        float f11 = 0.0f;
                        if (tyVar.f52378c == i16) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z11) {
                                f11 = org.telegram.messenger.g0.L(i15 * (-7));
                            }
                            animate.translationX(f11).setDuration(180L).setInterpolator(org.telegram.ui.Components.lr.h).start();
                        } else {
                            if (z11) {
                                f11 = org.telegram.messenger.g0.L(i15 * (-7));
                            }
                            textView.setTranslationX(f11);
                        }
                    }
                    tyVar.d = z10;
                    tyVar.setWillNotDraw(!z10);
                    tyVar.f52378c = i16;
                    return;
                }
                org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) view;
                String str = czVar.f46797i;
                if (str != null) {
                    qaVar.d(str, czVar.d, null, z10);
                    return;
                }
                long j3 = czVar.h;
                if (j3 > 0) {
                    TLRPC.User c22 = kzVar.getMessagesController().c2(Long.valueOf(j3));
                    if (c22 != null) {
                        if (c22.bot) {
                            M02 = org.telegram.messenger.gd.M0(2131753154, null);
                        } else if (c22.contact) {
                            M02 = org.telegram.messenger.gd.M0(2131750781, null);
                        } else {
                            M02 = org.telegram.messenger.gd.M0(2131750708, null);
                        }
                        qaVar.d(c22, null, M02, z10);
                        return;
                    }
                    return;
                }
                TLRPC.Chat O0 = kzVar.getMessagesController().O0(Long.valueOf(-j3));
                if (O0 != null) {
                    if (org.telegram.messenger.v3.Y(O0)) {
                        M0 = org.telegram.messenger.gd.M0(2131751979, null);
                    } else if (O0.participants_count != 0) {
                        if (org.telegram.messenger.v3.V(O0)) {
                            M0 = org.telegram.messenger.gd.H(',', "Subscribers", O0.participants_count);
                        } else {
                            M0 = org.telegram.messenger.gd.H(',', "Members", O0.participants_count);
                        }
                    } else if (!org.telegram.messenger.v3.t0(O0)) {
                        if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                            M0 = org.telegram.messenger.gd.M0(2131752318, null);
                        } else {
                            M0 = org.telegram.messenger.gd.M0(2131748449, null);
                        }
                    } else if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                        M0 = org.telegram.messenger.gd.M0(2131752307, null);
                    } else {
                        M0 = org.telegram.messenger.gd.M0(2131748446, null);
                    }
                    qaVar.d(O0, null, M0, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (czVar.f46795f) {
                n4Var.setText(kz.E0(0, czVar.d, false));
            } else {
                n4Var.setText(czVar.d);
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.qa qaVar;
        org.telegram.ui.ActionBar.i6 i6Var;
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.i6 i6Var2;
        org.telegram.ui.ActionBar.i6 i6Var3;
        Context context = this.d;
        kz kzVar = this.f48548e;
        switch (i7) {
            case 0:
                qaVar = new org.telegram.ui.Cells.n4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.qa qaVar2 = new org.telegram.ui.Cells.qa(context, 6, 0, false);
                qaVar2.setSelfAsSavedMessages(true);
                qaVar = qaVar2;
                break;
            case 2:
                String M0 = org.telegram.messenger.gd.M0(2131750721, null);
                i6Var = ((org.telegram.ui.ActionBar.h2) kzVar).resourceProvider;
                ?? h3Var = new org.telegram.ui.Cells.h3(this.d, (org.telegram.ui.Components.au0) kzVar.fragmentView, M0, false, 12, i6Var);
                kzVar.L = h3Var;
                h3Var.f30757r = false;
                h3Var.f30758s = true;
                org.telegram.ui.Cells.f3 f3Var = h3Var.f30752b;
                f3Var.getEditText().setEmojiColor(Integer.valueOf(kzVar.getThemedColor(org.telegram.ui.ActionBar.n6.Fi)));
                f3Var.setEmojiViewCacheType(25);
                f3Var.setText(kzVar.f49384x);
                i10 = ((org.telegram.ui.ActionBar.h2) kzVar).currentAccount;
                org.telegram.ui.Components.o5.r(i10, kzVar.f49385y);
                org.telegram.ui.Components.mt editText = f3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.j3());
                editText.addTextChangedListener(new m0(this, 7));
                editText.setPadding(org.telegram.messenger.g0.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                f3Var.getEditText().setImeOptions(268435462);
                qaVar = h3Var;
                break;
            case 3:
                qaVar = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.f52379e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f52376a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i15 = 3;
                if (org.telegram.messenger.gd.f24216a0) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                frameLayout.addView(imageView, c8.ma.d(24, 24.0f, i11 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f52377b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = org.telegram.messenger.gd.f24216a0;
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
                if (org.telegram.messenger.gd.f24216a0) {
                    i15 = 5;
                }
                textView.setGravity(i15);
                boolean z11 = org.telegram.messenger.gd.f24216a0;
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
                frameLayout.addView(textView, c8.ma.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
                qaVar = frameLayout;
                break;
            case 5:
                k0 k0Var = new k0(context, 8);
                ?? imageView2 = new ImageView(context);
                k0Var.f49141b = imageView2;
                imageView2.f(2131624016, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                k0Var.addView((View) imageView2, c8.ma.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(k0Var, 23));
                qaVar = k0Var;
                break;
            case 6:
            default:
                qaVar = new org.telegram.ui.Cells.z8(context);
                break;
            case 7:
                i13 = ((org.telegram.ui.ActionBar.h2) kzVar).currentAccount;
                qaVar = new gz(this, this.d, kzVar, i13, kzVar.f49381r.f26674a);
                break;
            case 8:
                qaVar = new vy(context);
                break;
            case 9:
                qaVar = new az(kzVar, context);
                break;
            case 10:
                Activity parentActivity = kzVar.getParentActivity();
                i14 = ((org.telegram.ui.ActionBar.h2) kzVar).currentAccount;
                i6Var2 = ((org.telegram.ui.ActionBar.h2) kzVar).resourceProvider;
                qaVar = new im0(2, i14, parentActivity, i6Var2);
                break;
            case 11:
                i6Var3 = ((org.telegram.ui.ActionBar.h2) kzVar).resourceProvider;
                qaVar = new bz(context, i6Var3);
                break;
        }
        return new v4.f1(qaVar);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        int i7 = f1Var.f59126f;
        if (i7 != 2 && i7 == 9) {
            kz kzVar = this.f48548e;
            ((az) f1Var.f59122a).e(org.telegram.ui.Components.x5.cloneSpans(kzVar.f49384x, -1, kzVar.J.f45705s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(v4.f1 f1Var) {
        if (f1Var.f59126f == 2) {
            org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) f1Var.f59122a;
            h3Var.f30752b.k(true);
            h3Var.f30752b.d();
        }
    }
}
