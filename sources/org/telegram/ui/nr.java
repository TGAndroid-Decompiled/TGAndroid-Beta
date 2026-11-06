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
public final class nr extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, org.telegram.ui.Components.i30 {
    public org.telegram.ui.Cells.m8 D;
    public lr E;
    public org.telegram.ui.Cells.m8 F;
    public org.telegram.messenger.yo G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public String M;
    public String N;
    public mr O;
    public final org.telegram.ui.Components.j30 P;
    public TLRPC.FileLocation Q;
    public int R;
    public int S;
    public TLRPC.Photo T;
    public org.telegram.ui.Components.l9 U;
    public FrameLayout V;
    public org.telegram.ui.Components.q41 W;
    public boolean X;
    public boolean Y;
    public org.telegram.messenger.ij Z;
    public org.telegram.ui.ActionBar.b5 f48116a;
    public org.telegram.ui.Cells.k3 f48117b;
    public org.telegram.ui.Cells.k3 f48118c;
    public org.telegram.ui.Cells.k3 d;
    public org.telegram.ui.Components.l9 f48119e;
    public TextView f48120f;
    public TextView h;
    public org.telegram.ui.Components.w8 f48121n;
    public final org.telegram.ui.ActionBar.f6 f48122r;
    public RadialProgressView f48123s;
    public fi.p5 f48124w;
    public AnimatorSet f48125x;
    public org.telegram.ui.Cells.m8 f48126y;

    public nr(Bundle bundle) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.P = new org.telegram.ui.Components.j30(0, true, true);
    }

    public static void Z(nr nrVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.f27097id = nrVar.getMessagesController().o1(nrVar.H);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(nrVar.currentAccount).sendRequest(tL_users_suggestBirthday, new l(nrVar, 5));
    }

    public static void a0(nr nrVar, TLRPC.User user) {
        nrVar.Q = null;
        nrVar.h0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User a22 = nrVar.getMessagesController().a2(Long.valueOf(nrVar.H));
        a22.photo.personal = false;
        TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(nrVar.currentAccount).b2(nrVar.H);
        if (b22 != null) {
            b22.personal_photo = null;
            b22.flags &= -2097153;
            nrVar.getMessagesStorage().j2(b22, true);
        }
        TLRPC.Photo photo = nrVar.T;
        if (photo != null) {
            a22.photo.photo_id = photo.f26977id;
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
        nrVar.getMessagesStorage().m1(arrayList2, null, false, true);
        nrVar.k0();
        nrVar.getNotificationCenter().k(org.telegram.messenger.qs.f24970c0, new Object[0]);
        nrVar.getNotificationCenter().k(org.telegram.messenger.qs.f25054r, 2);
    }

    public static void b0(nr nrVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z9) {
        boolean z10;
        org.telegram.ui.Components.j30 j30Var = nrVar.P;
        if (j30Var.T) {
            return;
        }
        int i7 = nrVar.S;
        if (i7 == 2) {
            nrVar.Q = photoSize.location;
        } else if (i7 == 1 && nrVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.q4 parentLayout = nrVar.getParentLayout();
            org.telegram.ui.ActionBar.f2 lastFragment = nrVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) fragmentStack.get(size);
                if (f2Var instanceof an) {
                    an anVar = (an) f2Var;
                    org.telegram.ui.ActionBar.f2 f2Var2 = lastFragment;
                    if (anVar.a() == nrVar.H && anVar.f43790f4 == 0) {
                        anVar.wb(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var2;
                            if (arrayList.get(size2) != f2Var3) {
                                ((org.telegram.ui.ActionBar.f2) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            f2Var2 = f2Var3;
                        }
                        f2Var2.finishFragment();
                    } else {
                        lastFragment = f2Var2;
                    }
                }
                arrayList.add((org.telegram.ui.ActionBar.f2) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            nrVar.f48119e.j(org.telegram.messenger.hc.e(nrVar.Q), "50_50", nrVar.f48121n, nrVar.getMessagesController().a2(Long.valueOf(nrVar.H)));
            if (nrVar.S == 2) {
                nrVar.i0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                org.telegram.messenger.gz.C(nrVar.currentAccount);
                tL_messageService.random_id = org.telegram.messenger.gz.E();
                tL_messageService.dialog_id = nrVar.H;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int j3 = nrVar.getUserConfig().j();
                tL_messageService.f26974id = j3;
                tL_messageService.local_id = j3;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = nrVar.getUserConfig().e();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = nrVar.H;
                tL_messageService.date = nrVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z9;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList arrayList2 = new ArrayList();
                org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(nrVar.currentAccount, tL_messageService, false, false);
                nrVar.Z = ijVar;
                arrayList2.add(ijVar);
                new ArrayList().add(tL_messageService);
                org.telegram.messenger.qp.s1(nrVar.currentAccount).l5(0, nrVar.H, arrayList2);
                nrVar.getMessagesController().B7.put(tL_messageService.local_id, j30Var);
            }
        } else {
            TLRPC.User a22 = nrVar.getMessagesController().a2(Long.valueOf(nrVar.H));
            if (nrVar.Z == null && a22 != null) {
                if (inputFile2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a22.flags |= 32;
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                a22.photo = tL_userProfilePhoto;
                tL_userProfilePhoto.personal = true;
                tL_userProfilePhoto.photo_id = 0L;
                tL_userProfilePhoto.has_video = z10;
                if (photoSize != null) {
                    tL_userProfilePhoto.photo_small = photoSize.location;
                }
                if (photoSize2 != null) {
                    tL_userProfilePhoto.photo_big = photoSize2.location;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(a22);
                nrVar.getMessagesStorage().m1(arrayList3, null, false, true);
                nrVar.getNotificationCenter().k(org.telegram.messenger.qs.f24970c0, new Object[0]);
                org.telegram.messenger.qs notificationCenter = nrVar.getNotificationCenter();
                int i10 = org.telegram.messenger.qp.C8;
                notificationCenter.k(org.telegram.messenger.qs.f25054r, 2);
            }
            nrVar.h0(nrVar.Q, photoSize2.location, inputFile, inputFile2, videoSize, d, nrVar.S);
            nrVar.i0(false, true);
        }
        nrVar.k0();
    }

    public static void c0(nr nrVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i7) {
        if (nrVar.Z == null) {
            if ((fileLocation != null || inputFile != null) && tLObject != null) {
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                TLRPC.User a22 = nrVar.getMessagesController().a2(Long.valueOf(nrVar.H));
                TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(nrVar.currentAccount).b2(nrVar.H);
                if (b22 != null) {
                    b22.personal_photo = tL_photos_photo.photo;
                    b22.flags |= 2097152;
                    nrVar.getMessagesStorage().j2(b22, true);
                }
                if (a22 != null) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, 100, false, null, false);
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList, 1000, false, null, false);
                    if (w10 != null && fileLocation != null) {
                        org.telegram.messenger.w7.G(nrVar.currentAccount);
                        File J = org.telegram.messenger.w7.J(w10, null, true, true);
                        org.telegram.messenger.w7.G(nrVar.currentAccount);
                        org.telegram.messenger.w7.J(fileLocation, null, true, true).renameTo(J);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocation.volume_id);
                        sb2.append("_");
                        String n10 = a8.p0.n(fileLocation.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(w10.location.volume_id);
                        sb3.append("_");
                        org.telegram.messenger.gc.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.hc.l(nrVar.currentAccount, 1, a22));
                    }
                    if (w11 != null && fileLocation2 != null) {
                        org.telegram.messenger.w7.G(nrVar.currentAccount);
                        File J2 = org.telegram.messenger.w7.J(w11, null, true, true);
                        org.telegram.messenger.w7.G(nrVar.currentAccount);
                        org.telegram.messenger.w7.J(fileLocation2, null, true, true).renameTo(J2);
                    }
                    bg.n0.a(tL_photos_photo.photo, a22, true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(a22);
                    nrVar.getMessagesStorage().m1(arrayList2, null, false, true);
                    nrVar.getMessagesController().U0(nrVar.H);
                    nrVar.getNotificationCenter().k(org.telegram.messenger.qs.f24970c0, new Object[0]);
                    nrVar.getNotificationCenter().k(org.telegram.messenger.qs.f25054r, 2);
                    if (nrVar.getParentActivity() != null) {
                        if (i7 == 2) {
                            org.telegram.ui.Components.hc.a0(nrVar).V(arrayList2, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("UserCustomPhotoSeted", null, 2131743744, a22.first_name)), null, null).j();
                        } else {
                            org.telegram.ui.Components.hc.a0(nrVar).V(arrayList2, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("UserCustomPhotoSeted", null, 2131743744, a22.first_name)), null, null).j();
                        }
                    }
                }
                nrVar.Q = null;
                nrVar.k0();
            }
        }
    }

    public static void d0(nr nrVar) {
        if (nrVar.Z != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(nrVar.Z.f1()));
            org.telegram.messenger.qs.f(nrVar.currentAccount).k(org.telegram.messenger.qs.f25087w, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override
    public final void H(float f10) {
        RadialProgressView radialProgressView = this.f48123s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void O(boolean z9, boolean z10) {
        RadialProgressView radialProgressView = this.f48123s;
        if (radialProgressView == null) {
            return;
        }
        this.S = this.R;
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void T() {
        org.telegram.messenger.g0.h3(new dr(this, 0));
    }

    @Override
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z9, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new Runnable() {
            @Override
            public final void run() {
                nr.b0(nr.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z9);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27996l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27978k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
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
        if (this.I) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131748282, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131751283, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new jr(this));
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (this.I) {
            i7 = 2131751753;
        } else {
            i7 = 2131745947;
        }
        this.f48116a = y4Var.n(org.telegram.messenger.hd.M0(i7, null));
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V = frameLayout2;
        int i16 = org.telegram.ui.ActionBar.k6.f27849d6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f48122r;
        org.telegram.ui.ActionBar.r6.i(i16, frameLayout2, f6Var);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f48119e = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(32.0f));
        FrameLayout frameLayout3 = this.V;
        org.telegram.ui.Components.l9 l9Var2 = this.f48119e;
        int i17 = 3;
        if (org.telegram.messenger.hd.f22878a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout3.addView(l9Var2, c8.ha.d(64, 64.0f, i10 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        fi.p5 p5Var = new fi.p5(this, context, paint, 10);
        this.f48124w = p5Var;
        FrameLayout frameLayout4 = this.V;
        if (org.telegram.messenger.hd.f22878a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout4.addView(p5Var, c8.ha.d(64, 64.0f, i11 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f48123s = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(30.0f));
        this.f48123s.setProgressColor(-1);
        this.f48123s.setNoProgress(false);
        FrameLayout frameLayout5 = this.V;
        RadialProgressView radialProgressView2 = this.f48123s;
        if (org.telegram.messenger.hd.f22878a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        frameLayout5.addView(radialProgressView2, c8.ha.d(64, 64.0f, i12 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        i0(false, false);
        TextView textView = new TextView(context);
        this.f48120f = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, f6Var);
        this.f48120f.setTextSize(1, 18.0f);
        this.f48120f.setLines(1);
        this.f48120f.setMaxLines(1);
        this.f48120f.setSingleLine(true);
        TextView textView2 = this.f48120f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView textView3 = this.f48120f;
        if (org.telegram.messenger.hd.f22878a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView3.setGravity(i13);
        this.f48120f.setTypeface(org.telegram.messenger.g0.o());
        FrameLayout frameLayout6 = this.V;
        TextView textView4 = this.f48120f;
        boolean z9 = org.telegram.messenger.hd.f22878a0;
        if (z9) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i18 = i14 | 48;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 94.0f;
        }
        if (z9) {
            f11 = 94.0f;
        } else {
            f11 = 0.0f;
        }
        TextView i19 = org.telegram.ui.Cells.f1.i(frameLayout6, textView4, c8.ha.d(-2, -2.0f, i18, f10, 25.66f, f11, 0.0f), context);
        this.h = i19;
        org.telegram.ui.ActionBar.r6.V(i19, org.telegram.ui.ActionBar.k6.A6, f6Var);
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        TextView textView5 = this.h;
        if (org.telegram.messenger.hd.f22878a0) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView5.setGravity(i15);
        FrameLayout frameLayout7 = this.V;
        TextView textView6 = this.h;
        boolean z10 = org.telegram.messenger.hd.f22878a0;
        if (z10) {
            i17 = 5;
        }
        int i20 = i17 | 48;
        if (z10) {
            f12 = 0.0f;
        } else {
            f12 = 94.0f;
        }
        if (z10) {
            f13 = 94.0f;
        } else {
            f13 = 0.0f;
        }
        frameLayout7.addView(textView6, c8.ha.d(-2, -2.0f, i20, f12, 49.66f, f13, 0.0f));
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.hd.M0(2131750695, null), false, false, -1, this.f48122r);
        this.f48117b = k3Var;
        k3Var.d.setImeOptions(5);
        org.telegram.ui.ActionBar.r6.i(i16, this.f48117b, f6Var);
        this.f48117b.setDivider(true);
        this.f48117b.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final nr f46480b;

            {
                this.f46480b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i21, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i21 == 5) {
                            nr nrVar = this.f46480b;
                            nrVar.f48118c.d.requestFocus();
                            org.telegram.ui.Cells.i3 i3Var = nrVar.f48118c.d;
                            i3Var.setSelection(i3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        nr nrVar2 = this.f46480b;
                        if (i21 == 6) {
                            nrVar2.f48116a.performClick();
                            return true;
                        } else if (i21 == 5) {
                            nrVar2.d.d.requestFocus();
                            nrVar2.d.d.setSelection(nrVar2.f48118c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        nr nrVar3 = this.f46480b;
                        if (i21 == 6) {
                            nrVar3.f48116a.performClick();
                            return true;
                        }
                        nrVar3.getClass();
                        return false;
                }
            }
        });
        this.f48117b.d.setOnFocusChangeListener(new Object());
        this.f48117b.setText(this.M);
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.hd.M0(2131749031, null), false, false, -1, this.f48122r);
        this.f48118c = k3Var2;
        k3Var2.d.setImeOptions(5);
        org.telegram.ui.ActionBar.r6.i(i16, this.f48118c, f6Var);
        this.f48118c.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final nr f46480b;

            {
                this.f46480b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i21, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i21 == 5) {
                            nr nrVar = this.f46480b;
                            nrVar.f48118c.d.requestFocus();
                            org.telegram.ui.Cells.i3 i3Var = nrVar.f48118c.d;
                            i3Var.setSelection(i3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        nr nrVar2 = this.f46480b;
                        if (i21 == 6) {
                            nrVar2.f48116a.performClick();
                            return true;
                        } else if (i21 == 5) {
                            nrVar2.d.d.requestFocus();
                            nrVar2.d.d.setSelection(nrVar2.f48118c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        nr nrVar3 = this.f46480b;
                        if (i21 == 6) {
                            nrVar3.f48116a.performClick();
                            return true;
                        }
                        nrVar3.getClass();
                        return false;
                }
            }
        });
        this.f48118c.setText(this.N);
        org.telegram.ui.Cells.k3 k3Var3 = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.hd.M0(2131754395, null), true, true, ((org.telegram.messenger.j0) getMessagesController().f24935x7.f24460y.f13555b).f23439c, this.f48122r);
        this.d = k3Var3;
        org.telegram.ui.ActionBar.r6.H(k3Var3.d, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        this.d.d.setImeOptions(6);
        org.telegram.ui.ActionBar.r6.i(i16, this.d, f6Var);
        this.d.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final nr f46480b;

            {
                this.f46480b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i21, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i21 == 5) {
                            nr nrVar = this.f46480b;
                            nrVar.f48118c.d.requestFocus();
                            org.telegram.ui.Cells.i3 i3Var = nrVar.f48118c.d;
                            i3Var.setSelection(i3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        nr nrVar2 = this.f46480b;
                        if (i21 == 6) {
                            nrVar2.f48116a.performClick();
                            return true;
                        } else if (i21 == 5) {
                            nrVar2.d.d.requestFocus();
                            nrVar2.d.d.setSelection(nrVar2.f48118c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        nr nrVar3 = this.f46480b;
                        if (i21 == 6) {
                            nrVar3.f48116a.performClick();
                            return true;
                        }
                        nrVar3.getClass();
                        return false;
                }
            }
        });
        if (!this.I) {
            final TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.H));
            org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context, f6Var);
            this.f48126y = m8Var;
            m8Var.o(2131232047, org.telegram.messenger.hd.a0(null, null, 2131744399, a22.first_name), true);
            this.f48126y.setBackground(org.telegram.ui.ActionBar.k6.M0(f6Var, true));
            org.telegram.ui.Cells.m8 m8Var2 = this.f48126y;
            int i21 = org.telegram.ui.ActionBar.k6.f28184v6;
            int i22 = org.telegram.ui.ActionBar.k6.f28165u6;
            m8Var2.g(i21, i22);
            final org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(2131624132, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
            this.f48126y.f29567e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
            this.f48126y.f29567e.setAnimation(zg0Var);
            this.f48126y.setOnClickListener(new View.OnClickListener(this) {
                public final nr f46730b;

                {
                    this.f46730b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z11;
                    switch (r4) {
                        case 0:
                            final nr nrVar = this.f46730b;
                            boolean z12 = true;
                            nrVar.R = 1;
                            org.telegram.ui.Components.j30 j30Var = nrVar.P;
                            TLRPC.User user = a22;
                            j30Var.L = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z12 = false;
                            }
                            ai.m0 m0Var = new ai.m0(22);
                            final org.telegram.ui.Components.zg0 zg0Var2 = zg0Var;
                            j30Var.n(z12, m0Var, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            nr nrVar2 = nrVar;
                                            boolean g10 = nrVar2.P.g();
                                            org.telegram.ui.Components.zg0 zg0Var3 = zg0Var2;
                                            if (!g10) {
                                                zg0Var3.P(86);
                                                nrVar2.D.f29567e.d();
                                                return;
                                            }
                                            zg0Var3.N(0, false, false);
                                            return;
                                        default:
                                            nr nrVar3 = nrVar;
                                            boolean g11 = nrVar3.P.g();
                                            org.telegram.ui.Components.zg0 zg0Var4 = zg0Var2;
                                            if (!g11) {
                                                zg0Var4.P(85);
                                                nrVar3.f48126y.f29567e.d();
                                                return;
                                            }
                                            zg0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            zg0Var2.M(0);
                            zg0Var2.P(43);
                            nrVar.f48126y.f29567e.d();
                            return;
                        default:
                            final nr nrVar2 = this.f46730b;
                            nrVar2.R = 2;
                            org.telegram.ui.Components.j30 j30Var2 = nrVar2.P;
                            TLRPC.User user2 = a22;
                            j30Var2.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                            if (userProfilePhoto2 == null) {
                                fileLocation2 = null;
                            } else {
                                fileLocation2 = userProfilePhoto2.photo_small;
                            }
                            if (fileLocation2 != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            ai.m0 m0Var2 = new ai.m0(22);
                            final org.telegram.ui.Components.zg0 zg0Var3 = zg0Var;
                            j30Var2.n(z11, m0Var2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            nr nrVar22 = nrVar2;
                                            boolean g10 = nrVar22.P.g();
                                            org.telegram.ui.Components.zg0 zg0Var32 = zg0Var3;
                                            if (!g10) {
                                                zg0Var32.P(86);
                                                nrVar22.D.f29567e.d();
                                                return;
                                            }
                                            zg0Var32.N(0, false, false);
                                            return;
                                        default:
                                            nr nrVar3 = nrVar2;
                                            boolean g11 = nrVar3.P.g();
                                            org.telegram.ui.Components.zg0 zg0Var4 = zg0Var3;
                                            if (!g11) {
                                                zg0Var4.P(85);
                                                nrVar3.f48126y.f29567e.d();
                                                return;
                                            }
                                            zg0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            zg0Var3.M(0);
                            zg0Var3.P(43);
                            nrVar2.D.f29567e.d();
                            return;
                    }
                }
            });
            org.telegram.ui.Cells.m8 m8Var3 = new org.telegram.ui.Cells.m8(context, f6Var);
            this.D = m8Var3;
            m8Var3.o(2131232047, org.telegram.messenger.hd.a0(null, null, 2131743680, a22.first_name), false);
            this.D.setBackground(org.telegram.ui.ActionBar.k6.M0(f6Var, true));
            this.D.g(i21, i22);
            final org.telegram.ui.Components.zg0 zg0Var2 = new org.telegram.ui.Components.zg0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
            this.D.f29567e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
            this.D.f29567e.setAnimation(zg0Var2);
            this.D.setOnClickListener(new View.OnClickListener(this) {
                public final nr f46730b;

                {
                    this.f46730b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z11;
                    switch (r4) {
                        case 0:
                            final nr nrVar = this.f46730b;
                            boolean z12 = true;
                            nrVar.R = 1;
                            org.telegram.ui.Components.j30 j30Var = nrVar.P;
                            TLRPC.User user = a22;
                            j30Var.L = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z12 = false;
                            }
                            ai.m0 m0Var = new ai.m0(22);
                            final org.telegram.ui.Components.zg0 zg0Var22 = zg0Var2;
                            j30Var.n(z12, m0Var, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            nr nrVar22 = nrVar;
                                            boolean g10 = nrVar22.P.g();
                                            org.telegram.ui.Components.zg0 zg0Var32 = zg0Var22;
                                            if (!g10) {
                                                zg0Var32.P(86);
                                                nrVar22.D.f29567e.d();
                                                return;
                                            }
                                            zg0Var32.N(0, false, false);
                                            return;
                                        default:
                                            nr nrVar3 = nrVar;
                                            boolean g11 = nrVar3.P.g();
                                            org.telegram.ui.Components.zg0 zg0Var4 = zg0Var22;
                                            if (!g11) {
                                                zg0Var4.P(85);
                                                nrVar3.f48126y.f29567e.d();
                                                return;
                                            }
                                            zg0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            zg0Var22.M(0);
                            zg0Var22.P(43);
                            nrVar.f48126y.f29567e.d();
                            return;
                        default:
                            final nr nrVar2 = this.f46730b;
                            nrVar2.R = 2;
                            org.telegram.ui.Components.j30 j30Var2 = nrVar2.P;
                            TLRPC.User user2 = a22;
                            j30Var2.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                            if (userProfilePhoto2 == null) {
                                fileLocation2 = null;
                            } else {
                                fileLocation2 = userProfilePhoto2.photo_small;
                            }
                            if (fileLocation2 != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            ai.m0 m0Var2 = new ai.m0(22);
                            final org.telegram.ui.Components.zg0 zg0Var3 = zg0Var2;
                            j30Var2.n(z11, m0Var2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            nr nrVar22 = nrVar2;
                                            boolean g10 = nrVar22.P.g();
                                            org.telegram.ui.Components.zg0 zg0Var32 = zg0Var3;
                                            if (!g10) {
                                                zg0Var32.P(86);
                                                nrVar22.D.f29567e.d();
                                                return;
                                            }
                                            zg0Var32.N(0, false, false);
                                            return;
                                        default:
                                            nr nrVar3 = nrVar2;
                                            boolean g11 = nrVar3.P.g();
                                            org.telegram.ui.Components.zg0 zg0Var4 = zg0Var3;
                                            if (!g11) {
                                                zg0Var4.P(85);
                                                nrVar3.f48126y.f29567e.d();
                                                return;
                                            }
                                            zg0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            zg0Var3.M(0);
                            zg0Var3.P(43);
                            nrVar2.D.f29567e.d();
                            return;
                    }
                }
            });
            this.U = new org.telegram.ui.Components.l9(context);
            this.E = new lr(this, context, f6Var);
            if (this.f48121n == null) {
                this.f48121n = new org.telegram.ui.Components.w8(0, a22);
            }
            this.U.e(a22.photo, this.f48121n);
            this.E.addView(this.U, c8.ha.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.E.k(org.telegram.messenger.hd.M0(2131746089, null), false);
            this.E.getImageView().setVisibility(0);
            this.E.setBackground(org.telegram.ui.ActionBar.k6.M0(f6Var, true));
            this.E.g(i21, i22);
            this.E.setOnClickListener(new z(this, context, a22, 10));
            org.telegram.ui.Cells.m8 m8Var4 = new org.telegram.ui.Cells.m8(context, f6Var);
            this.F = m8Var4;
            m8Var4.o(2131231767, org.telegram.messenger.hd.a0(null, null, 2131743679, new Object[0]), false);
            this.F.setBackground(org.telegram.ui.ActionBar.k6.M0(f6Var, true));
            this.F.g(i21, i22);
            this.F.setNeedDivider(true);
            this.F.f29567e.setTranslationX(org.telegram.messenger.g0.L(4.0f));
            this.F.setOnClickListener(new org.telegram.ui.Components.t41(5, this, a22));
            TLRPC.UserFull b22 = getMessagesController().b2(this.H);
            if (b22 != null) {
                TLRPC.Photo photo = b22.profile_photo;
                this.T = photo;
                if (photo == null) {
                    this.T = b22.fallback_photo;
                }
            }
            k0();
        }
        org.telegram.ui.Components.q41 q41Var = new org.telegram.ui.Components.q41(this, new a5(this, 7), new w0(this, 29), null);
        this.W = q41Var;
        q41Var.r1();
        this.W.setSectionsDrawBackground(true);
        this.W.setOnScrollListener(new ai.o0(5, this, frameLayout));
        frameLayout.addView(this.W, c8.ha.e(-1, -1, 119));
        if (this.I && this.K) {
            this.X = true;
        }
        this.W.f37160f3.O(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.messenger.yo yoVar;
        if (i7 == org.telegram.messenger.qs.f25054r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.qp.C8;
            if ((intValue & 2) != 0 || (intValue & 4) != 0) {
                j0();
            }
        } else if (i7 == org.telegram.messenger.qs.f24984e3 && (yoVar = (org.telegram.messenger.yo) objArr[0]) == this.G) {
            ArrayList arrayList = new ArrayList(yoVar.f26682b);
            int i12 = 0;
            while (i12 < arrayList.size()) {
                if (arrayList.get(i12) == null) {
                    arrayList.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (arrayList.size() > 0) {
                this.T = (TLRPC.Photo) arrayList.get(0);
                k0();
            }
        }
    }

    @Override
    public final boolean e() {
        if (this.S != 1) {
            return true;
        }
        return false;
    }

    public final String g0() {
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.H));
        if (a22 != null && !TextUtils.isEmpty(a22.phone)) {
            return a22.phone;
        }
        return this.L;
    }

    @Override
    public final wq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.W;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f48122r;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i7) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().o1(this.H);
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

    public final void i0(boolean z9, boolean z10) {
        if (this.f48123s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f48125x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f48125x = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f48125x = animatorSet2;
            if (z9) {
                this.f48123s.setVisibility(0);
                this.f48124w.setVisibility(0);
                AnimatorSet animatorSet3 = this.f48125x;
                RadialProgressView radialProgressView = this.f48123s;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f48124w, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f48123s;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f48124w, property2, 0.0f));
            }
            this.f48125x.setDuration(180L);
            this.f48125x.addListener(new org.telegram.ui.Components.t9(27, this, z9));
            this.f48125x.start();
        } else if (z9) {
            this.f48123s.setAlpha(1.0f);
            this.f48123s.setVisibility(0);
            this.f48124w.setAlpha(1.0f);
            this.f48124w.setVisibility(0);
        } else {
            this.f48123s.setAlpha(0.0f);
            this.f48123s.setVisibility(4);
            this.f48124w.setAlpha(0.0f);
            this.f48124w.setVisibility(4);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        TLRPC.User a22;
        if (this.f48120f != null && (a22 = getMessagesController().a2(Long.valueOf(this.H))) != null) {
            if (TextUtils.isEmpty(g0())) {
                this.f48120f.setText(org.telegram.messenger.hd.M0(2131748409, null));
            } else {
                TextView textView = this.f48120f;
                pf.b c10 = pf.b.c();
                textView.setText(c10.b("+" + g0()));
            }
            this.h.setText(org.telegram.messenger.hd.d0(this.currentAccount, a22, null, null));
            if (this.Q == null) {
                org.telegram.ui.Components.l9 l9Var = this.f48119e;
                org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(0, a22);
                this.f48121n = w8Var;
                l9Var.e(a22, w8Var);
            }
        }
    }

    public final void k0() {
        TLRPC.Photo photo;
        if (this.I) {
            return;
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.H));
        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.T) != null) {
            this.U.j(org.telegram.messenger.hc.i(org.telegram.messenger.w7.w(photo.sizes, 1000, false, null, false), this.T), "50_50", this.f48121n, null);
        }
        if (this.f48121n == null) {
            this.f48121n = new org.telegram.ui.Components.w8(0, a22);
        }
        TLRPC.FileLocation fileLocation = this.Q;
        if (fileLocation == null) {
            this.f48119e.e(a22, this.f48121n);
        } else {
            this.f48119e.j(org.telegram.messenger.hc.e(fileLocation), "50_50", this.f48121n, getMessagesController().a2(Long.valueOf(this.H)));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        TLRPC.User user;
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25054r);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f24984e3);
        this.H = getArguments().getLong("user_id", 0L);
        this.L = getArguments().getString("phone");
        this.M = getArguments().getString("first_name_card");
        this.N = getArguments().getString("last_name_card");
        this.I = getArguments().getBoolean("addContact", false);
        this.J = getArguments().getBoolean("focus_notes", false);
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(this.currentAccount).f24757d7;
        this.K = sharedPreferences.getBoolean("dialog_bar_exception" + this.H, false);
        if (this.H != 0) {
            user = getMessagesController().a2(Long.valueOf(this.H));
        } else {
            user = null;
        }
        org.telegram.ui.Components.j30 j30Var = this.P;
        if (j30Var != null) {
            j30Var.f34858a = this;
            j30Var.f34859b = this;
        }
        this.G = org.telegram.messenger.qp.s1(this.currentAccount).U0(this.H);
        if (user == null || !super.onFragmentCreate()) {
            return false;
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25054r);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f24984e3);
        org.telegram.ui.Components.j30 j30Var = this.P;
        if (j30Var != null) {
            j30Var.d();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.P.i();
    }

    @Override
    public final void onResume() {
        super.onResume();
        j0();
        this.P.k();
    }

    @Override
    public final void onThemeColorsChanged() {
        TLRPC.User a22;
        try {
            super.onThemeColorsChanged();
            if (this.f48119e != null && (a22 = getMessagesController().a2(Long.valueOf(this.H))) != null) {
                this.f48121n.r(a22);
                this.f48119e.invalidate();
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

    public nr(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.f48122r = f6Var;
        this.P = new org.telegram.ui.Components.j30(0, true, true);
    }
}
