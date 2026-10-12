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
public final class hu extends org.telegram.ui.Components.db {
    public final FrameLayout X;
    public final di.d Y;
    public final di.d Z;
    public final ArrayList f36956a0;
    public final HashSet f36957b0;
    public boolean f36958c0;
    public org.telegram.ui.Components.z61 f36959d0;

    public hu(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, new bi.b());
        ArrayList arrayList = new ArrayList();
        this.f36956a0 = arrayList;
        HashSet hashSet2 = new HashSet();
        this.f36957b0 = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f19972h5));
        this.drawDoubleNavigationBar = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.X = frameLayout;
        LinearLayout f7 = org.telegram.messenger.q.f(activity, 1);
        frameLayout.addView(f7, w7.a6.e(-1, -1, 119));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.a6.a(24.0f, 0.0f, 14.0f, 14.0f, 0.0f, 24, 53));
        w7.c6.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final hu f36483b;

            {
                this.f36483b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f36483b.dismiss();
                        return;
                    case 1:
                        this.f36483b.T(false);
                        return;
                    default:
                        this.f36483b.T(true);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.filled_calls_users);
        frameLayout2.addView(imageView2, w7.a6.e(56, 56, 17));
        f7.addView(frameLayout2, w7.a6.t(80, 80, 1, 2, 21, 2, 13));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.Components.da0 a2 = w7.e6.a(activity, 20.0f, i10, true, this.resourcesProvider);
        a2.setText(LocaleController.getString(R.string.GroupCallCreateTitle));
        a2.setGravity(17);
        f7.addView(a2, w7.a6.t(-1, -2, 1, 2, 0, 2, 4));
        org.telegram.ui.Components.da0 a10 = w7.e6.a(activity, 14.0f, i10, false, this.resourcesProvider);
        a10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallCreateText)));
        a10.setGravity(17);
        a10.setMaxWidth(di.d4.a(a10.getText(), a10.getPaint()));
        f7.addView(a10, w7.a6.t(-1, -2, 1, 2, 0, 2, 23));
        org.telegram.ui.Components.z61 z61Var = this.f36959d0;
        if (z61Var != null) {
            z61Var.N(false);
        }
        s4.k kVar = new s4.k();
        kVar.f44872m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.es.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        this.d.setOnItemClickListener(new b1(this, 28));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout f10 = org.telegram.messenger.q.f(activity, 0);
        f10.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        frameLayout3.addView(f10, w7.a6.e(-1, -2, 87));
        di.d dVar = new di.d(activity, this.resourcesProvider, true);
        this.Y = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.br(R.drawable.profile_phone, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
        dVar.g(spannableStringBuilder, false, true);
        f10.addView(dVar, w7.a6.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final hu f36483b;

            {
                this.f36483b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f36483b.dismiss();
                        return;
                    case 1:
                        this.f36483b.T(false);
                        return;
                    default:
                        this.f36483b.T(true);
                        return;
                }
            }
        });
        di.d dVar2 = new di.d(activity, this.resourcesProvider, true);
        this.Z = dVar2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.br(R.drawable.profile_video, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
        dVar2.g(spannableStringBuilder2, false, true);
        f10.addView(dVar2, w7.a6.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final hu f36483b;

            {
                this.f36483b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f36483b.dismiss();
                        return;
                    case 1:
                        this.f36483b.T(false);
                        return;
                    default:
                        this.f36483b.T(true);
                        return;
                }
            }
        });
        this.containerView.addView(frameLayout3, w7.a6.e(-1, -2, 87));
        org.telegram.ui.Components.mm0 mm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(76.0f));
    }

    public static void R(hu huVar, TLObject tLObject, di.d dVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(huVar.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(huVar.currentAccount).putChats(updates.chats, false);
            ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
            int size = findUpdates.size();
            TLRPC.GroupCall groupCall = null;
            int i10 = 0;
            while (i10 < size) {
                Object obj = findUpdates.get(i10);
                i10++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            Utilities.stageQueue.postRunnable(new org.telegram.ui.Components.k31(18, huVar, updates));
            if (groupCall != null && LaunchActivity.G1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.f19233id = groupCall.f19226id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                huVar.dismiss();
                org.telegram.ui.Components.voip.d2.g(LaunchActivity.G1, huVar.currentAccount, tL_inputGroupCall, z10, groupCall, hashSet);
                return;
            }
            huVar.f36958c0 = false;
            dVar.setLoading(false);
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(huVar.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(huVar.currentAccount).putChats(groupcall.chats, false);
            if (LaunchActivity.G1 == null) {
                huVar.f36958c0 = false;
                dVar.setLoading(false);
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall2 = groupcall.call;
            tL_inputGroupCall2.f19233id = groupCall2.f19226id;
            tL_inputGroupCall2.access_hash = groupCall2.access_hash;
            huVar.dismiss();
            org.telegram.ui.Components.voip.d2.g(LaunchActivity.G1, huVar.currentAccount, tL_inputGroupCall2, z10, groupcall.call, hashSet);
        } else if (tL_error != null) {
            org.telegram.ui.Cells.d0.r(huVar.topBulletinContainer, huVar.resourcesProvider, tL_error, false);
        }
    }

    public static void S(hu huVar, ArrayList arrayList) {
        arrayList.add(org.telegram.ui.Components.l61.k(huVar.X));
        arrayList.add(org.telegram.ui.Components.l61.B(null));
        ArrayList arrayList2 = huVar.f36956a0;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            i2.d.o(R.string.GroupCallCreateAddMembers, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                Long l4 = (Long) arrayList2.get(i10);
                l4.getClass();
                TLRPC.User user = MessagesController.getInstance(huVar.currentAccount).getUser(l4);
                if (user != null) {
                    int i11 = yg.k.f48779a;
                    org.telegram.ui.Components.l61 J = org.telegram.ui.Components.l61.J(yg.k.class);
                    J.G = user;
                    J.K(huVar.f36957b0.contains(l4));
                    arrayList.add(J);
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.GroupCallCreateTitle);
    }

    public final void T(boolean z10) {
        di.d dVar;
        if (this.f36958c0) {
            return;
        }
        this.f36958c0 = true;
        if (z10) {
            dVar = this.Z;
        } else {
            dVar = this.Y;
        }
        dVar.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f36957b0);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.random.nextInt();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new di.s1(this, dVar, z10, hashSet));
    }

    @Override
    public final org.telegram.ui.Components.lm0 x(org.telegram.ui.Components.mm0 mm0Var) {
        org.telegram.ui.Components.z61 z61Var = new org.telegram.ui.Components.z61(mm0Var, getContext(), this.currentAccount, 0, true, new f5(this, 10), this.resourcesProvider);
        this.f36959d0 = z61Var;
        return z61Var;
    }
}
