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
import org.telegram.messenger.DispatchQueue;
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
public final class ho0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public final Activity F;
    public final org.telegram.ui.ActionBar.m2 G;
    public boolean H;
    public org.telegram.ui.x10 I;
    public final org.telegram.ui.q10 J;
    public String K;
    public String L;
    public ao0 M;
    public final bm0 N;
    public boolean O;
    public boolean P;
    public final gy0 f26853a;
    public final ai.w0 f26854b;
    public final go0 f26855c;
    public final int d;
    public final ArrayList f26856e;
    public final ArrayList f26857f;
    public final ArrayList h;
    public final ArrayList f26858n;
    public int f26859r;
    public int f26860s;
    public int v;
    public int f26861w;
    public int f26862x;
    public int f26863y;

    public ho0(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        super(m2Var.getParentActivity());
        go0 go0Var = new go0(this);
        this.f26855c = go0Var;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        this.f26856e = arrayList;
        this.f26857f = new ArrayList();
        this.h = new ArrayList();
        this.f26858n = new ArrayList();
        this.f26860s = -1;
        this.v = -1;
        this.f26861w = -1;
        this.f26862x = -1;
        this.f26863y = -1;
        this.E = -1;
        this.J = new org.telegram.ui.q10(0, 0L);
        this.G = m2Var;
        this.F = m2Var.getParentActivity();
        this.d = i10;
        ai.w0 w0Var = new ai.w0(this, getContext(), 19);
        this.f26854b = w0Var;
        new s4.z(new bi.g(this, 3)).e(w0Var);
        addView(w0Var);
        m2Var.getParentActivity();
        w0Var.setLayoutManager(new gg.a0(10));
        w0Var.setAdapter(go0Var);
        w0Var.setOnScrollListener(new qh0(this, 3));
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f47929m = false;
        w0Var.setItemAnimator(jVar);
        w0Var.setOnItemClickListener(new bo0(this, i10, 0));
        w0Var.setOnItemLongClickListener(new ew(this, 17));
        this.N = new bm0(w0Var, true);
        m10 m10Var = new m10(getContext(), null);
        addView(m10Var);
        m10Var.setUseHeaderOffset(true);
        m10Var.setViewType(3);
        m10Var.setVisibility(8);
        gy0 gy0Var = new gy0(getContext(), m10Var, 1, null);
        this.f26853a = gy0Var;
        addView(gy0Var);
        w0Var.setEmptyView(gy0Var);
        FileLoader.getInstance(i10).getCurrentLoadingFiles(arrayList);
    }

    public final void a() {
        ai.w0 w0Var;
        MessageObject message;
        int i10 = this.d;
        if (!UserConfig.getInstance(i10).isPremium() && (w0Var = this.f26854b) != null) {
            for (int i11 = 0; i11 < w0Var.getChildCount(); i11++) {
                try {
                    View childAt = w0Var.getChildAt(i11);
                    if ((childAt instanceof do0) && (message = ((do0) childAt).f25442a.getMessage()) != null) {
                        if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                            c(false);
                        } else if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                            c(true);
                        } else {
                            continue;
                        }
                        return;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    public final void b(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.P = z10;
        setPadding(0, i10, 0, i11);
        ai.w0 w0Var = this.f26854b;
        if (z10) {
            w0Var.o1(0, i10, 0, i11);
        } else {
            w0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) w0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.P = false;
    }

    public final void c(boolean z10) {
        float f7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.m2 m2Var = this.G;
        if (m2Var != null && this.f26854b.G) {
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
                    spannableString.setSpan(new r61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    if (!m2Var.hasStoryViewer()) {
                        zc a02 = zc.a0(m2Var);
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
                        sc M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new bi.f(29, this, z10)), spannableString), i13);
                        M.f30540j = 8000;
                        M.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        long j3;
        go0 go0Var = this.f26855c;
        go0Var.q(0, go0Var.f26483c.f26859r);
        if (!TextUtils.isEmpty(this.K)) {
            int i10 = this.d;
            if (!DownloadController.getInstance(i10).downloadingFiles.isEmpty() || !DownloadController.getInstance(i10).recentDownloadingFiles.isEmpty()) {
                this.f26853a.setStickerType(1);
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                FileLoader.getInstance(this.d).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(this.d).getRecentLoadingFiles(arrayList2);
                String lowerCase = this.K.toLowerCase();
                boolean equals = lowerCase.equals(this.L);
                this.L = lowerCase;
                Utilities.searchQueue.cancelRunnable(this.M);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                ao0 ao0Var = new ao0(this, arrayList, lowerCase, arrayList2);
                this.M = ao0Var;
                if (equals) {
                    j3 = 0;
                } else {
                    j3 = 300;
                }
                dispatchQueue.postRunnable(ao0Var, j3);
                this.f26858n.clear();
                this.h.clear();
                if (!equals) {
                    this.f26853a.e(true, true);
                    e(this.h, this.f26858n, z10);
                    return;
                }
                return;
            }
        }
        if (this.f26859r == 0) {
            this.N.b(0);
        }
        if (this.O) {
            this.h.clear();
            this.f26858n.clear();
        }
        FileLoader.getInstance(this.d).getCurrentLoadingFiles(this.h);
        FileLoader.getInstance(this.d).getRecentLoadingFiles(this.f26858n);
        for (int i11 = 0; i11 < this.f26856e.size(); i11++) {
            ((MessageObject) this.f26856e.get(i11)).setQuery(null);
        }
        for (int i12 = 0; i12 < this.f26857f.size(); i12++) {
            ((MessageObject) this.f26857f.get(i12)).setQuery(null);
        }
        this.L = null;
        e(this.h, this.f26858n, z10);
        if (this.f26859r == 0) {
            this.f26853a.e(false, false);
            this.f26853a.d.setText(LocaleController.getString(R.string.SearchEmptyViewDownloads));
            this.f26853a.f26557e.setVisibility(8);
        }
        this.f26853a.setStickerType(9);
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
        s4.d1 T;
        go0 go0Var = this.f26855c;
        if (z10) {
            int i10 = this.f26860s;
            int i11 = this.v;
            int i12 = this.f26861w;
            int i13 = this.f26862x;
            int i14 = this.f26863y;
            int i15 = this.E;
            int i16 = this.f26859r;
            ArrayList arrayList3 = new ArrayList(this.f26856e);
            ArrayList arrayList4 = new ArrayList(this.f26857f);
            f(arrayList, arrayList2);
            s4.o.c(new co0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).b(go0Var);
            int i17 = 0;
            while (true) {
                ai.w0 w0Var = this.f26854b;
                if (i17 < w0Var.getChildCount()) {
                    View childAt = w0Var.getChildAt(i17);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = w0Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.v3) {
                            go0Var.v(T, R);
                        } else if (childAt instanceof do0) {
                            org.telegram.ui.Cells.j7 j7Var = ((do0) childAt).f25442a;
                            j7Var.f(true);
                            int id2 = j7Var.getMessage().getId();
                            long dialogId = j7Var.getMessage().getDialogId();
                            org.telegram.ui.q10 q10Var = this.J;
                            q10Var.f41138a = dialogId;
                            q10Var.f41139b = id2;
                            j7Var.b(this.I.c(q10Var), true);
                        }
                    }
                    i17++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            go0Var.l();
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.f26856e;
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
        ArrayList arrayList4 = this.f26857f;
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
        this.f26859r = 0;
        this.f26860s = -1;
        this.v = -1;
        this.f26861w = -1;
        this.f26862x = -1;
        this.f26863y = -1;
        this.E = -1;
        this.H = false;
        if (!arrayList3.isEmpty()) {
            int i13 = this.f26859r;
            int i14 = i13 + 1;
            this.f26859r = i14;
            this.f26860s = i13;
            this.v = i14;
            int size3 = arrayList3.size() + i14;
            this.f26859r = size3;
            this.f26861w = size3;
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
            int i15 = this.f26859r;
            int i16 = i15 + 1;
            this.f26859r = i16;
            this.f26862x = i15;
            this.f26863y = i16;
            int size4 = arrayList4.size() + i16;
            this.f26859r = size4;
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
            Utilities.searchQueue.postRunnable(new cd0(this, 21));
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

    public void setUiCallback(org.telegram.ui.x10 x10Var) {
        this.I = x10Var;
    }
}
