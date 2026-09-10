package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class ay0 extends org.telegram.ui.Components.ul0 {
    public final Context f31104c;
    public final PrivacyControlActivity d;

    public ay0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.f31104c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int b10 = c1Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b10 == privacyControlActivity.f30305b0) {
            i16 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).currentAccount;
            if (!ContactsController.getInstance(i16).getLoadingPrivacyInfo(3)) {
                return true;
            }
        }
        i10 = privacyControlActivity.currentPhotoForRestRow;
        if (b10 != i10 && b10 != privacyControlActivity.Z) {
            i11 = privacyControlActivity.photoForRestRow;
            if (b10 != i11) {
                i12 = privacyControlActivity.readRow;
                if (b10 != i12) {
                    i13 = privacyControlActivity.showGiftIconRow;
                    if (b10 != i13 && b10 != privacyControlActivity.f30309e0 && b10 != privacyControlActivity.f30319n0 && b10 != privacyControlActivity.f30320o0 && b10 != privacyControlActivity.f30321p0 && b10 != privacyControlActivity.m0 && b10 != privacyControlActivity.f30317l0) {
                        if (privacyControlActivity.f30332x != 12 || !privacyControlActivity.u0()) {
                            i14 = privacyControlActivity.nobodyRow;
                            if (b10 != i14 && b10 != privacyControlActivity.O && b10 != privacyControlActivity.f30312g0) {
                                i15 = privacyControlActivity.everybodyRow;
                                if (b10 != i15 && b10 != privacyControlActivity.T && b10 != privacyControlActivity.S) {
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
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            long longValue = ((Long) arrayList.get(i11)).longValue();
            if (longValue > 0) {
                i10++;
            } else {
                TLRPC.Chat chat = this.d.getMessagesController().getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    i10 += chat.participants_count;
                }
            }
        }
        return i10;
    }

    @Override
    public final int h() {
        return this.d.f30324r0;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        PrivacyControlActivity privacyControlActivity = this.d;
        if (i10 != privacyControlActivity.S && i10 != privacyControlActivity.T && i10 != privacyControlActivity.f30305b0 && i10 != privacyControlActivity.f30309e0) {
            if (i10 != privacyControlActivity.U && i10 != privacyControlActivity.P && i10 != privacyControlActivity.Q && i10 != privacyControlActivity.f30315j0 && i10 != privacyControlActivity.f30307c0 && i10 != privacyControlActivity.Z && i10 != privacyControlActivity.f30308d0 && i10 != privacyControlActivity.f30311f0) {
                i11 = privacyControlActivity.setBirthdayRow;
                if (i10 != i11 && i10 != privacyControlActivity.f30316k0 && i10 != privacyControlActivity.f30322q0) {
                    if (i10 != privacyControlActivity.N && i10 != privacyControlActivity.f30313h0 && i10 != privacyControlActivity.R && i10 != privacyControlActivity.f30303a0 && i10 != privacyControlActivity.V) {
                        i12 = privacyControlActivity.giftTypesHeaderRow;
                        if (i10 != i12) {
                            i13 = privacyControlActivity.everybodyRow;
                            if (i10 != i13 && i10 != privacyControlActivity.O) {
                                i14 = privacyControlActivity.nobodyRow;
                                if (i10 != i14 && i10 != privacyControlActivity.f30312g0 && i10 != privacyControlActivity.W && i10 != privacyControlActivity.X) {
                                    if (i10 == privacyControlActivity.M) {
                                        return 4;
                                    }
                                    if (i10 != privacyControlActivity.Y) {
                                        i15 = privacyControlActivity.photoForRestRow;
                                        if (i10 != i15) {
                                            i16 = privacyControlActivity.currentPhotoForRestRow;
                                            if (i10 != i16) {
                                                i17 = privacyControlActivity.readRow;
                                                if (i10 != i17) {
                                                    i18 = privacyControlActivity.showGiftIconRow;
                                                    if (i10 != i18 && i10 != privacyControlActivity.f30319n0 && i10 != privacyControlActivity.f30320o0 && i10 != privacyControlActivity.f30321p0 && i10 != privacyControlActivity.f30317l0 && i10 != privacyControlActivity.m0) {
                                                        i19 = privacyControlActivity.priceRow;
                                                        if (i10 == i19) {
                                                            return 9;
                                                        }
                                                        if (i10 == privacyControlActivity.f30314i0) {
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
    public final void v(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay0.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        View view;
        Context context = this.f31104c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context);
                gaVar.setCanDisable(true);
                view = gaVar;
                break;
            case 1:
                view = new org.telegram.ui.Cells.f9(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.m4(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.l6(context, null);
                break;
            case 4:
                view = privacyControlActivity.e;
                break;
            case 5:
            default:
                view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                break;
            case 6:
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(privacyControlActivity.getParentActivity());
                privacyControlActivity.f30328u0 = s8Var;
                if (privacyControlActivity.f30333x0 == null) {
                    s8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SetPhotoForRest, new Object[0]), false);
                } else {
                    s8Var.m(R.drawable.msg_addphoto, LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]), true);
                }
                privacyControlActivity.f30328u0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                privacyControlActivity.f30328u0.e(org.telegram.ui.ActionBar.j6.f18254v6, org.telegram.ui.ActionBar.j6.f18236u6);
                privacyControlActivity.f30327t0 = new org.telegram.ui.Components.hj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                privacyControlActivity.f30328u0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                privacyControlActivity.f30328u0.e.setAnimation(privacyControlActivity.f30327t0);
                view = privacyControlActivity.f30328u0;
                break;
            case 7:
                privacyControlActivity.f30329v0 = new org.telegram.ui.Components.w9(privacyControlActivity.getParentActivity());
                privacyControlActivity.f30331w0 = new rs(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.f30333x0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.f30335y0;
                    if (photo != null) {
                        org.telegram.ui.Components.w9 w9Var = privacyControlActivity.f30329v0;
                        ImageLocation forPhoto = ImageLocation.getForPhoto(photoSize, photo);
                        i12 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).currentAccount;
                        w9Var.h(forPhoto, "50_50", null, UserConfig.getInstance(i12).getCurrentUser());
                    } else {
                        org.telegram.ui.Components.w9 w9Var2 = privacyControlActivity.f30329v0;
                        ImageLocation forLocal = ImageLocation.getForLocal(photoSize.location);
                        i11 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).currentAccount;
                        w9Var2.h(forLocal, "50_50", null, UserConfig.getInstance(i11).getCurrentUser());
                    }
                }
                privacyControlActivity.f30331w0.addView(privacyControlActivity.f30329v0, w7.a6.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.f30331w0.i(LocaleController.getString(R.string.RemovePublicPhoto), false);
                privacyControlActivity.f30331w0.getImageView().setVisibility(0);
                privacyControlActivity.f30331w0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                rs rsVar = privacyControlActivity.f30331w0;
                int i13 = org.telegram.ui.ActionBar.j6.f18144p7;
                rsVar.e(i13, i13);
                view = privacyControlActivity.f30331w0;
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.x8(context, f6Var);
                break;
            case 9:
                f6Var2 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.a8(context, f6Var2);
                break;
            case 10:
                FrameLayout frameLayout = new FrameLayout(context);
                f6Var3 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).resourceProvider;
                bi.d dVar = new bi.d(context, f6Var3, true);
                dVar.setRoundRadius(24);
                org.telegram.ui.Components.uq uqVar = new org.telegram.ui.Components.uq(R.drawable.msg_mini_lock3, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PrivateMessagesChargePremiumLocked));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(uqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                dVar.g(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new l60(this, 24));
                frameLayout.addView(dVar, w7.a6.d(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                view = frameLayout;
                break;
        }
        return new s4.c1(view);
    }
}
