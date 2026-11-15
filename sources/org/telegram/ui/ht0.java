package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ht0 extends org.telegram.ui.Components.tj0 {
    public final Context f47811c;
    public final PrivacyControlActivity d;

    public ht0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.f47811c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int b10 = e1Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b10 == privacyControlActivity.f43017d0) {
            i15 = ((org.telegram.ui.ActionBar.e2) privacyControlActivity).currentAccount;
            if (!org.telegram.messenger.g5.r(i15).t(3)) {
                return true;
            }
        }
        i7 = privacyControlActivity.currentPhotoForRestRow;
        if (b10 != i7 && b10 != privacyControlActivity.f43014b0) {
            i10 = privacyControlActivity.photoForRestRow;
            if (b10 != i10) {
                i11 = privacyControlActivity.readRow;
                if (b10 != i11) {
                    i12 = privacyControlActivity.showGiftIconRow;
                    if (b10 != i12 && b10 != privacyControlActivity.f43022g0 && b10 != privacyControlActivity.f43031p0 && b10 != privacyControlActivity.f43032q0 && b10 != privacyControlActivity.f43034r0 && b10 != privacyControlActivity.f43030o0 && b10 != privacyControlActivity.f43029n0) {
                        if (privacyControlActivity.E != 12 || !privacyControlActivity.F0()) {
                            i13 = privacyControlActivity.nobodyRow;
                            if (b10 != i13 && b10 != privacyControlActivity.Q && b10 != privacyControlActivity.f43024i0) {
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
        return this.d.f43037t0;
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
        if (i7 != privacyControlActivity.U && i7 != privacyControlActivity.V && i7 != privacyControlActivity.f43017d0 && i7 != privacyControlActivity.f43022g0) {
            if (i7 != privacyControlActivity.W && i7 != privacyControlActivity.R && i7 != privacyControlActivity.S && i7 != privacyControlActivity.f43027l0 && i7 != privacyControlActivity.f43019e0 && i7 != privacyControlActivity.f43014b0 && i7 != privacyControlActivity.f43021f0 && i7 != privacyControlActivity.f43023h0) {
                i10 = privacyControlActivity.setBirthdayRow;
                if (i7 != i10 && i7 != privacyControlActivity.m0 && i7 != privacyControlActivity.f43036s0) {
                    if (i7 != privacyControlActivity.P && i7 != privacyControlActivity.f43025j0 && i7 != privacyControlActivity.T && i7 != privacyControlActivity.f43016c0 && i7 != privacyControlActivity.X) {
                        i11 = privacyControlActivity.giftTypesHeaderRow;
                        if (i7 != i11) {
                            i12 = privacyControlActivity.everybodyRow;
                            if (i7 != i12 && i7 != privacyControlActivity.Q) {
                                i13 = privacyControlActivity.nobodyRow;
                                if (i7 != i13 && i7 != privacyControlActivity.f43024i0 && i7 != privacyControlActivity.Y && i7 != privacyControlActivity.Z) {
                                    if (i7 == privacyControlActivity.O) {
                                        return 4;
                                    }
                                    if (i7 != privacyControlActivity.f43012a0) {
                                        i14 = privacyControlActivity.photoForRestRow;
                                        if (i7 != i14) {
                                            i15 = privacyControlActivity.currentPhotoForRestRow;
                                            if (i7 != i15) {
                                                i16 = privacyControlActivity.readRow;
                                                if (i7 != i16) {
                                                    i17 = privacyControlActivity.showGiftIconRow;
                                                    if (i7 != i17 && i7 != privacyControlActivity.f43031p0 && i7 != privacyControlActivity.f43032q0 && i7 != privacyControlActivity.f43034r0 && i7 != privacyControlActivity.f43029n0 && i7 != privacyControlActivity.f43030o0) {
                                                        i18 = privacyControlActivity.priceRow;
                                                        if (i7 == i18) {
                                                            return 9;
                                                        }
                                                        if (i7 == privacyControlActivity.f43026k0) {
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
    public final void t(v4.e1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ht0.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View y8Var;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.Cells.v9 v9Var;
        org.telegram.ui.ActionBar.e6 e6Var3;
        Context context = this.f47811c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i7) {
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
                y8Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
                break;
            case 6:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(privacyControlActivity.getParentActivity());
                privacyControlActivity.f43041w0 = l8Var;
                if (privacyControlActivity.f43046z0 == null) {
                    l8Var.o(2131232048, org.telegram.messenger.hd.a0(null, null, 2131745517, new Object[0]), false);
                } else {
                    l8Var.o(2131232048, org.telegram.messenger.hd.a0("UpdatePhotoForRest", null, 2131743817, new Object[0]), true);
                }
                privacyControlActivity.f43041w0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
                privacyControlActivity.f43041w0.g(org.telegram.ui.ActionBar.j6.f29184v6, org.telegram.ui.ActionBar.j6.f29165u6);
                privacyControlActivity.f43039v0 = new org.telegram.ui.Components.ch0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                privacyControlActivity.f43041w0.f30656e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                privacyControlActivity.f43041w0.f30656e.setAnimation(privacyControlActivity.f43039v0);
                y8Var = privacyControlActivity.f43041w0;
                break;
            case 7:
                privacyControlActivity.f43043x0 = new org.telegram.ui.Components.i9(privacyControlActivity.getParentActivity());
                privacyControlActivity.f43045y0 = new nr(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.f43046z0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.A0;
                    if (photo != null) {
                        org.telegram.ui.Components.i9 i9Var = privacyControlActivity.f43043x0;
                        org.telegram.messenger.gc i12 = org.telegram.messenger.gc.i(photoSize, photo);
                        i11 = ((org.telegram.ui.ActionBar.e2) privacyControlActivity).currentAccount;
                        i9Var.j(i12, "50_50", null, org.telegram.messenger.m10.i(i11).f());
                    } else {
                        org.telegram.ui.Components.i9 i9Var2 = privacyControlActivity.f43043x0;
                        org.telegram.messenger.gc e10 = org.telegram.messenger.gc.e(photoSize.location);
                        i10 = ((org.telegram.ui.ActionBar.e2) privacyControlActivity).currentAccount;
                        i9Var2.j(e10, "50_50", null, org.telegram.messenger.m10.i(i10).f());
                    }
                }
                privacyControlActivity.f43045y0.addView(privacyControlActivity.f43043x0, c8.ja.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.f43045y0.k(org.telegram.messenger.hd.M0(2131746289, null), false);
                privacyControlActivity.f43045y0.getImageView().setVisibility(0);
                privacyControlActivity.f43045y0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
                nr nrVar = privacyControlActivity.f43045y0;
                int i13 = org.telegram.ui.ActionBar.j6.f29070p7;
                nrVar.g(i13, i13);
                y8Var = privacyControlActivity.f43045y0;
                break;
            case 8:
                e6Var = ((org.telegram.ui.ActionBar.e2) privacyControlActivity).resourceProvider;
                y8Var = new org.telegram.ui.Cells.q8(context, e6Var);
                break;
            case 9:
                e6Var2 = ((org.telegram.ui.ActionBar.e2) privacyControlActivity).resourceProvider;
                y8Var = new org.telegram.ui.Cells.s7(context, e6Var2);
                break;
            case 10:
                ?? frameLayout = new FrameLayout(context);
                e6Var3 = ((org.telegram.ui.ActionBar.e2) privacyControlActivity).resourceProvider;
                hi.d dVar = new hi.d(context, e6Var3, true);
                dVar.setRoundRadius(24);
                org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(2131232244, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131746752, null));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                dVar.i(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new g40(this, 26));
                frameLayout.addView(dVar, c8.ja.d(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                v9Var = frameLayout;
                y8Var = v9Var;
                break;
        }
        return new v4.e1(y8Var);
    }
}
