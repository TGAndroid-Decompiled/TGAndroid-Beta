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
public final class gz extends rg.b {
    public final Context d;
    public final jz f48380e;

    public gz(jz jzVar, Context context) {
        this.f48380e = jzVar;
        this.d = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 != 3 && i7 != 0 && i7 != 2 && i7 != 5 && i7 != 9 && i7 != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f48380e.Q.size();
    }

    @Override
    public final int d(int i7) {
        bz bzVar = (bz) this.f48380e.Q.get(i7);
        if (bzVar == null) {
            return 3;
        }
        return bzVar.f56712a;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        String N0;
        String N02;
        int i10;
        int i11;
        int i12;
        jz jzVar = this.f48380e;
        ArrayList arrayList = jzVar.Q;
        bz bzVar = (bz) arrayList.get(i7);
        if (bzVar != null) {
            int i13 = i7 + 1;
            boolean z11 = false;
            if (i13 < arrayList.size() && (i12 = ((bz) arrayList.get(i13)).f56712a) != 3 && i12 != 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i14 = f1Var.f59249f;
            View view = f1Var.f59245a;
            if (i14 != 0) {
                if (i14 != 1) {
                    int i15 = -1;
                    if (i14 != 4) {
                        switch (i14) {
                            case 6:
                                ((org.telegram.ui.Cells.z8) view).setText(bzVar.d);
                                return;
                            case 7:
                                ((dz) view).e(bzVar.f46673m, z10);
                                return;
                            case 8:
                                uy uyVar = (uy) view;
                                if (uyVar.f52758c != z10) {
                                    uyVar.f52758c = z10;
                                    uyVar.setWillNotDraw(!z10);
                                    return;
                                }
                                return;
                            case 9:
                                zy zyVar = (zy) view;
                                jzVar.J = zyVar;
                                zyVar.e(org.telegram.ui.Components.x5.cloneSpans(jzVar.f49257x, -1, zyVar.f54747s.getPaint().getFontMetricsInt(), 0.5f), false);
                                zy zyVar2 = jzVar.J;
                                if (jzVar.getUserConfig().q()) {
                                    i15 = jzVar.F;
                                }
                                zyVar2.d(i15, false);
                                jzVar.J.setText(org.telegram.messenger.gd.N0(2131750605, null));
                                return;
                            case 10:
                                gm0 gm0Var = (gm0) view;
                                gm0Var.setCloseAsLock(!jzVar.getUserConfig().q());
                                if (jzVar.getUserConfig().q()) {
                                    i15 = jzVar.F;
                                }
                                gm0Var.a(i15, false);
                                gm0Var.setOnColorClick(new org.telegram.ui.Components.ph(16, this, gm0Var));
                                return;
                            case 11:
                                az azVar = (az) view;
                                jzVar.K = azVar;
                                azVar.setText(bzVar.d);
                                org.telegram.ui.Cells.x3 x3Var = azVar.f45837r;
                                x3Var.setText(bzVar.f46666e);
                                x3Var.setOnClickListener(bzVar.f46665c);
                                return;
                            default:
                                return;
                        }
                    }
                    sy syVar = (sy) view;
                    boolean z12 = bzVar.f46672l;
                    ImageView imageView = syVar.f52170a;
                    TextView textView = syVar.f52171b;
                    if (z12) {
                        i10 = org.telegram.ui.ActionBar.n6.f29692q7;
                    } else {
                        i10 = org.telegram.ui.ActionBar.n6.f29651o6;
                    }
                    org.telegram.ui.ActionBar.u6.s(imageView, i10, null, PorterDuff.Mode.MULTIPLY);
                    if (z12) {
                        i11 = org.telegram.ui.ActionBar.n6.f29672p7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.n6.f29691q6;
                    }
                    org.telegram.ui.ActionBar.u6.U(textView, i11, null);
                    int i16 = bzVar.f46671k;
                    CharSequence charSequence = bzVar.d;
                    ImageView imageView2 = syVar.f52170a;
                    if (!org.telegram.messenger.gd.f24314a0) {
                        i15 = 1;
                    }
                    if (i16 == 0) {
                        imageView2.setVisibility(8);
                    } else {
                        imageView2.setVisibility(0);
                        imageView2.setImageResource(i16);
                    }
                    float f10 = 72.0f;
                    if (org.telegram.messenger.gd.f24314a0) {
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
                    Boolean bool = syVar.f52173e;
                    if (bool == null || bool.booleanValue() != z11) {
                        syVar.f52173e = Boolean.valueOf(z11);
                        float f11 = 0.0f;
                        if (syVar.f52172c == i16) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z11) {
                                f11 = org.telegram.messenger.g0.L(i15 * (-7));
                            }
                            animate.translationX(f11).setDuration(180L).setInterpolator(org.telegram.ui.Components.kr.h).start();
                        } else {
                            if (z11) {
                                f11 = org.telegram.messenger.g0.L(i15 * (-7));
                            }
                            textView.setTranslationX(f11);
                        }
                    }
                    syVar.d = z10;
                    syVar.setWillNotDraw(!z10);
                    syVar.f52172c = i16;
                    return;
                }
                org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
                String str = bzVar.f46669i;
                if (str != null) {
                    saVar.d(str, bzVar.d, null, z10);
                    return;
                }
                long j3 = bzVar.h;
                if (j3 > 0) {
                    TLRPC.User c22 = jzVar.getMessagesController().c2(Long.valueOf(j3));
                    if (c22 != null) {
                        if (c22.bot) {
                            N02 = org.telegram.messenger.gd.N0(2131753153, null);
                        } else if (c22.contact) {
                            N02 = org.telegram.messenger.gd.N0(2131750780, null);
                        } else {
                            N02 = org.telegram.messenger.gd.N0(2131750707, null);
                        }
                        saVar.d(c22, null, N02, z10);
                        return;
                    }
                    return;
                }
                TLRPC.Chat O0 = jzVar.getMessagesController().O0(Long.valueOf(-j3));
                if (O0 != null) {
                    if (org.telegram.messenger.v3.Y(O0)) {
                        N0 = org.telegram.messenger.gd.N0(2131751978, null);
                    } else if (O0.participants_count != 0) {
                        if (org.telegram.messenger.v3.V(O0)) {
                            N0 = org.telegram.messenger.gd.H(',', "Subscribers", O0.participants_count);
                        } else {
                            N0 = org.telegram.messenger.gd.H(',', "Members", O0.participants_count);
                        }
                    } else if (!org.telegram.messenger.v3.t0(O0)) {
                        if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                            N0 = org.telegram.messenger.gd.N0(2131752317, null);
                        } else {
                            N0 = org.telegram.messenger.gd.N0(2131748448, null);
                        }
                    } else if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                        N0 = org.telegram.messenger.gd.N0(2131752306, null);
                    } else {
                        N0 = org.telegram.messenger.gd.N0(2131748445, null);
                    }
                    saVar.d(O0, null, N0, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
            if (bzVar.f46667f) {
                o4Var.setText(jz.E0(0, bzVar.d, false));
            } else {
                o4Var.setText(bzVar.d);
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.sa saVar;
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
        jz jzVar = this.f48380e;
        switch (i7) {
            case 0:
                saVar = new org.telegram.ui.Cells.o4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.sa saVar2 = new org.telegram.ui.Cells.sa(context, 6, 0, false);
                saVar2.setSelfAsSavedMessages(true);
                saVar = saVar2;
                break;
            case 2:
                String N0 = org.telegram.messenger.gd.N0(2131750720, null);
                i6Var = ((org.telegram.ui.ActionBar.g2) jzVar).resourceProvider;
                ?? i3Var = new org.telegram.ui.Cells.i3(this.d, (org.telegram.ui.Components.cu0) jzVar.fragmentView, N0, false, 12, i6Var);
                jzVar.L = i3Var;
                i3Var.f30892r = false;
                i3Var.f30893s = true;
                org.telegram.ui.Cells.g3 g3Var = i3Var.f30887b;
                g3Var.getEditText().setEmojiColor(Integer.valueOf(jzVar.getThemedColor(org.telegram.ui.ActionBar.n6.Fi)));
                g3Var.setEmojiViewCacheType(25);
                g3Var.setText(jzVar.f49257x);
                i10 = ((org.telegram.ui.ActionBar.g2) jzVar).currentAccount;
                org.telegram.ui.Components.o5.r(i10, jzVar.f49258y);
                org.telegram.ui.Components.mt editText = g3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.k3());
                editText.addTextChangedListener(new m0(this, 7));
                editText.setPadding(org.telegram.messenger.g0.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                g3Var.getEditText().setImeOptions(268435462);
                saVar = i3Var;
                break;
            case 3:
                saVar = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.d = true;
                frameLayout.f52173e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f52170a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i15 = 3;
                if (org.telegram.messenger.gd.f24314a0) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                frameLayout.addView(imageView, c8.na.d(24, 24.0f, i11 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f52171b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = org.telegram.messenger.gd.f24314a0;
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
                if (org.telegram.messenger.gd.f24314a0) {
                    i15 = 5;
                }
                textView.setGravity(i15);
                boolean z11 = org.telegram.messenger.gd.f24314a0;
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
                saVar = frameLayout;
                break;
            case 5:
                k0 k0Var = new k0(context, 8);
                ?? imageView2 = new ImageView(context);
                k0Var.f49267b = imageView2;
                imageView2.f(2131624016, 100, 100, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                k0Var.addView((View) imageView2, c8.na.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(k0Var, 23));
                saVar = k0Var;
                break;
            case 6:
            default:
                saVar = new org.telegram.ui.Cells.z8(context);
                break;
            case 7:
                i13 = ((org.telegram.ui.ActionBar.g2) jzVar).currentAccount;
                saVar = new fz(this, this.d, jzVar, i13, jzVar.f49254r.f26773a);
                break;
            case 8:
                saVar = new uy(context);
                break;
            case 9:
                saVar = new zy(jzVar, context);
                break;
            case 10:
                Activity parentActivity = jzVar.getParentActivity();
                i14 = ((org.telegram.ui.ActionBar.g2) jzVar).currentAccount;
                i6Var2 = ((org.telegram.ui.ActionBar.g2) jzVar).resourceProvider;
                saVar = new gm0(2, i14, parentActivity, i6Var2);
                break;
            case 11:
                i6Var3 = ((org.telegram.ui.ActionBar.g2) jzVar).resourceProvider;
                saVar = new az(context, i6Var3);
                break;
        }
        return new v4.f1(saVar);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 != 2 && i7 == 9) {
            jz jzVar = this.f48380e;
            ((zy) f1Var.f59245a).e(org.telegram.ui.Components.x5.cloneSpans(jzVar.f49257x, -1, jzVar.J.f54747s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(v4.f1 f1Var) {
        if (f1Var.f59249f == 2) {
            org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) f1Var.f59245a;
            i3Var.f30887b.k(true);
            i3Var.f30887b.d();
        }
    }
}
