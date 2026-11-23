package org.telegram.ui.Wallet;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.ui.Components.ik;
public final class i1 {
    public final int f44337a;
    public final String f44338b;
    public final u0 f44339c;
    public boolean d;
    public boolean f44340e;
    public String f44341f;
    public int f44342g;
    public int h;
    public int f44344j;
    public rc.u f44345k;
    public long f44346l;
    public int f44343i = -1;
    public final f1 f44347m = new Runnable(this) {
        public final i1 f44172b;

        {
            this.f44172b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f44172b.e();
                    return;
                case 1:
                    i1 i1Var = this.f44172b;
                    if (i1Var.d) {
                        i1Var.d("URL expired; renewing connection");
                        i1Var.b();
                        i1Var.e();
                        return;
                    }
                    return;
                default:
                    this.f44172b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final f1 f44348n = new Runnable(this) {
        public final i1 f44172b;

        {
            this.f44172b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f44172b.e();
                    return;
                case 1:
                    i1 i1Var = this.f44172b;
                    if (i1Var.d) {
                        i1Var.d("URL expired; renewing connection");
                        i1Var.b();
                        i1Var.e();
                        return;
                    }
                    return;
                default:
                    this.f44172b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final f1 f44349o = new Runnable(this) {
        public final i1 f44172b;

        {
            this.f44172b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f44172b.e();
                    return;
                case 1:
                    i1 i1Var = this.f44172b;
                    if (i1Var.d) {
                        i1Var.d("URL expired; renewing connection");
                        i1Var.b();
                        i1Var.e();
                        return;
                    }
                    return;
                default:
                    this.f44172b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final ik f44350p = new ik(this, 26);

    public i1(int i7, String str, u0 u0Var) {
        this.f44337a = i7;
        this.f44338b = str;
        this.f44339c = u0Var;
    }

    public static String a(rc.v vVar) {
        String str;
        com.google.android.gms.internal.clearcut.y0 y0Var;
        switch (vVar.f56571a) {
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
        if ((vVar instanceof rc.n) && (y0Var = ((rc.n) vVar).f56530b) != null) {
            StringBuilder n10 = p5.c.n(str, ", HTTP ");
            n10.append(y0Var.f6959b);
            return n10.toString();
        }
        return str;
    }

    public final void b() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("disconnecting; socket=");
        if (this.f44345k != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", subscribed=");
        sb2.append(this.f44340e);
        sb2.append(", URL request=");
        sb2.append(this.f44343i);
        d(sb2.toString());
        this.h++;
        this.f44340e = false;
        org.telegram.messenger.g0.r(this.f44347m);
        org.telegram.messenger.g0.r(this.f44348n);
        org.telegram.messenger.g0.r(this.f44349o);
        org.telegram.messenger.g0.r(this.f44350p);
        if (this.f44343i >= 0) {
            ConnectionsManager.getInstance(this.f44337a).cancelRequest(this.f44343i, true);
            this.f44343i = -1;
        }
        rc.u uVar = this.f44345k;
        this.f44345k = null;
        if (uVar != null) {
            uVar.c();
        }
    }

    public final boolean c(rc.u uVar, int i7) {
        if (this.d && this.f44345k == uVar && this.h == i7) {
            return true;
        }
        return false;
    }

    public final void d(String str) {
        org.telegram.messenger.a8.b("[gram-wallet-streaming] account=" + this.f44337a + " generation=" + this.h + " " + str);
    }

    public final void e() {
        if (!this.d) {
            return;
        }
        org.telegram.messenger.g0.r(this.f44347m);
        final int i7 = this.h + 1;
        this.h = i7;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        d("requesting streaming URL; retry=" + this.f44344j);
        org.telegram.messenger.g0.h3(this.f44349o, 30000L);
        this.f44343i = ConnectionsManager.getInstance(this.f44337a).sendRequestTyped(new TL_toncenter.getStreamingUrl(), new d3.b(1), new r10() {
            @Override
            public final void a(Object obj, Object obj2) {
                Object valueOf;
                i1 i1Var = i1.this;
                int i10 = i7;
                long j3 = elapsedRealtime;
                TL_toncenter.streamingUrl streamingurl = (TL_toncenter.streamingUrl) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (i1Var.d && i1Var.h == i10) {
                    StringBuilder sb2 = new StringBuilder("URL response after ");
                    sb2.append(SystemClock.elapsedRealtime() - j3);
                    sb2.append(" ms; errorCode=");
                    if (tL_error == null) {
                        valueOf = "none";
                    } else {
                        valueOf = Integer.valueOf(tL_error.code);
                    }
                    sb2.append(valueOf);
                    i1Var.d(sb2.toString());
                    i1Var.f44343i = -1;
                    org.telegram.messenger.g0.r(i1Var.f44349o);
                    if (streamingurl != null && !TextUtils.isEmpty(streamingurl.url)) {
                        long currentTime = (streamingurl.expires - ConnectionsManager.getInstance(i1Var.f44337a).getCurrentTime()) * 1000;
                        i1Var.d("URL expires=" + streamingurl.expires + ", remaining=" + currentTime + " ms");
                        if (currentTime <= 0) {
                            i1Var.f("received expired streaming URL");
                            return;
                        }
                        org.telegram.messenger.g0.h3(i1Var.f44348n, currentTime);
                        String str = streamingurl.url;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        i1Var.d("opening websocket; attempt=" + i10);
                        try {
                            b3.j jVar = new b3.j(15, (short) 0);
                            jVar.f2872b = 10000;
                            rc.u h = jVar.h(str);
                            i1Var.f44345k = h;
                            h1 h1Var = new h1(i1Var, i10, elapsedRealtime2);
                            ab.q qVar = h.d;
                            synchronized (((ArrayList) qVar.f989c)) {
                                ((ArrayList) qVar.f989c).add(h1Var);
                                qVar.f987a = true;
                            }
                            org.telegram.messenger.g0.h3(i1Var.f44349o, 30000L);
                            rc.u uVar = i1Var.f44345k;
                            uVar.getClass();
                            rc.b bVar = new rc.b("ConnectThread", uVar, 3, 0);
                            ab.q qVar2 = uVar.d;
                            if (qVar2 != null) {
                                ArrayList arrayList = (ArrayList) qVar2.p();
                                int size = arrayList.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    Object obj3 = arrayList.get(i11);
                                    i11++;
                                    h1 h1Var2 = (h1) obj3;
                                    try {
                                        try {
                                            h1Var2.getClass();
                                        } catch (Throwable unused) {
                                            h1Var2.getClass();
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                            bVar.start();
                            return;
                        } catch (Exception e10) {
                            i1Var.f("could not open websocket: ".concat(e10.getClass().getSimpleName()));
                            return;
                        }
                    }
                    i1Var.f("could not obtain streaming URL");
                    return;
                }
                i1Var.d("ignoring stale URL response; attempt=" + i10);
            }
        });
    }

    public final void f(String str) {
        if (!this.d) {
            return;
        }
        b();
        int i7 = this.f44344j;
        this.f44344j = i7 + 1;
        long min = Math.min(30000L, 1000 << Math.min(i7, 5)) + ((long) (Math.random() * 500.0d));
        d(str + "; retrying in " + min + " ms");
        org.telegram.messenger.g0.h3(this.f44347m, min);
    }

    public final void g(String str) {
        d("send -> " + str);
        rc.u uVar = this.f44345k;
        uVar.getClass();
        ?? obj = new Object();
        obj.f56574a = true;
        obj.f56577e = 1;
        if (str != null && str.length() != 0) {
            obj.c(rc.k.a(str));
        } else {
            obj.f56579g = null;
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
