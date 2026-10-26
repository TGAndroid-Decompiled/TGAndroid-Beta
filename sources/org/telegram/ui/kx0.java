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
public final class kx0 extends org.telegram.ui.Components.lm0 {
    public final Context f41082c;
    public final PrivacyControlActivity d;

    public kx0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.f41082c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int b10 = e1Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b10 == privacyControlActivity.f35901a0) {
            i16 = ((org.telegram.ui.ActionBar.r2) privacyControlActivity).currentAccount;
            if (!ContactsController.getInstance(i16).getLoadingPrivacyInfo(3)) {
                return true;
            }
        }
        i10 = privacyControlActivity.currentPhotoForRestRow;
        if (b10 != i10 && b10 != privacyControlActivity.Y) {
            i11 = privacyControlActivity.photoForRestRow;
            if (b10 != i11) {
                i12 = privacyControlActivity.readRow;
                if (b10 != i12) {
                    i13 = privacyControlActivity.showGiftIconRow;
                    if (b10 != i13 && b10 != privacyControlActivity.f35906d0 && b10 != privacyControlActivity.m0 && b10 != privacyControlActivity.f35917n0 && b10 != privacyControlActivity.f35918o0 && b10 != privacyControlActivity.f35915l0 && b10 != privacyControlActivity.f35914k0) {
                        if (privacyControlActivity.f35928w != 12 || !privacyControlActivity.v0()) {
                            i14 = privacyControlActivity.nobodyRow;
                            if (b10 != i14 && b10 != privacyControlActivity.N && b10 != privacyControlActivity.f35909f0) {
                                i15 = privacyControlActivity.everybodyRow;
                                if (b10 != i15 && b10 != privacyControlActivity.S && b10 != privacyControlActivity.R) {
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
        return this.d.f35920q0;
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
        if (i10 != privacyControlActivity.R && i10 != privacyControlActivity.S && i10 != privacyControlActivity.f35901a0 && i10 != privacyControlActivity.f35906d0) {
            if (i10 != privacyControlActivity.T && i10 != privacyControlActivity.O && i10 != privacyControlActivity.P && i10 != privacyControlActivity.f35912i0 && i10 != privacyControlActivity.f35903b0 && i10 != privacyControlActivity.Y && i10 != privacyControlActivity.f35905c0 && i10 != privacyControlActivity.f35907e0) {
                i11 = privacyControlActivity.setBirthdayRow;
                if (i10 != i11 && i10 != privacyControlActivity.f35913j0 && i10 != privacyControlActivity.f35919p0) {
                    if (i10 != privacyControlActivity.M && i10 != privacyControlActivity.f35910g0 && i10 != privacyControlActivity.Q && i10 != privacyControlActivity.Z && i10 != privacyControlActivity.U) {
                        i12 = privacyControlActivity.giftTypesHeaderRow;
                        if (i10 != i12) {
                            i13 = privacyControlActivity.everybodyRow;
                            if (i10 != i13 && i10 != privacyControlActivity.N) {
                                i14 = privacyControlActivity.nobodyRow;
                                if (i10 != i14 && i10 != privacyControlActivity.f35909f0 && i10 != privacyControlActivity.V && i10 != privacyControlActivity.W) {
                                    if (i10 == privacyControlActivity.L) {
                                        return 4;
                                    }
                                    if (i10 != privacyControlActivity.X) {
                                        i15 = privacyControlActivity.photoForRestRow;
                                        if (i10 != i15) {
                                            i16 = privacyControlActivity.currentPhotoForRestRow;
                                            if (i10 != i16) {
                                                i17 = privacyControlActivity.readRow;
                                                if (i10 != i17) {
                                                    i18 = privacyControlActivity.showGiftIconRow;
                                                    if (i10 != i18 && i10 != privacyControlActivity.m0 && i10 != privacyControlActivity.f35917n0 && i10 != privacyControlActivity.f35918o0 && i10 != privacyControlActivity.f35914k0 && i10 != privacyControlActivity.f35915l0) {
                                                        i19 = privacyControlActivity.priceRow;
                                                        if (i10 == i19) {
                                                            return 9;
                                                        }
                                                        if (i10 == privacyControlActivity.f35911h0) {
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
    public final void v(s4.e1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kx0.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        View view;
        Context context = this.f41082c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context);
                gaVar.setCanDisable(true);
                view = gaVar;
                break;
            case 1:
                view = new org.telegram.ui.Cells.i9(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.q4(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.o6(context, null);
                break;
            case 4:
                view = privacyControlActivity.d;
                break;
            case 5:
            default:
                view = new org.telegram.ui.Cells.f7(context, (d3) null);
                break;
            case 6:
                org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(privacyControlActivity.getParentActivity());
                privacyControlActivity.f35925t0 = v8Var;
                if (privacyControlActivity.f35929w0 == null) {
                    v8Var.o(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SetPhotoForRest, new Object[0]), false);
                } else {
                    v8Var.o(R.drawable.msg_addphoto, LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]), true);
                }
                privacyControlActivity.f35925t0.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
                privacyControlActivity.f35925t0.g(org.telegram.ui.ActionBar.y6.f23692v6, org.telegram.ui.ActionBar.y6.f23673u6);
                privacyControlActivity.f35924s0 = new org.telegram.ui.Components.xj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                privacyControlActivity.f35925t0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                privacyControlActivity.f35925t0.e.setAnimation(privacyControlActivity.f35924s0);
                view = privacyControlActivity.f35925t0;
                break;
            case 7:
                privacyControlActivity.f35926u0 = new org.telegram.ui.Components.y9(privacyControlActivity.getParentActivity());
                privacyControlActivity.f35927v0 = new hs(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.f35929w0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.f35931x0;
                    if (photo != null) {
                        org.telegram.ui.Components.y9 y9Var = privacyControlActivity.f35926u0;
                        ImageLocation forPhoto = ImageLocation.getForPhoto(photoSize, photo);
                        i12 = ((org.telegram.ui.ActionBar.r2) privacyControlActivity).currentAccount;
                        y9Var.h(forPhoto, "50_50", null, UserConfig.getInstance(i12).getCurrentUser());
                    } else {
                        org.telegram.ui.Components.y9 y9Var2 = privacyControlActivity.f35926u0;
                        ImageLocation forLocal = ImageLocation.getForLocal(photoSize.location);
                        i11 = ((org.telegram.ui.ActionBar.r2) privacyControlActivity).currentAccount;
                        y9Var2.h(forLocal, "50_50", null, UserConfig.getInstance(i11).getCurrentUser());
                    }
                }
                privacyControlActivity.f35927v0.addView(privacyControlActivity.f35926u0, org.telegram.ui.Components.gb1.h(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.f35927v0.k(LocaleController.getString(R.string.RemovePublicPhoto), false);
                privacyControlActivity.f35927v0.getImageView().setVisibility(0);
                privacyControlActivity.f35927v0.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
                hs hsVar = privacyControlActivity.f35927v0;
                int i13 = org.telegram.ui.ActionBar.y6.f23581p7;
                hsVar.g(i13, i13);
                view = privacyControlActivity.f35927v0;
                break;
            case 8:
                u6Var = ((org.telegram.ui.ActionBar.r2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.a9(context, u6Var);
                break;
            case 9:
                u6Var2 = ((org.telegram.ui.ActionBar.r2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.c8(context, u6Var2);
                break;
            case 10:
                FrameLayout frameLayout = new FrameLayout(context);
                u6Var3 = ((org.telegram.ui.ActionBar.r2) privacyControlActivity).resourceProvider;
                fi.d dVar = new fi.d(context, u6Var3, true);
                dVar.setRoundRadius(24);
                org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.msg_mini_lock3, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PrivateMessagesChargePremiumLocked));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(zqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                dVar.i(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new x50(this, 26));
                frameLayout.addView(dVar, org.telegram.ui.Components.gb1.h(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                view = frameLayout;
                break;
        }
        return new s4.e1(view);
    }
}
