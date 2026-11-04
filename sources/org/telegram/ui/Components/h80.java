package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class h80 extends b8.lc {
    public int f34341a;
    public final TL_iv.PageBlock f34342b;
    public TL_iv.textConcat f34343c = new TL_iv.textConcat();

    public h80(TL_iv.PageBlock pageBlock) {
        this.f34342b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        if (textconcat.texts.isEmpty()) {
            return new TL_iv.textEmpty();
        }
        if (textconcat.texts.size() == 1) {
            return textconcat.texts.get(0);
        }
        return textconcat;
    }

    @Override
    public final void a(gf.b bVar) {
        int i3 = this.f34341a;
        if (i3 >= 64) {
            return;
        }
        this.f34341a = i3 + 1;
        try {
            v(bVar);
        } finally {
            this.f34341a--;
        }
    }

    @Override
    public final void b(gf.c cVar) {
        int i3 = this.f34341a;
        if (i3 >= 64) {
            return;
        }
        this.f34341a = i3 + 1;
        try {
            v(cVar);
        } finally {
            this.f34341a--;
        }
    }

    @Override
    public final void c(gf.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = k80.n(dVar.h);
        w(textfixed);
    }

    @Override
    public final void d(gf.e eVar) {
        if (eVar instanceof ze.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof wc.d) {
            w(k80.c(((wc.d) eVar).f57456g));
        } else {
            v(eVar);
        }
    }

    @Override
    public final void e(gf.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override
    public final void i(gf.k kVar) {
        w(y(kVar));
    }

    @Override
    public final void k(gf.n nVar) {
        if (nVar instanceof wc.a) {
            if (!this.f34343c.texts.isEmpty()) {
                w(k80.n("\n"));
            }
            w(k80.c(((wc.a) nVar).f57451g));
            w(k80.n("\n"));
            return;
        }
        v(nVar);
    }

    @Override
    public final void l(gf.o oVar) {
        int i3 = this.f34341a;
        if (i3 >= 64) {
            return;
        }
        this.f34341a = i3 + 1;
        try {
            v(oVar);
        } finally {
            this.f34341a--;
        }
    }

    @Override
    public final void m(gf.q qVar) {
        int i3 = this.f34341a;
        if (i3 >= 64) {
            return;
        }
        this.f34341a = i3 + 1;
        try {
            v(qVar);
        } finally {
            this.f34341a--;
        }
    }

    @Override
    public final void n(gf.r rVar) {
        if (!this.f34343c.texts.isEmpty()) {
            w(k80.n("\n\n"));
        }
        v(rVar);
    }

    @Override
    public final void o(gf.s sVar) {
        w(k80.n(sVar.f12271g));
    }

    @Override
    public final void q(gf.d dVar) {
        w(k80.n(dVar.h));
    }

    @Override
    public final void r(gf.g gVar) {
        w(k80.n("\n"));
    }

    @Override
    public final void s(gf.k kVar) {
        String str = kVar.h;
        if (str == null) {
            str = "";
        }
        String trim = str.trim();
        if (trim.startsWith("mailto:")) {
            TL_iv.RichText textemail = new TL_iv.textEmail();
            textemail.text = y(kVar);
            textemail.email = trim.substring(7);
            w(textemail);
        } else if (trim.startsWith("tel:")) {
            TL_iv.textPhone textphone = new TL_iv.textPhone();
            textphone.text = y(kVar);
            textphone.phone = trim.substring(4);
            w(textphone);
        } else {
            TL_iv.RichText texturl = new TL_iv.textUrl();
            texturl.text = y(kVar);
            texturl.url = trim;
            w(texturl);
        }
    }

    @Override
    public final void t(gf.g gVar) {
        String str;
        if (this.f34342b instanceof TL_iv.pageBlockBlockquote) {
            str = "\n";
        } else {
            str = " ";
        }
        w(k80.n(str));
    }

    @Override
    public final void u(gf.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.f34343c.texts.add(richText);
    }

    public final TL_iv.RichText y(gf.p pVar) {
        TL_iv.textConcat textconcat = this.f34343c;
        this.f34343c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText x10 = x(this.f34343c);
        this.f34343c = textconcat;
        return x10;
    }
}
