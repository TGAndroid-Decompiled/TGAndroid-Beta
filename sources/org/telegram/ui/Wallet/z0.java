package org.telegram.ui.Wallet;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.k20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.ui.Components.ew;
public final class z0 {
    public final int f35438a;
    public final String f35439b;
    public final k0 f35440c;
    public boolean d;
    public boolean e;
    public String f35441f;
    public int f35442g;
    public int h;
    public int f35444j;
    public lc.v f35445k;
    public long f35446l;
    public int f35443i = -1;
    public final v0 f35447m = new Runnable(this) {
        public final z0 f35302b;

        {
            this.f35302b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f35302b.e();
                    return;
                case 1:
                    z0 z0Var = this.f35302b;
                    if (z0Var.d) {
                        z0Var.d("URL expired; renewing connection");
                        z0Var.b();
                        z0Var.e();
                        return;
                    }
                    return;
                default:
                    this.f35302b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final v0 f35448n = new Runnable(this) {
        public final z0 f35302b;

        {
            this.f35302b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f35302b.e();
                    return;
                case 1:
                    z0 z0Var = this.f35302b;
                    if (z0Var.d) {
                        z0Var.d("URL expired; renewing connection");
                        z0Var.b();
                        z0Var.e();
                        return;
                    }
                    return;
                default:
                    this.f35302b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final v0 f35449o = new Runnable(this) {
        public final z0 f35302b;

        {
            this.f35302b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f35302b.e();
                    return;
                case 1:
                    z0 z0Var = this.f35302b;
                    if (z0Var.d) {
                        z0Var.d("URL expired; renewing connection");
                        z0Var.b();
                        z0Var.e();
                        return;
                    }
                    return;
                default:
                    this.f35302b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final ew f35450p = new ew(this, 17);

    public z0(int i10, String str, k0 k0Var) {
        this.f35438a = i10;
        this.f35439b = str;
        this.f35440c = k0Var;
    }

    public static String a(lc.w wVar) {
        String str;
        ba.a aVar;
        switch (wVar.f11797a) {
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
        if ((wVar instanceof lc.n) && (aVar = ((lc.n) wVar).f11760b) != null) {
            StringBuilder i10 = sc.e.i(str, ", HTTP ");
            i10.append(aVar.f2519c);
            return i10.toString();
        }
        return str;
    }

    public final void b() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("disconnecting; socket=");
        if (this.f35445k != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", subscribed=");
        sb2.append(this.e);
        sb2.append(", URL request=");
        sb2.append(this.f35443i);
        d(sb2.toString());
        this.h++;
        this.e = false;
        org.telegram.messenger.i0.r(this.f35447m);
        org.telegram.messenger.i0.r(this.f35448n);
        org.telegram.messenger.i0.r(this.f35449o);
        org.telegram.messenger.i0.r(this.f35450p);
        if (this.f35443i >= 0) {
            ConnectionsManager.getInstance(this.f35438a).cancelRequest(this.f35443i, true);
            this.f35443i = -1;
        }
        lc.v vVar = this.f35445k;
        this.f35445k = null;
        if (vVar != null) {
            vVar.c();
        }
    }

    public final boolean c(lc.v vVar, int i10) {
        if (this.d && this.f35445k == vVar && this.h == i10) {
            return true;
        }
        return false;
    }

    public final void d(String str) {
        org.telegram.messenger.f8.b("[gram-wallet-streaming] account=" + this.f35438a + " generation=" + this.h + " " + str);
    }

    public final void e() {
        if (!this.d) {
            return;
        }
        org.telegram.messenger.i0.r(this.f35447m);
        final int i10 = this.h + 1;
        this.h = i10;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        d("requesting streaming URL; retry=" + this.f35444j);
        org.telegram.messenger.i0.h3(this.f35449o, 30000L);
        this.f35443i = ConnectionsManager.getInstance(this.f35438a).sendRequestTyped(new TL_toncenter.getStreamingUrl(), new a3.b(1), new k20() {
            @Override
            public final void a(Object obj, Object obj2) {
                Object valueOf;
                z0 z0Var = z0.this;
                int i11 = i10;
                long j10 = elapsedRealtime;
                TL_toncenter.streamingUrl streamingurl = (TL_toncenter.streamingUrl) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (z0Var.d && z0Var.h == i11) {
                    StringBuilder sb2 = new StringBuilder("URL response after ");
                    sb2.append(SystemClock.elapsedRealtime() - j10);
                    sb2.append(" ms; errorCode=");
                    if (tL_error == null) {
                        valueOf = "none";
                    } else {
                        valueOf = Integer.valueOf(tL_error.code);
                    }
                    sb2.append(valueOf);
                    z0Var.d(sb2.toString());
                    z0Var.f35443i = -1;
                    org.telegram.messenger.i0.r(z0Var.f35449o);
                    if (streamingurl != null && !TextUtils.isEmpty(streamingurl.url)) {
                        long currentTime = (streamingurl.expires - ConnectionsManager.getInstance(z0Var.f35438a).getCurrentTime()) * 1000;
                        z0Var.d("URL expires=" + streamingurl.expires + ", remaining=" + currentTime + " ms");
                        if (currentTime <= 0) {
                            z0Var.f("received expired streaming URL");
                            return;
                        }
                        org.telegram.messenger.i0.h3(z0Var.f35448n, currentTime);
                        String str = streamingurl.url;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        z0Var.d("opening websocket; attempt=" + i11);
                        try {
                            c5.x xVar = new c5.x(9, (short) 0);
                            xVar.f3827b = 10000;
                            lc.v h = xVar.h(str);
                            z0Var.f35445k = h;
                            y0 y0Var = new y0(z0Var, i11, elapsedRealtime2);
                            ac.a aVar = h.d;
                            synchronized (((ArrayList) aVar.f364c)) {
                                ((ArrayList) aVar.f364c).add(y0Var);
                                aVar.f362a = true;
                            }
                            org.telegram.messenger.i0.h3(z0Var.f35449o, 30000L);
                            lc.v vVar = z0Var.f35445k;
                            vVar.getClass();
                            lc.b bVar = new lc.b("ConnectThread", vVar, 3, 0);
                            ac.a aVar2 = vVar.d;
                            if (aVar2 != null) {
                                ArrayList arrayList = (ArrayList) aVar2.o();
                                int size = arrayList.size();
                                int i12 = 0;
                                while (i12 < size) {
                                    Object obj3 = arrayList.get(i12);
                                    i12++;
                                    y0 y0Var2 = (y0) obj3;
                                    try {
                                        try {
                                            y0Var2.getClass();
                                        } catch (Throwable unused) {
                                            y0Var2.getClass();
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                            bVar.start();
                            return;
                        } catch (Exception e) {
                            z0Var.f("could not open websocket: ".concat(e.getClass().getSimpleName()));
                            return;
                        }
                    }
                    z0Var.f("could not obtain streaming URL");
                    return;
                }
                z0Var.d("ignoring stale URL response; attempt=" + i11);
            }
        });
    }

    public final void f(String str) {
        if (!this.d) {
            return;
        }
        b();
        int i10 = this.f35444j;
        this.f35444j = i10 + 1;
        long min = Math.min(30000L, 1000 << Math.min(i10, 5)) + ((long) (Math.random() * 500.0d));
        d(str + "; retrying in " + min + " ms");
        org.telegram.messenger.i0.h3(this.f35447m, min);
    }

    public final void g(String str) {
        d("send -> " + str);
        lc.v vVar = this.f35445k;
        vVar.getClass();
        ?? obj = new Object();
        obj.f11800a = true;
        obj.e = 1;
        if (str != null && str.length() != 0) {
            obj.c(lc.k.a(str));
        } else {
            obj.f11804g = null;
        }
        vVar.g(obj);
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
