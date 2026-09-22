package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class n90 extends v7.i0 {
    public int f26400a;
    public final TL_iv.PageBlock f26401b;
    public TL_iv.textConcat f26402c = new TL_iv.textConcat();

    public n90(TL_iv.PageBlock pageBlock) {
        this.f26401b = pageBlock;
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
    public final void a(bf.b bVar) {
        int i10 = this.f26400a;
        if (i10 >= 64) {
            return;
        }
        this.f26400a = i10 + 1;
        try {
            v(bVar);
        } finally {
            this.f26400a--;
        }
    }

    @Override
    public final void b(bf.c cVar) {
        int i10 = this.f26400a;
        if (i10 >= 64) {
            return;
        }
        this.f26400a = i10 + 1;
        try {
            v(cVar);
        } finally {
            this.f26400a--;
        }
    }

    @Override
    public final void c(bf.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = q90.j(dVar.h);
        w(textfixed);
    }

    @Override
    public final void d(bf.e eVar) {
        if (eVar instanceof ue.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof zc.d) {
            w(q90.c(((zc.d) eVar).f48857g));
        } else {
            v(eVar);
        }
    }

    @Override
    public final void e(bf.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override
    public final void i(bf.k kVar) {
        w(y(kVar));
    }

    @Override
    public final void k(bf.n nVar) {
        if (nVar instanceof zc.a) {
            if (!this.f26402c.texts.isEmpty()) {
                w(q90.j("\n"));
            }
            w(q90.c(((zc.a) nVar).f48853g));
            w(q90.j("\n"));
            return;
        }
        v(nVar);
    }

    @Override
    public final void l(bf.o oVar) {
        int i10 = this.f26400a;
        if (i10 >= 64) {
            return;
        }
        this.f26400a = i10 + 1;
        try {
            v(oVar);
        } finally {
            this.f26400a--;
        }
    }

    @Override
    public final void m(bf.q qVar) {
        int i10 = this.f26400a;
        if (i10 >= 64) {
            return;
        }
        this.f26400a = i10 + 1;
        try {
            v(qVar);
        } finally {
            this.f26400a--;
        }
    }

    @Override
    public final void n(bf.r rVar) {
        if (!this.f26402c.texts.isEmpty()) {
            w(q90.j("\n\n"));
        }
        v(rVar);
    }

    @Override
    public final void o(bf.s sVar) {
        w(q90.j(sVar.f3553g));
    }

    @Override
    public final void q(bf.d dVar) {
        w(q90.j(dVar.h));
    }

    @Override
    public final void r(bf.g gVar) {
        w(q90.j("\n"));
    }

    @Override
    public final void s(bf.k kVar) {
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
    public final void t(bf.g gVar) {
        String str;
        if (this.f26401b instanceof TL_iv.pageBlockBlockquote) {
            str = "\n";
        } else {
            str = " ";
        }
        w(q90.j(str));
    }

    @Override
    public final void u(bf.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.f26402c.texts.add(richText);
    }

    public final TL_iv.RichText y(bf.p pVar) {
        TL_iv.textConcat textconcat = this.f26402c;
        this.f26402c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText x10 = x(this.f26402c);
        this.f26402c = textconcat;
        return x10;
    }
}
