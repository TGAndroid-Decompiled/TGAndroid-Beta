package org.telegram.ui.Components;

import android.app.Activity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class wn0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public final Activity F;
    public final org.telegram.ui.ActionBar.o2 G;
    public boolean H;
    public org.telegram.ui.h10 I;
    public final org.telegram.ui.a10 J;
    public String K;
    public String L;
    public pn0 M;
    public final ql0 N;
    public boolean O;
    public boolean P;
    public final vx0 f32302a;
    public final ai.u1 f32303b;
    public final vn0 f32304c;
    public final int d;
    public final ArrayList e;
    public final ArrayList f32305f;
    public final ArrayList h;
    public final ArrayList f32306n;
    public int f32307r;
    public int f32308s;
    public int v;
    public int f32309w;
    public int f32310x;
    public int f32311y;

    public wn0(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        super(o2Var.getParentActivity());
        vn0 vn0Var = new vn0(this);
        this.f32304c = vn0Var;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        this.e = arrayList;
        this.f32305f = new ArrayList();
        this.h = new ArrayList();
        this.f32306n = new ArrayList();
        this.f32308s = -1;
        this.v = -1;
        this.f32309w = -1;
        this.f32310x = -1;
        this.f32311y = -1;
        this.E = -1;
        this.J = new org.telegram.ui.a10(0, 0L);
        this.G = o2Var;
        this.F = o2Var.getParentActivity();
        this.d = i10;
        ai.u1 u1Var = new ai.u1(this, getContext(), 20);
        this.f32303b = u1Var;
        new s4.y(new di.f(this, 3)).d(u1Var);
        addView(u1Var);
        o2Var.getParentActivity();
        u1Var.setLayoutManager(new hg.a0(10));
        u1Var.setAdapter(vn0Var);
        u1Var.setOnScrollListener(new iv(this, 8));
        s4.k kVar = new s4.k();
        kVar.C = false;
        kVar.f46376m = false;
        u1Var.setItemAnimator(kVar);
        u1Var.setOnItemClickListener(new qn0(this, i10, 0));
        u1Var.setOnItemLongClickListener(new rv(this, 17));
        this.N = new ql0(u1Var, true);
        z00 z00Var = new z00(getContext(), null);
        addView(z00Var);
        z00Var.setUseHeaderOffset(true);
        z00Var.setViewType(3);
        z00Var.setVisibility(8);
        vx0 vx0Var = new vx0(getContext(), z00Var, 1, null);
        this.f32302a = vx0Var;
        addView(vx0Var);
        u1Var.setEmptyView(vx0Var);
        FileLoader.getInstance(i10).getCurrentLoadingFiles(arrayList);
    }

    public final void a() {
        ai.u1 u1Var;
        MessageObject message;
        int i10 = this.d;
        if (!UserConfig.getInstance(i10).isPremium() && (u1Var = this.f32303b) != null) {
            for (int i11 = 0; i11 < u1Var.getChildCount(); i11++) {
                try {
                    View childAt = u1Var.getChildAt(i11);
                    if ((childAt instanceof sn0) && (message = ((sn0) childAt).f30597a.getMessage()) != null) {
                        if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                            c(false);
                        } else if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                            c(true);
                        } else {
                            continue;
                        }
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public final void b(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.P = z10;
        setPadding(0, i10, 0, i11);
        ai.u1 u1Var = this.f32303b;
        if (z10) {
            u1Var.s1(0, i10, 0, i11);
        } else {
            u1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) u1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.P = false;
    }

    public final void c(boolean z10) {
        float f7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.o2 o2Var = this.G;
        if (o2Var != null && this.f32303b.G) {
            long currentTimeMillis = System.currentTimeMillis();
            int i12 = this.d;
            if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= MessagesController.getInstance(i12).uploadPremiumSpeedupNotifyPeriod * 1000) {
                ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
                if (!UserConfig.getInstance(i12).isPremium() && !MessagesController.getInstance(i12).premiumFeaturesBlocked()) {
                    if (z10) {
                        f7 = MessagesController.getInstance(i12).uploadPremiumSpeedupUpload;
                    } else {
                        f7 = MessagesController.getInstance(i12).uploadPremiumSpeedupDownload;
                    }
                    SpannableString spannableString = new SpannableString(Double.toString(Math.round(f7 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                    spannableString.setSpan(new i61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    if (!o2Var.hasStoryViewer()) {
                        vc a02 = vc.a0(o2Var);
                        int i13 = R.raw.speed_limit;
                        if (z10) {
                            i10 = R.string.UploadSpeedLimited;
                        } else {
                            i10 = R.string.DownloadSpeedLimited;
                        }
                        String string = LocaleController.getString(i10);
                        if (z10) {
                            i11 = R.string.UploadSpeedLimitedMessage;
                        } else {
                            i11 = R.string.DownloadSpeedLimitedMessage;
                        }
                        oc M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new z50(2, this, z10)), spannableString), i13);
                        M.f29203j = 8000;
                        M.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        long j10;
        vn0 vn0Var = this.f32304c;
        vn0Var.q(0, vn0Var.f31479c.f32307r);
        if (!TextUtils.isEmpty(this.K)) {
            int i10 = this.d;
            if (!DownloadController.getInstance(i10).downloadingFiles.isEmpty() || !DownloadController.getInstance(i10).recentDownloadingFiles.isEmpty()) {
                this.f32302a.setStickerType(1);
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                FileLoader.getInstance(this.d).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(this.d).getRecentLoadingFiles(arrayList2);
                String lowerCase = this.K.toLowerCase();
                boolean equals = lowerCase.equals(this.L);
                this.L = lowerCase;
                Utilities.searchQueue.cancelRunnable(this.M);
                DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
                pn0 pn0Var = new pn0(this, arrayList, lowerCase, arrayList2);
                this.M = pn0Var;
                if (equals) {
                    j10 = 0;
                } else {
                    j10 = 300;
                }
                dispatchQueue2.postRunnable(pn0Var, j10);
                this.f32306n.clear();
                this.h.clear();
                if (!equals) {
                    this.f32302a.e(true, true);
                    e(this.h, this.f32306n, z10);
                    return;
                }
                return;
            }
        }
        if (this.f32307r == 0) {
            this.N.b(0);
        }
        if (this.O) {
            this.h.clear();
            this.f32306n.clear();
        }
        FileLoader.getInstance(this.d).getCurrentLoadingFiles(this.h);
        FileLoader.getInstance(this.d).getRecentLoadingFiles(this.f32306n);
        for (int i11 = 0; i11 < this.e.size(); i11++) {
            ((MessageObject) this.e.get(i11)).setQuery(null);
        }
        for (int i12 = 0; i12 < this.f32305f.size(); i12++) {
            ((MessageObject) this.f32305f.get(i12)).setQuery(null);
        }
        this.L = null;
        e(this.h, this.f32306n, z10);
        if (this.f32307r == 0) {
            this.f32302a.e(false, false);
            this.f32302a.d.setText(LocaleController.getString(R.string.SearchEmptyViewDownloads));
            this.f32302a.e.setVisibility(8);
        }
        this.f32302a.setStickerType(9);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.onDownloadingFilesChanged) {
            if (getVisibility() == 0) {
                DownloadController.getInstance(this.d).clearUnviewedDownloads();
            }
            d(true);
        } else if (i10 == NotificationCenter.premiumFloodWaitReceived) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        s4.b1 T;
        vn0 vn0Var = this.f32304c;
        if (z10) {
            int i10 = this.f32308s;
            int i11 = this.v;
            int i12 = this.f32309w;
            int i13 = this.f32310x;
            int i14 = this.f32311y;
            int i15 = this.E;
            int i16 = this.f32307r;
            ArrayList arrayList3 = new ArrayList(this.e);
            ArrayList arrayList4 = new ArrayList(this.f32305f);
            f(arrayList, arrayList2);
            s4.o.c(new rn0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).c(vn0Var);
            int i17 = 0;
            while (true) {
                ai.u1 u1Var = this.f32303b;
                if (i17 < u1Var.getChildCount()) {
                    View childAt = u1Var.getChildAt(i17);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = u1Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.u3) {
                            vn0Var.v(T, R);
                        } else if (childAt instanceof sn0) {
                            org.telegram.ui.Cells.k7 k7Var = ((sn0) childAt).f30597a;
                            k7Var.f(true);
                            int id2 = k7Var.getMessage().getId();
                            long dialogId = k7Var.getMessage().getDialogId();
                            org.telegram.ui.a10 a10Var = this.J;
                            a10Var.f35547a = dialogId;
                            a10Var.f35548b = id2;
                            k7Var.b(this.I.b(a10Var), true);
                        }
                    }
                    i17++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            vn0Var.l();
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            MessageObject messageObject = (MessageObject) obj;
            if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
                arrayList3.add(messageObject);
            }
        }
        ArrayList arrayList4 = this.f32305f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            MessageObject messageObject2 = (MessageObject) obj2;
            if (!messageObject2.isRoundVideo() && !messageObject2.isVoice()) {
                arrayList4.add(messageObject2);
            }
        }
        this.f32307r = 0;
        this.f32308s = -1;
        this.v = -1;
        this.f32309w = -1;
        this.f32310x = -1;
        this.f32311y = -1;
        this.E = -1;
        this.H = false;
        if (!arrayList3.isEmpty()) {
            int i13 = this.f32307r;
            int i14 = i13 + 1;
            this.f32307r = i14;
            this.f32308s = i13;
            this.v = i14;
            int size3 = arrayList3.size() + i14;
            this.f32307r = size3;
            this.f32309w = size3;
            while (true) {
                if (i10 >= arrayList3.size()) {
                    break;
                } else if (FileLoader.getInstance(this.d).isLoadingFile(((MessageObject) arrayList3.get(i10)).getFileName())) {
                    this.H = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            int i15 = this.f32307r;
            int i16 = i15 + 1;
            this.f32307r = i16;
            this.f32310x = i15;
            this.f32311y = i16;
            int size4 = arrayList4.size() + i16;
            this.f32307r = size4;
            this.E = size4;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.d).addObserver(this, NotificationCenter.onDownloadingFilesChanged);
        NotificationCenter.getInstance(this.d).addObserver(this, NotificationCenter.premiumFloodWaitReceived);
        if (getVisibility() == 0) {
            DownloadController.getInstance(this.d).clearUnviewedDownloads();
        }
        if (!this.O) {
            this.O = true;
            Utilities.searchQueue.postRunnable(new wb0(this, 21));
        }
        d(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.d;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.premiumFloodWaitReceived);
    }

    @Override
    public final void requestLayout() {
        if (this.P) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(org.telegram.ui.h10 h10Var) {
        this.I = h10Var;
    }
}
