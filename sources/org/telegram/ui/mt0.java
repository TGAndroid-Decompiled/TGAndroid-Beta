package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mt0 extends org.telegram.ui.Components.oj0 {
    public final Context f48052c;
    public final PrivacyControlActivity d;

    public mt0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.f48052c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int b10 = d1Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b10 == privacyControlActivity.f41644c0) {
            i15 = ((org.telegram.ui.ActionBar.f2) privacyControlActivity).currentAccount;
            if (!org.telegram.messenger.g5.r(i15).t(3)) {
                return true;
            }
        }
        i7 = privacyControlActivity.currentPhotoForRestRow;
        if (b10 != i7 && b10 != privacyControlActivity.f41640a0) {
            i10 = privacyControlActivity.photoForRestRow;
            if (b10 != i10) {
                i11 = privacyControlActivity.readRow;
                if (b10 != i11) {
                    i12 = privacyControlActivity.showGiftIconRow;
                    if (b10 != i12 && b10 != privacyControlActivity.f41649f0 && b10 != privacyControlActivity.f41658o0 && b10 != privacyControlActivity.f41659p0 && b10 != privacyControlActivity.f41660q0 && b10 != privacyControlActivity.f41657n0 && b10 != privacyControlActivity.m0) {
                        if (privacyControlActivity.D != 12 || !privacyControlActivity.F0()) {
                            i13 = privacyControlActivity.nobodyRow;
                            if (b10 != i13 && b10 != privacyControlActivity.P && b10 != privacyControlActivity.f41651h0) {
                                i14 = privacyControlActivity.everybodyRow;
                                if (b10 != i14 && b10 != privacyControlActivity.U && b10 != privacyControlActivity.T) {
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
                TLRPC.Chat M0 = this.d.getMessagesController().M0(Long.valueOf(-longValue));
                if (M0 != null) {
                    i7 += M0.participants_count;
                }
            }
        }
        return i7;
    }

    @Override
    public final int b() {
        return this.d.f41664s0;
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
        if (i7 != privacyControlActivity.T && i7 != privacyControlActivity.U && i7 != privacyControlActivity.f41644c0 && i7 != privacyControlActivity.f41649f0) {
            if (i7 != privacyControlActivity.V && i7 != privacyControlActivity.Q && i7 != privacyControlActivity.R && i7 != privacyControlActivity.f41654k0 && i7 != privacyControlActivity.f41645d0 && i7 != privacyControlActivity.f41640a0 && i7 != privacyControlActivity.f41647e0 && i7 != privacyControlActivity.f41650g0) {
                i10 = privacyControlActivity.setBirthdayRow;
                if (i7 != i10 && i7 != privacyControlActivity.f41655l0 && i7 != privacyControlActivity.f41662r0) {
                    if (i7 != privacyControlActivity.O && i7 != privacyControlActivity.f41652i0 && i7 != privacyControlActivity.S && i7 != privacyControlActivity.f41642b0 && i7 != privacyControlActivity.W) {
                        i11 = privacyControlActivity.giftTypesHeaderRow;
                        if (i7 != i11) {
                            i12 = privacyControlActivity.everybodyRow;
                            if (i7 != i12 && i7 != privacyControlActivity.P) {
                                i13 = privacyControlActivity.nobodyRow;
                                if (i7 != i13 && i7 != privacyControlActivity.f41651h0 && i7 != privacyControlActivity.X && i7 != privacyControlActivity.Y) {
                                    if (i7 == privacyControlActivity.N) {
                                        return 4;
                                    }
                                    if (i7 != privacyControlActivity.Z) {
                                        i14 = privacyControlActivity.photoForRestRow;
                                        if (i7 != i14) {
                                            i15 = privacyControlActivity.currentPhotoForRestRow;
                                            if (i7 != i15) {
                                                i16 = privacyControlActivity.readRow;
                                                if (i7 != i16) {
                                                    i17 = privacyControlActivity.showGiftIconRow;
                                                    if (i7 != i17 && i7 != privacyControlActivity.f41658o0 && i7 != privacyControlActivity.f41659p0 && i7 != privacyControlActivity.f41660q0 && i7 != privacyControlActivity.m0 && i7 != privacyControlActivity.f41657n0) {
                                                        i18 = privacyControlActivity.priceRow;
                                                        if (i7 == i18) {
                                                            return 9;
                                                        }
                                                        if (i7 == privacyControlActivity.f41653j0) {
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
    public final void t(v4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mt0.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View z8Var;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        org.telegram.ui.Cells.w9 w9Var;
        org.telegram.ui.ActionBar.h6 h6Var3;
        Context context = this.f48052c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i7) {
            case 0:
                org.telegram.ui.Cells.w9 w9Var2 = new org.telegram.ui.Cells.w9(context);
                w9Var2.setCanDisable(true);
                w9Var = w9Var2;
                z8Var = w9Var;
                break;
            case 1:
                z8Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 2:
                z8Var = new org.telegram.ui.Cells.n4(context);
                break;
            case 3:
                z8Var = new org.telegram.ui.Cells.i6(context, null);
                break;
            case 4:
                z8Var = privacyControlActivity.d;
                break;
            case 5:
            default:
                z8Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 6:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(privacyControlActivity.getParentActivity());
                privacyControlActivity.f41667v0 = m8Var;
                if (privacyControlActivity.f41673y0 == null) {
                    m8Var.o(2131232047, org.telegram.messenger.id.a0(null, null, 2131745517, new Object[0]), false);
                } else {
                    m8Var.o(2131232047, org.telegram.messenger.id.a0("UpdatePhotoForRest", null, 2131743817, new Object[0]), true);
                }
                privacyControlActivity.f41667v0.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(false));
                privacyControlActivity.f41667v0.g(org.telegram.ui.ActionBar.m6.f28225v6, org.telegram.ui.ActionBar.m6.f28206u6);
                privacyControlActivity.f41666u0 = new org.telegram.ui.Components.zg0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                privacyControlActivity.f41667v0.f29585e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                privacyControlActivity.f41667v0.f29585e.setAnimation(privacyControlActivity.f41666u0);
                z8Var = privacyControlActivity.f41667v0;
                break;
            case 7:
                privacyControlActivity.f41669w0 = new org.telegram.ui.Components.k9(privacyControlActivity.getParentActivity());
                privacyControlActivity.f41671x0 = new or(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.f41673y0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.f41674z0;
                    if (photo != null) {
                        org.telegram.ui.Components.k9 k9Var = privacyControlActivity.f41669w0;
                        org.telegram.messenger.hc i12 = org.telegram.messenger.hc.i(photoSize, photo);
                        i11 = ((org.telegram.ui.ActionBar.f2) privacyControlActivity).currentAccount;
                        k9Var.j(i12, "50_50", null, org.telegram.messenger.p10.i(i11).f());
                    } else {
                        org.telegram.ui.Components.k9 k9Var2 = privacyControlActivity.f41669w0;
                        org.telegram.messenger.hc e10 = org.telegram.messenger.hc.e(photoSize.location);
                        i10 = ((org.telegram.ui.ActionBar.f2) privacyControlActivity).currentAccount;
                        k9Var2.j(e10, "50_50", null, org.telegram.messenger.p10.i(i10).f());
                    }
                }
                privacyControlActivity.f41671x0.addView(privacyControlActivity.f41669w0, c8.ha.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.f41671x0.k(org.telegram.messenger.id.M0(2131746289, null), false);
                privacyControlActivity.f41671x0.getImageView().setVisibility(0);
                privacyControlActivity.f41671x0.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(false));
                or orVar = privacyControlActivity.f41671x0;
                int i13 = org.telegram.ui.ActionBar.m6.f28111p7;
                orVar.g(i13, i13);
                z8Var = privacyControlActivity.f41671x0;
                break;
            case 8:
                h6Var = ((org.telegram.ui.ActionBar.f2) privacyControlActivity).resourceProvider;
                z8Var = new org.telegram.ui.Cells.r8(context, h6Var);
                break;
            case 9:
                h6Var2 = ((org.telegram.ui.ActionBar.f2) privacyControlActivity).resourceProvider;
                z8Var = new org.telegram.ui.Cells.t7(context, h6Var2);
                break;
            case 10:
                ?? frameLayout = new FrameLayout(context);
                h6Var3 = ((org.telegram.ui.ActionBar.f2) privacyControlActivity).resourceProvider;
                fi.d dVar = new fi.d(context, h6Var3, true);
                dVar.setRoundRadius(24);
                org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131232243, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131746752, null));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                dVar.i(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new j40(this, 26));
                frameLayout.addView(dVar, c8.ha.d(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                w9Var = frameLayout;
                z8Var = w9Var;
                break;
        }
        return new v4.d1(z8Var);
    }
}
