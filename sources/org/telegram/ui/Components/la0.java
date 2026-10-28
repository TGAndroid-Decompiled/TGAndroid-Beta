package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class la0 extends a8.bc {
    public int f30214a;
    public final TL_iv.PageBlock f30215b;
    public TL_iv.textConcat f30216c = new TL_iv.textConcat();

    public la0(TL_iv.PageBlock pageBlock) {
        this.f30215b = pageBlock;
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
    public final void a(ef.b bVar) {
        int i10 = this.f30214a;
        if (i10 >= 64) {
            return;
        }
        this.f30214a = i10 + 1;
        try {
            v(bVar);
        } finally {
            this.f30214a--;
        }
    }

    @Override
    public final void b(ef.c cVar) {
        int i10 = this.f30214a;
        if (i10 >= 64) {
            return;
        }
        this.f30214a = i10 + 1;
        try {
            v(cVar);
        } finally {
            this.f30214a--;
        }
    }

    @Override
    public final void c(ef.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = oa0.j(dVar.h);
        w(textfixed);
    }

    @Override
    public final void d(ef.e eVar) {
        if (eVar instanceof xe.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof cd.d) {
            w(oa0.c(((cd.d) eVar).f6199g));
        } else {
            v(eVar);
        }
    }

    @Override
    public final void e(ef.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override
    public final void i(ef.k kVar) {
        w(y(kVar));
    }

    @Override
    public final void k(ef.n nVar) {
        if (nVar instanceof cd.a) {
            if (!this.f30216c.texts.isEmpty()) {
                w(oa0.j("\n"));
            }
            w(oa0.c(((cd.a) nVar).f6195g));
            w(oa0.j("\n"));
            return;
        }
        v(nVar);
    }

    @Override
    public final void l(ef.o oVar) {
        int i10 = this.f30214a;
        if (i10 >= 64) {
            return;
        }
        this.f30214a = i10 + 1;
        try {
            v(oVar);
        } finally {
            this.f30214a--;
        }
    }

    @Override
    public final void m(ef.q qVar) {
        int i10 = this.f30214a;
        if (i10 >= 64) {
            return;
        }
        this.f30214a = i10 + 1;
        try {
            v(qVar);
        } finally {
            this.f30214a--;
        }
    }

    @Override
    public final void n(ef.r rVar) {
        if (!this.f30216c.texts.isEmpty()) {
            w(oa0.j("\n\n"));
        }
        v(rVar);
    }

    @Override
    public final void o(ef.s sVar) {
        w(oa0.j(sVar.f9940g));
    }

    @Override
    public final void q(ef.d dVar) {
        w(oa0.j(dVar.h));
    }

    @Override
    public final void r(ef.g gVar) {
        w(oa0.j("\n"));
    }

    @Override
    public final void s(ef.k kVar) {
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
    public final void t(ef.g gVar) {
        String str;
        if (this.f30215b instanceof TL_iv.pageBlockBlockquote) {
            str = "\n";
        } else {
            str = " ";
        }
        w(oa0.j(str));
    }

    @Override
    public final void u(ef.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.f30216c.texts.add(richText);
    }

    public final TL_iv.RichText y(ef.p pVar) {
        TL_iv.textConcat textconcat = this.f30216c;
        this.f30216c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText x9 = x(this.f30216c);
        this.f30216c = textconcat;
        return x9;
    }
}
