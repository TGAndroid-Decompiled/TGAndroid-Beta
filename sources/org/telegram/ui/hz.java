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
    public final kz f48518e;

    public hz(kz kzVar, Context context) {
        this.f48518e = kzVar;
        this.d = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f59115f;
        if (i7 != 3 && i7 != 0 && i7 != 2 && i7 != 5 && i7 != 9 && i7 != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f48518e.Q.size();
    }

    @Override
    public final int d(int i7) {
        cz czVar = (cz) this.f48518e.Q.get(i7);
        if (czVar == null) {
            return 3;
        }
        return czVar.f56599a;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        String N0;
        String N02;
        int i10;
        int i11;
        int i12;
        kz kzVar = this.f48518e;
        ArrayList arrayList = kzVar.Q;
        cz czVar = (cz) arrayList.get(i7);
        if (czVar != null) {
            int i13 = i7 + 1;
            boolean z11 = false;
            if (i13 < arrayList.size() && (i12 = ((cz) arrayList.get(i13)).f56599a) != 3 && i12 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i14 = e1Var.f59115f;
            View view = e1Var.f59111a;
            if (i14 != 0) {
                if (i14 != 1) {
                    int i15 = -1;
                    if (i14 != 4) {
                        switch (i14) {
                            case 6:
                                ((org.telegram.ui.Cells.a9) view).setText(czVar.d);
                                return;
                            case 7:
                                ((ez) view).e(czVar.f46801m, z10);
                                return;
                            case 8:
                                vy vyVar = (vy) view;
                                if (vyVar.f52886c != z10) {
                                    vyVar.f52886c = z10;
                                    vyVar.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                az azVar = (az) view;
                                kzVar.J = azVar;
                                azVar.e(org.telegram.ui.Components.y5.cloneSpans(kzVar.f49410x, -1, azVar.f45679s.getPaint().getFontMetricsInt(), 0.5f), false);
                                az azVar2 = kzVar.J;
                                if (kzVar.getUserConfig().q()) {
                                    i15 = kzVar.F;
                                }
                                azVar2.d(i15, false);
                                kzVar.J.setText(org.telegram.messenger.hd.N0(2131750605, null));
                                return;
                            case 10:
                                im0 im0Var = (im0) view;
                                im0Var.setCloseAsLock(!kzVar.getUserConfig().q());
                                if (kzVar.getUserConfig().q()) {
                                    i15 = kzVar.F;
                                }
                                im0Var.a(i15, false);
                                im0Var.setOnColorClick(new org.telegram.ui.Components.rh(15, this, im0Var));
                                return;
                            case 11:
                                bz bzVar = (bz) view;
                                kzVar.K = bzVar;
                                bzVar.setText(czVar.d);
                                org.telegram.ui.Cells.x3 x3Var = bzVar.f46333r;
                                x3Var.setText(czVar.f46794e);
                                x3Var.setOnClickListener(czVar.f46793c);
                                return;
                            default:
                                return;
                        }
                    }
                    ty tyVar = (ty) view;
                    boolean z12 = czVar.f46800l;
                    ImageView imageView = tyVar.f52377a;
                    TextView textView = tyVar.f52378b;
                    if (z12) {
                        i10 = org.telegram.ui.ActionBar.m6.f29588q7;
                    } else {
                        i10 = org.telegram.ui.ActionBar.m6.f29547o6;
                    }
                    org.telegram.ui.ActionBar.t6.s(imageView, i10, null, PorterDuff.Mode.MULTIPLY);
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.m6.f29568p7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.m6.f29587q6;
                    }
                    org.telegram.ui.ActionBar.t6.U(textView, i11, null);
                    int i16 = czVar.f46799k;
                    CharSequence charSequence = czVar.d;
                    ImageView imageView2 = tyVar.f52377a;
                    if (!org.telegram.messenger.hd.f24408a0) {
                        i15 = 1;
                    }
                    if (i16 == 0) {
                        imageView2.setVisibility(8);
                    } else {
                        imageView2.setVisibility(0);
                        imageView2.setImageResource(i16);
                    }
                    float f10 = 72.0f;
                    if (org.telegram.messenger.hd.f24408a0) {
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
                    Boolean bool = tyVar.f52380e;
                    if (bool == null || bool.booleanValue() != z11) {
                        tyVar.f52380e = Boolean.valueOf(z11);
                        float f11 = 0.0f;
                        if (tyVar.f52379c == i16) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z11) {
                                f11 = org.telegram.messenger.g0.L(i15 * (-7));
                            }
                            animate.translationX(f11).setDuration(180L).setInterpolator(org.telegram.ui.Components.nr.h).start();
                        } else {
                            if (z11) {
                                f11 = org.telegram.messenger.g0.L(i15 * (-7));
                            }
                            textView.setTranslationX(f11);
                        }
                    }
                    tyVar.d = z10;
                    tyVar.setWillNotDraw(!z10);
                    tyVar.f52379c = i16;
                    return;
                }
                org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
                String str = czVar.f46797i;
                if (str != null) {
                    raVar.d(str, czVar.d, null, z10);
                    return;
                }
                long j3 = czVar.h;
                if (j3 > 0) {
                    TLRPC.User c22 = kzVar.getMessagesController().c2(Long.valueOf(j3));
                    if (c22 != null) {
                        if (c22.bot) {
                            N02 = org.telegram.messenger.hd.N0(2131753153, null);
                        } else if (c22.contact) {
                            N02 = org.telegram.messenger.hd.N0(2131750780, null);
                        } else {
                            N02 = org.telegram.messenger.hd.N0(2131750707, null);
                        }
                        raVar.d(c22, null, N02, z10);
                        return;
                    }
                    return;
                }
                TLRPC.Chat O0 = kzVar.getMessagesController().O0(Long.valueOf(-j3));
                if (O0 != null) {
                    if (org.telegram.messenger.v3.Y(O0)) {
                        N0 = org.telegram.messenger.hd.N0(2131751978, null);
                    } else if (O0.participants_count != 0) {
                        if (org.telegram.messenger.v3.V(O0)) {
                            N0 = org.telegram.messenger.hd.H(',', "Subscribers", O0.participants_count);
                        } else {
                            N0 = org.telegram.messenger.hd.H(',', "Members", O0.participants_count);
                        }
                    } else if (!org.telegram.messenger.v3.t0(O0)) {
                        if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                            N0 = org.telegram.messenger.hd.N0(2131752317, null);
                        } else {
                            N0 = org.telegram.messenger.hd.N0(2131748448, null);
                        }
                    } else if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                        N0 = org.telegram.messenger.hd.N0(2131752306, null);
                    } else {
                        N0 = org.telegram.messenger.hd.N0(2131748445, null);
                    }
                    raVar.d(O0, null, N0, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
            if (czVar.f46795f) {
                o4Var.setText(kz.E0(0, czVar.d, false));
            } else {
                o4Var.setText(czVar.d);
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.ra raVar;
        org.telegram.ui.ActionBar.h6 h6Var;
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.h6 h6Var2;
        org.telegram.ui.ActionBar.h6 h6Var3;
        Context context = this.d;
        kz kzVar = this.f48518e;
        switch (i7) {
            case 0:
                raVar = new org.telegram.ui.Cells.o4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.ra raVar2 = new org.telegram.ui.Cells.ra(context, 6, 0, false);
                raVar2.setSelfAsSavedMessages(true);
                raVar = raVar2;
                break;
            case 2:
                String N0 = org.telegram.messenger.hd.N0(2131750720, null);
                h6Var = ((org.telegram.ui.ActionBar.g2) kzVar).resourceProvider;
                ?? i3Var = new org.telegram.ui.Cells.i3(this.d, (org.telegram.ui.Components.du0) kzVar.fragmentView, N0, false, 12, h6Var);
                kzVar.L = i3Var;
                i3Var.f30802r = false;
                i3Var.f30803s = true;
                org.telegram.ui.Cells.g3 g3Var = i3Var.f30797b;
                g3Var.getEditText().setEmojiColor(Integer.valueOf(kzVar.getThemedColor(org.telegram.ui.ActionBar.m6.Fi)));
                g3Var.setEmojiViewCacheType(25);
                g3Var.setText(kzVar.f49410x);
                i10 = ((org.telegram.ui.ActionBar.g2) kzVar).currentAccount;
                org.telegram.ui.Components.p5.r(i10, kzVar.f49411y);
                org.telegram.ui.Components.ot editText = g3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.k3());
                editText.addTextChangedListener(new m0(this, 7));
                editText.setPadding(org.telegram.messenger.g0.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                g3Var.getEditText().setImeOptions(268435462);
                raVar = i3Var;
                break;
            case 3:
                raVar = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.f52380e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f52377a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i15 = 3;
                if (org.telegram.messenger.hd.f24408a0) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                frameLayout.addView(imageView, c8.na.d(24, 24.0f, i11 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f52378b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = org.telegram.messenger.hd.f24408a0;
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
                if (org.telegram.messenger.hd.f24408a0) {
                    i15 = 5;
                }
                textView.setGravity(i15);
                boolean z11 = org.telegram.messenger.hd.f24408a0;
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
                frameLayout.addView(textView, c8.na.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
                raVar = frameLayout;
                break;
            case 5:
                k0 k0Var = new k0(context, 8);
                ?? imageView2 = new ImageView(context);
                k0Var.f49119b = imageView2;
                imageView2.f(2131624016, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                k0Var.addView((View) imageView2, c8.na.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(k0Var, 23));
                raVar = k0Var;
                break;
            case 6:
            default:
                raVar = new org.telegram.ui.Cells.a9(context);
                break;
            case 7:
                i13 = ((org.telegram.ui.ActionBar.g2) kzVar).currentAccount;
                raVar = new gz(this, this.d, kzVar, i13, kzVar.f49407r.f26850a);
                break;
            case 8:
                raVar = new vy(context);
                break;
            case 9:
                raVar = new az(kzVar, context);
                break;
            case 10:
                Activity parentActivity = kzVar.getParentActivity();
                i14 = ((org.telegram.ui.ActionBar.g2) kzVar).currentAccount;
                h6Var2 = ((org.telegram.ui.ActionBar.g2) kzVar).resourceProvider;
                raVar = new im0(2, i14, parentActivity, h6Var2);
                break;
            case 11:
                h6Var3 = ((org.telegram.ui.ActionBar.g2) kzVar).resourceProvider;
                raVar = new bz(context, h6Var3);
                break;
        }
        return new v4.e1(raVar);
    }

    @Override
    public final void y(v4.e1 e1Var) {
        int i7 = e1Var.f59115f;
        if (i7 != 2 && i7 == 9) {
            kz kzVar = this.f48518e;
            ((az) e1Var.f59111a).e(org.telegram.ui.Components.y5.cloneSpans(kzVar.f49410x, -1, kzVar.J.f45679s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(v4.e1 e1Var) {
        if (e1Var.f59115f == 2) {
            org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) e1Var.f59111a;
            i3Var.f30797b.k(true);
            i3Var.f30797b.d();
        }
    }
}
