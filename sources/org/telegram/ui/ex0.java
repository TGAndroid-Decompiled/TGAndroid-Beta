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
public final class ex0 extends org.telegram.ui.Components.rl0 {
    public final Context f34105c;
    public final PrivacyControlActivity d;

    public ex0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.f34105c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int b10 = l1Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b10 == privacyControlActivity.Y) {
            i16 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).currentAccount;
            if (!ContactsController.getInstance(i16).getLoadingPrivacyInfo(3)) {
                return true;
            }
        }
        i10 = privacyControlActivity.currentPhotoForRestRow;
        if (b10 != i10 && b10 != privacyControlActivity.W) {
            i11 = privacyControlActivity.photoForRestRow;
            if (b10 != i11) {
                i12 = privacyControlActivity.readRow;
                if (b10 != i12) {
                    i13 = privacyControlActivity.showGiftIconRow;
                    if (b10 != i13 && b10 != privacyControlActivity.f31986b0 && b10 != privacyControlActivity.f31997k0 && b10 != privacyControlActivity.f31998l0 && b10 != privacyControlActivity.m0 && b10 != privacyControlActivity.f31996j0 && b10 != privacyControlActivity.f31995i0) {
                        if (privacyControlActivity.f32013x != 12 || !privacyControlActivity.u0()) {
                            i14 = privacyControlActivity.nobodyRow;
                            if (b10 != i14 && b10 != privacyControlActivity.L && b10 != privacyControlActivity.f31989d0) {
                                i15 = privacyControlActivity.everybodyRow;
                                if (b10 != i15 && b10 != privacyControlActivity.Q && b10 != privacyControlActivity.P) {
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
        return this.d.f32001o0;
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
        if (i10 != privacyControlActivity.P && i10 != privacyControlActivity.Q && i10 != privacyControlActivity.Y && i10 != privacyControlActivity.f31986b0) {
            if (i10 != privacyControlActivity.R && i10 != privacyControlActivity.M && i10 != privacyControlActivity.N && i10 != privacyControlActivity.f31993g0 && i10 != privacyControlActivity.Z && i10 != privacyControlActivity.W && i10 != privacyControlActivity.f31984a0 && i10 != privacyControlActivity.f31988c0) {
                i11 = privacyControlActivity.setBirthdayRow;
                if (i10 != i11 && i10 != privacyControlActivity.f31994h0 && i10 != privacyControlActivity.f32000n0) {
                    if (i10 != privacyControlActivity.K && i10 != privacyControlActivity.f31990e0 && i10 != privacyControlActivity.O && i10 != privacyControlActivity.X && i10 != privacyControlActivity.S) {
                        i12 = privacyControlActivity.giftTypesHeaderRow;
                        if (i10 != i12) {
                            i13 = privacyControlActivity.everybodyRow;
                            if (i10 != i13 && i10 != privacyControlActivity.L) {
                                i14 = privacyControlActivity.nobodyRow;
                                if (i10 != i14 && i10 != privacyControlActivity.f31989d0 && i10 != privacyControlActivity.T && i10 != privacyControlActivity.U) {
                                    if (i10 == privacyControlActivity.J) {
                                        return 4;
                                    }
                                    if (i10 != privacyControlActivity.V) {
                                        i15 = privacyControlActivity.photoForRestRow;
                                        if (i10 != i15) {
                                            i16 = privacyControlActivity.currentPhotoForRestRow;
                                            if (i10 != i16) {
                                                i17 = privacyControlActivity.readRow;
                                                if (i10 != i17) {
                                                    i18 = privacyControlActivity.showGiftIconRow;
                                                    if (i10 != i18 && i10 != privacyControlActivity.f31997k0 && i10 != privacyControlActivity.f31998l0 && i10 != privacyControlActivity.m0 && i10 != privacyControlActivity.f31995i0 && i10 != privacyControlActivity.f31996j0) {
                                                        i19 = privacyControlActivity.priceRow;
                                                        if (i10 == i19) {
                                                            return 9;
                                                        }
                                                        if (i10 == privacyControlActivity.f31992f0) {
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
    public final void v(f2.l1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ex0.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        View view;
        Context context = this.f34105c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
                aaVar.setCanDisable(true);
                view = aaVar;
                break;
            case 1:
                view = new org.telegram.ui.Cells.a9(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.m4(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.j6(context, null);
                break;
            case 4:
                view = privacyControlActivity.e;
                break;
            case 5:
            default:
                view = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            case 6:
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(privacyControlActivity.getParentActivity());
                privacyControlActivity.f32005r0 = o8Var;
                if (privacyControlActivity.f32009u0 == null) {
                    o8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SetPhotoForRest, new Object[0]), false);
                } else {
                    o8Var.m(R.drawable.msg_addphoto, LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]), true);
                }
                privacyControlActivity.f32005r0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                privacyControlActivity.f32005r0.e(org.telegram.ui.ActionBar.j6.f20225v6, org.telegram.ui.ActionBar.j6.f20207u6);
                int i13 = R.raw.camera_outline;
                privacyControlActivity.f32003q0 = new org.telegram.ui.Components.gj0(i13, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                privacyControlActivity.f32005r0.e.setTranslationX((float) (-AndroidUtilities.dp(8.0f)));
                privacyControlActivity.f32005r0.e.setAnimation(privacyControlActivity.f32003q0);
                view = privacyControlActivity.f32005r0;
                break;
            case 7:
                privacyControlActivity.f32007s0 = new org.telegram.ui.Components.p9(privacyControlActivity.getParentActivity());
                privacyControlActivity.f32008t0 = new ls(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.f32009u0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.f32010v0;
                    if (photo != null) {
                        org.telegram.ui.Components.p9 p9Var = privacyControlActivity.f32007s0;
                        ImageLocation forPhoto = ImageLocation.getForPhoto(photoSize, photo);
                        i12 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).currentAccount;
                        p9Var.h(forPhoto, "50_50", null, UserConfig.getInstance(i12).getCurrentUser());
                    } else {
                        org.telegram.ui.Components.p9 p9Var2 = privacyControlActivity.f32007s0;
                        ImageLocation forLocal = ImageLocation.getForLocal(photoSize.location);
                        i11 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).currentAccount;
                        p9Var2.h(forLocal, "50_50", null, UserConfig.getInstance(i11).getCurrentUser());
                    }
                }
                privacyControlActivity.f32008t0.addView(privacyControlActivity.f32007s0, k7.b6.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.f32008t0.i(LocaleController.getString(R.string.RemovePublicPhoto), false);
                privacyControlActivity.f32008t0.getImageView().setVisibility(0);
                privacyControlActivity.f32008t0.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                ls lsVar = privacyControlActivity.f32008t0;
                int i14 = org.telegram.ui.ActionBar.j6.f20122p7;
                lsVar.e(i14, i14);
                view = privacyControlActivity.f32008t0;
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.s8(context, f6Var);
                break;
            case 9:
                f6Var2 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.x7(context, f6Var2);
                break;
            case 10:
                FrameLayout frameLayout = new FrameLayout(context);
                f6Var3 = ((org.telegram.ui.ActionBar.p2) privacyControlActivity).resourceProvider;
                ph.d dVar = new ph.d(context, f6Var3, true);
                dVar.setRoundRadius(24);
                org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(R.drawable.msg_mini_lock3, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PrivateMessagesChargePremiumLocked));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(mqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                dVar.g(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new e60(this, 25));
                frameLayout.addView(dVar, k7.b6.d(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                view = frameLayout;
                break;
        }
        return new f2.l1(view);
    }
}
