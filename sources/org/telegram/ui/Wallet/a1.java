package org.telegram.ui.Wallet;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
public final class a1 {
    public final int f34668a;
    public final String f34669b;
    public final l0 f34670c;
    public boolean d;
    public boolean f34671e;
    public String f34672f;
    public int f34673g;
    public int h;
    public int f34675j;
    public sc.u f34676k;
    public long f34677l;
    public int f34674i = -1;
    public final x0 f34678m = new Runnable(this) {
        public final a1 f35716b;

        {
            this.f35716b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f35716b.e();
                    return;
                case 1:
                    a1 a1Var = this.f35716b;
                    if (a1Var.d) {
                        a1Var.d("URL expired; renewing connection");
                        a1Var.b();
                        a1Var.e();
                        return;
                    }
                    return;
                default:
                    this.f35716b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final x0 f34679n = new Runnable(this) {
        public final a1 f35716b;

        {
            this.f35716b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f35716b.e();
                    return;
                case 1:
                    a1 a1Var = this.f35716b;
                    if (a1Var.d) {
                        a1Var.d("URL expired; renewing connection");
                        a1Var.b();
                        a1Var.e();
                        return;
                    }
                    return;
                default:
                    this.f35716b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final x0 f34680o = new Runnable(this) {
        public final a1 f35716b;

        {
            this.f35716b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f35716b.e();
                    return;
                case 1:
                    a1 a1Var = this.f35716b;
                    if (a1Var.d) {
                        a1Var.d("URL expired; renewing connection");
                        a1Var.b();
                        a1Var.e();
                        return;
                    }
                    return;
                default:
                    this.f35716b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final org.telegram.ui.Cells.t6 f34681p = new org.telegram.ui.Cells.t6(this, 27);

    public a1(int i10, String str, l0 l0Var) {
        this.f34668a = i10;
        this.f34669b = str;
        this.f34670c = l0Var;
    }

    public static String a(sc.w wVar) {
        String str;
        aa.b bVar;
        switch (wVar.f48082a) {
            case 1:
                str = "NOT_IN_CREATED_STATE";
                break;
            case 2:
                str = "SOCKET_INPUT_STREAM_FAILURE";
                break;
            case 3:
                str = "SOCKET_OUTPUT_STREAM_FAILURE";
                break;
            case 4:
                str = "OPENING_HAHDSHAKE_REQUEST_FAILURE";
                break;
            case 5:
                str = "OPENING_HANDSHAKE_RESPONSE_FAILURE";
                break;
            case 6:
                str = "STATUS_LINE_EMPTY";
                break;
            case 7:
                str = "STATUS_LINE_BAD_FORMAT";
                break;
            case 8:
                str = "NOT_SWITCHING_PROTOCOLS";
                break;
            case 9:
                str = "HTTP_HEADER_FAILURE";
                break;
            case 10:
                str = "NO_UPGRADE_HEADER";
                break;
            case 11:
                str = "NO_WEBSOCKET_IN_UPGRADE_HEADER";
                break;
            case 12:
                str = "NO_CONNECTION_HEADER";
                break;
            case 13:
                str = "NO_UPGRADE_IN_CONNECTION_HEADER";
                break;
            case 14:
                str = "NO_SEC_WEBSOCKET_ACCEPT_HEADER";
                break;
            case 15:
                str = "UNEXPECTED_SEC_WEBSOCKET_ACCEPT_HEADER";
                break;
            case 16:
                str = "EXTENSION_PARSE_ERROR";
                break;
            case 17:
                str = "UNSUPPORTED_EXTENSION";
                break;
            case 18:
                str = "EXTENSIONS_CONFLICT";
                break;
            case 19:
                str = "UNSUPPORTED_PROTOCOL";
                break;
            case 20:
                str = "INSUFFICENT_DATA";
                break;
            case 21:
                str = "INVALID_PAYLOAD_LENGTH";
                break;
            case 22:
                str = "TOO_LONG_PAYLOAD";
                break;
            case 23:
                str = "INSUFFICIENT_MEMORY_FOR_PAYLOAD";
                break;
            case 24:
                str = "INTERRUPTED_IN_READING";
                break;
            case 25:
                str = "IO_ERROR_IN_READING";
                break;
            case 26:
                str = "IO_ERROR_IN_WRITING";
                break;
            case 27:
                str = "FLUSH_ERROR";
                break;
            case 28:
                str = "NON_ZERO_RESERVED_BITS";
                break;
            case 29:
                str = "UNEXPECTED_RESERVED_BIT";
                break;
            case 30:
                str = "FRAME_MASKED";
                break;
            case 31:
                str = "UNKNOWN_OPCODE";
                break;
            case 32:
                str = "FRAGMENTED_CONTROL_FRAME";
                break;
            case 33:
                str = "UNEXPECTED_CONTINUATION_FRAME";
                break;
            case 34:
                str = "CONTINUATION_NOT_CLOSED";
                break;
            case 35:
                str = "TOO_LONG_CONTROL_FRAME_PAYLOAD";
                break;
            case 36:
                str = "MESSAGE_CONSTRUCTION_ERROR";
                break;
            case 37:
                str = "TEXT_MESSAGE_CONSTRUCTION_ERROR";
                break;
            case 38:
                str = "UNEXPECTED_ERROR_IN_READING_THREAD";
                break;
            case 39:
                str = "UNEXPECTED_ERROR_IN_WRITING_THREAD";
                break;
            case 40:
                str = "PERMESSAGE_DEFLATE_UNSUPPORTED_PARAMETER";
                break;
            case 41:
                str = "PERMESSAGE_DEFLATE_INVALID_MAX_WINDOW_BITS";
                break;
            case 42:
                str = "COMPRESSION_ERROR";
                break;
            case 43:
                str = "DECOMPRESSION_ERROR";
                break;
            case 44:
                str = "SOCKET_CONNECT_ERROR";
                break;
            case 45:
                str = "PROXY_HANDSHAKE_ERROR";
                break;
            case 46:
                str = "SOCKET_OVERLAY_ERROR";
                break;
            case 47:
                str = "SSL_HANDSHAKE_ERROR";
                break;
            case 48:
                str = "NO_MORE_FRAME";
                break;
            case 49:
                str = "HOSTNAME_UNVERIFIED";
                break;
            default:
                str = "null";
                break;
        }
        if ((wVar instanceof sc.n) && (bVar = ((sc.n) wVar).f48041b) != null) {
            StringBuilder j3 = sc.v.j(str, ", HTTP ");
            j3.append(bVar.f388c);
            return j3.toString();
        }
        return str;
    }

    public final void b() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("disconnecting; socket=");
        if (this.f34676k != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", subscribed=");
        sb2.append(this.f34671e);
        sb2.append(", URL request=");
        sb2.append(this.f34674i);
        d(sb2.toString());
        this.h++;
        this.f34671e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f34678m);
        AndroidUtilities.cancelRunOnUIThread(this.f34679n);
        AndroidUtilities.cancelRunOnUIThread(this.f34680o);
        AndroidUtilities.cancelRunOnUIThread(this.f34681p);
        if (this.f34674i >= 0) {
            ConnectionsManager.getInstance(this.f34668a).cancelRequest(this.f34674i, true);
            this.f34674i = -1;
        }
        sc.u uVar = this.f34676k;
        this.f34676k = null;
        if (uVar != null) {
            uVar.c();
        }
    }

    public final boolean c(sc.u uVar, int i10) {
        if (this.d && this.f34676k == uVar && this.h == i10) {
            return true;
        }
        return false;
    }

    public final void d(String str) {
        FileLog.d("[gram-wallet-streaming] account=" + this.f34668a + " generation=" + this.h + " " + str);
    }

    public final void e() {
        if (!this.d) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f34678m);
        final int i10 = this.h + 1;
        this.h = i10;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        d("requesting streaming URL; retry=" + this.f34675j);
        AndroidUtilities.runOnUIThread(this.f34680o, 30000L);
        this.f34674i = ConnectionsManager.getInstance(this.f34668a).sendRequestTyped(new TL_toncenter.getStreamingUrl(), new Object(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                Object valueOf;
                a1 a1Var = a1.this;
                int i11 = i10;
                long j3 = elapsedRealtime;
                TL_toncenter.streamingUrl streamingurl = (TL_toncenter.streamingUrl) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (a1Var.d && a1Var.h == i11) {
                    StringBuilder sb2 = new StringBuilder("URL response after ");
                    sb2.append(SystemClock.elapsedRealtime() - j3);
                    sb2.append(" ms; errorCode=");
                    if (tL_error == null) {
                        valueOf = "none";
                    } else {
                        valueOf = Integer.valueOf(tL_error.code);
                    }
                    sb2.append(valueOf);
                    a1Var.d(sb2.toString());
                    a1Var.f34674i = -1;
                    AndroidUtilities.cancelRunOnUIThread(a1Var.f34680o);
                    if (streamingurl != null && !TextUtils.isEmpty(streamingurl.url)) {
                        long currentTime = (streamingurl.expires - ConnectionsManager.getInstance(a1Var.f34668a).getCurrentTime()) * 1000;
                        a1Var.d("URL expires=" + streamingurl.expires + ", remaining=" + currentTime + " ms");
                        if (currentTime <= 0) {
                            a1Var.f("received expired streaming URL");
                            return;
                        }
                        AndroidUtilities.runOnUIThread(a1Var.f34679n, currentTime);
                        String str = streamingurl.url;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        a1Var.d("opening websocket; attempt=" + i11);
                        try {
                            c5.b0 b0Var = new c5.b0(10, (short) 0);
                            b0Var.f4202b = 10000;
                            sc.u f7 = b0Var.f(str);
                            a1Var.f34676k = f7;
                            z0 z0Var = new z0(a1Var, i11, elapsedRealtime2);
                            com.google.firebase.messaging.m mVar = f7.d;
                            synchronized (((ArrayList) mVar.f7952c)) {
                                ((ArrayList) mVar.f7952c).add(z0Var);
                                mVar.f7950a = true;
                            }
                            AndroidUtilities.runOnUIThread(a1Var.f34680o, 30000L);
                            sc.u uVar = a1Var.f34676k;
                            uVar.getClass();
                            sc.b bVar = new sc.b("ConnectThread", uVar, 3, 0);
                            com.google.firebase.messaging.m mVar2 = uVar.d;
                            if (mVar2 != null) {
                                ArrayList arrayList = (ArrayList) mVar2.n();
                                int size = arrayList.size();
                                int i12 = 0;
                                while (i12 < size) {
                                    Object obj3 = arrayList.get(i12);
                                    i12++;
                                    z0 z0Var2 = (z0) obj3;
                                    try {
                                        try {
                                            z0Var2.getClass();
                                        } catch (Throwable unused) {
                                            z0Var2.getClass();
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                            bVar.start();
                            return;
                        } catch (Exception e7) {
                            a1Var.f("could not open websocket: ".concat(e7.getClass().getSimpleName()));
                            return;
                        }
                    }
                    a1Var.f("could not obtain streaming URL");
                    return;
                }
                a1Var.d("ignoring stale URL response; attempt=" + i11);
            }
        });
    }

    public final void f(String str) {
        if (!this.d) {
            return;
        }
        b();
        int i10 = this.f34675j;
        this.f34675j = i10 + 1;
        long min = Math.min(30000L, 1000 << Math.min(i10, 5)) + ((long) (Math.random() * 500.0d));
        d(str + "; retrying in " + min + " ms");
        AndroidUtilities.runOnUIThread(this.f34678m, min);
    }

    public final void g(String str) {
        d("send -> " + str);
        sc.u uVar = this.f34676k;
        uVar.getClass();
        ?? obj = new Object();
        obj.f48085a = true;
        obj.f48088e = 1;
        if (str != null && str.length() != 0) {
            obj.c(sc.k.a(str));
        } else {
            obj.f48090g = null;
        }
        uVar.g(obj);
    }

    public final void h() {
        if (!this.d) {
            return;
        }
        d("stopping");
        this.d = false;
        b();
    }
}
