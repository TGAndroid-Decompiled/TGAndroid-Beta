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
public final class ns extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs, org.telegram.ui.Components.a40 {
    public org.telegram.ui.Cells.p8 D;
    public ls E;
    public org.telegram.ui.Cells.p8 F;
    public org.telegram.messenger.ep G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public String M;
    public String N;
    public ms O;
    public final org.telegram.ui.Components.b40 P;
    public TLRPC.FileLocation Q;
    public int R;
    public int S;
    public TLRPC.Photo T;
    public org.telegram.ui.Components.g9 U;
    public FrameLayout V;
    public org.telegram.ui.Components.v51 W;
    public boolean X;
    public boolean Y;
    public org.telegram.messenger.kj Z;
    public org.telegram.ui.ActionBar.l5 f39962a;
    public org.telegram.ui.Cells.m3 f39963b;
    public org.telegram.ui.Cells.m3 f39964c;
    public org.telegram.ui.Cells.m3 d;
    public org.telegram.ui.Components.g9 e;
    public TextView f39965f;
    public TextView h;
    public org.telegram.ui.Components.r8 f39966n;
    public final org.telegram.ui.ActionBar.p6 f39967r;
    public RadialProgressView f39968s;
    public kg.f0 f39969w;
    public AnimatorSet f39970x;
    public org.telegram.ui.Cells.p8 f39971y;

    public ns(Bundle bundle) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.P = new org.telegram.ui.Components.b40(0, true, true);
    }

    public static void Z(ns nsVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.f19938id = nsVar.getMessagesController().n1(nsVar.H);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(nsVar.currentAccount).sendRequest(tL_users_suggestBirthday, new k(nsVar, 5));
    }

    public static void a0(ns nsVar, TLRPC.User user) {
        nsVar.Q = null;
        nsVar.h0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User Z1 = nsVar.getMessagesController().Z1(Long.valueOf(nsVar.H));
        Z1.photo.personal = false;
        TLRPC.UserFull a2 = org.telegram.messenger.wp.r1(nsVar.currentAccount).a2(nsVar.H);
        if (a2 != null) {
            a2.personal_photo = null;
            a2.flags &= -2097153;
            nsVar.getMessagesStorage().j2(a2, true);
        }
        TLRPC.Photo photo = nsVar.T;
        if (photo != null) {
            Z1.photo.photo_id = photo.f19818id;
            ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(arrayList, 100, false, null, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(arrayList, 1000, false, null, false);
            if (w9 != null) {
                Z1.photo.photo_small = w9.location;
            }
            if (w10 != null) {
                Z1.photo.photo_big = w10.location;
            }
        } else {
            Z1.photo = null;
            Z1.flags &= -33;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(user);
        nsVar.getMessagesStorage().m1(arrayList2, null, false, true);
        nsVar.k0();
        nsVar.getNotificationCenter().k(org.telegram.messenger.at.f14686c0, new Object[0]);
        nsVar.getNotificationCenter().k(org.telegram.messenger.at.f14772r, 2);
    }

    public static void b0(ns nsVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.b40 b40Var = nsVar.P;
        if (b40Var.T) {
            return;
        }
        int i10 = nsVar.S;
        if (i10 == 2) {
            nsVar.Q = photoSize.location;
        } else if (i10 == 1 && nsVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.z4 parentLayout = nsVar.getParentLayout();
            org.telegram.ui.ActionBar.k2 lastFragment = nsVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) fragmentStack.get(size);
                if (k2Var instanceof un) {
                    un unVar = (un) k2Var;
                    org.telegram.ui.ActionBar.k2 k2Var2 = lastFragment;
                    if (unVar.a() == nsVar.H && unVar.f42059f4 == 0) {
                        unVar.rb(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var2;
                            if (arrayList.get(size2) != k2Var3) {
                                ((org.telegram.ui.ActionBar.k2) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            k2Var2 = k2Var3;
                        }
                        k2Var2.finishFragment();
                    } else {
                        lastFragment = k2Var2;
                    }
                }
                arrayList.add((org.telegram.ui.ActionBar.k2) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            nsVar.e.j(org.telegram.messenger.jc.e(nsVar.Q), "50_50", nsVar.f39966n, nsVar.getMessagesController().Z1(Long.valueOf(nsVar.H)));
            if (nsVar.S == 2) {
                nsVar.i0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                org.telegram.messenger.rz.C(nsVar.currentAccount);
                tL_messageService.random_id = org.telegram.messenger.rz.E();
                tL_messageService.dialog_id = nsVar.H;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int j10 = nsVar.getUserConfig().j();
                tL_messageService.f19815id = j10;
                tL_messageService.local_id = j10;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = nsVar.getUserConfig().e();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = nsVar.H;
                tL_messageService.date = nsVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z10;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList arrayList2 = new ArrayList();
                org.telegram.messenger.kj kjVar = new org.telegram.messenger.kj(nsVar.currentAccount, tL_messageService, false, false);
                nsVar.Z = kjVar;
                arrayList2.add(kjVar);
                new ArrayList().add(tL_messageService);
                org.telegram.messenger.wp.r1(nsVar.currentAccount).i5(0, nsVar.H, arrayList2);
                nsVar.getMessagesController().C7.put(tL_messageService.local_id, b40Var);
            }
        } else {
            TLRPC.User Z1 = nsVar.getMessagesController().Z1(Long.valueOf(nsVar.H));
            if (nsVar.Z == null && Z1 != null) {
                if (inputFile2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Z1.flags |= 32;
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                Z1.photo = tL_userProfilePhoto;
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
                arrayList3.add(Z1);
                nsVar.getMessagesStorage().m1(arrayList3, null, false, true);
                nsVar.getNotificationCenter().k(org.telegram.messenger.at.f14686c0, new Object[0]);
                org.telegram.messenger.at notificationCenter = nsVar.getNotificationCenter();
                int i11 = org.telegram.messenger.wp.D8;
                notificationCenter.k(org.telegram.messenger.at.f14772r, 2);
            }
            nsVar.h0(nsVar.Q, photoSize2.location, inputFile, inputFile2, videoSize, d, nsVar.S);
            nsVar.i0(false, true);
        }
        nsVar.k0();
    }

    public static void c0(ns nsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        if (nsVar.Z == null) {
            if ((fileLocation != null || inputFile != null) && tLObject != null) {
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                TLRPC.User Z1 = nsVar.getMessagesController().Z1(Long.valueOf(nsVar.H));
                TLRPC.UserFull a2 = org.telegram.messenger.wp.r1(nsVar.currentAccount).a2(nsVar.H);
                if (a2 != null) {
                    a2.personal_photo = tL_photos_photo.photo;
                    a2.flags |= 2097152;
                    nsVar.getMessagesStorage().j2(a2, true);
                }
                if (Z1 != null) {
                    TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(arrayList, 100, false, null, false);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(arrayList, 1000, false, null, false);
                    if (w9 != null && fileLocation != null) {
                        org.telegram.messenger.b8.G(nsVar.currentAccount);
                        File K = org.telegram.messenger.b8.K(w9, null, true, true);
                        org.telegram.messenger.b8.G(nsVar.currentAccount);
                        org.telegram.messenger.b8.K(fileLocation, null, true, true).renameTo(K);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocation.volume_id);
                        sb2.append("_");
                        String p5 = a1.g.p(sb2, fileLocation.local_id, "@50_50");
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(w9.location.volume_id);
                        sb3.append("_");
                        org.telegram.messenger.ic.D().S(p5, a1.g.p(sb3, w9.location.local_id, "@50_50"), org.telegram.messenger.jc.l(nsVar.currentAccount, 1, Z1));
                    }
                    if (w10 != null && fileLocation2 != null) {
                        org.telegram.messenger.b8.G(nsVar.currentAccount);
                        File K2 = org.telegram.messenger.b8.K(w10, null, true, true);
                        org.telegram.messenger.b8.G(nsVar.currentAccount);
                        org.telegram.messenger.b8.K(fileLocation2, null, true, true).renameTo(K2);
                    }
                    rf.z.a(tL_photos_photo.photo, Z1, true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(Z1);
                    nsVar.getMessagesStorage().m1(arrayList2, null, false, true);
                    nsVar.getMessagesController().T0(nsVar.H);
                    nsVar.getNotificationCenter().k(org.telegram.messenger.at.f14686c0, new Object[0]);
                    nsVar.getNotificationCenter().k(org.telegram.messenger.at.f14772r, 2);
                    if (nsVar.getParentActivity() != null) {
                        if (i10 == 2) {
                            org.telegram.ui.Components.cc.a0(nsVar).V(arrayList2, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("UserCustomPhotoSeted", null, 2131743769, Z1.first_name)), null, null).j();
                        } else {
                            org.telegram.ui.Components.cc.a0(nsVar).V(arrayList2, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("UserCustomPhotoSeted", null, 2131743769, Z1.first_name)), null, null).j();
                        }
                    }
                }
                nsVar.Q = null;
                nsVar.k0();
            }
        }
    }

    public static void d0(ns nsVar) {
        if (nsVar.Z != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(nsVar.Z.f1()));
            org.telegram.messenger.at.f(nsVar.currentAccount).k(org.telegram.messenger.at.f14806w, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override
    public final void I(float f7) {
        RadialProgressView radialProgressView = this.f39968s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override
    public final void P(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f39968s;
        if (radialProgressView == null) {
            return;
        }
        this.S = this.R;
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void U() {
        org.telegram.messenger.i0.g3(new ds(this, 0));
    }

    @Override
    public final void V(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.i0.g3(new Runnable() {
            @Override
            public final void run() {
                ns.b0(ns.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z10);
            }
        });
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21077l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21059k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f7;
        float f10;
        int i16;
        float f11;
        float f12;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        if (this.I) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131748297, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131751283, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new js(this));
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (this.I) {
            i10 = 2131751753;
        } else {
            i10 = 2131745963;
        }
        this.f39962a = i5Var.n(org.telegram.messenger.dd.L0(i10, null));
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V = frameLayout2;
        int i17 = org.telegram.ui.ActionBar.t6.f20930d6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f39967r;
        org.telegram.ui.ActionBar.a7.i(i17, frameLayout2, p6Var);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.e = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(32.0f));
        FrameLayout frameLayout3 = this.V;
        org.telegram.ui.Components.g9 g9Var2 = this.e;
        int i18 = 3;
        if (org.telegram.messenger.dd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout3.addView(g9Var2, w7.b6.d(64, 64.0f, i11 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        kg.f0 f0Var = new kg.f0(this, context, paint, 9);
        this.f39969w = f0Var;
        FrameLayout frameLayout4 = this.V;
        if (org.telegram.messenger.dd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        frameLayout4.addView(f0Var, w7.b6.d(64, 64.0f, i12 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f39968s = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.i0.L(30.0f));
        this.f39968s.setProgressColor(-1);
        this.f39968s.setNoProgress(false);
        FrameLayout frameLayout5 = this.V;
        RadialProgressView radialProgressView2 = this.f39968s;
        if (org.telegram.messenger.dd.X) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        frameLayout5.addView(radialProgressView2, w7.b6.d(64, 64.0f, i13 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        i0(false, false);
        TextView textView = new TextView(context);
        this.f39965f = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        this.f39965f.setTextSize(1, 18.0f);
        this.f39965f.setLines(1);
        this.f39965f.setMaxLines(1);
        this.f39965f.setSingleLine(true);
        TextView textView2 = this.f39965f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView textView3 = this.f39965f;
        if (org.telegram.messenger.dd.X) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        textView3.setGravity(i14);
        this.f39965f.setTypeface(org.telegram.messenger.i0.o());
        FrameLayout frameLayout6 = this.V;
        TextView textView4 = this.f39965f;
        boolean z10 = org.telegram.messenger.dd.X;
        if (z10) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        int i19 = i15 | 48;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 94.0f;
        }
        if (z10) {
            f10 = 94.0f;
        } else {
            f10 = 0.0f;
        }
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout6, textView4, w7.b6.d(-2, -2.0f, i19, f7, 25.66f, f10, 0.0f), context);
        this.h = l4;
        org.telegram.ui.ActionBar.a7.V(l4, org.telegram.ui.ActionBar.t6.A6, p6Var);
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        TextView textView5 = this.h;
        if (org.telegram.messenger.dd.X) {
            i16 = 5;
        } else {
            i16 = 3;
        }
        textView5.setGravity(i16);
        FrameLayout frameLayout7 = this.V;
        TextView textView6 = this.h;
        boolean z11 = org.telegram.messenger.dd.X;
        if (z11) {
            i18 = 5;
        }
        int i20 = i18 | 48;
        if (z11) {
            f11 = 0.0f;
        } else {
            f11 = 94.0f;
        }
        if (z11) {
            f12 = 94.0f;
        } else {
            f12 = 0.0f;
        }
        frameLayout7.addView(textView6, w7.b6.d(-2, -2.0f, i20, f11, 49.66f, f12, 0.0f));
        org.telegram.ui.Cells.m3 m3Var = new org.telegram.ui.Cells.m3(context, org.telegram.messenger.dd.L0(2131750695, null), false, false, -1, this.f39967r);
        this.f39963b = m3Var;
        m3Var.d.setImeOptions(5);
        org.telegram.ui.ActionBar.a7.i(i17, this.f39963b, p6Var);
        this.f39963b.setDivider(true);
        this.f39963b.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ns f37857b;

            {
                this.f37857b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i21, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i21 == 5) {
                            ns nsVar = this.f37857b;
                            nsVar.f39964c.d.requestFocus();
                            org.telegram.ui.Cells.k3 k3Var = nsVar.f39964c.d;
                            k3Var.setSelection(k3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        ns nsVar2 = this.f37857b;
                        if (i21 == 6) {
                            nsVar2.f39962a.performClick();
                            return true;
                        } else if (i21 == 5) {
                            nsVar2.d.d.requestFocus();
                            nsVar2.d.d.setSelection(nsVar2.f39964c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        ns nsVar3 = this.f37857b;
                        if (i21 == 6) {
                            nsVar3.f39962a.performClick();
                            return true;
                        }
                        nsVar3.getClass();
                        return false;
                }
            }
        });
        this.f39963b.d.setOnFocusChangeListener(new Object());
        this.f39963b.setText(this.M);
        org.telegram.ui.Cells.m3 m3Var2 = new org.telegram.ui.Cells.m3(context, org.telegram.messenger.dd.L0(2131749042, null), false, false, -1, this.f39967r);
        this.f39964c = m3Var2;
        m3Var2.d.setImeOptions(5);
        org.telegram.ui.ActionBar.a7.i(i17, this.f39964c, p6Var);
        this.f39964c.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ns f37857b;

            {
                this.f37857b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i21, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i21 == 5) {
                            ns nsVar = this.f37857b;
                            nsVar.f39964c.d.requestFocus();
                            org.telegram.ui.Cells.k3 k3Var = nsVar.f39964c.d;
                            k3Var.setSelection(k3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        ns nsVar2 = this.f37857b;
                        if (i21 == 6) {
                            nsVar2.f39962a.performClick();
                            return true;
                        } else if (i21 == 5) {
                            nsVar2.d.d.requestFocus();
                            nsVar2.d.d.setSelection(nsVar2.f39964c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        ns nsVar3 = this.f37857b;
                        if (i21 == 6) {
                            nsVar3.f39962a.performClick();
                            return true;
                        }
                        nsVar3.getClass();
                        return false;
                }
            }
        });
        this.f39964c.setText(this.N);
        org.telegram.ui.Cells.m3 m3Var3 = new org.telegram.ui.Cells.m3(context, org.telegram.messenger.dd.L0(2131754395, null), true, true, ((org.telegram.messenger.l0) getMessagesController().f19300y7.f18050y.f10701a).f16855c, this.f39967r);
        this.d = m3Var3;
        org.telegram.ui.ActionBar.a7.H(m3Var3.d, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        this.d.d.setImeOptions(6);
        org.telegram.ui.ActionBar.a7.i(i17, this.d, p6Var);
        this.d.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ns f37857b;

            {
                this.f37857b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i21, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i21 == 5) {
                            ns nsVar = this.f37857b;
                            nsVar.f39964c.d.requestFocus();
                            org.telegram.ui.Cells.k3 k3Var = nsVar.f39964c.d;
                            k3Var.setSelection(k3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        ns nsVar2 = this.f37857b;
                        if (i21 == 6) {
                            nsVar2.f39962a.performClick();
                            return true;
                        } else if (i21 == 5) {
                            nsVar2.d.d.requestFocus();
                            nsVar2.d.d.setSelection(nsVar2.f39964c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        ns nsVar3 = this.f37857b;
                        if (i21 == 6) {
                            nsVar3.f39962a.performClick();
                            return true;
                        }
                        nsVar3.getClass();
                        return false;
                }
            }
        });
        if (!this.I) {
            final TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.H));
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context, p6Var);
            this.f39971y = p8Var;
            p8Var.o(2131232046, org.telegram.messenger.dd.a0(null, null, 2131744424, Z1.first_name), true);
            this.f39971y.setBackground(org.telegram.ui.ActionBar.t6.M0(p6Var, true));
            org.telegram.ui.Cells.p8 p8Var2 = this.f39971y;
            int i21 = org.telegram.ui.ActionBar.t6.f21260v6;
            int i22 = org.telegram.ui.ActionBar.t6.f21243u6;
            p8Var2.g(i21, i22);
            final org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(2131624130, org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f), false, null);
            this.f39971y.e.setTranslationX(-org.telegram.messenger.i0.L(8.0f));
            this.f39971y.e.setAnimation(ci0Var);
            this.f39971y.setOnClickListener(new View.OnClickListener(this) {
                public final ns f38165b;

                {
                    this.f38165b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final ns nsVar = this.f38165b;
                            boolean z13 = true;
                            nsVar.R = 1;
                            org.telegram.ui.Components.b40 b40Var = nsVar.P;
                            TLRPC.User user = Z1;
                            b40Var.L = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z13 = false;
                            }
                            ag.f3 f3Var = new ag.f3(13);
                            final org.telegram.ui.Components.ci0 ci0Var2 = ci0Var;
                            b40Var.n(z13, f3Var, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            ns nsVar2 = nsVar;
                                            boolean g10 = nsVar2.P.g();
                                            org.telegram.ui.Components.ci0 ci0Var3 = ci0Var2;
                                            if (!g10) {
                                                ci0Var3.P(86);
                                                nsVar2.D.e.d();
                                                return;
                                            }
                                            ci0Var3.N(0, false, false);
                                            return;
                                        default:
                                            ns nsVar3 = nsVar;
                                            boolean g11 = nsVar3.P.g();
                                            org.telegram.ui.Components.ci0 ci0Var4 = ci0Var2;
                                            if (!g11) {
                                                ci0Var4.P(85);
                                                nsVar3.f39971y.e.d();
                                                return;
                                            }
                                            ci0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            ci0Var2.M(0);
                            ci0Var2.P(43);
                            nsVar.f39971y.e.d();
                            return;
                        default:
                            final ns nsVar2 = this.f38165b;
                            nsVar2.R = 2;
                            org.telegram.ui.Components.b40 b40Var2 = nsVar2.P;
                            TLRPC.User user2 = Z1;
                            b40Var2.L = user2;
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
                            ag.f3 f3Var2 = new ag.f3(13);
                            final org.telegram.ui.Components.ci0 ci0Var3 = ci0Var;
                            b40Var2.n(z12, f3Var2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            ns nsVar22 = nsVar2;
                                            boolean g10 = nsVar22.P.g();
                                            org.telegram.ui.Components.ci0 ci0Var32 = ci0Var3;
                                            if (!g10) {
                                                ci0Var32.P(86);
                                                nsVar22.D.e.d();
                                                return;
                                            }
                                            ci0Var32.N(0, false, false);
                                            return;
                                        default:
                                            ns nsVar3 = nsVar2;
                                            boolean g11 = nsVar3.P.g();
                                            org.telegram.ui.Components.ci0 ci0Var4 = ci0Var3;
                                            if (!g11) {
                                                ci0Var4.P(85);
                                                nsVar3.f39971y.e.d();
                                                return;
                                            }
                                            ci0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            ci0Var3.M(0);
                            ci0Var3.P(43);
                            nsVar2.D.e.d();
                            return;
                    }
                }
            });
            org.telegram.ui.Cells.p8 p8Var3 = new org.telegram.ui.Cells.p8(context, p6Var);
            this.D = p8Var3;
            p8Var3.o(2131232046, org.telegram.messenger.dd.a0(null, null, 2131743705, Z1.first_name), false);
            this.D.setBackground(org.telegram.ui.ActionBar.t6.M0(p6Var, true));
            this.D.g(i21, i22);
            final org.telegram.ui.Components.ci0 ci0Var2 = new org.telegram.ui.Components.ci0(2131623965, org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f), false, null);
            this.D.e.setTranslationX(-org.telegram.messenger.i0.L(8.0f));
            this.D.e.setAnimation(ci0Var2);
            this.D.setOnClickListener(new View.OnClickListener(this) {
                public final ns f38165b;

                {
                    this.f38165b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final ns nsVar = this.f38165b;
                            boolean z13 = true;
                            nsVar.R = 1;
                            org.telegram.ui.Components.b40 b40Var = nsVar.P;
                            TLRPC.User user = Z1;
                            b40Var.L = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z13 = false;
                            }
                            ag.f3 f3Var = new ag.f3(13);
                            final org.telegram.ui.Components.ci0 ci0Var22 = ci0Var2;
                            b40Var.n(z13, f3Var, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            ns nsVar22 = nsVar;
                                            boolean g10 = nsVar22.P.g();
                                            org.telegram.ui.Components.ci0 ci0Var32 = ci0Var22;
                                            if (!g10) {
                                                ci0Var32.P(86);
                                                nsVar22.D.e.d();
                                                return;
                                            }
                                            ci0Var32.N(0, false, false);
                                            return;
                                        default:
                                            ns nsVar3 = nsVar;
                                            boolean g11 = nsVar3.P.g();
                                            org.telegram.ui.Components.ci0 ci0Var4 = ci0Var22;
                                            if (!g11) {
                                                ci0Var4.P(85);
                                                nsVar3.f39971y.e.d();
                                                return;
                                            }
                                            ci0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            ci0Var22.M(0);
                            ci0Var22.P(43);
                            nsVar.f39971y.e.d();
                            return;
                        default:
                            final ns nsVar2 = this.f38165b;
                            nsVar2.R = 2;
                            org.telegram.ui.Components.b40 b40Var2 = nsVar2.P;
                            TLRPC.User user2 = Z1;
                            b40Var2.L = user2;
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
                            ag.f3 f3Var2 = new ag.f3(13);
                            final org.telegram.ui.Components.ci0 ci0Var3 = ci0Var2;
                            b40Var2.n(z12, f3Var2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            ns nsVar22 = nsVar2;
                                            boolean g10 = nsVar22.P.g();
                                            org.telegram.ui.Components.ci0 ci0Var32 = ci0Var3;
                                            if (!g10) {
                                                ci0Var32.P(86);
                                                nsVar22.D.e.d();
                                                return;
                                            }
                                            ci0Var32.N(0, false, false);
                                            return;
                                        default:
                                            ns nsVar3 = nsVar2;
                                            boolean g11 = nsVar3.P.g();
                                            org.telegram.ui.Components.ci0 ci0Var4 = ci0Var3;
                                            if (!g11) {
                                                ci0Var4.P(85);
                                                nsVar3.f39971y.e.d();
                                                return;
                                            }
                                            ci0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            ci0Var3.M(0);
                            ci0Var3.P(43);
                            nsVar2.D.e.d();
                            return;
                    }
                }
            });
            this.U = new org.telegram.ui.Components.g9(context);
            this.E = new ls(this, context, p6Var);
            if (this.f39966n == null) {
                this.f39966n = new org.telegram.ui.Components.r8(0, Z1);
            }
            this.U.e(Z1.photo, this.f39966n);
            this.E.addView(this.U, w7.b6.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.E.k(org.telegram.messenger.dd.L0(2131746105, null), false);
            this.E.getImageView().setVisibility(0);
            this.E.setBackground(org.telegram.ui.ActionBar.t6.M0(p6Var, true));
            this.E.g(i21, i22);
            this.E.setOnClickListener(new x(this, context, Z1, 10));
            org.telegram.ui.Cells.p8 p8Var4 = new org.telegram.ui.Cells.p8(context, p6Var);
            this.F = p8Var4;
            p8Var4.o(2131231766, org.telegram.messenger.dd.a0(null, null, 2131743704, new Object[0]), false);
            this.F.setBackground(org.telegram.ui.ActionBar.t6.M0(p6Var, true));
            this.F.g(i21, i22);
            this.F.setNeedDivider(true);
            this.F.e.setTranslationX(org.telegram.messenger.i0.L(4.0f));
            this.F.setOnClickListener(new org.telegram.ui.Components.sr(28, this, Z1));
            TLRPC.UserFull a2 = getMessagesController().a2(this.H);
            if (a2 != null) {
                TLRPC.Photo photo = a2.profile_photo;
                this.T = photo;
                if (photo == null) {
                    this.T = a2.fallback_photo;
                }
            }
            k0();
        }
        org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(this, new z4(this, 7), new y0(this, 28), null);
        this.W = v51Var;
        v51Var.r1();
        this.W.setSectionsDrawBackground(true);
        this.W.setOnScrollListener(new bi.t3(6, this, frameLayout));
        frameLayout.addView(this.W, w7.b6.e(-1, -1, 119));
        if (this.I && this.K) {
            this.X = true;
        }
        this.W.f31183f3.O(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.messenger.ep epVar;
        if (i10 == org.telegram.messenger.at.f14772r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.wp.D8;
            if ((intValue & 2) != 0 || (intValue & 4) != 0) {
                j0();
            }
        } else if (i10 == org.telegram.messenger.at.f14701e3 && (epVar = (org.telegram.messenger.ep) objArr[0]) == this.G) {
            ArrayList arrayList = new ArrayList(epVar.f15623b);
            int i13 = 0;
            while (i13 < arrayList.size()) {
                if (arrayList.get(i13) == null) {
                    arrayList.remove(i13);
                    i13--;
                }
                i13++;
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
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.H));
        if (Z1 != null && !TextUtils.isEmpty(Z1.phone)) {
            return Z1.phone;
        }
        return this.L;
    }

    @Override
    public final fs0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.W;
    }

    @Override
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.f39967r;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i10) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().n1(this.H);
        if (inputFile != null) {
            tL_photos_uploadContactProfilePhoto.file = inputFile;
            tL_photos_uploadContactProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadContactProfilePhoto.video = inputFile2;
            int i11 = tL_photos_uploadContactProfilePhoto.flags;
            tL_photos_uploadContactProfilePhoto.video_start_ts = d;
            tL_photos_uploadContactProfilePhoto.flags = i11 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadContactProfilePhoto.flags |= 32;
            tL_photos_uploadContactProfilePhoto.video_emoji_markup = videoSize;
        }
        if (i10 == 1) {
            tL_photos_uploadContactProfilePhoto.suggest = true;
            tL_photos_uploadContactProfilePhoto.flags |= 8;
        } else {
            tL_photos_uploadContactProfilePhoto.save = true;
            tL_photos_uploadContactProfilePhoto.flags |= 16;
        }
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new q8(this, fileLocation, inputFile2, fileLocation2, i10, 4));
    }

    public final void i0(boolean z10, boolean z11) {
        if (this.f39968s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f39970x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f39970x = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f39970x = animatorSet2;
            if (z10) {
                this.f39968s.setVisibility(0);
                this.f39969w.setVisibility(0);
                AnimatorSet animatorSet3 = this.f39970x;
                RadialProgressView radialProgressView = this.f39968s;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f39969w, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f39968s;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f39969w, property2, 0.0f));
            }
            this.f39970x.setDuration(180L);
            this.f39970x.addListener(new org.telegram.ui.Components.ha0(13, this, z10));
            this.f39970x.start();
        } else if (z10) {
            this.f39968s.setAlpha(1.0f);
            this.f39968s.setVisibility(0);
            this.f39969w.setAlpha(1.0f);
            this.f39969w.setVisibility(0);
        } else {
            this.f39968s.setAlpha(0.0f);
            this.f39968s.setVisibility(4);
            this.f39969w.setAlpha(0.0f);
            this.f39969w.setVisibility(4);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        TLRPC.User Z1;
        if (this.f39965f != null && (Z1 = getMessagesController().Z1(Long.valueOf(this.H))) != null) {
            if (TextUtils.isEmpty(g0())) {
                this.f39965f.setText(org.telegram.messenger.dd.L0(2131748425, null));
            } else {
                TextView textView = this.f39965f;
                af.b c10 = af.b.c();
                textView.setText(c10.b("+" + g0()));
            }
            this.h.setText(org.telegram.messenger.dd.d0(this.currentAccount, Z1, null, null));
            if (this.Q == null) {
                org.telegram.ui.Components.g9 g9Var = this.e;
                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8(0, Z1);
                this.f39966n = r8Var;
                g9Var.e(Z1, r8Var);
            }
        }
    }

    public final void k0() {
        TLRPC.Photo photo;
        if (this.I) {
            return;
        }
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.H));
        TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.T) != null) {
            this.U.j(org.telegram.messenger.jc.i(org.telegram.messenger.b8.w(photo.sizes, 1000, false, null, false), this.T), "50_50", this.f39966n, null);
        }
        if (this.f39966n == null) {
            this.f39966n = new org.telegram.ui.Components.r8(0, Z1);
        }
        TLRPC.FileLocation fileLocation = this.Q;
        if (fileLocation == null) {
            this.e.e(Z1, this.f39966n);
        } else {
            this.e.j(org.telegram.messenger.jc.e(fileLocation), "50_50", this.f39966n, getMessagesController().Z1(Long.valueOf(this.H)));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        TLRPC.User user;
        getNotificationCenter().c(this, org.telegram.messenger.at.f14772r);
        getNotificationCenter().c(this, org.telegram.messenger.at.f14701e3);
        this.H = getArguments().getLong("user_id", 0L);
        this.L = getArguments().getString("phone");
        this.M = getArguments().getString("first_name_card");
        this.N = getArguments().getString("last_name_card");
        this.I = getArguments().getBoolean("addContact", false);
        this.J = getArguments().getBoolean("focus_notes", false);
        SharedPreferences sharedPreferences = org.telegram.messenger.wp.r1(this.currentAccount).e7;
        this.K = sharedPreferences.getBoolean("dialog_bar_exception" + this.H, false);
        if (this.H != 0) {
            user = getMessagesController().Z1(Long.valueOf(this.H));
        } else {
            user = null;
        }
        org.telegram.ui.Components.b40 b40Var = this.P;
        if (b40Var != null) {
            b40Var.f24618a = this;
            b40Var.f24619b = this;
        }
        this.G = org.telegram.messenger.wp.r1(this.currentAccount).T0(this.H);
        if (user == null || !super.onFragmentCreate()) {
            return false;
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.at.f14772r);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14701e3);
        org.telegram.ui.Components.b40 b40Var = this.P;
        if (b40Var != null) {
            b40Var.d();
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
        TLRPC.User Z1;
        try {
            super.onThemeColorsChanged();
            if (this.e != null && (Z1 = getMessagesController().Z1(Long.valueOf(this.H))) != null) {
                this.f39966n.r(Z1);
                this.e.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final boolean y() {
        return false;
    }

    public ns(Bundle bundle, org.telegram.ui.ActionBar.p6 p6Var) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.f39967r = p6Var;
        this.P = new org.telegram.ui.Components.b40(0, true, true);
    }
}
