package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jt0 extends org.telegram.ui.Components.dk0 {
    public final Context f49205c;
    public final PrivacyControlActivity d;

    public jt0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.f49205c = context;
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
        if (b10 == privacyControlActivity.f43588d0) {
            i15 = ((org.telegram.ui.ActionBar.g2) privacyControlActivity).currentAccount;
            if (!org.telegram.messenger.i5.r(i15).t(3)) {
                return true;
            }
        }
        i7 = privacyControlActivity.currentPhotoForRestRow;
        if (b10 != i7 && b10 != privacyControlActivity.f43585b0) {
            i10 = privacyControlActivity.photoForRestRow;
            if (b10 != i10) {
                i11 = privacyControlActivity.readRow;
                if (b10 != i11) {
                    i12 = privacyControlActivity.showGiftIconRow;
                    if (b10 != i12 && b10 != privacyControlActivity.f43593g0 && b10 != privacyControlActivity.f43602p0 && b10 != privacyControlActivity.f43603q0 && b10 != privacyControlActivity.f43605r0 && b10 != privacyControlActivity.f43601o0 && b10 != privacyControlActivity.f43600n0) {
                        if (privacyControlActivity.E != 12 || !privacyControlActivity.F0()) {
                            i13 = privacyControlActivity.nobodyRow;
                            if (b10 != i13 && b10 != privacyControlActivity.Q && b10 != privacyControlActivity.f43595i0) {
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
        return this.d.f43608t0;
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
        if (i7 != privacyControlActivity.U && i7 != privacyControlActivity.V && i7 != privacyControlActivity.f43588d0 && i7 != privacyControlActivity.f43593g0) {
            if (i7 != privacyControlActivity.W && i7 != privacyControlActivity.R && i7 != privacyControlActivity.S && i7 != privacyControlActivity.f43598l0 && i7 != privacyControlActivity.f43590e0 && i7 != privacyControlActivity.f43585b0 && i7 != privacyControlActivity.f43592f0 && i7 != privacyControlActivity.f43594h0) {
                i10 = privacyControlActivity.setBirthdayRow;
                if (i7 != i10 && i7 != privacyControlActivity.m0 && i7 != privacyControlActivity.f43607s0) {
                    if (i7 != privacyControlActivity.P && i7 != privacyControlActivity.f43596j0 && i7 != privacyControlActivity.T && i7 != privacyControlActivity.f43587c0 && i7 != privacyControlActivity.X) {
                        i11 = privacyControlActivity.giftTypesHeaderRow;
                        if (i7 != i11) {
                            i12 = privacyControlActivity.everybodyRow;
                            if (i7 != i12 && i7 != privacyControlActivity.Q) {
                                i13 = privacyControlActivity.nobodyRow;
                                if (i7 != i13 && i7 != privacyControlActivity.f43595i0 && i7 != privacyControlActivity.Y && i7 != privacyControlActivity.Z) {
                                    if (i7 == privacyControlActivity.O) {
                                        return 4;
                                    }
                                    if (i7 != privacyControlActivity.f43583a0) {
                                        i14 = privacyControlActivity.photoForRestRow;
                                        if (i7 != i14) {
                                            i15 = privacyControlActivity.currentPhotoForRestRow;
                                            if (i7 != i15) {
                                                i16 = privacyControlActivity.readRow;
                                                if (i7 != i16) {
                                                    i17 = privacyControlActivity.showGiftIconRow;
                                                    if (i7 != i17 && i7 != privacyControlActivity.f43602p0 && i7 != privacyControlActivity.f43603q0 && i7 != privacyControlActivity.f43605r0 && i7 != privacyControlActivity.f43600n0 && i7 != privacyControlActivity.f43601o0) {
                                                        i18 = privacyControlActivity.priceRow;
                                                        if (i7 == i18) {
                                                            return 9;
                                                        }
                                                        if (i7 == privacyControlActivity.f43597k0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jt0.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View z8Var;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        org.telegram.ui.Cells.w9 w9Var;
        org.telegram.ui.ActionBar.i6 i6Var3;
        Context context = this.f49205c;
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
                z8Var = new org.telegram.ui.Cells.o4(context);
                break;
            case 3:
                z8Var = new org.telegram.ui.Cells.i6(context, null);
                break;
            case 4:
                z8Var = privacyControlActivity.d;
                break;
            case 5:
            default:
                z8Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 6:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(privacyControlActivity.getParentActivity());
                privacyControlActivity.f43612w0 = m8Var;
                if (privacyControlActivity.f43617z0 == null) {
                    m8Var.o(2131232052, org.telegram.messenger.gd.a0(null, null, 2131745321, new Object[0]), false);
                } else {
                    m8Var.o(2131232052, org.telegram.messenger.gd.a0("UpdatePhotoForRest", null, 2131743570, new Object[0]), true);
                }
                privacyControlActivity.f43612w0.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                privacyControlActivity.f43612w0.g(org.telegram.ui.ActionBar.n6.f29786v6, org.telegram.ui.ActionBar.n6.f29767u6);
                privacyControlActivity.f43610v0 = new org.telegram.ui.Components.nh0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                privacyControlActivity.f43612w0.f31176e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                privacyControlActivity.f43612w0.f31176e.setAnimation(privacyControlActivity.f43610v0);
                z8Var = privacyControlActivity.f43612w0;
                break;
            case 7:
                privacyControlActivity.f43614x0 = new org.telegram.ui.Components.p9(privacyControlActivity.getParentActivity());
                privacyControlActivity.f43616y0 = new or(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.f43617z0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.A0;
                    if (photo != null) {
                        org.telegram.ui.Components.p9 p9Var = privacyControlActivity.f43614x0;
                        org.telegram.messenger.fc i12 = org.telegram.messenger.fc.i(photoSize, photo);
                        i11 = ((org.telegram.ui.ActionBar.g2) privacyControlActivity).currentAccount;
                        p9Var.j(i12, "50_50", null, org.telegram.messenger.i10.i(i11).f());
                    } else {
                        org.telegram.ui.Components.p9 p9Var2 = privacyControlActivity.f43614x0;
                        org.telegram.messenger.fc e10 = org.telegram.messenger.fc.e(photoSize.location);
                        i10 = ((org.telegram.ui.ActionBar.g2) privacyControlActivity).currentAccount;
                        p9Var2.j(e10, "50_50", null, org.telegram.messenger.i10.i(i10).f());
                    }
                }
                privacyControlActivity.f43616y0.addView(privacyControlActivity.f43614x0, c8.na.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.f43616y0.k(org.telegram.messenger.gd.N0(2131746093, null), false);
                privacyControlActivity.f43616y0.getImageView().setVisibility(0);
                privacyControlActivity.f43616y0.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                or orVar = privacyControlActivity.f43616y0;
                int i13 = org.telegram.ui.ActionBar.n6.f29672p7;
                orVar.g(i13, i13);
                z8Var = privacyControlActivity.f43616y0;
                break;
            case 8:
                i6Var = ((org.telegram.ui.ActionBar.g2) privacyControlActivity).resourceProvider;
                z8Var = new org.telegram.ui.Cells.r8(context, i6Var);
                break;
            case 9:
                i6Var2 = ((org.telegram.ui.ActionBar.g2) privacyControlActivity).resourceProvider;
                z8Var = new org.telegram.ui.Cells.t7(context, i6Var2);
                break;
            case 10:
                ?? frameLayout = new FrameLayout(context);
                i6Var3 = ((org.telegram.ui.ActionBar.g2) privacyControlActivity).resourceProvider;
                hi.e eVar = new hi.e(context, i6Var3, true);
                eVar.setRoundRadius(24);
                org.telegram.ui.Components.kq kqVar = new org.telegram.ui.Components.kq(2131232248, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.gd.N0(2131746558, null));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(kqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                eVar.i(spannableStringBuilder, false, true);
                eVar.setOnClickListener(new i40(this, 26));
                frameLayout.addView(eVar, c8.na.d(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                w9Var = frameLayout;
                z8Var = w9Var;
                break;
        }
        return new v4.f1(z8Var);
    }
}
