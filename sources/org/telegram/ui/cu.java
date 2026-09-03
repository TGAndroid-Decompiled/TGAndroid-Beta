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
public final class cu extends org.telegram.ui.Components.sa {
    public final FrameLayout U;
    public final ph.d V;
    public final ph.d W;
    public final ArrayList X;
    public final HashSet Y;
    public boolean Z;
    public org.telegram.ui.Components.w51 f33221a0;

    public cu(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, false, 1, new nh.b());
        ArrayList arrayList = new ArrayList();
        this.X = arrayList;
        HashSet hashSet2 = new HashSet();
        this.Y = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.f19952h5));
        this.drawDoubleNavigationBar = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.U = frameLayout;
        LinearLayout h = kf.k0.h(activity, 1);
        frameLayout.addView(h, k7.b6.e(-1, -1, 119));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, k7.b6.d(24, 24.0f, 53, 0.0f, 14.0f, 14.0f, 0.0f));
        k7.d6.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final cu f32944b;

            {
                this.f32944b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f32944b.dismiss();
                        return;
                    case 1:
                        this.f32944b.S(false);
                        return;
                    default:
                        this.f32944b.S(true);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider)));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.filled_calls_users);
        frameLayout2.addView(imageView2, k7.b6.e(56, 56, 17));
        h.addView(frameLayout2, k7.b6.t(80, 80, 1, 2, 21, 2, 13));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.Components.f90 a2 = k7.f6.a(activity, 20.0f, i10, true, this.resourcesProvider);
        a2.setText(LocaleController.getString(R.string.GroupCallCreateTitle));
        a2.setGravity(17);
        h.addView(a2, k7.b6.t(-1, -2, 1, 2, 0, 2, 4));
        org.telegram.ui.Components.f90 a10 = k7.f6.a(activity, 14.0f, i10, false, this.resourcesProvider);
        a10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallCreateText)));
        a10.setGravity(17);
        a10.setMaxWidth(ph.f3.a(a10.getText(), a10.getPaint()));
        h.addView(a10, k7.b6.t(-1, -2, 1, 2, 0, 2, 23));
        org.telegram.ui.Components.w51 w51Var = this.f33221a0;
        if (w51Var != null) {
            w51Var.N(false);
        }
        f2.l lVar = new f2.l();
        lVar.f5807m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.mr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.d.setOnItemClickListener(new c1(this, 28));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout h9 = kf.k0.h(activity, 0);
        h9.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        frameLayout3.addView(h9, k7.b6.e(-1, -2, 87));
        ph.d dVar = new ph.d(activity, this.resourcesProvider, true);
        this.V = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.lq(R.drawable.profile_phone, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
        dVar.g(spannableStringBuilder, false, true);
        h9.addView(dVar, k7.b6.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final cu f32944b;

            {
                this.f32944b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f32944b.dismiss();
                        return;
                    case 1:
                        this.f32944b.S(false);
                        return;
                    default:
                        this.f32944b.S(true);
                        return;
                }
            }
        });
        ph.d dVar2 = new ph.d(activity, this.resourcesProvider, true);
        this.W = dVar2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.lq(R.drawable.profile_video, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
        dVar2.g(spannableStringBuilder2, false, true);
        h9.addView(dVar2, k7.b6.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final cu f32944b;

            {
                this.f32944b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f32944b.dismiss();
                        return;
                    case 1:
                        this.f32944b.S(false);
                        return;
                    default:
                        this.f32944b.S(true);
                        return;
                }
            }
        });
        this.containerView.addView(frameLayout3, k7.b6.e(-1, -2, 87));
        org.telegram.ui.Components.rl0 rl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(76.0f));
    }

    public static void Q(cu cuVar, TLObject tLObject, ph.d dVar, boolean z4, HashSet hashSet, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(cuVar.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(cuVar.currentAccount).putChats(updates.chats, false);
            ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
            int size = findUpdates.size();
            TLRPC.GroupCall groupCall = null;
            int i10 = 0;
            while (i10 < size) {
                Object obj = findUpdates.get(i10);
                i10++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            Utilities.stageQueue.postRunnable(new org.telegram.ui.Components.k41(13, cuVar, updates));
            if (groupCall != null && LaunchActivity.D1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.f19176id = groupCall.f19169id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                cuVar.dismiss();
                org.telegram.ui.Components.voip.f2.g(LaunchActivity.D1, cuVar.currentAccount, tL_inputGroupCall, z4, groupCall, hashSet);
                return;
            }
            cuVar.Z = false;
            dVar.setLoading(false);
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(cuVar.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(cuVar.currentAccount).putChats(groupcall.chats, false);
            if (LaunchActivity.D1 == null) {
                cuVar.Z = false;
                dVar.setLoading(false);
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall2 = groupcall.call;
            tL_inputGroupCall2.f19176id = groupCall2.f19169id;
            tL_inputGroupCall2.access_hash = groupCall2.access_hash;
            cuVar.dismiss();
            org.telegram.ui.Components.voip.f2.g(LaunchActivity.D1, cuVar.currentAccount, tL_inputGroupCall2, z4, groupcall.call, hashSet);
        } else if (tL_error != null) {
            ai.u(cuVar.topBulletinContainer, cuVar.resourcesProvider, tL_error, false);
        }
    }

    public static void R(cu cuVar, ArrayList arrayList) {
        arrayList.add(org.telegram.ui.Components.i51.k(cuVar.U));
        arrayList.add(org.telegram.ui.Components.i51.B(null));
        ArrayList arrayList2 = cuVar.X;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ai.q(R.string.GroupCallCreateAddMembers, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                Long l10 = (Long) arrayList2.get(i10);
                l10.getClass();
                TLRPC.User user = MessagesController.getInstance(cuVar.currentAccount).getUser(l10);
                if (user != null) {
                    int i11 = kg.m.f10557a;
                    org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(kg.m.class);
                    J.G = user;
                    J.K(cuVar.Y.contains(l10));
                    arrayList.add(J);
                } else {
                    return;
                }
            }
        }
    }

    public final void S(boolean z4) {
        ph.d dVar;
        if (this.Z) {
            return;
        }
        this.Z = true;
        if (z4) {
            dVar = this.W;
        } else {
            dVar = this.V;
        }
        ph.d dVar2 = dVar;
        dVar2.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.Y);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.random.nextInt();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new yd(this, dVar2, z4, hashSet, 4));
    }

    @Override
    public final org.telegram.ui.Components.ql0 v(org.telegram.ui.Components.rl0 rl0Var) {
        org.telegram.ui.Components.w51 w51Var = new org.telegram.ui.Components.w51(rl0Var, getContext(), this.currentAccount, 0, true, new f5(this, 10), this.resourcesProvider);
        this.f33221a0 = w51Var;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.GroupCallCreateTitle);
    }
}
