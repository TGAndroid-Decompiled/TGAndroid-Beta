package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RadialProgressView;
public final class pr extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is, org.telegram.ui.Components.l30 {
    public org.telegram.ui.Cells.l8 E;
    public nr F;
    public org.telegram.ui.Cells.l8 G;
    public org.telegram.messenger.vo H;
    public long I;
    public boolean J;
    public boolean K;
    public boolean L;
    public String M;
    public String N;
    public String O;
    public or P;
    public final org.telegram.ui.Components.m30 Q;
    public TLRPC.FileLocation R;
    public int S;
    public int T;
    public TLRPC.Photo U;
    public org.telegram.ui.Components.i9 V;
    public FrameLayout W;
    public org.telegram.ui.Components.u41 X;
    public boolean Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.z4 f50335a;
    public org.telegram.messenger.gj f50336a0;
    public org.telegram.ui.Cells.k3 f50337b;
    public org.telegram.ui.Cells.k3 f50338c;
    public org.telegram.ui.Cells.k3 d;
    public org.telegram.ui.Components.i9 f50339e;
    public TextView f50340f;
    public TextView h;
    public org.telegram.ui.Components.t8 f50341n;
    public final org.telegram.ui.ActionBar.e6 f50342r;
    public RadialProgressView f50343s;
    public hi.n5 f50344w;
    public AnimatorSet f50345x;
    public org.telegram.ui.Cells.l8 f50346y;

    public pr(Bundle bundle) {
        super(bundle);
        this.Y = false;
        this.Z = true;
        this.Q = new org.telegram.ui.Components.m30(0, true, true);
    }

    public static void Z(pr prVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.f28195id = prVar.getMessagesController().o1(prVar.I);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(prVar.currentAccount).sendRequest(tL_users_suggestBirthday, new l(prVar, 5));
    }

    public static void a0(pr prVar, TLRPC.User user) {
        prVar.R = null;
        prVar.h0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User a22 = prVar.getMessagesController().a2(Long.valueOf(prVar.I));
        a22.photo.personal = false;
        TLRPC.UserFull b22 = org.telegram.messenger.np.s1(prVar.currentAccount).b2(prVar.I);
        if (b22 != null) {
            b22.personal_photo = null;
            b22.flags &= -2097153;
            prVar.getMessagesStorage().j2(b22, true);
        }
        TLRPC.Photo photo = prVar.U;
        if (photo != null) {
            a22.photo.photo_id = photo.f28075id;
            ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, 100, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList, 1000, false, null, false);
            if (w10 != null) {
                a22.photo.photo_small = w10.location;
            }
            if (w11 != null) {
                a22.photo.photo_big = w11.location;
            }
        } else {
            a22.photo = null;
            a22.flags &= -33;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(user);
        prVar.getMessagesStorage().m1(arrayList2, null, false, true);
        prVar.k0();
        prVar.getNotificationCenter().k(org.telegram.messenger.ns.f25476c0, new Object[0]);
        prVar.getNotificationCenter().k(org.telegram.messenger.ns.f25560r, 2);
    }

    public static void b0(pr prVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.m30 m30Var = prVar.Q;
        if (m30Var.U) {
            return;
        }
        int i7 = prVar.T;
        if (i7 == 2) {
            prVar.R = photoSize.location;
        } else if (i7 == 1 && prVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.o4 parentLayout = prVar.getParentLayout();
            org.telegram.ui.ActionBar.e2 lastFragment = prVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) fragmentStack.get(size);
                if (e2Var instanceof an) {
                    an anVar = (an) e2Var;
                    org.telegram.ui.ActionBar.e2 e2Var2 = lastFragment;
                    if (anVar.a() == prVar.I && anVar.f45203g4 == 0) {
                        anVar.Ab(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var2;
                            if (arrayList.get(size2) != e2Var3) {
                                ((org.telegram.ui.ActionBar.e2) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            e2Var2 = e2Var3;
                        }
                        e2Var2.finishFragment();
                    } else {
                        lastFragment = e2Var2;
                    }
                }
                arrayList.add((org.telegram.ui.ActionBar.e2) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            prVar.f50339e.j(org.telegram.messenger.gc.e(prVar.R), "50_50", prVar.f50341n, prVar.getMessagesController().a2(Long.valueOf(prVar.I)));
            if (prVar.T == 2) {
                prVar.i0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                org.telegram.messenger.ez.C(prVar.currentAccount);
                tL_messageService.random_id = org.telegram.messenger.ez.E();
                tL_messageService.dialog_id = prVar.I;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int j3 = prVar.getUserConfig().j();
                tL_messageService.f28072id = j3;
                tL_messageService.local_id = j3;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = prVar.getUserConfig().e();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = prVar.I;
                tL_messageService.date = prVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z10;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList arrayList2 = new ArrayList();
                org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(prVar.currentAccount, tL_messageService, false, false);
                prVar.f50336a0 = gjVar;
                arrayList2.add(gjVar);
                new ArrayList().add(tL_messageService);
                org.telegram.messenger.np.s1(prVar.currentAccount).m5(0, prVar.I, arrayList2);
                prVar.getMessagesController().C7.put(tL_messageService.local_id, m30Var);
            }
        } else {
            TLRPC.User a22 = prVar.getMessagesController().a2(Long.valueOf(prVar.I));
            if (prVar.f50336a0 == null && a22 != null) {
                if (inputFile2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                a22.flags |= 32;
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                a22.photo = tL_userProfilePhoto;
                tL_userProfilePhoto.personal = true;
                tL_userProfilePhoto.photo_id = 0L;
                tL_userProfilePhoto.has_video = z11;
                if (photoSize != null) {
                    tL_userProfilePhoto.photo_small = photoSize.location;
                }
                if (photoSize2 != null) {
                    tL_userProfilePhoto.photo_big = photoSize2.location;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(a22);
                prVar.getMessagesStorage().m1(arrayList3, null, false, true);
                prVar.getNotificationCenter().k(org.telegram.messenger.ns.f25476c0, new Object[0]);
                org.telegram.messenger.ns notificationCenter = prVar.getNotificationCenter();
                int i10 = org.telegram.messenger.np.D8;
                notificationCenter.k(org.telegram.messenger.ns.f25560r, 2);
            }
            prVar.h0(prVar.R, photoSize2.location, inputFile, inputFile2, videoSize, d, prVar.T);
            prVar.i0(false, true);
        }
        prVar.k0();
    }

    public static void c0(pr prVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i7) {
        if (prVar.f50336a0 == null) {
            if ((fileLocation != null || inputFile != null) && tLObject != null) {
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                TLRPC.User a22 = prVar.getMessagesController().a2(Long.valueOf(prVar.I));
                TLRPC.UserFull b22 = org.telegram.messenger.np.s1(prVar.currentAccount).b2(prVar.I);
                if (b22 != null) {
                    b22.personal_photo = tL_photos_photo.photo;
                    b22.flags |= 2097152;
                    prVar.getMessagesStorage().j2(b22, true);
                }
                if (a22 != null) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, 100, false, null, false);
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList, 1000, false, null, false);
                    if (w10 != null && fileLocation != null) {
                        org.telegram.messenger.w7.G(prVar.currentAccount);
                        File J = org.telegram.messenger.w7.J(w10, null, true, true);
                        org.telegram.messenger.w7.G(prVar.currentAccount);
                        org.telegram.messenger.w7.J(fileLocation, null, true, true).renameTo(J);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocation.volume_id);
                        sb2.append("_");
                        String n10 = a8.p0.n(fileLocation.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(w10.location.volume_id);
                        sb3.append("_");
                        org.telegram.messenger.fc.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.gc.l(prVar.currentAccount, 1, a22));
                    }
                    if (w11 != null && fileLocation2 != null) {
                        org.telegram.messenger.w7.G(prVar.currentAccount);
                        File J2 = org.telegram.messenger.w7.J(w11, null, true, true);
                        org.telegram.messenger.w7.G(prVar.currentAccount);
                        org.telegram.messenger.w7.J(fileLocation2, null, true, true).renameTo(J2);
                    }
                    bg.m0.a(tL_photos_photo.photo, a22, true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(a22);
                    prVar.getMessagesStorage().m1(arrayList2, null, false, true);
                    prVar.getMessagesController().U0(prVar.I);
                    prVar.getNotificationCenter().k(org.telegram.messenger.ns.f25476c0, new Object[0]);
                    prVar.getNotificationCenter().k(org.telegram.messenger.ns.f25560r, 2);
                    if (prVar.getParentActivity() != null) {
                        if (i7 == 2) {
                            org.telegram.ui.Components.cc.a0(prVar).V(arrayList2, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("UserCustomPhotoSeted", null, 2131743743, a22.first_name)), null, null).j();
                        } else {
                            org.telegram.ui.Components.cc.a0(prVar).V(arrayList2, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("UserCustomPhotoSeted", null, 2131743743, a22.first_name)), null, null).j();
                        }
                    }
                }
                prVar.R = null;
                prVar.k0();
            }
        }
    }

    public static void d0(pr prVar) {
        if (prVar.f50336a0 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(prVar.f50336a0.e1()));
            org.telegram.messenger.ns.f(prVar.currentAccount).k(org.telegram.messenger.ns.f25593w, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override
    public final void I(float f10) {
        RadialProgressView radialProgressView = this.f50343s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void O(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f50343s;
        if (radialProgressView == null) {
            return;
        }
        this.T = this.S;
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void U() {
        org.telegram.messenger.g0.h3(new fr(this, 0));
    }

    @Override
    public final void V(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new Runnable() {
            @Override
            public final void run() {
                pr.b0(pr.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z10);
            }
        });
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28996l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28978k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        float f11;
        int i15;
        float f12;
        float f13;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        if (this.J) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131748283, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131751282, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new lr(this));
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        if (this.J) {
            i7 = 2131751753;
        } else {
            i7 = 2131745946;
        }
        this.f50335a = w4Var.q(org.telegram.messenger.hd.M0(i7, null));
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.W = frameLayout2;
        int i16 = org.telegram.ui.ActionBar.j6.f28849d6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f50342r;
        org.telegram.ui.ActionBar.q6.h(i16, frameLayout2, e6Var);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f50339e = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(32.0f));
        FrameLayout frameLayout3 = this.W;
        org.telegram.ui.Components.i9 i9Var2 = this.f50339e;
        int i17 = 3;
        if (org.telegram.messenger.hd.f24104a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout3.addView(i9Var2, c8.ja.d(64, 64.0f, i10 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        hi.n5 n5Var = new hi.n5(this, context, paint, 10);
        this.f50344w = n5Var;
        FrameLayout frameLayout4 = this.W;
        if (org.telegram.messenger.hd.f24104a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout4.addView(n5Var, c8.ja.d(64, 64.0f, i11 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f50343s = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(30.0f));
        this.f50343s.setProgressColor(-1);
        this.f50343s.setNoProgress(false);
        FrameLayout frameLayout5 = this.W;
        RadialProgressView radialProgressView2 = this.f50343s;
        if (org.telegram.messenger.hd.f24104a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        frameLayout5.addView(radialProgressView2, c8.ja.d(64, 64.0f, i12 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        i0(false, false);
        TextView textView = new TextView(context);
        this.f50340f = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, e6Var);
        this.f50340f.setTextSize(1, 18.0f);
        this.f50340f.setLines(1);
        this.f50340f.setMaxLines(1);
        this.f50340f.setSingleLine(true);
        TextView textView2 = this.f50340f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView textView3 = this.f50340f;
        if (org.telegram.messenger.hd.f24104a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView3.setGravity(i13);
        this.f50340f.setTypeface(org.telegram.messenger.g0.o());
        FrameLayout frameLayout6 = this.W;
        TextView textView4 = this.f50340f;
        boolean z10 = org.telegram.messenger.hd.f24104a0;
        if (z10) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i18 = i14 | 48;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 94.0f;
        }
        if (z10) {
            f11 = 94.0f;
        } else {
            f11 = 0.0f;
        }
        TextView k10 = org.telegram.ui.Cells.y0.k(frameLayout6, textView4, c8.ja.d(-2, -2.0f, i18, f10, 25.66f, f11, 0.0f), context);
        this.h = k10;
        org.telegram.ui.ActionBar.q6.U(k10, org.telegram.ui.ActionBar.j6.A6, e6Var);
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        TextView textView5 = this.h;
        if (org.telegram.messenger.hd.f24104a0) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView5.setGravity(i15);
        FrameLayout frameLayout7 = this.W;
        TextView textView6 = this.h;
        boolean z11 = org.telegram.messenger.hd.f24104a0;
        if (z11) {
            i17 = 5;
        }
        int i19 = i17 | 48;
        if (z11) {
            f12 = 0.0f;
        } else {
            f12 = 94.0f;
        }
        if (z11) {
            f13 = 94.0f;
        } else {
            f13 = 0.0f;
        }
        frameLayout7.addView(textView6, c8.ja.d(-2, -2.0f, i19, f12, 49.66f, f13, 0.0f));
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.hd.M0(2131750694, null), false, false, -1, this.f50342r);
        this.f50337b = k3Var;
        k3Var.d.setImeOptions(5);
        org.telegram.ui.ActionBar.q6.h(i16, this.f50337b, e6Var);
        this.f50337b.setDivider(true);
        this.f50337b.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final pr f48405b;

            {
                this.f48405b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i20, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i20 == 5) {
                            pr prVar = this.f48405b;
                            prVar.f50338c.d.requestFocus();
                            org.telegram.ui.Cells.i3 i3Var = prVar.f50338c.d;
                            i3Var.setSelection(i3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        pr prVar2 = this.f48405b;
                        if (i20 == 6) {
                            prVar2.f50335a.performClick();
                            return true;
                        } else if (i20 == 5) {
                            prVar2.d.d.requestFocus();
                            prVar2.d.d.setSelection(prVar2.f50338c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        pr prVar3 = this.f48405b;
                        if (i20 == 6) {
                            prVar3.f50335a.performClick();
                            return true;
                        }
                        prVar3.getClass();
                        return false;
                }
            }
        });
        this.f50337b.d.setOnFocusChangeListener(new Object());
        this.f50337b.setText(this.N);
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.hd.M0(2131749032, null), false, false, -1, this.f50342r);
        this.f50338c = k3Var2;
        k3Var2.d.setImeOptions(5);
        org.telegram.ui.ActionBar.q6.h(i16, this.f50338c, e6Var);
        this.f50338c.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final pr f48405b;

            {
                this.f48405b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i20, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i20 == 5) {
                            pr prVar = this.f48405b;
                            prVar.f50338c.d.requestFocus();
                            org.telegram.ui.Cells.i3 i3Var = prVar.f50338c.d;
                            i3Var.setSelection(i3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        pr prVar2 = this.f48405b;
                        if (i20 == 6) {
                            prVar2.f50335a.performClick();
                            return true;
                        } else if (i20 == 5) {
                            prVar2.d.d.requestFocus();
                            prVar2.d.d.setSelection(prVar2.f50338c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        pr prVar3 = this.f48405b;
                        if (i20 == 6) {
                            prVar3.f50335a.performClick();
                            return true;
                        }
                        prVar3.getClass();
                        return false;
                }
            }
        });
        this.f50338c.setText(this.O);
        org.telegram.ui.Cells.k3 k3Var3 = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.hd.M0(2131754395, null), true, true, ((org.telegram.messenger.j0) getMessagesController().f25451y7.f25872y.f15881b).f24498c, this.f50342r);
        this.d = k3Var3;
        org.telegram.ui.ActionBar.q6.G(k3Var3.d, org.telegram.ui.ActionBar.j6.Xc, e6Var);
        this.d.d.setImeOptions(6);
        org.telegram.ui.ActionBar.q6.h(i16, this.d, e6Var);
        this.d.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final pr f48405b;

            {
                this.f48405b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i20, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i20 == 5) {
                            pr prVar = this.f48405b;
                            prVar.f50338c.d.requestFocus();
                            org.telegram.ui.Cells.i3 i3Var = prVar.f50338c.d;
                            i3Var.setSelection(i3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        pr prVar2 = this.f48405b;
                        if (i20 == 6) {
                            prVar2.f50335a.performClick();
                            return true;
                        } else if (i20 == 5) {
                            prVar2.d.d.requestFocus();
                            prVar2.d.d.setSelection(prVar2.f50338c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        pr prVar3 = this.f48405b;
                        if (i20 == 6) {
                            prVar3.f50335a.performClick();
                            return true;
                        }
                        prVar3.getClass();
                        return false;
                }
            }
        });
        if (!this.J) {
            final TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.I));
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context, e6Var);
            this.f50346y = l8Var;
            l8Var.o(2131232048, org.telegram.messenger.hd.a0(null, null, 2131744398, a22.first_name), true);
            this.f50346y.setBackground(org.telegram.ui.ActionBar.j6.M0(e6Var, true));
            org.telegram.ui.Cells.l8 l8Var2 = this.f50346y;
            int i20 = org.telegram.ui.ActionBar.j6.f29184v6;
            int i21 = org.telegram.ui.ActionBar.j6.f29165u6;
            l8Var2.g(i20, i21);
            final org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131624133, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
            this.f50346y.f30656e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
            this.f50346y.f30656e.setAnimation(ch0Var);
            this.f50346y.setOnClickListener(new View.OnClickListener(this) {
                public final pr f48748b;

                {
                    this.f48748b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final pr prVar = this.f48748b;
                            boolean z13 = true;
                            prVar.S = 1;
                            org.telegram.ui.Components.m30 m30Var = prVar.Q;
                            TLRPC.User user = a22;
                            m30Var.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z13 = false;
                            }
                            ai.o oVar = new ai.o(28);
                            final org.telegram.ui.Components.ch0 ch0Var2 = ch0Var;
                            m30Var.n(z13, oVar, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            pr prVar2 = prVar;
                                            boolean g10 = prVar2.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var3 = ch0Var2;
                                            if (!g10) {
                                                ch0Var3.P(86);
                                                prVar2.E.f30656e.d();
                                                return;
                                            }
                                            ch0Var3.N(0, false, false);
                                            return;
                                        default:
                                            pr prVar3 = prVar;
                                            boolean g11 = prVar3.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var4 = ch0Var2;
                                            if (!g11) {
                                                ch0Var4.P(85);
                                                prVar3.f50346y.f30656e.d();
                                                return;
                                            }
                                            ch0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            ch0Var2.M(0);
                            ch0Var2.P(43);
                            prVar.f50346y.f30656e.d();
                            return;
                        default:
                            final pr prVar2 = this.f48748b;
                            prVar2.S = 2;
                            org.telegram.ui.Components.m30 m30Var2 = prVar2.Q;
                            TLRPC.User user2 = a22;
                            m30Var2.M = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                            if (userProfilePhoto2 == null) {
                                fileLocation2 = null;
                            } else {
                                fileLocation2 = userProfilePhoto2.photo_small;
                            }
                            if (fileLocation2 != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            ai.o oVar2 = new ai.o(28);
                            final org.telegram.ui.Components.ch0 ch0Var3 = ch0Var;
                            m30Var2.n(z12, oVar2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            pr prVar22 = prVar2;
                                            boolean g10 = prVar22.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var32 = ch0Var3;
                                            if (!g10) {
                                                ch0Var32.P(86);
                                                prVar22.E.f30656e.d();
                                                return;
                                            }
                                            ch0Var32.N(0, false, false);
                                            return;
                                        default:
                                            pr prVar3 = prVar2;
                                            boolean g11 = prVar3.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var4 = ch0Var3;
                                            if (!g11) {
                                                ch0Var4.P(85);
                                                prVar3.f50346y.f30656e.d();
                                                return;
                                            }
                                            ch0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            ch0Var3.M(0);
                            ch0Var3.P(43);
                            prVar2.E.f30656e.d();
                            return;
                    }
                }
            });
            org.telegram.ui.Cells.l8 l8Var3 = new org.telegram.ui.Cells.l8(context, e6Var);
            this.E = l8Var3;
            l8Var3.o(2131232048, org.telegram.messenger.hd.a0(null, null, 2131743679, a22.first_name), false);
            this.E.setBackground(org.telegram.ui.ActionBar.j6.M0(e6Var, true));
            this.E.g(i20, i21);
            final org.telegram.ui.Components.ch0 ch0Var2 = new org.telegram.ui.Components.ch0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
            this.E.f30656e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
            this.E.f30656e.setAnimation(ch0Var2);
            this.E.setOnClickListener(new View.OnClickListener(this) {
                public final pr f48748b;

                {
                    this.f48748b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final pr prVar = this.f48748b;
                            boolean z13 = true;
                            prVar.S = 1;
                            org.telegram.ui.Components.m30 m30Var = prVar.Q;
                            TLRPC.User user = a22;
                            m30Var.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z13 = false;
                            }
                            ai.o oVar = new ai.o(28);
                            final org.telegram.ui.Components.ch0 ch0Var22 = ch0Var2;
                            m30Var.n(z13, oVar, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            pr prVar22 = prVar;
                                            boolean g10 = prVar22.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var32 = ch0Var22;
                                            if (!g10) {
                                                ch0Var32.P(86);
                                                prVar22.E.f30656e.d();
                                                return;
                                            }
                                            ch0Var32.N(0, false, false);
                                            return;
                                        default:
                                            pr prVar3 = prVar;
                                            boolean g11 = prVar3.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var4 = ch0Var22;
                                            if (!g11) {
                                                ch0Var4.P(85);
                                                prVar3.f50346y.f30656e.d();
                                                return;
                                            }
                                            ch0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            ch0Var22.M(0);
                            ch0Var22.P(43);
                            prVar.f50346y.f30656e.d();
                            return;
                        default:
                            final pr prVar2 = this.f48748b;
                            prVar2.S = 2;
                            org.telegram.ui.Components.m30 m30Var2 = prVar2.Q;
                            TLRPC.User user2 = a22;
                            m30Var2.M = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                            if (userProfilePhoto2 == null) {
                                fileLocation2 = null;
                            } else {
                                fileLocation2 = userProfilePhoto2.photo_small;
                            }
                            if (fileLocation2 != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            ai.o oVar2 = new ai.o(28);
                            final org.telegram.ui.Components.ch0 ch0Var3 = ch0Var2;
                            m30Var2.n(z12, oVar2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            pr prVar22 = prVar2;
                                            boolean g10 = prVar22.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var32 = ch0Var3;
                                            if (!g10) {
                                                ch0Var32.P(86);
                                                prVar22.E.f30656e.d();
                                                return;
                                            }
                                            ch0Var32.N(0, false, false);
                                            return;
                                        default:
                                            pr prVar3 = prVar2;
                                            boolean g11 = prVar3.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var4 = ch0Var3;
                                            if (!g11) {
                                                ch0Var4.P(85);
                                                prVar3.f50346y.f30656e.d();
                                                return;
                                            }
                                            ch0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            ch0Var3.M(0);
                            ch0Var3.P(43);
                            prVar2.E.f30656e.d();
                            return;
                    }
                }
            });
            this.V = new org.telegram.ui.Components.i9(context);
            this.F = new nr(this, context, e6Var);
            if (this.f50341n == null) {
                this.f50341n = new org.telegram.ui.Components.t8(0, a22);
            }
            this.V.f(a22.photo, this.f50341n);
            this.F.addView(this.V, c8.ja.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.F.k(org.telegram.messenger.hd.M0(2131746088, null), false);
            this.F.getImageView().setVisibility(0);
            this.F.setBackground(org.telegram.ui.ActionBar.j6.M0(e6Var, true));
            this.F.g(i20, i21);
            this.F.setOnClickListener(new y(this, context, a22, 10));
            org.telegram.ui.Cells.l8 l8Var4 = new org.telegram.ui.Cells.l8(context, e6Var);
            this.G = l8Var4;
            l8Var4.o(2131231767, org.telegram.messenger.hd.a0(null, null, 2131743678, new Object[0]), false);
            this.G.setBackground(org.telegram.ui.ActionBar.j6.M0(e6Var, true));
            this.G.g(i20, i21);
            this.G.setNeedDivider(true);
            this.G.f30656e.setTranslationX(org.telegram.messenger.g0.L(4.0f));
            this.G.setOnClickListener(new org.telegram.ui.Components.vv0(13, this, a22));
            TLRPC.UserFull b22 = getMessagesController().b2(this.I);
            if (b22 != null) {
                TLRPC.Photo photo = b22.profile_photo;
                this.U = photo;
                if (photo == null) {
                    this.U = b22.fallback_photo;
                }
            }
            k0();
        }
        org.telegram.ui.Components.u41 u41Var = new org.telegram.ui.Components.u41(this, new a5(this, 7), new w0(this, 29), null);
        this.X = u41Var;
        u41Var.r1();
        this.X.setSectionsDrawBackground(true);
        this.X.setOnScrollListener(new bi.w3(6, this, frameLayout));
        frameLayout.addView(this.X, c8.ja.e(-1, -1, 119));
        if (this.J && this.L) {
            this.Y = true;
        }
        this.X.f39892g3.O(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.messenger.vo voVar;
        if (i7 == org.telegram.messenger.ns.f25560r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.np.D8;
            if ((intValue & 2) != 0 || (intValue & 4) != 0) {
                j0();
            }
        } else if (i7 == org.telegram.messenger.ns.f25490e3 && (voVar = (org.telegram.messenger.vo) objArr[0]) == this.H) {
            ArrayList arrayList = new ArrayList(voVar.f27090b);
            int i12 = 0;
            while (i12 < arrayList.size()) {
                if (arrayList.get(i12) == null) {
                    arrayList.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (arrayList.size() > 0) {
                this.U = (TLRPC.Photo) arrayList.get(0);
                k0();
            }
        }
    }

    @Override
    public final boolean e() {
        if (this.T != 1) {
            return true;
        }
        return false;
    }

    public final String g0() {
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.I));
        if (a22 != null && !TextUtils.isEmpty(a22.phone)) {
            return a22.phone;
        }
        return this.M;
    }

    @Override
    public final uq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.X;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.f50342r;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i7) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().o1(this.I);
        if (inputFile != null) {
            tL_photos_uploadContactProfilePhoto.file = inputFile;
            tL_photos_uploadContactProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadContactProfilePhoto.video = inputFile2;
            int i10 = tL_photos_uploadContactProfilePhoto.flags;
            tL_photos_uploadContactProfilePhoto.video_start_ts = d;
            tL_photos_uploadContactProfilePhoto.flags = i10 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadContactProfilePhoto.flags |= 32;
            tL_photos_uploadContactProfilePhoto.video_emoji_markup = videoSize;
        }
        if (i7 == 1) {
            tL_photos_uploadContactProfilePhoto.suggest = true;
            tL_photos_uploadContactProfilePhoto.flags |= 8;
        } else {
            tL_photos_uploadContactProfilePhoto.save = true;
            tL_photos_uploadContactProfilePhoto.flags |= 16;
        }
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new bg.k0(this, fileLocation, inputFile2, fileLocation2, i7, 9));
    }

    public final void i0(boolean z10, boolean z11) {
        if (this.f50343s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f50345x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f50345x = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f50345x = animatorSet2;
            if (z10) {
                this.f50343s.setVisibility(0);
                this.f50344w.setVisibility(0);
                AnimatorSet animatorSet3 = this.f50345x;
                RadialProgressView radialProgressView = this.f50343s;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f50344w, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f50343s;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f50344w, property2, 0.0f));
            }
            this.f50345x.setDuration(180L);
            this.f50345x.addListener(new nn(28, this, z10));
            this.f50345x.start();
        } else if (z10) {
            this.f50343s.setAlpha(1.0f);
            this.f50343s.setVisibility(0);
            this.f50344w.setAlpha(1.0f);
            this.f50344w.setVisibility(0);
        } else {
            this.f50343s.setAlpha(0.0f);
            this.f50343s.setVisibility(4);
            this.f50344w.setAlpha(0.0f);
            this.f50344w.setVisibility(4);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        TLRPC.User a22;
        if (this.f50340f != null && (a22 = getMessagesController().a2(Long.valueOf(this.I))) != null) {
            if (TextUtils.isEmpty(g0())) {
                this.f50340f.setText(org.telegram.messenger.hd.M0(2131748410, null));
            } else {
                TextView textView = this.f50340f;
                pf.b c10 = pf.b.c();
                textView.setText(c10.b("+" + g0()));
            }
            this.h.setText(org.telegram.messenger.hd.d0(this.currentAccount, a22, null, null));
            if (this.R == null) {
                org.telegram.ui.Components.i9 i9Var = this.f50339e;
                org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8(0, a22);
                this.f50341n = t8Var;
                i9Var.f(a22, t8Var);
            }
        }
    }

    public final void k0() {
        TLRPC.Photo photo;
        if (this.J) {
            return;
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.I));
        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.U) != null) {
            this.V.j(org.telegram.messenger.gc.i(org.telegram.messenger.w7.w(photo.sizes, 1000, false, null, false), this.U), "50_50", this.f50341n, null);
        }
        if (this.f50341n == null) {
            this.f50341n = new org.telegram.ui.Components.t8(0, a22);
        }
        TLRPC.FileLocation fileLocation = this.R;
        if (fileLocation == null) {
            this.f50339e.f(a22, this.f50341n);
        } else {
            this.f50339e.j(org.telegram.messenger.gc.e(fileLocation), "50_50", this.f50341n, getMessagesController().a2(Long.valueOf(this.I)));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        TLRPC.User user;
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25560r);
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25490e3);
        this.I = getArguments().getLong("user_id", 0L);
        this.M = getArguments().getString("phone");
        this.N = getArguments().getString("first_name_card");
        this.O = getArguments().getString("last_name_card");
        this.J = getArguments().getBoolean("addContact", false);
        this.K = getArguments().getBoolean("focus_notes", false);
        SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(this.currentAccount).f25273e7;
        this.L = sharedPreferences.getBoolean("dialog_bar_exception" + this.I, false);
        if (this.I != 0) {
            user = getMessagesController().a2(Long.valueOf(this.I));
        } else {
            user = null;
        }
        org.telegram.ui.Components.m30 m30Var = this.Q;
        if (m30Var != null) {
            m30Var.f37040a = this;
            m30Var.f37041b = this;
        }
        this.H = org.telegram.messenger.np.s1(this.currentAccount).U0(this.I);
        if (user == null || !super.onFragmentCreate()) {
            return false;
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25560r);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25490e3);
        org.telegram.ui.Components.m30 m30Var = this.Q;
        if (m30Var != null) {
            m30Var.d();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.Q.i();
    }

    @Override
    public final void onResume() {
        super.onResume();
        j0();
        this.Q.k();
    }

    @Override
    public final void onThemeColorsChanged() {
        TLRPC.User a22;
        try {
            super.onThemeColorsChanged();
            if (this.f50339e != null && (a22 = getMessagesController().a2(Long.valueOf(this.I))) != null) {
                this.f50341n.r(a22);
                this.f50339e.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final boolean x() {
        return false;
    }

    public pr(Bundle bundle, org.telegram.ui.ActionBar.e6 e6Var) {
        super(bundle);
        this.Y = false;
        this.Z = true;
        this.f50342r = e6Var;
        this.Q = new org.telegram.ui.Components.m30(0, true, true);
    }
}
