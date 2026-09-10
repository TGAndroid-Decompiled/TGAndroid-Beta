package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
public final class du extends org.telegram.ui.Components.ab {
    public final FrameLayout X;
    public final bi.d Y;
    public final bi.d Z;
    public final ArrayList f31973a0;
    public final HashSet f31974b0;
    public boolean f31975c0;
    public org.telegram.ui.Components.j61 f31976d0;

    public du(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, new zh.b());
        ArrayList arrayList = new ArrayList();
        this.f31973a0 = arrayList;
        HashSet hashSet2 = new HashSet();
        this.f31974b0 = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.f17998h5));
        this.drawDoubleNavigationBar = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.X = frameLayout;
        LinearLayout f7 = org.telegram.messenger.a2.f(activity, 1);
        frameLayout.addView(f7, w7.a6.e(-1, -1, 119));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.a6.d(24, 24.0f, 53, 0.0f, 14.0f, 14.0f, 0.0f));
        w7.c6.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final du f31777b;

            {
                this.f31777b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f31777b.dismiss();
                        return;
                    case 1:
                        this.f31777b.S(false);
                        return;
                    default:
                        this.f31777b.S(true);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider)));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.filled_calls_users);
        frameLayout2.addView(imageView2, w7.a6.e(56, 56, 17));
        f7.addView(frameLayout2, w7.a6.t(80, 80, 1, 2, 21, 2, 13));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.Components.m90 a2 = w7.e6.a(activity, 20.0f, i10, true, this.resourcesProvider);
        a2.setText(LocaleController.getString(R.string.GroupCallCreateTitle));
        a2.setGravity(17);
        f7.addView(a2, w7.a6.t(-1, -2, 1, 2, 0, 2, 4));
        org.telegram.ui.Components.m90 a10 = w7.e6.a(activity, 14.0f, i10, false, this.resourcesProvider);
        a10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallCreateText)));
        a10.setGravity(17);
        a10.setMaxWidth(bi.x4.a(a10.getText(), a10.getPaint()));
        f7.addView(a10, w7.a6.t(-1, -2, 1, 2, 0, 2, 23));
        org.telegram.ui.Components.j61 j61Var = this.f31976d0;
        if (j61Var != null) {
            j61Var.N(false);
        }
        s4.j jVar = new s4.j();
        jVar.f41645m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.wr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.d.setOnItemClickListener(new a1(this, 28));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout f10 = org.telegram.messenger.a2.f(activity, 0);
        f10.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        frameLayout3.addView(f10, w7.a6.e(-1, -2, 87));
        bi.d dVar = new bi.d(activity, this.resourcesProvider, true);
        this.Y = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.uq(R.drawable.profile_phone, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
        dVar.g(spannableStringBuilder, false, true);
        f10.addView(dVar, w7.a6.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final du f31777b;

            {
                this.f31777b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f31777b.dismiss();
                        return;
                    case 1:
                        this.f31777b.S(false);
                        return;
                    default:
                        this.f31777b.S(true);
                        return;
                }
            }
        });
        bi.d dVar2 = new bi.d(activity, this.resourcesProvider, true);
        this.Z = dVar2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.uq(R.drawable.profile_video, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
        dVar2.g(spannableStringBuilder2, false, true);
        f10.addView(dVar2, w7.a6.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final du f31777b;

            {
                this.f31777b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f31777b.dismiss();
                        return;
                    case 1:
                        this.f31777b.S(false);
                        return;
                    default:
                        this.f31777b.S(true);
                        return;
                }
            }
        });
        this.containerView.addView(frameLayout3, w7.a6.e(-1, -2, 87));
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(76.0f));
    }

    public static void Q(du duVar, TLObject tLObject, bi.d dVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(duVar.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(duVar.currentAccount).putChats(updates.chats, false);
            ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
            int size = findUpdates.size();
            TLRPC.GroupCall groupCall = null;
            int i10 = 0;
            while (i10 < size) {
                Object obj = findUpdates.get(i10);
                i10++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            Utilities.stageQueue.postRunnable(new org.telegram.ui.Components.yo0(29, duVar, updates));
            if (groupCall != null && LaunchActivity.G1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.f17212id = groupCall.f17205id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                duVar.dismiss();
                org.telegram.ui.Components.voip.e2.g(LaunchActivity.G1, duVar.currentAccount, tL_inputGroupCall, z10, groupCall, hashSet);
                return;
            }
            duVar.f31975c0 = false;
            dVar.setLoading(false);
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(duVar.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(duVar.currentAccount).putChats(groupcall.chats, false);
            if (LaunchActivity.G1 == null) {
                duVar.f31975c0 = false;
                dVar.setLoading(false);
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall2 = groupcall.call;
            tL_inputGroupCall2.f17212id = groupCall2.f17205id;
            tL_inputGroupCall2.access_hash = groupCall2.access_hash;
            duVar.dismiss();
            org.telegram.ui.Components.voip.e2.g(LaunchActivity.G1, duVar.currentAccount, tL_inputGroupCall2, z10, groupcall.call, hashSet);
        } else if (tL_error != null) {
            org.telegram.ui.Cells.r6.q(duVar.topBulletinContainer, duVar.resourcesProvider, tL_error, false);
        }
    }

    public static void R(du duVar, ArrayList arrayList) {
        arrayList.add(org.telegram.ui.Components.v51.k(duVar.X));
        arrayList.add(org.telegram.ui.Components.v51.B(null));
        ArrayList arrayList2 = duVar.f31973a0;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            com.google.android.gms.internal.vision.e2.m(R.string.GroupCallCreateAddMembers, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                Long l4 = (Long) arrayList2.get(i10);
                l4.getClass();
                TLRPC.User user = MessagesController.getInstance(duVar.currentAccount).getUser(l4);
                if (user != null) {
                    int i11 = wg.j.f44010a;
                    org.telegram.ui.Components.v51 J = org.telegram.ui.Components.v51.J(wg.j.class);
                    J.G = user;
                    J.K(duVar.f31974b0.contains(l4));
                    arrayList.add(J);
                } else {
                    return;
                }
            }
        }
    }

    public final void S(boolean z10) {
        bi.d dVar;
        if (this.f31975c0) {
            return;
        }
        this.f31975c0 = true;
        if (z10) {
            dVar = this.Z;
        } else {
            dVar = this.Y;
        }
        dVar.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f31974b0);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.random.nextInt();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new bi.d2(this, dVar, z10, hashSet));
    }

    @Override
    public final org.telegram.ui.Components.ul0 v(org.telegram.ui.Components.vl0 vl0Var) {
        org.telegram.ui.Components.j61 j61Var = new org.telegram.ui.Components.j61(vl0Var, getContext(), this.currentAccount, 0, true, new b5(this, 10), this.resourcesProvider);
        this.f31976d0 = j61Var;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.GroupCallCreateTitle);
    }
}
