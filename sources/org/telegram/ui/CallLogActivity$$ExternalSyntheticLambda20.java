package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;

public final class CallLogActivity$$ExternalSyntheticLambda20 implements RequestDelegate {
    public final int $r8$classId = 0;
    public final int f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public CallLogActivity$$ExternalSyntheticLambda20(int i, AlertDialog alertDialog, Context context, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
        this.f$0 = i;
        this.f$1 = alertDialog;
        this.f$2 = context;
        this.f$3 = resourcesProvider;
        this.f$4 = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                CallLogActivity.lambda$createCallLink$40(this.f$0, (AlertDialog) this.f$1, (Context) this.f$2, (Theme.ResourcesProvider) this.f$3, (Runnable) this.f$4, tLObject, tL_error);
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f$3;
                ChatActivity$$ExternalSyntheticLambda30 chatActivity$$ExternalSyntheticLambda30 = (ChatActivity$$ExternalSyntheticLambda30) this.f$4;
                ChatUsersActivity.lambda$loadChatParticipants$33((ArrayList) this.f$1, this.f$0, (AtomicInteger) this.f$2, arrayList, chatActivity$$ExternalSyntheticLambda30, tLObject, tL_error);
                break;
            case 2:
                ((ContactAddActivity) this.f$1).lambda$sendPhotoChangedRequest$22((TLRPC.FileLocation) this.f$2, (TLRPC.InputFile) this.f$3, (TLRPC.FileLocation) this.f$4, this.f$0, tLObject, tL_error);
                break;
            case 3:
                ((LaunchActivity) this.f$1).lambda$runLinkRequest$59((TLRPC.TL_inputInvoiceSlug) this.f$2, (LinkManager$$ExternalSyntheticLambda2) this.f$3, this.f$0, (String) this.f$4, tLObject, tL_error);
                break;
            default:
                LinkManager$$ExternalSyntheticLambda2 linkManager$$ExternalSyntheticLambda2 = (LinkManager$$ExternalSyntheticLambda2) this.f$3;
                String str = (String) this.f$4;
                ((LaunchActivity) this.f$2).lambda$runLinkRequest$87(this.f$0, (AlertDialog) this.f$1, linkManager$$ExternalSyntheticLambda2, str, tLObject, tL_error);
                break;
        }
    }

    public CallLogActivity$$ExternalSyntheticLambda20(ArrayList arrayList, int i, AtomicInteger atomicInteger, ArrayList arrayList2, ChatActivity$$ExternalSyntheticLambda30 chatActivity$$ExternalSyntheticLambda30) {
        this.f$1 = arrayList;
        this.f$0 = i;
        this.f$2 = atomicInteger;
        this.f$3 = arrayList2;
        this.f$4 = chatActivity$$ExternalSyntheticLambda30;
    }

    public CallLogActivity$$ExternalSyntheticLambda20(ContactAddActivity contactAddActivity, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLRPC.FileLocation fileLocation2, int i) {
        this.f$1 = contactAddActivity;
        this.f$2 = fileLocation;
        this.f$3 = inputFile;
        this.f$4 = fileLocation2;
        this.f$0 = i;
    }

    public CallLogActivity$$ExternalSyntheticLambda20(LaunchActivity launchActivity, int i, AlertDialog alertDialog, LinkManager$$ExternalSyntheticLambda2 linkManager$$ExternalSyntheticLambda2, String str) {
        this.f$2 = launchActivity;
        this.f$0 = i;
        this.f$1 = alertDialog;
        this.f$3 = linkManager$$ExternalSyntheticLambda2;
        this.f$4 = str;
    }

    public CallLogActivity$$ExternalSyntheticLambda20(LaunchActivity launchActivity, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, LinkManager$$ExternalSyntheticLambda2 linkManager$$ExternalSyntheticLambda2, int i, String str) {
        this.f$1 = launchActivity;
        this.f$2 = tL_inputInvoiceSlug;
        this.f$3 = linkManager$$ExternalSyntheticLambda2;
        this.f$0 = i;
        this.f$4 = str;
    }
}
