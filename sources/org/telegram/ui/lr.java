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
public final class lr extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, org.telegram.ui.Components.e30 {
    public org.telegram.ui.Cells.l8 E;
    public jr F;
    public org.telegram.ui.Cells.l8 G;
    public org.telegram.messenger.po H;
    public long I;
    public boolean J;
    public boolean K;
    public boolean L;
    public String M;
    public String N;
    public String O;
    public kr P;
    public final org.telegram.ui.Components.f30 Q;
    public TLRPC.FileLocation R;
    public int S;
    public int T;
    public TLRPC.Photo U;
    public org.telegram.ui.Components.k9 V;
    public FrameLayout W;
    public org.telegram.ui.Components.l41 X;
    public boolean Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.b5 f47414a;
    public org.telegram.messenger.zi f47415a0;
    public org.telegram.ui.Cells.k3 f47416b;
    public org.telegram.ui.Cells.k3 f47417c;
    public org.telegram.ui.Cells.k3 d;
    public org.telegram.ui.Components.k9 f47418e;
    public TextView f47419f;
    public TextView h;
    public org.telegram.ui.Components.u8 f47420n;
    public final org.telegram.ui.ActionBar.e6 f47421r;
    public RadialProgressView f47422s;
    public gi.n5 f47423w;
    public AnimatorSet f47424x;
    public org.telegram.ui.Cells.l8 f47425y;

    public lr(Bundle bundle) {
        super(bundle);
        this.Y = false;
        this.Z = true;
        this.Q = new org.telegram.ui.Components.f30(0, true, true);
    }

    public static void Z(lr lrVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.f27145id = lrVar.getMessagesController().o1(lrVar.I);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(lrVar.currentAccount).sendRequest(tL_users_suggestBirthday, new l(lrVar, 5));
    }

    public static void a0(lr lrVar, TLRPC.User user) {
        lrVar.R = null;
        lrVar.h0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User a22 = lrVar.getMessagesController().a2(Long.valueOf(lrVar.I));
        a22.photo.personal = false;
        TLRPC.UserFull b22 = org.telegram.messenger.hp.s1(lrVar.currentAccount).b2(lrVar.I);
        if (b22 != null) {
            b22.personal_photo = null;
            b22.flags &= -2097153;
            lrVar.getMessagesStorage().j2(b22, true);
        }
        TLRPC.Photo photo = lrVar.U;
        if (photo != null) {
            a22.photo.photo_id = photo.f27025id;
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
        lrVar.getMessagesStorage().m1(arrayList2, null, false, true);
        lrVar.k0();
        lrVar.getNotificationCenter().k(org.telegram.messenger.hs.f23208c0, new Object[0]);
        lrVar.getNotificationCenter().k(org.telegram.messenger.hs.f23292r, 2);
    }

    public static void b0(lr lrVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.f30 f30Var = lrVar.Q;
        if (f30Var.U) {
            return;
        }
        int i3 = lrVar.T;
        if (i3 == 2) {
            lrVar.R = photoSize.location;
        } else if (i3 == 1 && lrVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.q4 parentLayout = lrVar.getParentLayout();
            org.telegram.ui.ActionBar.d2 lastFragment = lrVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) fragmentStack.get(size);
                if (d2Var instanceof wm) {
                    wm wmVar = (wm) d2Var;
                    org.telegram.ui.ActionBar.d2 d2Var2 = lastFragment;
                    if (wmVar.a() == lrVar.I && wmVar.f51325g4 == 0) {
                        wmVar.wb(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var2;
                            if (arrayList.get(size2) != d2Var3) {
                                ((org.telegram.ui.ActionBar.d2) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            d2Var2 = d2Var3;
                        }
                        d2Var2.finishFragment();
                    } else {
                        lastFragment = d2Var2;
                    }
                }
                arrayList.add((org.telegram.ui.ActionBar.d2) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            lrVar.f47418e.j(org.telegram.messenger.ac.e(lrVar.R), "50_50", lrVar.f47420n, lrVar.getMessagesController().a2(Long.valueOf(lrVar.I)));
            if (lrVar.T == 2) {
                lrVar.i0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                org.telegram.messenger.yy.C(lrVar.currentAccount);
                tL_messageService.random_id = org.telegram.messenger.yy.E();
                tL_messageService.dialog_id = lrVar.I;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int j10 = lrVar.getUserConfig().j();
                tL_messageService.f27022id = j10;
                tL_messageService.local_id = j10;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = lrVar.getUserConfig().e();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = lrVar.I;
                tL_messageService.date = lrVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z10;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList arrayList2 = new ArrayList();
                org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(lrVar.currentAccount, tL_messageService, false, false);
                lrVar.f47415a0 = ziVar;
                arrayList2.add(ziVar);
                new ArrayList().add(tL_messageService);
                org.telegram.messenger.hp.s1(lrVar.currentAccount).l5(0, lrVar.I, arrayList2);
                lrVar.getMessagesController().B7.put(tL_messageService.local_id, f30Var);
            }
        } else {
            TLRPC.User a22 = lrVar.getMessagesController().a2(Long.valueOf(lrVar.I));
            if (lrVar.f47415a0 == null && a22 != null) {
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
                lrVar.getMessagesStorage().m1(arrayList3, null, false, true);
                lrVar.getNotificationCenter().k(org.telegram.messenger.hs.f23208c0, new Object[0]);
                org.telegram.messenger.hs notificationCenter = lrVar.getNotificationCenter();
                int i10 = org.telegram.messenger.hp.C8;
                notificationCenter.k(org.telegram.messenger.hs.f23292r, 2);
            }
            lrVar.h0(lrVar.R, photoSize2.location, inputFile, inputFile2, videoSize, d, lrVar.T);
            lrVar.i0(false, true);
        }
        lrVar.k0();
    }

    public static void c0(lr lrVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i3) {
        if (lrVar.f47415a0 == null) {
            if ((fileLocation != null || inputFile != null) && tLObject != null) {
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                TLRPC.User a22 = lrVar.getMessagesController().a2(Long.valueOf(lrVar.I));
                TLRPC.UserFull b22 = org.telegram.messenger.hp.s1(lrVar.currentAccount).b2(lrVar.I);
                if (b22 != null) {
                    b22.personal_photo = tL_photos_photo.photo;
                    b22.flags |= 2097152;
                    lrVar.getMessagesStorage().j2(b22, true);
                }
                if (a22 != null) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, 100, false, null, false);
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList, 1000, false, null, false);
                    if (w10 != null && fileLocation != null) {
                        org.telegram.messenger.w7.G(lrVar.currentAccount);
                        File K = org.telegram.messenger.w7.K(w10, null, true, true);
                        org.telegram.messenger.w7.G(lrVar.currentAccount);
                        org.telegram.messenger.w7.K(fileLocation, null, true, true).renameTo(K);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocation.volume_id);
                        sb2.append("_");
                        String o10 = a1.g.o(fileLocation.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(w10.location.volume_id);
                        sb3.append("_");
                        org.telegram.messenger.zb.D().S(o10, a1.g.o(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.ac.l(lrVar.currentAccount, 1, a22));
                    }
                    if (w11 != null && fileLocation2 != null) {
                        org.telegram.messenger.w7.G(lrVar.currentAccount);
                        File K2 = org.telegram.messenger.w7.K(w11, null, true, true);
                        org.telegram.messenger.w7.G(lrVar.currentAccount);
                        org.telegram.messenger.w7.K(fileLocation2, null, true, true).renameTo(K2);
                    }
                    cg.m0.a(tL_photos_photo.photo, a22, true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(a22);
                    lrVar.getMessagesStorage().m1(arrayList2, null, false, true);
                    lrVar.getMessagesController().U0(lrVar.I);
                    lrVar.getNotificationCenter().k(org.telegram.messenger.hs.f23208c0, new Object[0]);
                    lrVar.getNotificationCenter().k(org.telegram.messenger.hs.f23292r, 2);
                    if (lrVar.getParentActivity() != null) {
                        if (i3 == 2) {
                            org.telegram.ui.Components.fc.a0(lrVar).V(arrayList2, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("UserCustomPhotoSeted", null, 2131743753, a22.first_name)), null, null).j();
                        } else {
                            org.telegram.ui.Components.fc.a0(lrVar).V(arrayList2, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("UserCustomPhotoSeted", null, 2131743753, a22.first_name)), null, null).j();
                        }
                    }
                }
                lrVar.R = null;
                lrVar.k0();
            }
        }
    }

    public static void d0(lr lrVar) {
        if (lrVar.f47415a0 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(lrVar.f47415a0.f1()));
            org.telegram.messenger.hs.f(lrVar.currentAccount).k(org.telegram.messenger.hs.f23325w, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override
    public final void H(float f10) {
        RadialProgressView radialProgressView = this.f47422s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void O(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f47422s;
        if (radialProgressView == null) {
            return;
        }
        this.T = this.S;
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void T() {
        org.telegram.messenger.g0.h3(new br(this, 0));
    }

    @Override
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new Runnable() {
            @Override
            public final void run() {
                lr.b0(lr.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z10);
            }
        });
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28026l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28007k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
    }

    @Override
    public final View createView(Context context) {
        int i3;
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
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131748291, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131751283, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new hr(this));
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (this.J) {
            i3 = 2131751753;
        } else {
            i3 = 2131745956;
        }
        this.f47414a = y4Var.n(org.telegram.messenger.bd.M0(i3, null));
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.W = frameLayout2;
        int i16 = org.telegram.ui.ActionBar.k6.f27878d6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f47421r;
        org.telegram.ui.ActionBar.r6.i(i16, frameLayout2, e6Var);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f47418e = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(32.0f));
        FrameLayout frameLayout3 = this.W;
        org.telegram.ui.Components.k9 k9Var2 = this.f47418e;
        int i17 = 3;
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout3.addView(k9Var2, b8.mf.d(64, 64.0f, i10 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        gi.n5 n5Var = new gi.n5(this, context, paint, 10);
        this.f47423w = n5Var;
        FrameLayout frameLayout4 = this.W;
        if (org.telegram.messenger.bd.f21784a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout4.addView(n5Var, b8.mf.d(64, 64.0f, i11 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f47422s = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(30.0f));
        this.f47422s.setProgressColor(-1);
        this.f47422s.setNoProgress(false);
        FrameLayout frameLayout5 = this.W;
        RadialProgressView radialProgressView2 = this.f47422s;
        if (org.telegram.messenger.bd.f21784a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        frameLayout5.addView(radialProgressView2, b8.mf.d(64, 64.0f, i12 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        i0(false, false);
        TextView textView = new TextView(context);
        this.f47419f = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
        this.f47419f.setTextSize(1, 18.0f);
        this.f47419f.setLines(1);
        this.f47419f.setMaxLines(1);
        this.f47419f.setSingleLine(true);
        TextView textView2 = this.f47419f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView textView3 = this.f47419f;
        if (org.telegram.messenger.bd.f21784a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView3.setGravity(i13);
        this.f47419f.setTypeface(org.telegram.messenger.g0.o());
        FrameLayout frameLayout6 = this.W;
        TextView textView4 = this.f47419f;
        boolean z10 = org.telegram.messenger.bd.f21784a0;
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
        TextView m10 = org.telegram.ui.Cells.f1.m(frameLayout6, textView4, b8.mf.d(-2, -2.0f, i18, f10, 25.66f, f11, 0.0f), context);
        this.h = m10;
        org.telegram.ui.ActionBar.r6.V(m10, org.telegram.ui.ActionBar.k6.A6, e6Var);
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        TextView textView5 = this.h;
        if (org.telegram.messenger.bd.f21784a0) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView5.setGravity(i15);
        FrameLayout frameLayout7 = this.W;
        TextView textView6 = this.h;
        boolean z11 = org.telegram.messenger.bd.f21784a0;
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
        frameLayout7.addView(textView6, b8.mf.d(-2, -2.0f, i19, f12, 49.66f, f13, 0.0f));
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.bd.M0(2131750695, null), false, false, -1, this.f47421r);
        this.f47416b = k3Var;
        k3Var.d.setImeOptions(5);
        org.telegram.ui.ActionBar.r6.i(i16, this.f47416b, e6Var);
        this.f47416b.setDivider(true);
        this.f47416b.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final lr f45326b;

            {
                this.f45326b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i20, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i20 == 5) {
                            lr lrVar = this.f45326b;
                            lrVar.f47417c.d.requestFocus();
                            org.telegram.ui.Cells.i3 i3Var = lrVar.f47417c.d;
                            i3Var.setSelection(i3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        lr lrVar2 = this.f45326b;
                        if (i20 == 6) {
                            lrVar2.f47414a.performClick();
                            return true;
                        } else if (i20 == 5) {
                            lrVar2.d.d.requestFocus();
                            lrVar2.d.d.setSelection(lrVar2.f47417c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        lr lrVar3 = this.f45326b;
                        if (i20 == 6) {
                            lrVar3.f47414a.performClick();
                            return true;
                        }
                        lrVar3.getClass();
                        return false;
                }
            }
        });
        this.f47416b.d.setOnFocusChangeListener(new Object());
        this.f47416b.setText(this.N);
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.bd.M0(2131749040, null), false, false, -1, this.f47421r);
        this.f47417c = k3Var2;
        k3Var2.d.setImeOptions(5);
        org.telegram.ui.ActionBar.r6.i(i16, this.f47417c, e6Var);
        this.f47417c.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final lr f45326b;

            {
                this.f45326b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i20, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i20 == 5) {
                            lr lrVar = this.f45326b;
                            lrVar.f47417c.d.requestFocus();
                            org.telegram.ui.Cells.i3 i3Var = lrVar.f47417c.d;
                            i3Var.setSelection(i3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        lr lrVar2 = this.f45326b;
                        if (i20 == 6) {
                            lrVar2.f47414a.performClick();
                            return true;
                        } else if (i20 == 5) {
                            lrVar2.d.d.requestFocus();
                            lrVar2.d.d.setSelection(lrVar2.f47417c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        lr lrVar3 = this.f45326b;
                        if (i20 == 6) {
                            lrVar3.f47414a.performClick();
                            return true;
                        }
                        lrVar3.getClass();
                        return false;
                }
            }
        });
        this.f47417c.setText(this.O);
        org.telegram.ui.Cells.k3 k3Var3 = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.bd.M0(2131754395, null), true, true, ((org.telegram.messenger.j0) getMessagesController().f23167x7.f24679y.f13798b).f23620c, this.f47421r);
        this.d = k3Var3;
        org.telegram.ui.ActionBar.r6.H(k3Var3.d, org.telegram.ui.ActionBar.k6.Uc, e6Var);
        this.d.d.setImeOptions(6);
        org.telegram.ui.ActionBar.r6.i(i16, this.d, e6Var);
        this.d.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final lr f45326b;

            {
                this.f45326b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i20, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i20 == 5) {
                            lr lrVar = this.f45326b;
                            lrVar.f47417c.d.requestFocus();
                            org.telegram.ui.Cells.i3 i3Var = lrVar.f47417c.d;
                            i3Var.setSelection(i3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        lr lrVar2 = this.f45326b;
                        if (i20 == 6) {
                            lrVar2.f47414a.performClick();
                            return true;
                        } else if (i20 == 5) {
                            lrVar2.d.d.requestFocus();
                            lrVar2.d.d.setSelection(lrVar2.f47417c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        lr lrVar3 = this.f45326b;
                        if (i20 == 6) {
                            lrVar3.f47414a.performClick();
                            return true;
                        }
                        lrVar3.getClass();
                        return false;
                }
            }
        });
        if (!this.J) {
            final TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.I));
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context, e6Var);
            this.f47425y = l8Var;
            l8Var.o(2131232047, org.telegram.messenger.bd.a0(null, null, 2131744408, a22.first_name), true);
            this.f47425y.setBackground(org.telegram.ui.ActionBar.k6.M0(e6Var, true));
            org.telegram.ui.Cells.l8 l8Var2 = this.f47425y;
            int i20 = org.telegram.ui.ActionBar.k6.f28214v6;
            int i21 = org.telegram.ui.ActionBar.k6.f28196u6;
            l8Var2.g(i20, i21);
            final org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131624132, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
            this.f47425y.f29595e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
            this.f47425y.f29595e.setAnimation(ch0Var);
            this.f47425y.setOnClickListener(new View.OnClickListener(this) {
                public final lr f45707b;

                {
                    this.f45707b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final lr lrVar = this.f45707b;
                            boolean z13 = true;
                            lrVar.S = 1;
                            org.telegram.ui.Components.f30 f30Var = lrVar.Q;
                            TLRPC.User user = a22;
                            f30Var.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z13 = false;
                            }
                            ai.y1 y1Var = new ai.y1(26);
                            final org.telegram.ui.Components.ch0 ch0Var2 = ch0Var;
                            f30Var.n(z13, y1Var, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            lr lrVar2 = lrVar;
                                            boolean g7 = lrVar2.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var3 = ch0Var2;
                                            if (!g7) {
                                                ch0Var3.P(86);
                                                lrVar2.E.f29595e.d();
                                                return;
                                            }
                                            ch0Var3.N(0, false, false);
                                            return;
                                        default:
                                            lr lrVar3 = lrVar;
                                            boolean g10 = lrVar3.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var4 = ch0Var2;
                                            if (!g10) {
                                                ch0Var4.P(85);
                                                lrVar3.f47425y.f29595e.d();
                                                return;
                                            }
                                            ch0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            ch0Var2.M(0);
                            ch0Var2.P(43);
                            lrVar.f47425y.f29595e.d();
                            return;
                        default:
                            final lr lrVar2 = this.f45707b;
                            lrVar2.S = 2;
                            org.telegram.ui.Components.f30 f30Var2 = lrVar2.Q;
                            TLRPC.User user2 = a22;
                            f30Var2.M = user2;
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
                            ai.y1 y1Var2 = new ai.y1(26);
                            final org.telegram.ui.Components.ch0 ch0Var3 = ch0Var;
                            f30Var2.n(z12, y1Var2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            lr lrVar22 = lrVar2;
                                            boolean g7 = lrVar22.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var32 = ch0Var3;
                                            if (!g7) {
                                                ch0Var32.P(86);
                                                lrVar22.E.f29595e.d();
                                                return;
                                            }
                                            ch0Var32.N(0, false, false);
                                            return;
                                        default:
                                            lr lrVar3 = lrVar2;
                                            boolean g10 = lrVar3.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var4 = ch0Var3;
                                            if (!g10) {
                                                ch0Var4.P(85);
                                                lrVar3.f47425y.f29595e.d();
                                                return;
                                            }
                                            ch0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            ch0Var3.M(0);
                            ch0Var3.P(43);
                            lrVar2.E.f29595e.d();
                            return;
                    }
                }
            });
            org.telegram.ui.Cells.l8 l8Var3 = new org.telegram.ui.Cells.l8(context, e6Var);
            this.E = l8Var3;
            l8Var3.o(2131232047, org.telegram.messenger.bd.a0(null, null, 2131743689, a22.first_name), false);
            this.E.setBackground(org.telegram.ui.ActionBar.k6.M0(e6Var, true));
            this.E.g(i20, i21);
            final org.telegram.ui.Components.ch0 ch0Var2 = new org.telegram.ui.Components.ch0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
            this.E.f29595e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
            this.E.f29595e.setAnimation(ch0Var2);
            this.E.setOnClickListener(new View.OnClickListener(this) {
                public final lr f45707b;

                {
                    this.f45707b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final lr lrVar = this.f45707b;
                            boolean z13 = true;
                            lrVar.S = 1;
                            org.telegram.ui.Components.f30 f30Var = lrVar.Q;
                            TLRPC.User user = a22;
                            f30Var.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z13 = false;
                            }
                            ai.y1 y1Var = new ai.y1(26);
                            final org.telegram.ui.Components.ch0 ch0Var22 = ch0Var2;
                            f30Var.n(z13, y1Var, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            lr lrVar22 = lrVar;
                                            boolean g7 = lrVar22.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var32 = ch0Var22;
                                            if (!g7) {
                                                ch0Var32.P(86);
                                                lrVar22.E.f29595e.d();
                                                return;
                                            }
                                            ch0Var32.N(0, false, false);
                                            return;
                                        default:
                                            lr lrVar3 = lrVar;
                                            boolean g10 = lrVar3.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var4 = ch0Var22;
                                            if (!g10) {
                                                ch0Var4.P(85);
                                                lrVar3.f47425y.f29595e.d();
                                                return;
                                            }
                                            ch0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            ch0Var22.M(0);
                            ch0Var22.P(43);
                            lrVar.f47425y.f29595e.d();
                            return;
                        default:
                            final lr lrVar2 = this.f45707b;
                            lrVar2.S = 2;
                            org.telegram.ui.Components.f30 f30Var2 = lrVar2.Q;
                            TLRPC.User user2 = a22;
                            f30Var2.M = user2;
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
                            ai.y1 y1Var2 = new ai.y1(26);
                            final org.telegram.ui.Components.ch0 ch0Var3 = ch0Var2;
                            f30Var2.n(z12, y1Var2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            lr lrVar22 = lrVar2;
                                            boolean g7 = lrVar22.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var32 = ch0Var3;
                                            if (!g7) {
                                                ch0Var32.P(86);
                                                lrVar22.E.f29595e.d();
                                                return;
                                            }
                                            ch0Var32.N(0, false, false);
                                            return;
                                        default:
                                            lr lrVar3 = lrVar2;
                                            boolean g10 = lrVar3.Q.g();
                                            org.telegram.ui.Components.ch0 ch0Var4 = ch0Var3;
                                            if (!g10) {
                                                ch0Var4.P(85);
                                                lrVar3.f47425y.f29595e.d();
                                                return;
                                            }
                                            ch0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            ch0Var3.M(0);
                            ch0Var3.P(43);
                            lrVar2.E.f29595e.d();
                            return;
                    }
                }
            });
            this.V = new org.telegram.ui.Components.k9(context);
            this.F = new jr(this, context, e6Var);
            if (this.f47420n == null) {
                this.f47420n = new org.telegram.ui.Components.u8(0, a22);
            }
            this.V.e(a22.photo, this.f47420n);
            this.F.addView(this.V, b8.mf.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.F.k(org.telegram.messenger.bd.M0(2131746098, null), false);
            this.F.getImageView().setVisibility(0);
            this.F.setBackground(org.telegram.ui.ActionBar.k6.M0(e6Var, true));
            this.F.g(i20, i21);
            this.F.setOnClickListener(new a0(this, context, a22, 10));
            org.telegram.ui.Cells.l8 l8Var4 = new org.telegram.ui.Cells.l8(context, e6Var);
            this.G = l8Var4;
            l8Var4.o(2131231767, org.telegram.messenger.bd.a0(null, null, 2131743688, new Object[0]), false);
            this.G.setBackground(org.telegram.ui.ActionBar.k6.M0(e6Var, true));
            this.G.g(i20, i21);
            this.G.setNeedDivider(true);
            this.G.f29595e.setTranslationX(org.telegram.messenger.g0.L(4.0f));
            this.G.setOnClickListener(new org.telegram.ui.Components.ux0(11, this, a22));
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
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(this, new c5(this, 7), new x0(this, 29), null);
        this.X = l41Var;
        l41Var.r1();
        this.X.setSectionsDrawBackground(true);
        this.X.setOnScrollListener(new ai.i4(6, this, frameLayout));
        frameLayout.addView(this.X, b8.mf.e(-1, -1, 119));
        if (this.J && this.L) {
            this.Y = true;
        }
        this.X.f35594g3.O(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.messenger.po poVar;
        if (i3 == org.telegram.messenger.hs.f23292r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.hp.C8;
            if ((intValue & 2) != 0 || (intValue & 4) != 0) {
                j0();
            }
        } else if (i3 == org.telegram.messenger.hs.f23222e3 && (poVar = (org.telegram.messenger.po) objArr[0]) == this.H) {
            ArrayList arrayList = new ArrayList(poVar.f24786b);
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
    public final mq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.X;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.f47421r;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i3) {
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
        if (i3 == 1) {
            tL_photos_uploadContactProfilePhoto.suggest = true;
            tL_photos_uploadContactProfilePhoto.flags |= 8;
        } else {
            tL_photos_uploadContactProfilePhoto.save = true;
            tL_photos_uploadContactProfilePhoto.flags |= 16;
        }
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new cg.j0(this, fileLocation, inputFile2, fileLocation2, i3, 9));
    }

    public final void i0(boolean z10, boolean z11) {
        if (this.f47422s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f47424x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f47424x = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f47424x = animatorSet2;
            if (z10) {
                this.f47422s.setVisibility(0);
                this.f47423w.setVisibility(0);
                AnimatorSet animatorSet3 = this.f47424x;
                RadialProgressView radialProgressView = this.f47422s;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f47423w, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f47422s;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f47423w, property2, 0.0f));
            }
            this.f47424x.setDuration(180L);
            this.f47424x.addListener(new org.telegram.ui.Components.s9(27, this, z10));
            this.f47424x.start();
        } else if (z10) {
            this.f47422s.setAlpha(1.0f);
            this.f47422s.setVisibility(0);
            this.f47423w.setAlpha(1.0f);
            this.f47423w.setVisibility(0);
        } else {
            this.f47422s.setAlpha(0.0f);
            this.f47422s.setVisibility(4);
            this.f47423w.setAlpha(0.0f);
            this.f47423w.setVisibility(4);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        TLRPC.User a22;
        if (this.f47419f != null && (a22 = getMessagesController().a2(Long.valueOf(this.I))) != null) {
            if (TextUtils.isEmpty(g0())) {
                this.f47419f.setText(org.telegram.messenger.bd.M0(2131748418, null));
            } else {
                TextView textView = this.f47419f;
                mf.b c2 = mf.b.c();
                textView.setText(c2.b("+" + g0()));
            }
            this.h.setText(org.telegram.messenger.bd.d0(this.currentAccount, a22, null, null));
            if (this.R == null) {
                org.telegram.ui.Components.k9 k9Var = this.f47418e;
                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(0, a22);
                this.f47420n = u8Var;
                k9Var.e(a22, u8Var);
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
            this.V.j(org.telegram.messenger.ac.i(org.telegram.messenger.w7.w(photo.sizes, 1000, false, null, false), this.U), "50_50", this.f47420n, null);
        }
        if (this.f47420n == null) {
            this.f47420n = new org.telegram.ui.Components.u8(0, a22);
        }
        TLRPC.FileLocation fileLocation = this.R;
        if (fileLocation == null) {
            this.f47418e.e(a22, this.f47420n);
        } else {
            this.f47418e.j(org.telegram.messenger.ac.e(fileLocation), "50_50", this.f47420n, getMessagesController().a2(Long.valueOf(this.I)));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        TLRPC.User user;
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23292r);
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23222e3);
        this.I = getArguments().getLong("user_id", 0L);
        this.M = getArguments().getString("phone");
        this.N = getArguments().getString("first_name_card");
        this.O = getArguments().getString("last_name_card");
        this.J = getArguments().getBoolean("addContact", false);
        this.K = getArguments().getBoolean("focus_notes", false);
        SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(this.currentAccount).f22989d7;
        this.L = sharedPreferences.getBoolean("dialog_bar_exception" + this.I, false);
        if (this.I != 0) {
            user = getMessagesController().a2(Long.valueOf(this.I));
        } else {
            user = null;
        }
        org.telegram.ui.Components.f30 f30Var = this.Q;
        if (f30Var != null) {
            f30Var.f33681a = this;
            f30Var.f33682b = this;
        }
        this.H = org.telegram.messenger.hp.s1(this.currentAccount).U0(this.I);
        if (user == null || !super.onFragmentCreate()) {
            return false;
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23292r);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23222e3);
        org.telegram.ui.Components.f30 f30Var = this.Q;
        if (f30Var != null) {
            f30Var.d();
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
            if (this.f47418e != null && (a22 = getMessagesController().a2(Long.valueOf(this.I))) != null) {
                this.f47420n.r(a22);
                this.f47418e.invalidate();
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

    public lr(Bundle bundle, org.telegram.ui.ActionBar.e6 e6Var) {
        super(bundle);
        this.Y = false;
        this.Z = true;
        this.f47421r = e6Var;
        this.Q = new org.telegram.ui.Components.f30(0, true, true);
    }
}
