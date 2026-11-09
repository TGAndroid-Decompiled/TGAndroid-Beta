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
public final class pr extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, org.telegram.ui.Components.j30 {
    public org.telegram.ui.Cells.m8 D;
    public nr E;
    public org.telegram.ui.Cells.m8 F;
    public org.telegram.messenger.yo G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public String M;
    public String N;
    public or O;
    public final org.telegram.ui.Components.k30 P;
    public TLRPC.FileLocation Q;
    public int R;
    public int S;
    public TLRPC.Photo T;
    public org.telegram.ui.Components.l9 U;
    public FrameLayout V;
    public org.telegram.ui.Components.r41 W;
    public boolean X;
    public boolean Y;
    public org.telegram.messenger.ij Z;
    public org.telegram.ui.ActionBar.b5 f48787a;
    public org.telegram.ui.Cells.k3 f48788b;
    public org.telegram.ui.Cells.k3 f48789c;
    public org.telegram.ui.Cells.k3 d;
    public org.telegram.ui.Components.l9 f48790e;
    public TextView f48791f;
    public TextView h;
    public org.telegram.ui.Components.w8 f48792n;
    public final org.telegram.ui.ActionBar.g6 f48793r;
    public RadialProgressView f48794s;
    public fi.p5 f48795w;
    public AnimatorSet f48796x;
    public org.telegram.ui.Cells.m8 f48797y;

    public pr(Bundle bundle) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.P = new org.telegram.ui.Components.k30(0, true, true);
    }

    public static void Z(pr prVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.f27100id = prVar.getMessagesController().o1(prVar.H);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(prVar.currentAccount).sendRequest(tL_users_suggestBirthday, new l(prVar, 5));
    }

    public static void a0(pr prVar, TLRPC.User user) {
        prVar.Q = null;
        prVar.h0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User a22 = prVar.getMessagesController().a2(Long.valueOf(prVar.H));
        a22.photo.personal = false;
        TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(prVar.currentAccount).b2(prVar.H);
        if (b22 != null) {
            b22.personal_photo = null;
            b22.flags &= -2097153;
            prVar.getMessagesStorage().j2(b22, true);
        }
        TLRPC.Photo photo = prVar.T;
        if (photo != null) {
            a22.photo.photo_id = photo.f26980id;
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
        prVar.getNotificationCenter().k(org.telegram.messenger.qs.f24979c0, new Object[0]);
        prVar.getNotificationCenter().k(org.telegram.messenger.qs.f25063r, 2);
    }

    public static void b0(pr prVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z9) {
        boolean z10;
        org.telegram.ui.Components.k30 k30Var = prVar.P;
        if (k30Var.T) {
            return;
        }
        int i7 = prVar.S;
        if (i7 == 2) {
            prVar.Q = photoSize.location;
        } else if (i7 == 1 && prVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.q4 parentLayout = prVar.getParentLayout();
            org.telegram.ui.ActionBar.f2 lastFragment = prVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) fragmentStack.get(size);
                if (f2Var instanceof cn) {
                    cn cnVar = (cn) f2Var;
                    org.telegram.ui.ActionBar.f2 f2Var2 = lastFragment;
                    if (cnVar.a() == prVar.H && cnVar.f44451f4 == 0) {
                        cnVar.zb(false, null);
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
            prVar.f48790e.j(org.telegram.messenger.hc.e(prVar.Q), "50_50", prVar.f48792n, prVar.getMessagesController().a2(Long.valueOf(prVar.H)));
            if (prVar.S == 2) {
                prVar.i0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                org.telegram.messenger.gz.C(prVar.currentAccount);
                tL_messageService.random_id = org.telegram.messenger.gz.E();
                tL_messageService.dialog_id = prVar.H;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int j3 = prVar.getUserConfig().j();
                tL_messageService.f26977id = j3;
                tL_messageService.local_id = j3;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = prVar.getUserConfig().e();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = prVar.H;
                tL_messageService.date = prVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z9;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList arrayList2 = new ArrayList();
                org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(prVar.currentAccount, tL_messageService, false, false);
                prVar.Z = ijVar;
                arrayList2.add(ijVar);
                new ArrayList().add(tL_messageService);
                org.telegram.messenger.qp.s1(prVar.currentAccount).l5(0, prVar.H, arrayList2);
                prVar.getMessagesController().B7.put(tL_messageService.local_id, k30Var);
            }
        } else {
            TLRPC.User a22 = prVar.getMessagesController().a2(Long.valueOf(prVar.H));
            if (prVar.Z == null && a22 != null) {
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
                prVar.getMessagesStorage().m1(arrayList3, null, false, true);
                prVar.getNotificationCenter().k(org.telegram.messenger.qs.f24979c0, new Object[0]);
                org.telegram.messenger.qs notificationCenter = prVar.getNotificationCenter();
                int i10 = org.telegram.messenger.qp.C8;
                notificationCenter.k(org.telegram.messenger.qs.f25063r, 2);
            }
            prVar.h0(prVar.Q, photoSize2.location, inputFile, inputFile2, videoSize, d, prVar.S);
            prVar.i0(false, true);
        }
        prVar.k0();
    }

    public static void c0(pr prVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i7) {
        if (prVar.Z == null) {
            if ((fileLocation != null || inputFile != null) && tLObject != null) {
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                TLRPC.User a22 = prVar.getMessagesController().a2(Long.valueOf(prVar.H));
                TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(prVar.currentAccount).b2(prVar.H);
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
                        org.telegram.messenger.gc.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.hc.l(prVar.currentAccount, 1, a22));
                    }
                    if (w11 != null && fileLocation2 != null) {
                        org.telegram.messenger.w7.G(prVar.currentAccount);
                        File J2 = org.telegram.messenger.w7.J(w11, null, true, true);
                        org.telegram.messenger.w7.G(prVar.currentAccount);
                        org.telegram.messenger.w7.J(fileLocation2, null, true, true).renameTo(J2);
                    }
                    bg.n0.a(tL_photos_photo.photo, a22, true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(a22);
                    prVar.getMessagesStorage().m1(arrayList2, null, false, true);
                    prVar.getMessagesController().U0(prVar.H);
                    prVar.getNotificationCenter().k(org.telegram.messenger.qs.f24979c0, new Object[0]);
                    prVar.getNotificationCenter().k(org.telegram.messenger.qs.f25063r, 2);
                    if (prVar.getParentActivity() != null) {
                        if (i7 == 2) {
                            org.telegram.ui.Components.hc.a0(prVar).V(arrayList2, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("UserCustomPhotoSeted", null, 2131743743, a22.first_name)), null, null).j();
                        } else {
                            org.telegram.ui.Components.hc.a0(prVar).V(arrayList2, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("UserCustomPhotoSeted", null, 2131743743, a22.first_name)), null, null).j();
                        }
                    }
                }
                prVar.Q = null;
                prVar.k0();
            }
        }
    }

    public static void d0(pr prVar) {
        if (prVar.Z != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(prVar.Z.e1()));
            org.telegram.messenger.qs.f(prVar.currentAccount).k(org.telegram.messenger.qs.f25096w, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override
    public final void H(float f10) {
        RadialProgressView radialProgressView = this.f48794s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void O(boolean z9, boolean z10) {
        RadialProgressView radialProgressView = this.f48794s;
        if (radialProgressView == null) {
            return;
        }
        this.S = this.R;
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void T() {
        org.telegram.messenger.g0.h3(new fr(this, 0));
    }

    @Override
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z9, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new Runnable() {
            @Override
            public final void run() {
                pr.b0(pr.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z9);
            }
        });
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28012l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27994k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
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
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131748283, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131751282, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new lr(this));
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (this.I) {
            i7 = 2131751753;
        } else {
            i7 = 2131745946;
        }
        this.f48787a = y4Var.o(org.telegram.messenger.id.M0(i7, null));
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V = frameLayout2;
        int i16 = org.telegram.ui.ActionBar.l6.f27865d6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f48793r;
        org.telegram.ui.ActionBar.s6.h(i16, frameLayout2, g6Var);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f48790e = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(32.0f));
        FrameLayout frameLayout3 = this.V;
        org.telegram.ui.Components.l9 l9Var2 = this.f48790e;
        int i17 = 3;
        if (org.telegram.messenger.id.f23157a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout3.addView(l9Var2, c8.ha.d(64, 64.0f, i10 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        fi.p5 p5Var = new fi.p5(this, context, paint, 10);
        this.f48795w = p5Var;
        FrameLayout frameLayout4 = this.V;
        if (org.telegram.messenger.id.f23157a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout4.addView(p5Var, c8.ha.d(64, 64.0f, i11 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f48794s = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(30.0f));
        this.f48794s.setProgressColor(-1);
        this.f48794s.setNoProgress(false);
        FrameLayout frameLayout5 = this.V;
        RadialProgressView radialProgressView2 = this.f48794s;
        if (org.telegram.messenger.id.f23157a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        frameLayout5.addView(radialProgressView2, c8.ha.d(64, 64.0f, i12 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        i0(false, false);
        TextView textView = new TextView(context);
        this.f48791f = textView;
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.G6, g6Var);
        this.f48791f.setTextSize(1, 18.0f);
        this.f48791f.setLines(1);
        this.f48791f.setMaxLines(1);
        this.f48791f.setSingleLine(true);
        TextView textView2 = this.f48791f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView textView3 = this.f48791f;
        if (org.telegram.messenger.id.f23157a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView3.setGravity(i13);
        this.f48791f.setTypeface(org.telegram.messenger.g0.o());
        FrameLayout frameLayout6 = this.V;
        TextView textView4 = this.f48791f;
        boolean z9 = org.telegram.messenger.id.f23157a0;
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
        org.telegram.ui.ActionBar.s6.U(i19, org.telegram.ui.ActionBar.l6.A6, g6Var);
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        TextView textView5 = this.h;
        if (org.telegram.messenger.id.f23157a0) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView5.setGravity(i15);
        FrameLayout frameLayout7 = this.V;
        TextView textView6 = this.h;
        boolean z10 = org.telegram.messenger.id.f23157a0;
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
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.id.M0(2131750694, null), false, false, -1, this.f48793r);
        this.f48788b = k3Var;
        k3Var.d.setImeOptions(5);
        org.telegram.ui.ActionBar.s6.h(i16, this.f48788b, g6Var);
        this.f48788b.setDivider(true);
        this.f48788b.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final pr f47067b;

            {
                this.f47067b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i21, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i21 == 5) {
                            pr prVar = this.f47067b;
                            prVar.f48789c.d.requestFocus();
                            org.telegram.ui.Cells.i3 i3Var = prVar.f48789c.d;
                            i3Var.setSelection(i3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        pr prVar2 = this.f47067b;
                        if (i21 == 6) {
                            prVar2.f48787a.performClick();
                            return true;
                        } else if (i21 == 5) {
                            prVar2.d.d.requestFocus();
                            prVar2.d.d.setSelection(prVar2.f48789c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        pr prVar3 = this.f47067b;
                        if (i21 == 6) {
                            prVar3.f48787a.performClick();
                            return true;
                        }
                        prVar3.getClass();
                        return false;
                }
            }
        });
        this.f48788b.d.setOnFocusChangeListener(new Object());
        this.f48788b.setText(this.M);
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.id.M0(2131749032, null), false, false, -1, this.f48793r);
        this.f48789c = k3Var2;
        k3Var2.d.setImeOptions(5);
        org.telegram.ui.ActionBar.s6.h(i16, this.f48789c, g6Var);
        this.f48789c.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final pr f47067b;

            {
                this.f47067b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i21, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i21 == 5) {
                            pr prVar = this.f47067b;
                            prVar.f48789c.d.requestFocus();
                            org.telegram.ui.Cells.i3 i3Var = prVar.f48789c.d;
                            i3Var.setSelection(i3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        pr prVar2 = this.f47067b;
                        if (i21 == 6) {
                            prVar2.f48787a.performClick();
                            return true;
                        } else if (i21 == 5) {
                            prVar2.d.d.requestFocus();
                            prVar2.d.d.setSelection(prVar2.f48789c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        pr prVar3 = this.f47067b;
                        if (i21 == 6) {
                            prVar3.f48787a.performClick();
                            return true;
                        }
                        prVar3.getClass();
                        return false;
                }
            }
        });
        this.f48789c.setText(this.N);
        org.telegram.ui.Cells.k3 k3Var3 = new org.telegram.ui.Cells.k3(context, org.telegram.messenger.id.M0(2131754395, null), true, true, ((org.telegram.messenger.j0) getMessagesController().f24942x7.f24464y.f13555b).f23460c, this.f48793r);
        this.d = k3Var3;
        org.telegram.ui.ActionBar.s6.G(k3Var3.d, org.telegram.ui.ActionBar.l6.Uc, g6Var);
        this.d.d.setImeOptions(6);
        org.telegram.ui.ActionBar.s6.h(i16, this.d, g6Var);
        this.d.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final pr f47067b;

            {
                this.f47067b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i21, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i21 == 5) {
                            pr prVar = this.f47067b;
                            prVar.f48789c.d.requestFocus();
                            org.telegram.ui.Cells.i3 i3Var = prVar.f48789c.d;
                            i3Var.setSelection(i3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        pr prVar2 = this.f47067b;
                        if (i21 == 6) {
                            prVar2.f48787a.performClick();
                            return true;
                        } else if (i21 == 5) {
                            prVar2.d.d.requestFocus();
                            prVar2.d.d.setSelection(prVar2.f48789c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        pr prVar3 = this.f47067b;
                        if (i21 == 6) {
                            prVar3.f48787a.performClick();
                            return true;
                        }
                        prVar3.getClass();
                        return false;
                }
            }
        });
        if (!this.I) {
            final TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.H));
            org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context, g6Var);
            this.f48797y = m8Var;
            m8Var.o(2131232047, org.telegram.messenger.id.a0(null, null, 2131744398, a22.first_name), true);
            this.f48797y.setBackground(org.telegram.ui.ActionBar.l6.M0(g6Var, true));
            org.telegram.ui.Cells.m8 m8Var2 = this.f48797y;
            int i21 = org.telegram.ui.ActionBar.l6.f28200v6;
            int i22 = org.telegram.ui.ActionBar.l6.f28181u6;
            m8Var2.g(i21, i22);
            final org.telegram.ui.Components.ah0 ah0Var = new org.telegram.ui.Components.ah0(2131624132, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
            this.f48797y.f29574e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
            this.f48797y.f29574e.setAnimation(ah0Var);
            this.f48797y.setOnClickListener(new View.OnClickListener(this) {
                public final pr f47354b;

                {
                    this.f47354b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z11;
                    switch (r4) {
                        case 0:
                            final pr prVar = this.f47354b;
                            boolean z12 = true;
                            prVar.R = 1;
                            org.telegram.ui.Components.k30 k30Var = prVar.P;
                            TLRPC.User user = a22;
                            k30Var.L = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z12 = false;
                            }
                            ai.m0 m0Var = new ai.m0(24);
                            final org.telegram.ui.Components.ah0 ah0Var2 = ah0Var;
                            k30Var.n(z12, m0Var, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            pr prVar2 = prVar;
                                            boolean g10 = prVar2.P.g();
                                            org.telegram.ui.Components.ah0 ah0Var3 = ah0Var2;
                                            if (!g10) {
                                                ah0Var3.P(86);
                                                prVar2.D.f29574e.d();
                                                return;
                                            }
                                            ah0Var3.N(0, false, false);
                                            return;
                                        default:
                                            pr prVar3 = prVar;
                                            boolean g11 = prVar3.P.g();
                                            org.telegram.ui.Components.ah0 ah0Var4 = ah0Var2;
                                            if (!g11) {
                                                ah0Var4.P(85);
                                                prVar3.f48797y.f29574e.d();
                                                return;
                                            }
                                            ah0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            ah0Var2.M(0);
                            ah0Var2.P(43);
                            prVar.f48797y.f29574e.d();
                            return;
                        default:
                            final pr prVar2 = this.f47354b;
                            prVar2.R = 2;
                            org.telegram.ui.Components.k30 k30Var2 = prVar2.P;
                            TLRPC.User user2 = a22;
                            k30Var2.L = user2;
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
                            ai.m0 m0Var2 = new ai.m0(24);
                            final org.telegram.ui.Components.ah0 ah0Var3 = ah0Var;
                            k30Var2.n(z11, m0Var2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            pr prVar22 = prVar2;
                                            boolean g10 = prVar22.P.g();
                                            org.telegram.ui.Components.ah0 ah0Var32 = ah0Var3;
                                            if (!g10) {
                                                ah0Var32.P(86);
                                                prVar22.D.f29574e.d();
                                                return;
                                            }
                                            ah0Var32.N(0, false, false);
                                            return;
                                        default:
                                            pr prVar3 = prVar2;
                                            boolean g11 = prVar3.P.g();
                                            org.telegram.ui.Components.ah0 ah0Var4 = ah0Var3;
                                            if (!g11) {
                                                ah0Var4.P(85);
                                                prVar3.f48797y.f29574e.d();
                                                return;
                                            }
                                            ah0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            ah0Var3.M(0);
                            ah0Var3.P(43);
                            prVar2.D.f29574e.d();
                            return;
                    }
                }
            });
            org.telegram.ui.Cells.m8 m8Var3 = new org.telegram.ui.Cells.m8(context, g6Var);
            this.D = m8Var3;
            m8Var3.o(2131232047, org.telegram.messenger.id.a0(null, null, 2131743679, a22.first_name), false);
            this.D.setBackground(org.telegram.ui.ActionBar.l6.M0(g6Var, true));
            this.D.g(i21, i22);
            final org.telegram.ui.Components.ah0 ah0Var2 = new org.telegram.ui.Components.ah0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
            this.D.f29574e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
            this.D.f29574e.setAnimation(ah0Var2);
            this.D.setOnClickListener(new View.OnClickListener(this) {
                public final pr f47354b;

                {
                    this.f47354b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z11;
                    switch (r4) {
                        case 0:
                            final pr prVar = this.f47354b;
                            boolean z12 = true;
                            prVar.R = 1;
                            org.telegram.ui.Components.k30 k30Var = prVar.P;
                            TLRPC.User user = a22;
                            k30Var.L = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z12 = false;
                            }
                            ai.m0 m0Var = new ai.m0(24);
                            final org.telegram.ui.Components.ah0 ah0Var22 = ah0Var2;
                            k30Var.n(z12, m0Var, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            pr prVar22 = prVar;
                                            boolean g10 = prVar22.P.g();
                                            org.telegram.ui.Components.ah0 ah0Var32 = ah0Var22;
                                            if (!g10) {
                                                ah0Var32.P(86);
                                                prVar22.D.f29574e.d();
                                                return;
                                            }
                                            ah0Var32.N(0, false, false);
                                            return;
                                        default:
                                            pr prVar3 = prVar;
                                            boolean g11 = prVar3.P.g();
                                            org.telegram.ui.Components.ah0 ah0Var4 = ah0Var22;
                                            if (!g11) {
                                                ah0Var4.P(85);
                                                prVar3.f48797y.f29574e.d();
                                                return;
                                            }
                                            ah0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            ah0Var22.M(0);
                            ah0Var22.P(43);
                            prVar.f48797y.f29574e.d();
                            return;
                        default:
                            final pr prVar2 = this.f47354b;
                            prVar2.R = 2;
                            org.telegram.ui.Components.k30 k30Var2 = prVar2.P;
                            TLRPC.User user2 = a22;
                            k30Var2.L = user2;
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
                            ai.m0 m0Var2 = new ai.m0(24);
                            final org.telegram.ui.Components.ah0 ah0Var3 = ah0Var2;
                            k30Var2.n(z11, m0Var2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            pr prVar22 = prVar2;
                                            boolean g10 = prVar22.P.g();
                                            org.telegram.ui.Components.ah0 ah0Var32 = ah0Var3;
                                            if (!g10) {
                                                ah0Var32.P(86);
                                                prVar22.D.f29574e.d();
                                                return;
                                            }
                                            ah0Var32.N(0, false, false);
                                            return;
                                        default:
                                            pr prVar3 = prVar2;
                                            boolean g11 = prVar3.P.g();
                                            org.telegram.ui.Components.ah0 ah0Var4 = ah0Var3;
                                            if (!g11) {
                                                ah0Var4.P(85);
                                                prVar3.f48797y.f29574e.d();
                                                return;
                                            }
                                            ah0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            ah0Var3.M(0);
                            ah0Var3.P(43);
                            prVar2.D.f29574e.d();
                            return;
                    }
                }
            });
            this.U = new org.telegram.ui.Components.l9(context);
            this.E = new nr(this, context, g6Var);
            if (this.f48792n == null) {
                this.f48792n = new org.telegram.ui.Components.w8(0, a22);
            }
            this.U.e(a22.photo, this.f48792n);
            this.E.addView(this.U, c8.ha.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.E.k(org.telegram.messenger.id.M0(2131746088, null), false);
            this.E.getImageView().setVisibility(0);
            this.E.setBackground(org.telegram.ui.ActionBar.l6.M0(g6Var, true));
            this.E.g(i21, i22);
            this.E.setOnClickListener(new z(this, context, a22, 10));
            org.telegram.ui.Cells.m8 m8Var4 = new org.telegram.ui.Cells.m8(context, g6Var);
            this.F = m8Var4;
            m8Var4.o(2131231767, org.telegram.messenger.id.a0(null, null, 2131743678, new Object[0]), false);
            this.F.setBackground(org.telegram.ui.ActionBar.l6.M0(g6Var, true));
            this.F.g(i21, i22);
            this.F.setNeedDivider(true);
            this.F.f29574e.setTranslationX(org.telegram.messenger.g0.L(4.0f));
            this.F.setOnClickListener(new org.telegram.ui.Components.u41(5, this, a22));
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
        org.telegram.ui.Components.r41 r41Var = new org.telegram.ui.Components.r41(this, new a5(this, 7), new w0(this, 29), null);
        this.W = r41Var;
        r41Var.r1();
        this.W.setSectionsDrawBackground(true);
        this.W.setOnScrollListener(new ai.o0(5, this, frameLayout));
        frameLayout.addView(this.W, c8.ha.e(-1, -1, 119));
        if (this.I && this.K) {
            this.X = true;
        }
        this.W.f37556f3.O(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.messenger.yo yoVar;
        if (i7 == org.telegram.messenger.qs.f25063r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.qp.C8;
            if ((intValue & 2) != 0 || (intValue & 4) != 0) {
                j0();
            }
        } else if (i7 == org.telegram.messenger.qs.f24993e3 && (yoVar = (org.telegram.messenger.yo) objArr[0]) == this.G) {
            ArrayList arrayList = new ArrayList(yoVar.f26704b);
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
    public final yq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.W;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.f48793r;
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
        if (this.f48794s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f48796x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f48796x = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f48796x = animatorSet2;
            if (z9) {
                this.f48794s.setVisibility(0);
                this.f48795w.setVisibility(0);
                AnimatorSet animatorSet3 = this.f48796x;
                RadialProgressView radialProgressView = this.f48794s;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f48795w, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f48794s;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f48795w, property2, 0.0f));
            }
            this.f48796x.setDuration(180L);
            this.f48796x.addListener(new org.telegram.ui.Components.t9(27, this, z9));
            this.f48796x.start();
        } else if (z9) {
            this.f48794s.setAlpha(1.0f);
            this.f48794s.setVisibility(0);
            this.f48795w.setAlpha(1.0f);
            this.f48795w.setVisibility(0);
        } else {
            this.f48794s.setAlpha(0.0f);
            this.f48794s.setVisibility(4);
            this.f48795w.setAlpha(0.0f);
            this.f48795w.setVisibility(4);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        TLRPC.User a22;
        if (this.f48791f != null && (a22 = getMessagesController().a2(Long.valueOf(this.H))) != null) {
            if (TextUtils.isEmpty(g0())) {
                this.f48791f.setText(org.telegram.messenger.id.M0(2131748410, null));
            } else {
                TextView textView = this.f48791f;
                pf.b c10 = pf.b.c();
                textView.setText(c10.b("+" + g0()));
            }
            this.h.setText(org.telegram.messenger.id.d0(this.currentAccount, a22, null, null));
            if (this.Q == null) {
                org.telegram.ui.Components.l9 l9Var = this.f48790e;
                org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(0, a22);
                this.f48792n = w8Var;
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
            this.U.j(org.telegram.messenger.hc.i(org.telegram.messenger.w7.w(photo.sizes, 1000, false, null, false), this.T), "50_50", this.f48792n, null);
        }
        if (this.f48792n == null) {
            this.f48792n = new org.telegram.ui.Components.w8(0, a22);
        }
        TLRPC.FileLocation fileLocation = this.Q;
        if (fileLocation == null) {
            this.f48790e.e(a22, this.f48792n);
        } else {
            this.f48790e.j(org.telegram.messenger.hc.e(fileLocation), "50_50", this.f48792n, getMessagesController().a2(Long.valueOf(this.H)));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        TLRPC.User user;
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25063r);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f24993e3);
        this.H = getArguments().getLong("user_id", 0L);
        this.L = getArguments().getString("phone");
        this.M = getArguments().getString("first_name_card");
        this.N = getArguments().getString("last_name_card");
        this.I = getArguments().getBoolean("addContact", false);
        this.J = getArguments().getBoolean("focus_notes", false);
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(this.currentAccount).f24764d7;
        this.K = sharedPreferences.getBoolean("dialog_bar_exception" + this.H, false);
        if (this.H != 0) {
            user = getMessagesController().a2(Long.valueOf(this.H));
        } else {
            user = null;
        }
        org.telegram.ui.Components.k30 k30Var = this.P;
        if (k30Var != null) {
            k30Var.f35218a = this;
            k30Var.f35219b = this;
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
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25063r);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f24993e3);
        org.telegram.ui.Components.k30 k30Var = this.P;
        if (k30Var != null) {
            k30Var.d();
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
            if (this.f48790e != null && (a22 = getMessagesController().a2(Long.valueOf(this.H))) != null) {
                this.f48792n.r(a22);
                this.f48790e.invalidate();
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

    public pr(Bundle bundle, org.telegram.ui.ActionBar.g6 g6Var) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.f48793r = g6Var;
        this.P = new org.telegram.ui.Components.k30(0, true, true);
    }
}
