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
    public final jz f46182e;

    public gz(jz jzVar, Context context) {
        this.f46182e = jzVar;
        this.d = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57056f;
        if (i7 != 3 && i7 != 0 && i7 != 2 && i7 != 5 && i7 != 9 && i7 != 11) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f46182e.P.size();
    }

    @Override
    public final int d(int i7) {
        bz bzVar = (bz) this.f46182e.P.get(i7);
        if (bzVar == null) {
            return 3;
        }
        return bzVar.f54543a;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        String M0;
        String M02;
        int i10;
        int i11;
        int i12;
        jz jzVar = this.f46182e;
        ArrayList arrayList = jzVar.P;
        bz bzVar = (bz) arrayList.get(i7);
        if (bzVar != null) {
            int i13 = i7 + 1;
            boolean z10 = false;
            if (i13 < arrayList.size() && (i12 = ((bz) arrayList.get(i13)).f54543a) != 3 && i12 != 6) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i14 = d1Var.f57056f;
            View view = d1Var.f57052a;
            if (i14 != 0) {
                if (i14 != 1) {
                    int i15 = -1;
                    if (i14 != 4) {
                        switch (i14) {
                            case 6:
                                ((org.telegram.ui.Cells.z8) view).setText(bzVar.d);
                                return;
                            case 7:
                                ((dz) view).e(bzVar.f44183m, z9);
                                return;
                            case 8:
                                uy uyVar = (uy) view;
                                if (uyVar.f50585c != z9) {
                                    uyVar.f50585c = z9;
                                    uyVar.setWillNotDraw(!z9);
                                    return;
                                }
                                return;
                            case 9:
                                zy zyVar = (zy) view;
                                jzVar.I = zyVar;
                                zyVar.e(org.telegram.ui.Components.q5.cloneSpans(jzVar.f47117x, -1, zyVar.f52706s.getPaint().getFontMetricsInt(), 0.5f), false);
                                zy zyVar2 = jzVar.I;
                                if (jzVar.getUserConfig().q()) {
                                    i15 = jzVar.E;
                                }
                                zyVar2.d(i15, false);
                                jzVar.I.setText(org.telegram.messenger.id.M0(2131750622, null));
                                return;
                            case 10:
                                hm0 hm0Var = (hm0) view;
                                hm0Var.setCloseAsLock(!jzVar.getUserConfig().q());
                                if (jzVar.getUserConfig().q()) {
                                    i15 = jzVar.E;
                                }
                                hm0Var.a(i15, false);
                                hm0Var.setOnColorClick(new org.telegram.ui.Components.ex(11, this, hm0Var));
                                return;
                            case 11:
                                az azVar = (az) view;
                                jzVar.J = azVar;
                                azVar.setText(bzVar.d);
                                org.telegram.ui.Cells.w3 w3Var = azVar.f43843r;
                                w3Var.setText(bzVar.f44176e);
                                w3Var.setOnClickListener(bzVar.f44175c);
                                return;
                            default:
                                return;
                        }
                    }
                    sy syVar = (sy) view;
                    boolean z11 = bzVar.f44182l;
                    ImageView imageView = syVar.f49987a;
                    TextView textView = syVar.f49988b;
                    if (z11) {
                        i10 = org.telegram.ui.ActionBar.m6.f28131q7;
                    } else {
                        i10 = org.telegram.ui.ActionBar.m6.f28090o6;
                    }
                    org.telegram.ui.ActionBar.t6.s(imageView, i10, null, PorterDuff.Mode.MULTIPLY);
                    if (z11) {
                        i11 = org.telegram.ui.ActionBar.m6.f28111p7;
                    } else {
                        i11 = org.telegram.ui.ActionBar.m6.f28130q6;
                    }
                    org.telegram.ui.ActionBar.t6.U(textView, i11, null);
                    int i16 = bzVar.f44181k;
                    CharSequence charSequence = bzVar.d;
                    ImageView imageView2 = syVar.f49987a;
                    if (!org.telegram.messenger.id.f23161a0) {
                        i15 = 1;
                    }
                    if (i16 == 0) {
                        imageView2.setVisibility(8);
                    } else {
                        imageView2.setVisibility(0);
                        imageView2.setImageResource(i16);
                    }
                    float f10 = 72.0f;
                    if (org.telegram.messenger.id.f23161a0) {
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
                    Boolean bool = syVar.f49990e;
                    if (bool == null || bool.booleanValue() != z10) {
                        syVar.f49990e = Boolean.valueOf(z10);
                        float f11 = 0.0f;
                        if (syVar.f49989c == i16) {
                            textView.clearAnimation();
                            ViewPropertyAnimator animate = textView.animate();
                            if (z10) {
                                f11 = org.telegram.messenger.g0.L(i15 * (-7));
                            }
                            animate.translationX(f11).setDuration(180L).setInterpolator(org.telegram.ui.Components.wq.h).start();
                        } else {
                            if (z10) {
                                f11 = org.telegram.messenger.g0.L(i15 * (-7));
                            }
                            textView.setTranslationX(f11);
                        }
                    }
                    syVar.d = z9;
                    syVar.setWillNotDraw(!z9);
                    syVar.f49989c = i16;
                    return;
                }
                org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                String str = bzVar.f44179i;
                if (str != null) {
                    paVar.d(str, bzVar.d, null, z9);
                    return;
                }
                long j3 = bzVar.h;
                if (j3 > 0) {
                    TLRPC.User a22 = jzVar.getMessagesController().a2(Long.valueOf(j3));
                    if (a22 != null) {
                        if (a22.bot) {
                            M02 = org.telegram.messenger.id.M0(2131753156, null);
                        } else if (a22.contact) {
                            M02 = org.telegram.messenger.id.M0(2131750792, null);
                        } else {
                            M02 = org.telegram.messenger.id.M0(2131750721, null);
                        }
                        paVar.d(a22, null, M02, z9);
                        return;
                    }
                    return;
                }
                TLRPC.Chat M03 = jzVar.getMessagesController().M0(Long.valueOf(-j3));
                if (M03 != null) {
                    if (org.telegram.messenger.t3.Y(M03)) {
                        M0 = org.telegram.messenger.id.M0(2131751990, null);
                    } else if (M03.participants_count != 0) {
                        if (org.telegram.messenger.t3.V(M03)) {
                            M0 = org.telegram.messenger.id.H(',', "Subscribers", M03.participants_count);
                        } else {
                            M0 = org.telegram.messenger.id.H(',', "Members", M03.participants_count);
                        }
                    } else if (!org.telegram.messenger.t3.t0(M03)) {
                        if (org.telegram.messenger.t3.T(M03) && !M03.megagroup) {
                            M0 = org.telegram.messenger.id.M0(2131752329, null);
                        } else {
                            M0 = org.telegram.messenger.id.M0(2131748641, null);
                        }
                    } else if (org.telegram.messenger.t3.T(M03) && !M03.megagroup) {
                        M0 = org.telegram.messenger.id.M0(2131752318, null);
                    } else {
                        M0 = org.telegram.messenger.id.M0(2131748638, null);
                    }
                    paVar.d(M03, null, M0, z9);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (bzVar.f44177f) {
                n4Var.setText(jz.E0(0, bzVar.d, false));
            } else {
                n4Var.setText(bzVar.d);
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.pa paVar;
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
        jz jzVar = this.f46182e;
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
                String M0 = org.telegram.messenger.id.M0(2131750732, null);
                h6Var = ((org.telegram.ui.ActionBar.f2) jzVar).resourceProvider;
                ?? h3Var = new org.telegram.ui.Cells.h3(this.d, (org.telegram.ui.Components.st0) jzVar.fragmentView, M0, false, 12, h6Var);
                jzVar.K = h3Var;
                h3Var.f29272r = false;
                h3Var.f29273s = true;
                org.telegram.ui.Cells.f3 f3Var = h3Var.f29267b;
                f3Var.getEditText().setEmojiColor(Integer.valueOf(jzVar.getThemedColor(org.telegram.ui.ActionBar.m6.Ci)));
                f3Var.setEmojiViewCacheType(25);
                f3Var.setText(jzVar.f47117x);
                i10 = ((org.telegram.ui.ActionBar.f2) jzVar).currentAccount;
                org.telegram.ui.Components.h5.r(i10, jzVar.f47118y);
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
                frameLayout.f49990e = null;
                ImageView imageView = new ImageView(context);
                frameLayout.f49987a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                int i15 = 3;
                if (org.telegram.messenger.id.f23161a0) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                frameLayout.addView(imageView, c8.ha.d(24, 24.0f, i11 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f49988b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z9 = org.telegram.messenger.id.f23161a0;
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
                if (org.telegram.messenger.id.f23161a0) {
                    i15 = 5;
                }
                textView.setGravity(i15);
                boolean z10 = org.telegram.messenger.id.f23161a0;
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
                k0Var.f47127b = imageView2;
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
                i13 = ((org.telegram.ui.ActionBar.f2) jzVar).currentAccount;
                paVar = new fz(this, this.d, jzVar, i13, jzVar.f47114r.f26074a);
                break;
            case 8:
                paVar = new uy(context);
                break;
            case 9:
                paVar = new zy(jzVar, context);
                break;
            case 10:
                Activity parentActivity = jzVar.getParentActivity();
                i14 = ((org.telegram.ui.ActionBar.f2) jzVar).currentAccount;
                h6Var2 = ((org.telegram.ui.ActionBar.f2) jzVar).resourceProvider;
                paVar = new hm0(2, i14, parentActivity, h6Var2);
                break;
            case 11:
                h6Var3 = ((org.telegram.ui.ActionBar.f2) jzVar).resourceProvider;
                paVar = new az(context, h6Var3);
                break;
        }
        return new v4.d1(paVar);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        int i7 = d1Var.f57056f;
        if (i7 != 2 && i7 == 9) {
            jz jzVar = this.f46182e;
            ((zy) d1Var.f57052a).e(org.telegram.ui.Components.q5.cloneSpans(jzVar.f47117x, -1, jzVar.I.f52706s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(v4.d1 d1Var) {
        if (d1Var.f57056f == 2) {
            org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) d1Var.f57052a;
            h3Var.f29267b.k(true);
            h3Var.f29267b.d();
        }
    }
}
