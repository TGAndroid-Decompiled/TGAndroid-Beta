package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class at0 extends org.telegram.ui.Components.sj0 {
    public final Context f43842c;
    public final PrivacyControlActivity d;

    public at0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.f43842c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int b10 = d1Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b10 == privacyControlActivity.f41674d0) {
            i15 = ((org.telegram.ui.ActionBar.d2) privacyControlActivity).currentAccount;
            if (!org.telegram.messenger.g5.r(i15).t(3)) {
                return true;
            }
        }
        i3 = privacyControlActivity.currentPhotoForRestRow;
        if (b10 != i3 && b10 != privacyControlActivity.f41671b0) {
            i10 = privacyControlActivity.photoForRestRow;
            if (b10 != i10) {
                i11 = privacyControlActivity.readRow;
                if (b10 != i11) {
                    i12 = privacyControlActivity.showGiftIconRow;
                    if (b10 != i12 && b10 != privacyControlActivity.f41679g0 && b10 != privacyControlActivity.f41688p0 && b10 != privacyControlActivity.f41689q0 && b10 != privacyControlActivity.f41691r0 && b10 != privacyControlActivity.f41687o0 && b10 != privacyControlActivity.f41686n0) {
                        if (privacyControlActivity.E != 12 || !privacyControlActivity.F0()) {
                            i13 = privacyControlActivity.nobodyRow;
                            if (b10 != i13 && b10 != privacyControlActivity.Q && b10 != privacyControlActivity.f41681i0) {
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
        int i3 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long longValue = ((Long) arrayList.get(i10)).longValue();
            if (longValue > 0) {
                i3++;
            } else {
                TLRPC.Chat M0 = this.d.getMessagesController().M0(Long.valueOf(-longValue));
                if (M0 != null) {
                    i3 += M0.participants_count;
                }
            }
        }
        return i3;
    }

    @Override
    public final int b() {
        return this.d.f41694t0;
    }

    @Override
    public final int d(int i3) {
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
        if (i3 != privacyControlActivity.U && i3 != privacyControlActivity.V && i3 != privacyControlActivity.f41674d0 && i3 != privacyControlActivity.f41679g0) {
            if (i3 != privacyControlActivity.W && i3 != privacyControlActivity.R && i3 != privacyControlActivity.S && i3 != privacyControlActivity.f41684l0 && i3 != privacyControlActivity.f41676e0 && i3 != privacyControlActivity.f41671b0 && i3 != privacyControlActivity.f41678f0 && i3 != privacyControlActivity.f41680h0) {
                i10 = privacyControlActivity.setBirthdayRow;
                if (i3 != i10 && i3 != privacyControlActivity.m0 && i3 != privacyControlActivity.f41693s0) {
                    if (i3 != privacyControlActivity.P && i3 != privacyControlActivity.f41682j0 && i3 != privacyControlActivity.T && i3 != privacyControlActivity.f41673c0 && i3 != privacyControlActivity.X) {
                        i11 = privacyControlActivity.giftTypesHeaderRow;
                        if (i3 != i11) {
                            i12 = privacyControlActivity.everybodyRow;
                            if (i3 != i12 && i3 != privacyControlActivity.Q) {
                                i13 = privacyControlActivity.nobodyRow;
                                if (i3 != i13 && i3 != privacyControlActivity.f41681i0 && i3 != privacyControlActivity.Y && i3 != privacyControlActivity.Z) {
                                    if (i3 == privacyControlActivity.O) {
                                        return 4;
                                    }
                                    if (i3 != privacyControlActivity.f41669a0) {
                                        i14 = privacyControlActivity.photoForRestRow;
                                        if (i3 != i14) {
                                            i15 = privacyControlActivity.currentPhotoForRestRow;
                                            if (i3 != i15) {
                                                i16 = privacyControlActivity.readRow;
                                                if (i3 != i16) {
                                                    i17 = privacyControlActivity.showGiftIconRow;
                                                    if (i3 != i17 && i3 != privacyControlActivity.f41688p0 && i3 != privacyControlActivity.f41689q0 && i3 != privacyControlActivity.f41691r0 && i3 != privacyControlActivity.f41686n0 && i3 != privacyControlActivity.f41687o0) {
                                                        i18 = privacyControlActivity.priceRow;
                                                        if (i3 == i18) {
                                                            return 9;
                                                        }
                                                        if (i3 == privacyControlActivity.f41683k0) {
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
    public final void t(u4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.at0.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View y8Var;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.Cells.v9 v9Var;
        org.telegram.ui.ActionBar.e6 e6Var3;
        Context context = this.f43842c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i3) {
            case 0:
                org.telegram.ui.Cells.v9 v9Var2 = new org.telegram.ui.Cells.v9(context);
                v9Var2.setCanDisable(true);
                v9Var = v9Var2;
                y8Var = v9Var;
                break;
            case 1:
                y8Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 2:
                y8Var = new org.telegram.ui.Cells.n4(context);
                break;
            case 3:
                y8Var = new org.telegram.ui.Cells.h6(context, null);
                break;
            case 4:
                y8Var = privacyControlActivity.d;
                break;
            case 5:
            default:
                y8Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 6:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(privacyControlActivity.getParentActivity());
                privacyControlActivity.f41698w0 = l8Var;
                if (privacyControlActivity.f41703z0 == null) {
                    l8Var.o(2131232047, org.telegram.messenger.bd.a0(null, null, 2131745527, new Object[0]), false);
                } else {
                    l8Var.o(2131232047, org.telegram.messenger.bd.a0("UpdatePhotoForRest", null, 2131743827, new Object[0]), true);
                }
                privacyControlActivity.f41698w0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                privacyControlActivity.f41698w0.g(org.telegram.ui.ActionBar.k6.f28214v6, org.telegram.ui.ActionBar.k6.f28196u6);
                privacyControlActivity.f41696v0 = new org.telegram.ui.Components.ch0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                privacyControlActivity.f41698w0.f29595e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                privacyControlActivity.f41698w0.f29595e.setAnimation(privacyControlActivity.f41696v0);
                y8Var = privacyControlActivity.f41698w0;
                break;
            case 7:
                privacyControlActivity.f41700x0 = new org.telegram.ui.Components.k9(privacyControlActivity.getParentActivity());
                privacyControlActivity.f41702y0 = new jr(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.f41703z0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.A0;
                    if (photo != null) {
                        org.telegram.ui.Components.k9 k9Var = privacyControlActivity.f41700x0;
                        org.telegram.messenger.ac i12 = org.telegram.messenger.ac.i(photoSize, photo);
                        i11 = ((org.telegram.ui.ActionBar.d2) privacyControlActivity).currentAccount;
                        k9Var.j(i12, "50_50", null, org.telegram.messenger.h10.i(i11).f());
                    } else {
                        org.telegram.ui.Components.k9 k9Var2 = privacyControlActivity.f41700x0;
                        org.telegram.messenger.ac e10 = org.telegram.messenger.ac.e(photoSize.location);
                        i10 = ((org.telegram.ui.ActionBar.d2) privacyControlActivity).currentAccount;
                        k9Var2.j(e10, "50_50", null, org.telegram.messenger.h10.i(i10).f());
                    }
                }
                privacyControlActivity.f41702y0.addView(privacyControlActivity.f41700x0, b8.mf.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.f41702y0.k(org.telegram.messenger.bd.M0(2131746297, null), false);
                privacyControlActivity.f41702y0.getImageView().setVisibility(0);
                privacyControlActivity.f41702y0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                jr jrVar = privacyControlActivity.f41702y0;
                int i13 = org.telegram.ui.ActionBar.k6.f28102p7;
                jrVar.g(i13, i13);
                y8Var = privacyControlActivity.f41702y0;
                break;
            case 8:
                e6Var = ((org.telegram.ui.ActionBar.d2) privacyControlActivity).resourceProvider;
                y8Var = new org.telegram.ui.Cells.q8(context, e6Var);
                break;
            case 9:
                e6Var2 = ((org.telegram.ui.ActionBar.d2) privacyControlActivity).resourceProvider;
                y8Var = new org.telegram.ui.Cells.s7(context, e6Var2);
                break;
            case 10:
                ?? frameLayout = new FrameLayout(context);
                e6Var3 = ((org.telegram.ui.ActionBar.d2) privacyControlActivity).resourceProvider;
                gi.d dVar = new gi.d(context, e6Var3, true);
                dVar.setRoundRadius(24);
                org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131232243, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131746760, null));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                dVar.i(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new b40(this, 26));
                frameLayout.addView(dVar, b8.mf.d(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                v9Var = frameLayout;
                y8Var = v9Var;
                break;
        }
        return new u4.d1(y8Var);
    }
}
