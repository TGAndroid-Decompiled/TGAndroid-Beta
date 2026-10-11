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
public final class au extends org.telegram.ui.Components.db {
    public final FrameLayout X;
    public final ci.d Y;
    public final ci.d Z;
    public final ArrayList f36172a0;
    public final HashSet f36173b0;
    public boolean f36174c0;
    public org.telegram.ui.Components.e71 f36175d0;

    public au(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, new ai.d());
        ArrayList arrayList = new ArrayList();
        this.f36172a0 = arrayList;
        HashSet hashSet2 = new HashSet();
        this.f36173b0 = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.h6.f20857h5));
        this.drawDoubleNavigationBar = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.X = frameLayout;
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        frameLayout.addView(e7, w7.x5.e(-1, -1, 119));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.x5.a(24.0f, 0.0f, 14.0f, 14.0f, 0.0f, 24, 53));
        w7.z5.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final au f45067b;

            {
                this.f45067b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f45067b.dismiss();
                        return;
                    case 1:
                        this.f45067b.T(false);
                        return;
                    default:
                        this.f45067b.T(true);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.resourcesProvider)));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.filled_calls_users);
        frameLayout2.addView(imageView2, w7.x5.e(56, 56, 17));
        e7.addView(frameLayout2, w7.x5.t(80, 80, 1, 2, 21, 2, 13));
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.Components.fa0 a2 = w7.b6.a(activity, 20.0f, i10, true, this.resourcesProvider);
        a2.setText(LocaleController.getString(R.string.GroupCallCreateTitle));
        a2.setGravity(17);
        e7.addView(a2, w7.x5.t(-1, -2, 1, 2, 0, 2, 4));
        org.telegram.ui.Components.fa0 a10 = w7.b6.a(activity, 14.0f, i10, false, this.resourcesProvider);
        a10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallCreateText)));
        a10.setGravity(17);
        a10.setMaxWidth(ci.d4.a(a10.getText(), a10.getPaint()));
        e7.addView(a10, w7.x5.t(-1, -2, 1, 2, 0, 2, 23));
        org.telegram.ui.Components.e71 e71Var = this.f36175d0;
        if (e71Var != null) {
            e71Var.N(false);
        }
        s4.j jVar = new s4.j();
        jVar.f47788m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.is.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        this.d.setOnItemClickListener(new y0(this, 28));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout e10 = org.telegram.messenger.q.e(activity, 0);
        e10.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        frameLayout3.addView(e10, w7.x5.e(-1, -2, 87));
        ci.d dVar = new ci.d(activity, this.resourcesProvider, true);
        this.Y = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.er(R.drawable.profile_phone, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
        dVar.g(spannableStringBuilder, false, true);
        e10.addView(dVar, w7.x5.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final au f45067b;

            {
                this.f45067b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f45067b.dismiss();
                        return;
                    case 1:
                        this.f45067b.T(false);
                        return;
                    default:
                        this.f45067b.T(true);
                        return;
                }
            }
        });
        ci.d dVar2 = new ci.d(activity, this.resourcesProvider, true);
        this.Z = dVar2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.er(R.drawable.profile_video, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
        dVar2.g(spannableStringBuilder2, false, true);
        e10.addView(dVar2, w7.x5.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final au f45067b;

            {
                this.f45067b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f45067b.dismiss();
                        return;
                    case 1:
                        this.f45067b.T(false);
                        return;
                    default:
                        this.f45067b.T(true);
                        return;
                }
            }
        });
        this.containerView.addView(frameLayout3, w7.x5.e(-1, -2, 87));
        org.telegram.ui.Components.sm0 sm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        sm0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(76.0f));
    }

    public static void R(au auVar, TLObject tLObject, ci.d dVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(auVar.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(auVar.currentAccount).putChats(updates.chats, false);
            ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
            int size = findUpdates.size();
            TLRPC.GroupCall groupCall = null;
            int i10 = 0;
            while (i10 < size) {
                Object obj = findUpdates.get(i10);
                i10++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            Utilities.stageQueue.postRunnable(new org.telegram.ui.Components.voip.i(6, auVar, updates));
            if (groupCall != null && LaunchActivity.G1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.f20049id = groupCall.f20042id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                auVar.dismiss();
                org.telegram.ui.Components.voip.g2.g(LaunchActivity.G1, auVar.currentAccount, tL_inputGroupCall, z10, groupCall, hashSet);
                return;
            }
            auVar.f36174c0 = false;
            dVar.setLoading(false);
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(auVar.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(auVar.currentAccount).putChats(groupcall.chats, false);
            if (LaunchActivity.G1 == null) {
                auVar.f36174c0 = false;
                dVar.setLoading(false);
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall2 = groupcall.call;
            tL_inputGroupCall2.f20049id = groupCall2.f20042id;
            tL_inputGroupCall2.access_hash = groupCall2.access_hash;
            auVar.dismiss();
            org.telegram.ui.Components.voip.g2.g(LaunchActivity.G1, auVar.currentAccount, tL_inputGroupCall2, z10, groupcall.call, hashSet);
        } else if (tL_error != null) {
            org.telegram.ui.Cells.c1.p(auVar.topBulletinContainer, auVar.resourcesProvider, tL_error, false);
        }
    }

    public static void S(au auVar, ArrayList arrayList) {
        arrayList.add(org.telegram.ui.Components.r61.k(auVar.X));
        arrayList.add(org.telegram.ui.Components.r61.B(null));
        ArrayList arrayList2 = auVar.f36172a0;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            com.google.android.gms.internal.vision.e2.n(R.string.GroupCallCreateAddMembers, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                Long l4 = (Long) arrayList2.get(i10);
                l4.getClass();
                TLRPC.User user = MessagesController.getInstance(auVar.currentAccount).getUser(l4);
                if (user != null) {
                    int i11 = xg.k.f51243a;
                    org.telegram.ui.Components.r61 J = org.telegram.ui.Components.r61.J(xg.k.class);
                    J.G = user;
                    J.K(auVar.f36173b0.contains(l4));
                    arrayList.add(J);
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.GroupCallCreateTitle);
    }

    public final void T(boolean z10) {
        ci.d dVar;
        if (this.f36174c0) {
            return;
        }
        this.f36174c0 = true;
        if (z10) {
            dVar = this.Z;
        } else {
            dVar = this.Y;
        }
        dVar.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f36173b0);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.random.nextInt();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new ci.s1(this, dVar, z10, hashSet));
    }

    @Override
    public final org.telegram.ui.Components.rm0 x(org.telegram.ui.Components.sm0 sm0Var) {
        org.telegram.ui.Components.e71 e71Var = new org.telegram.ui.Components.e71(sm0Var, getContext(), this.currentAccount, 0, true, new a5(this, 10), this.resourcesProvider);
        this.f36175d0 = e71Var;
        return e71Var;
    }
}
