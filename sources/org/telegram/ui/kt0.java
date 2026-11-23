package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kt0 extends org.telegram.ui.Components.dk0 {
    public final Context f49385c;
    public final PrivacyControlActivity d;

    public kt0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.f49385c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int b10 = f1Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b10 == privacyControlActivity.f43507d0) {
            i15 = ((org.telegram.ui.ActionBar.g2) privacyControlActivity).currentAccount;
            if (!org.telegram.messenger.i5.r(i15).t(3)) {
                return true;
            }
        }
        i7 = privacyControlActivity.currentPhotoForRestRow;
        if (b10 != i7 && b10 != privacyControlActivity.f43504b0) {
            i10 = privacyControlActivity.photoForRestRow;
            if (b10 != i10) {
                i11 = privacyControlActivity.readRow;
                if (b10 != i11) {
                    i12 = privacyControlActivity.showGiftIconRow;
                    if (b10 != i12 && b10 != privacyControlActivity.f43512g0 && b10 != privacyControlActivity.f43521p0 && b10 != privacyControlActivity.f43522q0 && b10 != privacyControlActivity.f43524r0 && b10 != privacyControlActivity.f43520o0 && b10 != privacyControlActivity.f43519n0) {
                        if (privacyControlActivity.E != 12 || !privacyControlActivity.F0()) {
                            i13 = privacyControlActivity.nobodyRow;
                            if (b10 != i13 && b10 != privacyControlActivity.Q && b10 != privacyControlActivity.f43514i0) {
                                i14 = privacyControlActivity.everybodyRow;
                                if (b10 != i14 && b10 != privacyControlActivity.V && b10 != privacyControlActivity.U) {
                                    return false;
                                }
                                return true;
                            }
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final int E(ArrayList arrayList) {
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long longValue = ((Long) arrayList.get(i10)).longValue();
            if (longValue > 0) {
                i7++;
            } else {
                TLRPC.Chat O0 = this.d.getMessagesController().O0(Long.valueOf(-longValue));
                if (O0 != null) {
                    i7 += O0.participants_count;
                }
            }
        }
        return i7;
    }

    @Override
    public final int b() {
        return this.d.f43527t0;
    }

    @Override
    public final int d(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        PrivacyControlActivity privacyControlActivity = this.d;
        if (i7 != privacyControlActivity.U && i7 != privacyControlActivity.V && i7 != privacyControlActivity.f43507d0 && i7 != privacyControlActivity.f43512g0) {
            if (i7 != privacyControlActivity.W && i7 != privacyControlActivity.R && i7 != privacyControlActivity.S && i7 != privacyControlActivity.f43517l0 && i7 != privacyControlActivity.f43509e0 && i7 != privacyControlActivity.f43504b0 && i7 != privacyControlActivity.f43511f0 && i7 != privacyControlActivity.f43513h0) {
                i10 = privacyControlActivity.setBirthdayRow;
                if (i7 != i10 && i7 != privacyControlActivity.m0 && i7 != privacyControlActivity.f43526s0) {
                    if (i7 != privacyControlActivity.P && i7 != privacyControlActivity.f43515j0 && i7 != privacyControlActivity.T && i7 != privacyControlActivity.f43506c0 && i7 != privacyControlActivity.X) {
                        i11 = privacyControlActivity.giftTypesHeaderRow;
                        if (i7 != i11) {
                            i12 = privacyControlActivity.everybodyRow;
                            if (i7 != i12 && i7 != privacyControlActivity.Q) {
                                i13 = privacyControlActivity.nobodyRow;
                                if (i7 != i13 && i7 != privacyControlActivity.f43514i0 && i7 != privacyControlActivity.Y && i7 != privacyControlActivity.Z) {
                                    if (i7 == privacyControlActivity.O) {
                                        return 4;
                                    }
                                    if (i7 != privacyControlActivity.f43502a0) {
                                        i14 = privacyControlActivity.photoForRestRow;
                                        if (i7 != i14) {
                                            i15 = privacyControlActivity.currentPhotoForRestRow;
                                            if (i7 != i15) {
                                                i16 = privacyControlActivity.readRow;
                                                if (i7 != i16) {
                                                    i17 = privacyControlActivity.showGiftIconRow;
                                                    if (i7 != i17 && i7 != privacyControlActivity.f43521p0 && i7 != privacyControlActivity.f43522q0 && i7 != privacyControlActivity.f43524r0 && i7 != privacyControlActivity.f43519n0 && i7 != privacyControlActivity.f43520o0) {
                                                        i18 = privacyControlActivity.priceRow;
                                                        if (i7 == i18) {
                                                            return 9;
                                                        }
                                                        if (i7 == privacyControlActivity.f43516k0) {
                                                            return 10;
                                                        }
                                                        return 0;
                                                    }
                                                    return 8;
                                                }
                                                return 8;
                                            }
                                            return 7;
                                        }
                                        return 6;
                                    }
                                    return 5;
                                }
                                return 3;
                            }
                            return 3;
                        }
                        return 2;
                    }
                    return 2;
                }
                return 1;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.f1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kt0.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View a9Var;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        org.telegram.ui.Cells.x9 x9Var;
        org.telegram.ui.ActionBar.h6 h6Var3;
        Context context = this.f49385c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i7) {
            case 0:
                org.telegram.ui.Cells.x9 x9Var2 = new org.telegram.ui.Cells.x9(context);
                x9Var2.setCanDisable(true);
                x9Var = x9Var2;
                a9Var = x9Var;
                break;
            case 1:
                a9Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 2:
                a9Var = new org.telegram.ui.Cells.o4(context);
                break;
            case 3:
                a9Var = new org.telegram.ui.Cells.j6(context, null);
                break;
            case 4:
                a9Var = privacyControlActivity.d;
                break;
            case 5:
            default:
                a9Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 6:
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(privacyControlActivity.getParentActivity());
                privacyControlActivity.f43531w0 = n8Var;
                if (privacyControlActivity.f43536z0 == null) {
                    n8Var.o(2131232049, org.telegram.messenger.hd.a0(null, null, 2131745321, new Object[0]), false);
                } else {
                    n8Var.o(2131232049, org.telegram.messenger.hd.a0("UpdatePhotoForRest", null, 2131743572, new Object[0]), true);
                }
                privacyControlActivity.f43531w0.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(false));
                privacyControlActivity.f43531w0.g(org.telegram.ui.ActionBar.m6.f29716v6, org.telegram.ui.ActionBar.m6.f29697u6);
                privacyControlActivity.f43529v0 = new org.telegram.ui.Components.oh0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                privacyControlActivity.f43531w0.f31168e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                privacyControlActivity.f43531w0.f31168e.setAnimation(privacyControlActivity.f43529v0);
                a9Var = privacyControlActivity.f43531w0;
                break;
            case 7:
                privacyControlActivity.f43533x0 = new org.telegram.ui.Components.q9(privacyControlActivity.getParentActivity());
                privacyControlActivity.f43535y0 = new or(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.f43536z0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.A0;
                    if (photo != null) {
                        org.telegram.ui.Components.q9 q9Var = privacyControlActivity.f43533x0;
                        org.telegram.messenger.gc i12 = org.telegram.messenger.gc.i(photoSize, photo);
                        i11 = ((org.telegram.ui.ActionBar.g2) privacyControlActivity).currentAccount;
                        q9Var.j(i12, "50_50", null, org.telegram.messenger.k10.i(i11).f());
                    } else {
                        org.telegram.ui.Components.q9 q9Var2 = privacyControlActivity.f43533x0;
                        org.telegram.messenger.gc e10 = org.telegram.messenger.gc.e(photoSize.location);
                        i10 = ((org.telegram.ui.ActionBar.g2) privacyControlActivity).currentAccount;
                        q9Var2.j(e10, "50_50", null, org.telegram.messenger.k10.i(i10).f());
                    }
                }
                privacyControlActivity.f43535y0.addView(privacyControlActivity.f43533x0, c8.ma.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.f43535y0.k(org.telegram.messenger.hd.N0(2131746093, null), false);
                privacyControlActivity.f43535y0.getImageView().setVisibility(0);
                privacyControlActivity.f43535y0.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(false));
                or orVar = privacyControlActivity.f43535y0;
                int i13 = org.telegram.ui.ActionBar.m6.f29602p7;
                orVar.g(i13, i13);
                a9Var = privacyControlActivity.f43535y0;
                break;
            case 8:
                h6Var = ((org.telegram.ui.ActionBar.g2) privacyControlActivity).resourceProvider;
                a9Var = new org.telegram.ui.Cells.s8(context, h6Var);
                break;
            case 9:
                h6Var2 = ((org.telegram.ui.ActionBar.g2) privacyControlActivity).resourceProvider;
                a9Var = new org.telegram.ui.Cells.u7(context, h6Var2);
                break;
            case 10:
                ?? frameLayout = new FrameLayout(context);
                h6Var3 = ((org.telegram.ui.ActionBar.g2) privacyControlActivity).resourceProvider;
                hi.e eVar = new hi.e(context, h6Var3, true);
                eVar.setRoundRadius(24);
                org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(2131232245, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.N0(2131746558, null));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(nqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                eVar.i(spannableStringBuilder, false, true);
                eVar.setOnClickListener(new j40(this, 26));
                frameLayout.addView(eVar, c8.ma.d(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                x9Var = frameLayout;
                a9Var = x9Var;
                break;
        }
        return new v4.f1(a9Var);
    }
}
