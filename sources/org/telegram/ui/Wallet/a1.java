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
    public final int f33971a;
    public final String f33972b;
    public final m0 f33973c;
    public boolean d;
    public boolean e;
    public String f33974f;
    public int f33975g;
    public int h;
    public int f33977j;
    public tc.u f33978k;
    public long f33979l;
    public int f33976i = -1;
    public final x0 f33980m = new Runnable(this) {
        public final a1 f35086b;

        {
            this.f35086b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f35086b.e();
                    return;
                case 1:
                    a1 a1Var = this.f35086b;
                    if (a1Var.d) {
                        a1Var.d("URL expired; renewing connection");
                        a1Var.b();
                        a1Var.e();
                        return;
                    }
                    return;
                default:
                    this.f35086b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final x0 f33981n = new Runnable(this) {
        public final a1 f35086b;

        {
            this.f35086b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f35086b.e();
                    return;
                case 1:
                    a1 a1Var = this.f35086b;
                    if (a1Var.d) {
                        a1Var.d("URL expired; renewing connection");
                        a1Var.b();
                        a1Var.e();
                        return;
                    }
                    return;
                default:
                    this.f35086b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final x0 f33982o = new Runnable(this) {
        public final a1 f35086b;

        {
            this.f35086b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f35086b.e();
                    return;
                case 1:
                    a1 a1Var = this.f35086b;
                    if (a1Var.d) {
                        a1Var.d("URL expired; renewing connection");
                        a1Var.b();
                        a1Var.e();
                        return;
                    }
                    return;
                default:
                    this.f35086b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final org.telegram.ui.Cells.k7 f33983p = new org.telegram.ui.Cells.k7(this, 26);

    public a1(int i10, String str, m0 m0Var) {
        this.f33971a = i10;
        this.f33972b = str;
        this.f33973c = m0Var;
    }

    public static String a(tc.v vVar) {
        String str;
        ba.a aVar;
        switch (vVar.f46991a) {
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
        if ((vVar instanceof tc.n) && (aVar = ((tc.n) vVar).f46955b) != null) {
            StringBuilder i10 = r4.c.i(str, ", HTTP ");
            i10.append(aVar.f4227c);
            return i10.toString();
        }
        return str;
    }

    public final void b() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("disconnecting; socket=");
        if (this.f33978k != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", subscribed=");
        sb2.append(this.e);
        sb2.append(", URL request=");
        sb2.append(this.f33976i);
        d(sb2.toString());
        this.h++;
        this.e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f33980m);
        AndroidUtilities.cancelRunOnUIThread(this.f33981n);
        AndroidUtilities.cancelRunOnUIThread(this.f33982o);
        AndroidUtilities.cancelRunOnUIThread(this.f33983p);
        if (this.f33976i >= 0) {
            ConnectionsManager.getInstance(this.f33971a).cancelRequest(this.f33976i, true);
            this.f33976i = -1;
        }
        tc.u uVar = this.f33978k;
        this.f33978k = null;
        if (uVar != null) {
            uVar.c();
        }
    }

    public final boolean c(tc.u uVar, int i10) {
        if (this.d && this.f33978k == uVar && this.h == i10) {
            return true;
        }
        return false;
    }

    public final void d(String str) {
        FileLog.d("[gram-wallet-streaming] account=" + this.f33971a + " generation=" + this.h + " " + str);
    }

    public final void e() {
        if (!this.d) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f33980m);
        final int i10 = this.h + 1;
        this.h = i10;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        d("requesting streaming URL; retry=" + this.f33977j);
        AndroidUtilities.runOnUIThread(this.f33982o, 30000L);
        this.f33976i = ConnectionsManager.getInstance(this.f33971a).sendRequestTyped(new TL_toncenter.getStreamingUrl(), new Object(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                Object valueOf;
                a1 a1Var = a1.this;
                int i11 = i10;
                long j10 = elapsedRealtime;
                TL_toncenter.streamingUrl streamingurl = (TL_toncenter.streamingUrl) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (a1Var.d && a1Var.h == i11) {
                    StringBuilder sb2 = new StringBuilder("URL response after ");
                    sb2.append(SystemClock.elapsedRealtime() - j10);
                    sb2.append(" ms; errorCode=");
                    if (tL_error == null) {
                        valueOf = "none";
                    } else {
                        valueOf = Integer.valueOf(tL_error.code);
                    }
                    sb2.append(valueOf);
                    a1Var.d(sb2.toString());
                    a1Var.f33976i = -1;
                    AndroidUtilities.cancelRunOnUIThread(a1Var.f33982o);
                    if (streamingurl != null && !TextUtils.isEmpty(streamingurl.url)) {
                        long currentTime = (streamingurl.expires - ConnectionsManager.getInstance(a1Var.f33971a).getCurrentTime()) * 1000;
                        a1Var.d("URL expires=" + streamingurl.expires + ", remaining=" + currentTime + " ms");
                        if (currentTime <= 0) {
                            a1Var.f("received expired streaming URL");
                            return;
                        }
                        AndroidUtilities.runOnUIThread(a1Var.f33981n, currentTime);
                        String str = streamingurl.url;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        a1Var.d("opening websocket; attempt=" + i11);
                        try {
                            c5.c0 c0Var = new c5.c0(13, (short) 0);
                            c0Var.f4723b = 10000;
                            tc.u j11 = c0Var.j(str);
                            a1Var.f33978k = j11;
                            z0 z0Var = new z0(a1Var, i11, elapsedRealtime2);
                            c2.b bVar = j11.d;
                            synchronized (((ArrayList) bVar.f4491c)) {
                                ((ArrayList) bVar.f4491c).add(z0Var);
                                bVar.f4489a = true;
                            }
                            AndroidUtilities.runOnUIThread(a1Var.f33982o, 30000L);
                            tc.u uVar = a1Var.f33978k;
                            uVar.getClass();
                            tc.b bVar2 = new tc.b("ConnectThread", uVar, 3, 0);
                            c2.b bVar3 = uVar.d;
                            if (bVar3 != null) {
                                ArrayList arrayList = (ArrayList) bVar3.n();
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
                            bVar2.start();
                            return;
                        } catch (Exception e) {
                            a1Var.f("could not open websocket: ".concat(e.getClass().getSimpleName()));
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
        int i10 = this.f33977j;
        this.f33977j = i10 + 1;
        long min = Math.min(30000L, 1000 << Math.min(i10, 5)) + ((long) (Math.random() * 500.0d));
        d(str + "; retrying in " + min + " ms");
        AndroidUtilities.runOnUIThread(this.f33980m, min);
    }

    public final void g(String str) {
        d("send -> " + str);
        tc.u uVar = this.f33978k;
        uVar.getClass();
        ?? obj = new Object();
        obj.f46994a = true;
        obj.e = 1;
        if (str != null && str.length() != 0) {
            obj.c(tc.k.a(str));
        } else {
            obj.f46998g = null;
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
