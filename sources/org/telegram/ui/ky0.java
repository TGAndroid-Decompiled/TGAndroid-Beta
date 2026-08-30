package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ky0 implements Utilities.Callback2 {
    public final int f35850a;
    public final boolean f35851b;
    public final NotificationCenter.NotificationCenterDelegate f35852c;

    public ky0(boolean z4, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f35850a = i10;
        this.f35852c = notificationCenterDelegate;
        this.f35851b = z4;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z4;
        float f10;
        org.telegram.ui.Components.jv0 jv0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.f35850a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.f35852c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (org.telegram.ui.Components.qc.a(profileActivity)) {
                        int intValue = num.intValue();
                        boolean z10 = this.f35851b;
                        if (intValue == 1) {
                            org.telegram.ui.Components.qc.l(null, profileActivity, z10).j();
                        } else if (num.intValue() == 2) {
                            org.telegram.ui.Components.qc.l(DialogObject.getShortName(profileActivity.f32037b1), profileActivity, z10).j();
                        } else if (tL_error != null) {
                            org.telegram.ui.Components.qc.b0(tL_error);
                        }
                    }
                    FlagSecureReason flagSecureReason = profileActivity.U1;
                    if (flagSecureReason != null) {
                        flagSecureReason.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ph.da daVar = (ph.da) this.f35852c;
                Bitmap bitmap = (Bitmap) obj2;
                int i10 = daVar.f41479c;
                if (obj != null && daVar.f41511m2 == null && !daVar.T && daVar.J()) {
                    int i11 = 0;
                    if (this.f35851b) {
                        if (daVar.H1 != null) {
                            daVar.u();
                            daVar.H1.f42418j = true;
                            if (obj instanceof MediaController.PhotoEntry) {
                                ph.h9 h9Var = daVar.f41531s1;
                                h9Var.d0(h9Var.k0(((MediaController.PhotoEntry) obj).path, false));
                            } else if (obj instanceof TLObject) {
                                ph.h9 h9Var2 = daVar.f41531s1;
                                TLObject tLObject = (TLObject) obj;
                                h9Var2.f41342i2 = true;
                                ph.w4 w4Var = h9Var2.O0;
                                if ((tLObject instanceof TLRPC.Photo) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000)) != null) {
                                    f10 = closestPhotoSizeWithSize.f19209w / closestPhotoSizeWithSize.h;
                                } else {
                                    f10 = 1.0f;
                                }
                                if (f10 > 1.0f) {
                                    float floor = (float) Math.floor(Math.max(h9Var2.O1, w4Var.getMeasuredWidth()) * 0.5d);
                                    jv0Var = new org.telegram.ui.Components.jv0(floor, floor / f10);
                                } else {
                                    float floor2 = (float) Math.floor(Math.max(h9Var2.P1, w4Var.getMeasuredHeight()) * 0.5d);
                                    jv0Var = new org.telegram.ui.Components.jv0(f10 * floor2, floor2);
                                }
                                dg.v2 v2Var = new dg.v2(h9Var2.getContext(), h9Var2.e0(), jv0Var, tLObject);
                                v2Var.setDelegate(h9Var2);
                                w4Var.addView(v2Var);
                                h9Var2.g0();
                                h9Var2.d0(v2Var);
                            }
                            daVar.f(false);
                        } else {
                            return;
                        }
                    } else {
                        daVar.i0(false, true);
                        daVar.N0.a(daVar.L1);
                        ph.t5 t5Var = daVar.L0;
                        if (daVar.L1 == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        t5Var.f42346k0 = -1.0f;
                        t5Var.f42347l0 = z4;
                        t5Var.invalidate();
                        daVar.f(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (z11) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            daVar.L1 = i11;
                            ph.u6 l10 = ph.u6.l(photoEntry);
                            l10.M0 = bitmap;
                            l10.J0 = daVar.f41530s0;
                            l10.K0 = daVar.f41533t0;
                            l10.A();
                            daVar.I1 = true;
                            if (daVar.f41547x0.j()) {
                                daVar.D1 = null;
                                l10.P = 1.0f;
                                if (daVar.f41547x0.l(l10)) {
                                    daVar.H1 = ph.u6.a(daVar.f41547x0.getLayout(), daVar.f41547x0.getContent());
                                }
                                daVar.m0(true);
                            } else {
                                l10.B();
                                daVar.H1 = l10;
                                if (z11) {
                                    ph.g8.a(i10, l10);
                                }
                                daVar.K(1, true);
                            }
                        } else if (obj instanceof ph.u6) {
                            ph.u6 u6Var = (ph.u6) obj;
                            if (u6Var.L == null && !u6Var.v()) {
                                daVar.f41477b1.c(R.raw.error, "Failed to load draft");
                                MessagesController.getInstance(i10).getStoriesController().f15935w.c(u6Var);
                                return;
                            }
                            u6Var.J0 = daVar.f41530s0;
                            u6Var.K0 = daVar.f41533t0;
                            daVar.L1 = u6Var.K ? 1 : 0;
                            u6Var.M0 = bitmap;
                            daVar.I1 = false;
                            daVar.f41547x0.n(u6Var);
                            daVar.H1 = u6Var;
                            if (z11) {
                                ph.g8.a(i10, u6Var);
                            }
                            daVar.K(1, true);
                        } else {
                            return;
                        }
                    }
                    ph.e9 e9Var = daVar.J0;
                    if (e9Var != null) {
                        daVar.f41501i2 = e9Var.e.e0();
                        daVar.f41504j2 = daVar.J0.getSelectedAlbum();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                sh.i0.m((sh.i0) this.f35852c, this.f35851b, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
