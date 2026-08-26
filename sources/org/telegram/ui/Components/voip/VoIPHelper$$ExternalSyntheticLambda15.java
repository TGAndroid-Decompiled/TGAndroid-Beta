package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.JoinCallAlert;
import org.telegram.ui.Components.JoinCallByUrlAlert;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.LaunchActivity;

public final class VoIPHelper$$ExternalSyntheticLambda15 implements AlertDialog.OnButtonClickListener, JoinCallAlert.JoinCallAlertDelegate {
    public final TLRPC.User f$0;
    public final TLRPC.Chat f$1;
    public final String f$2;
    public final boolean f$3;
    public final boolean f$4;
    public final boolean f$5;
    public final Activity f$6;
    public final BaseFragment f$7;
    public final AccountInstance f$8;

    public VoIPHelper$$ExternalSyntheticLambda15(TLRPC.User user, TLRPC.Chat chat, String str, boolean z, boolean z2, boolean z3, Activity activity, BaseFragment baseFragment, AccountInstance accountInstance) {
        this.f$0 = user;
        this.f$1 = chat;
        this.f$2 = str;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$5 = z3;
        this.f$6 = activity;
        this.f$7 = baseFragment;
        this.f$8 = accountInstance;
    }

    @Override
    public void didSelectChat(final TLRPC.InputPeer inputPeer, boolean z, boolean z2, final boolean z3) {
        final boolean z4 = this.f$3;
        final Activity activity = this.f$6;
        final AccountInstance accountInstance = this.f$8;
        final TLRPC.Chat chat = this.f$1;
        final String str = this.f$2;
        if (z4 && z2) {
            GroupCallActivity.create((LaunchActivity) activity, accountInstance, chat, inputPeer, z, str);
            return;
        }
        final TLRPC.User user = this.f$0;
        final boolean z5 = this.f$4;
        final boolean z6 = this.f$5;
        final BaseFragment baseFragment = this.f$7;
        if (z || str == null) {
            VoIPHelper.doInitiateCall(user, chat, str, inputPeer, z, z5, z6, z4, activity, baseFragment, accountInstance, false, true, z3);
            return;
        }
        JoinCallByUrlAlert joinCallByUrlAlert = new JoinCallByUrlAlert(activity, chat) {
            public final AccountInstance val$accountInstance;
            public final Activity val$activity;
            public final boolean val$canVideoCall;
            public final TLRPC.Chat val$chat;
            public final boolean val$createCall;
            public final BaseFragment val$fragment;
            public final String val$hash;
            public final boolean val$rtmp;
            public final TLRPC.InputPeer val$selectedPeer;
            public final TLRPC.User val$user;
            public final boolean val$videoCall;

            public AnonymousClass2(final Activity activity2, final TLRPC.Chat chat2) {
                super(activity2, chat2);
                user = user;
                chat = chat2;
                str = str;
                inputPeer = inputPeer;
                z = z5;
                z = z6;
                z = z4;
                activity = activity2;
                baseFragment = baseFragment;
                accountInstance = accountInstance;
                z = z3;
            }

            @Override
            public final void onJoin() {
                VoIPHelper.doInitiateCall(user, chat, str, inputPeer, false, z, z, z, activity, baseFragment, accountInstance, false, true, z);
            }
        };
        if (baseFragment != null) {
            baseFragment.showDialog(joinCallByUrlAlert);
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f$0;
        final TLRPC.Chat chat = this.f$1;
        final String str = this.f$2;
        final boolean z = this.f$3;
        final boolean z2 = this.f$4;
        final boolean z3 = this.f$5;
        final Activity activity = this.f$6;
        final BaseFragment baseFragment = this.f$7;
        final AccountInstance accountInstance = this.f$8;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    VoIPHelper.lastCallTime = 0L;
                    VoIPHelper.doInitiateCall(user, chat, str, null, false, z, z2, z3, activity, baseFragment, accountInstance, true, true, false);
                }
            });
        } else {
            VoIPHelper.doInitiateCall(user, chat, str, null, false, z, z2, z3, activity, baseFragment, accountInstance, true, true, false);
        }
    }

    public VoIPHelper$$ExternalSyntheticLambda15(boolean z, Activity activity, AccountInstance accountInstance, TLRPC.Chat chat, String str, TLRPC.User user, boolean z2, boolean z3, BaseFragment baseFragment) {
        this.f$3 = z;
        this.f$6 = activity;
        this.f$8 = accountInstance;
        this.f$1 = chat;
        this.f$2 = str;
        this.f$0 = user;
        this.f$4 = z2;
        this.f$5 = z3;
        this.f$7 = baseFragment;
    }
}
